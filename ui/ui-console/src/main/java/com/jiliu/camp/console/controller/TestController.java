package com.jiliu.camp.console.controller;

import com.jiliu.camp.console.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @description:  测试控制层
 * @copyright: @Copyright (c) 2022
 * @company: Aiocloud
 * @author: pany
 * @version: 1.0.0
 * @createTime: 2023-07-08 14:53
 */
@RestController
@RequestMapping("/v1/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @RequestMapping("/get")
    public String test() {
        return testService.getTestContent();
    }
}
