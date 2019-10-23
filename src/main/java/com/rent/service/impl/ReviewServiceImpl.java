package com.rent.service.impl;

import com.rent.bean.Review;
import com.rent.bean.ReviewExample;
import com.rent.mapper.ExpandMapper;
import com.rent.mapper.ReviewMapper;
import com.rent.service.JSonPool;
import com.rent.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@CacheConfig(cacheNames = "ReviewService",cacheManager ="cacheManager" )
@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ExpandMapper expandMapper;
    @Autowired
    ReviewMapper reviewMapper;
    @Override
    @Cacheable(key = "#hs_Id",value = "AllReview")
    public String getAllReviewByHs_Id(int hs_Id) {
        ReviewExample example = new ReviewExample();
        example.createCriteria().andHsIdEqualTo(hs_Id);
        List<Review> reviews = reviewMapper.selectByExample(example);
        return JSonPool.toJSon(reviews);
    }

    @Override
    public int review(Review review,Integer id) {

        review.setRgtId(id);
        return reviewMapper.insertSelective(review);

    }

    @Override
    public List<Review> findAllReview() {

        return reviewMapper.selectByExample(null);
    }

    @Override
    public int deleteReview(int id) {

        return reviewMapper.deleteByPrimaryKey(id);
    }
}
