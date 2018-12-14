package com.liaoin.frame.dao.mybatis.admin;

import com.liaoin.frame.entity.admin.Admin;
import tk.mybatis.mapper.common.Mapper;

/**
 * AdminMapper
 *
 * @author cqwu729
 * @date 2018/11/6 10:24
 */
public interface AdminMapper extends Mapper<Admin> {

    /**
     * 根据用户名查询
     *
     * @param username 用户名
     * @return Admin对象
     */
    Admin queryByUsername(String username);

}
