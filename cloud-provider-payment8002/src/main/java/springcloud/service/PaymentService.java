package springcloud.service;

import com.atguigu.springcloud.entities.Payment;


public interface PaymentService {
    public Integer create(Payment payment);

    public Payment getPaymentById(Long id);
}
