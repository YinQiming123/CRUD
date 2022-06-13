package com.tomorrow.mapper;

import com.tomorrow.pojo.Class;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yinqiming
 * @since 2022-06-12
 */
@Repository
public interface ClassMapper extends BaseMapper<Class> {
    Class getClassInfoById(Integer classId);
}
