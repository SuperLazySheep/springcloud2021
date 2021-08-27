package com.cloud.service.impl;

import com.cloud.dao.PaymentDao;
import com.cloud.model.bean.jpa.Payment;
import com.cloud.service.inter.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sqq
 * @Date 2021/8/24
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getById(Integer id) {
        return paymentDao.getById(id);
    }
}
