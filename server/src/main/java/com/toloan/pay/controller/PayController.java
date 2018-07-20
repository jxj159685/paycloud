package com.toloan.pay.controller;

import com.toloan.pay.dto.OrderDTO;
import com.toloan.response.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;



/**
 *
 *
 * @author pantheon
 * @version 1.0.0
 * @date 2018/7/20
 * Copyright 杭州民华金融信息服务有限公司 All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class PayController {


    @PostMapping("/create")
    public ServerResponse create() {

        return ServerResponse.createBySuccess("hello world");

    }

}
