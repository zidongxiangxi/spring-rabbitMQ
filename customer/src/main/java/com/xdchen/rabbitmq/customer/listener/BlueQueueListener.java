package com.xdchen.rabbitmq.customer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueQueueListener {
    private static Logger log = LoggerFactory.getLogger(BlueQueueListener.class);
    /**
     * 处理消息
     * @param message
     * void
     */
    public void onMessage(String message) {
        log.info("BlueQueueListener Receved:"  + message);
    }
}
