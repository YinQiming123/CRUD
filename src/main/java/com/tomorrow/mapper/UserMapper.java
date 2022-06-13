package com.tomorrow.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tomorrow.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yinqiming
 * @since 2022-06-12
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> getUserListInfo(Page<User> page);

    Long getUserCount();
}
