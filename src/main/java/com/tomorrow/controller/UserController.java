package com.tomorrow.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tomorrow.mapper.UserMapper;
import com.tomorrow.pojo.User;
import com.tomorrow.utils.WebResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yinqiming
 * @since 2022-06-12
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/userList")
    public WebResult userList(Integer page,Integer limit){
        Page<User> userPage = new Page<>(page,limit);
        userMapper.selectPage(userPage,new QueryWrapper<User>().select("name","age","gender","phone","email"));
        Integer count = userMapper.selectCount(null);
        Map<String ,Object> map = new HashMap<>();
        map.put("list",userPage.getRecords());
        map.put("count",count);
        return WebResult.ok("查询成功",map);
    }
}

