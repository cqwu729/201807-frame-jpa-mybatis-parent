package com.liaoin.frame.service.admin.impl;


import com.liaoin.frame.commons.response.Result;
//import com.liaoin.frame.dao.jpa.dao.AdminRepository;
import com.liaoin.frame.dao.mybatis.admin.AdminMapper;
import com.liaoin.frame.dao.mybatis.admin.UserMapper;
import com.liaoin.frame.entity.admin.Admin;
import com.liaoin.frame.entity.admin.User;
import com.liaoin.frame.service.admin.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.Date;

import static com.liaoin.frame.commons.response.Results.ok;


@Slf4j
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;


    @Resource
    private UserMapper userMapper;

//    @Resource
//    private AdminRepository adminRepository;

    @Override
    public Result queryAdminInfo(String name) {
        Admin admin = Admin.builder()
                .username(System.currentTimeMillis()+"")
                .password(System.currentTimeMillis()+"")
                .random(123)
                .addTime(new Date())
                .build();
//        adminRepository.save(admin);
        adminMapper.insert(admin);
        admin.setAddTime(new Date());
        adminMapper.updateByPrimaryKeySelective(admin);

        User user = User.builder()
                .username(System.currentTimeMillis()+"")
                .password(System.currentTimeMillis()+"")
                .random(123)
                .addTime(new Date())
                .build();
//        adminRepository.save(admin);
        userMapper.insert(user);
        Admin adminDto = adminMapper.queryByUsername(admin.getUsername());
        return ok(adminDto);
    }

}
