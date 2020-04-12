package com.wy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLb  implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current>=Integer.MAX_VALUE ? 0 : current +1;
            System.out.println("******第"+ current+"次访问****");


        }while(!this.atomicInteger.compareAndSet(current, next));
        return next;

    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        return  serviceInstances.get(getAndIncrement() % serviceInstances.size());
    }
}
