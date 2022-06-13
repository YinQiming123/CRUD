package com.tomorrow.mapper;

import com.tomorrow.pojo.Address;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tomorrow.pojo.Class;
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
public interface AddressMapper extends BaseMapper<Address> {
    Address getAddressInfoById(Integer addressId);
}
