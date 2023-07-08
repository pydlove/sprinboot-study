package com.jiliu.camp.console.service.impl;

import com.jiliu.camp.console.dao.mapper.TestMapper;
import com.jiliu.camp.console.dao.po.Test;
import com.jiliu.camp.console.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @description:  测试业务层
 * @copyright: @Copyright (c) 2022 
 * @company: Aiocloud
 * @author: pany
 * @version: 1.0.0 
 * @createTime: 2023-07-08 14:43
 */
@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @Override
    public String getTestContent() {
        Test test = testMapper.selectByPrimaryKey(1L);
        return test.getContent();
    }
}
