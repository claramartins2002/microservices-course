package com.clara.hrpayroll.service;
import com.clara.hrpayroll.entity.Payment;
import com.clara.hrpayroll.entity.Worker;
import com.clara.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {
    private final WorkerFeignClient feignClient;

    public PaymentService( WorkerFeignClient feignClient) {
        this.feignClient = feignClient;
    }


    public Payment getPayment(Long workerId, Integer days) {
        Worker worker = feignClient.getById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
