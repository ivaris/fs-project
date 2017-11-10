package com.ivar.enterprise.context.controller;

import com.ivar.enterprise.context.bean.FS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ONC50886 on 8/15/2016.
 */
@RestController
public class FSControllerImpl implements FSController {
    @Autowired
    @Qualifier("FSControllerImpl")
    FS contextService;

    @RequestMapping("/fs")
    public String toString(){
		return "Context Resource";
    	
    }
}
