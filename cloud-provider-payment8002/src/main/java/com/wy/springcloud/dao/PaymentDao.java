package com.wy.springcloud.dao;

import com.wy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int create(Payment Payment);

    public Payment getPaymentById(@Param("id") long id);
}
