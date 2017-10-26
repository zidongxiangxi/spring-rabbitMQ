package com.xdchen.rabbitmq.customer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedQueueListener {
    private static Logger log = LoggerFactory.getLogger(RedQueueListener.class);
    /**
     * 处理消息
     * @param message
     * void
     */
    public void onMessage(String message) {
        log.info("RedQueueListener Receved:"  + message);
    }
}
