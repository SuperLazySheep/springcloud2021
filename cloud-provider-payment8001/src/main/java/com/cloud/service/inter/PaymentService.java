package com.cloud.service.inter;

import com.cloud.model.bean.jpa.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author sqq
 * @Date 2021/8/24
 */
public interface PaymentService {

    Payment create(Payment payment);

    Payment getById(@Param("id") Integer id);
}
