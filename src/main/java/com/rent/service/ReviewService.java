package com.rent.service;

import com.rent.bean.Review;

import java.util.List;

public interface ReviewService {

    /**
     * 获取该房屋的所有评论
     * @param hs_Id
     * @return json -----List
     */
    public String getAllReviewByHs_Id(int hs_Id);

    /**
     * 评论信息录入
     * @param review
     */
    public void review(Review review,String username);
}
