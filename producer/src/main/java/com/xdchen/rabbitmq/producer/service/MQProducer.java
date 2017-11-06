package com.xdchen.rabbitmq.producer.service;

public interface MQProducer {
    /**
     * 发送消息到指定队列
     * @param queueKey
     * @param object
     */
    void sendDataToQueue(String queueKey, Object object);
}
