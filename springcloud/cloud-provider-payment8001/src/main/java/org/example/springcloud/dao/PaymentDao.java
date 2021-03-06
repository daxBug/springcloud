package org.example.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.springcloud.entities.Payment;
import org.springframework.stereotype.Repository;

@Mapper
/*@Repository*/
public interface PaymentDao {

    public int create(Payment payment);

    public Payment get(@Param("id") Long id);
}
