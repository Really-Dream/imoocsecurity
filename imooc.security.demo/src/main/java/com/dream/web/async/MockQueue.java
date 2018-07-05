package com.dream.web.async;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by H.J
 * 2018/7/5
 */
@Getter
@Component
public class MockQueue {

    private String placeOrder;

    private String completeOrder;

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void setPlaceOrder(String placeOrder) throws Exception{
        new Thread(() ->{
            logger.info("接到下单请求，" + placeOrder);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            this.completeOrder = placeOrder;
            logger.info("下单请求处理完毕，" +placeOrder);
        }).start();
    }

    public void setCompleteOrder(String completeOrder) {
        this.completeOrder = completeOrder;
    }
}
