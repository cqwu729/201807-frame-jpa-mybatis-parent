package com.liaoin.frame.web.admin.controller;

import com.liaoin.frame.commons.response.Result;
import com.liaoin.frame.commons.response.Results;
//import com.liaoin.frame.dao.jpa.dao.AdminRepository;
import com.liaoin.frame.service.admin.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController
 *
 * @author cqwu729
 * @date 2018/12/10 17:33
 */
@RestController
@RequestMapping("/index")
@Api(tags = "首页版块")
public class IndexController {

    private AdminService adminService;

    public IndexController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/index")
    @ApiOperation("获取轮播列表")
    public Result getBannerList() {
        return adminService.queryAdminInfo("admin");
    }
}
