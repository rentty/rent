package com.rent.handler;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rent.bean.Registy;
import com.rent.bean.RegistyExample;
import com.rent.common.MyUser;
import com.rent.mapper.RegistyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.stereotype.Component;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author BABA
 * @date 2019/10/11 11:12
 */
@Component
public class MyAuthenticationSucessHandler implements AuthenticationSuccessHandler {
    private RequestCache requestCache = new HttpSessionRequestCache();
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private RegistyMapper registyMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException {
//        SavedRequest savedRequest = requestCache.getRequest(request, response);
//        redirectStrategy.sendRedirect(request, response, savedRequest.getRedirectUrl());
//        response.setContentType("application/json;charset=utf-8");
//        response.getWriter().write(mapper.writeValueAsString(authentication));
//        Object parse = JSON.parse(mapper.writeValueAsString(authentication.getPrincipal().toString()));
//        System.out.println(parse);
        String json = mapper.writeValueAsString(authentication.getPrincipal());
        System.out.println(json);
        MyUser user = JSON.parseObject(json,MyUser.class);
        System.out.println(user.getUserName());
        RegistyExample registyExample = new RegistyExample();
        registyExample.createCriteria().andRgtUserEqualTo(user.getUserName());
        Registy registy = registyMapper.selectByExample(registyExample).get(0);
        int id = registy.getRgtId();
        System.out.println(id);
//        System.out.println(mapper.writeValueAsString(authentication.getPrincipal().toString()));
        redirectStrategy.sendRedirect(request, response, "/base.html?rgtId="+id);
        return;
    }
}
