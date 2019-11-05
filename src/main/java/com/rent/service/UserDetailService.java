package com.rent.service;

import com.rent.bean.Registy;
import com.rent.bean.RegistyExample;
import com.rent.common.MyUser;
import com.rent.mapper.RegistyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @author BABA
 * @date 2019/10/11 10:16
 */
@Configuration
public class UserDetailService implements UserDetailsService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RegistyMapper registyMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        RegistyExample registyExample = new RegistyExample();
        RegistyExample.Criteria criteria = registyExample.createCriteria();
        criteria.andRgtUserEqualTo(username);
        List<Registy> registies = registyMapper.selectByExample(registyExample);
        Registy registy = registies.get(0);
        System.out.println(registy);

        MyUser user = new MyUser();
        user.setUserName(username);
        user.setPassword(this.passwordEncoder.encode(registy.getRgtPassword()));
//        user.setPassword(this.passwordEncoder.encode("123456"));
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());

//        // 模拟一个用户，替代数据库获取逻辑
//        MyUser user = new MyUser();
//        user.setUserName(username);
//        user.setPassword(this.passwordEncoder.encode("123456"));
//        // 输出加密后的密码
//        System.out.println(user.getPassword());

        return new User(user.getUserName(), user.getPassword(), user.isEnabled(),
                user.isAccountNonExpired(), user.isCredentialsNonExpired(),
                user.isAccountNonLocked(), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
