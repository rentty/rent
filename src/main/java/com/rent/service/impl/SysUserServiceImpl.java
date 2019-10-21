package com.rent.service.impl;

import com.rent.bean.*;
import com.rent.mapper.DialogMapper;
import com.rent.mapper.RegistyMapper;
import com.rent.mapper.UserinfoMapper;
import com.rent.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author BABA
 * @date 2019/10/16 10:12
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private RegistyMapper registyMapper;

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Autowired
    DialogMapper dialogMapper;

    UserinfoExample userinfoExample = new UserinfoExample();

    @Override
    public int login(Sysuser sysuser) {
        String username = sysuser.getUsername();
        String password = sysuser.getPassword();
        RegistyExample registyExample = new RegistyExample();
        RegistyExample.Criteria criteria = registyExample.createCriteria();
        criteria.andRgtUserEqualTo(username);
        criteria.andRgtPasswordEqualTo(password);
        List<Registy> registies = registyMapper.selectByExample(registyExample);
        if(registies.size() > 0){
            Registy registy = registies.get(0);
            Integer id = registy.getRgtId();//获取主键
            Userinfo userinfo = userinfoMapper.selectByPrimaryKey(id);
            if (userinfo.getUifUsertype() == 2){
                return 1;
            }else{
                return -1;
            }
        }
        return 0;
    }

    @Override
    public List<Dialog> getDialogWithEdtrydl() {

        return dialogMapper.selectByExampleWithEntrydl(null);
    }

    @Override
    public List<Userinfo> findAllUserWithFavor() {

        return userinfoMapper.selectByExampleWithFavor(null);
    }
}
