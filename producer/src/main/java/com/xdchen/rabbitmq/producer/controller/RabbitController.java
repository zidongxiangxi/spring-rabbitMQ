package com.xdchen.rabbitmq.producer.controller;

import com.xdchen.rabbitmq.producer.service.MQProducer;
import com.xdchen.rabbitmq.producer.service.RabbitServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rabbit")
public class RabbitController {
    private static Logger log = LoggerFactory.getLogger(RabbitController.class);

    @Autowired
    private RabbitServiceImpl rabbitService;

    @Autowired
    private MQProducer mqProducer;

    @RequestMapping(value = "/setMessage", method = RequestMethod.POST)
    @ResponseBody
    public String setMessage(String msg, String type) {
        log.info("rabbitmq--收到待发送消息: type[{}]-msg[{}]", type, msg);
        rabbitService.setMessage(msg, type);
        return "{\"success\":1}";
    }

    @RequestMapping(value = "/setMessage2", method = RequestMethod.GET)
    @ResponseBody
    public String setMessage2(String msg) {
        log.info("rabbitmq--收到待发送消息: msg[{}]", msg);
        mqProducer.sendDataToQueue("test_queue_key", msg);
        return "{\"success\":1}";
    }
}
