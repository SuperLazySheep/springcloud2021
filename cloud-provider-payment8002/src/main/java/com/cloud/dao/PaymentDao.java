package com.cloud.dao;

import com.cloud.model.bean.jpa.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author sqq
 * @Date 2021/8/24
 */
@Mapper
public interface PaymentDao {

    /**
     * 新增
     * @param payment
     * @return
     */
    Payment create(Payment payment);

    Payment getById(@Param("id") Integer id);
}
