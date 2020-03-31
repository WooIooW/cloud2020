package com.wy.springcloud.service;

import com.wy.springcloud.dao.PaymentDao;
import com.wy.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(long id);

}
