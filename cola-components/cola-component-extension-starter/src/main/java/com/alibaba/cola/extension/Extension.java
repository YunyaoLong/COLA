/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.cola.extension;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Extension
 * 源于<a href="https://blog.csdn.net/significantfrank/article/details/100074716">COLA 2.0</a>
 * @author fulan.zjf 2017-11-05
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Component
public @interface Extension {
    // 业务
    String bizId()  default BizScenario.DEFAULT_BIZ_ID;
    // 用例
    String useCase() default BizScenario.DEFAULT_USE_CASE;
    // 场景
    String scenario() default BizScenario.DEFAULT_SCENARIO;
}
