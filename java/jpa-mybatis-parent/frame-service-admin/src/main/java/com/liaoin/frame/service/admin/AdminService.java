package com.liaoin.frame.service.admin;


import com.liaoin.frame.commons.response.Result;

/**
 * AdminService
 *
 * @author cqwu729
 * @date 2018/11/6 10:32
 */
public interface AdminService {


    /**
     * 用户管理员基本信息
     * @param name
     * @return
     */
    Result queryAdminInfo(String name);

}
