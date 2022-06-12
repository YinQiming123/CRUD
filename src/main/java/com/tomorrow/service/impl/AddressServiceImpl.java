package com.tomorrow.service.impl;

import com.tomorrow.pojo.Address;
import com.tomorrow.mapper.AddressMapper;
import com.tomorrow.service.AddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

}
