package com.tomorrow;

import com.tomorrow.mapper.UserMapper;
import com.tomorrow.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TomorrowApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = new User(null, "张三", 22, 1, "15203340717", "928843421@qq.com", null, null, null, null, null, null, null);
        userMapper.insert(user);
    }

}
