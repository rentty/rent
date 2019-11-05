package com.rent.config;

import com.rent.filter.SmsCodeFilter;
import com.rent.filter.ValidateCodeFilter;
import com.rent.handler.MyAuthenticationFailureHandler;
import com.rent.handler.MyAuthenticationSucessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author BABA
 * @date 2019/10/11 11:11
 */
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyAuthenticationSucessHandler authenticationSucessHandler;

    @Autowired
    private MyAuthenticationFailureHandler authenticationFailureHandler;


    @Autowired
    private ValidateCodeFilter validateCodeFilter;

    @Autowired
    private SmsCodeFilter smsCodeFilter;

    @Autowired
    private SmsAuthenticationConfig smsAuthenticationConfig;

    @Autowired
    private sessionExpiredStrategy sessionExpiredStrategy;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**","/fonts/**","/images/**","/code/image","/js/**");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.addFilterBefore(verifyCodeFilter, UsernamePasswordAuthenticationFilter.class)
        http.addFilterBefore(validateCodeFilter, UsernamePasswordAuthenticationFilter.class)
           .addFilterBefore(smsCodeFilter, UsernamePasswordAuthenticationFilter.class) // 添加短信验证码校验过滤器
            .formLogin() // 表单登录
                // http.httpBasic() // HTTP Basic
                .loginPage("/login.html") // 登录跳转 URL
                .loginProcessingUrl("/login") // 处理表单登录 URL
                .failureUrl("/login.html?code=5")
                .successHandler(authenticationSucessHandler) // 处理登录成功
//                .failureHandler(authenticationFailureHandler) // 处理登录失败
                .and()
                .authorizeRequests() // 授权配置
                .antMatchers("/authentication/require", "/login.html",
                        "/code/image","/code/sms","/session/invalid","/oauth/callback/qq",
                        "/signout/success").permitAll() // 登录跳转 URL 无需认证
                .anyRequest()  // 所有请求
                .authenticated() // 都需要认证
                .and()
                .logout()
                .logoutUrl("/signout")
                .logoutSuccessUrl("/signout/success")
                .deleteCookies("JSESSIONID")
                .and()
                .sessionManagement() // 添加 Session管理器
                .invalidSessionUrl("/login.html?code=6") // Session失效后跳转到这个链接
                .maximumSessions(1)
                .expiredSessionStrategy(sessionExpiredStrategy)
                .and()
                .and().csrf().disable()
                .apply(smsAuthenticationConfig);
    }
}
