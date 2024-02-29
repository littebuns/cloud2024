package org.example.pay.service.impl;

import org.example.pay.model.entity.TPay;
import org.example.pay.mapper.TPayMapper;
import org.example.pay.service.ITPayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付交易表 服务实现类
 * </p>
 *
 * @author xxb
 * @since 2024-02-29
 */
@Service
public class TPayServiceImpl extends ServiceImpl<TPayMapper, TPay> implements ITPayService {

}
