/**
 * Copyright (c) 2008-2015 浩瀚深度 All Rights Reserved.
 *
 * <p>FileName: HiController.java</p>
 *
 * @author jiangningning
 * @date 2018/10/26
 * @version 1.0
 * History:
 * v1.0.0, 姜宁宁 2018/10/26 Create
 */
package com.hh.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: HiController</p>
 * <p>Description: </p>
 * @author jiangningning
 */
@RestController
public class HiController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/hi")
    public String hi(){
        return foo;
    }

}
