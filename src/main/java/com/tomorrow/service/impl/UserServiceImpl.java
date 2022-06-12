package com.tomorrow.service.impl;

import com.tomorrow.pojo.User;
import com.tomorrow.mapper.UserMapper;
import com.tomorrow.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yinqiming
 * @since 2022-06-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
