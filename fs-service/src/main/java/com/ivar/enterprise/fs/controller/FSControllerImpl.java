package com.ivar.enterprise.fs.controller;

import com.ivar.enterprise.fs.bean.FS;

import com.ivar.enterprise.fs.service.FSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ivaris on 8/15/2016.
 */
@RestController
public class FSControllerImpl implements FSController {
    @Autowired
    @Qualifier("FSServiceImpl")
    FSService fsService;

    @RequestMapping("/fs")
    public String toString(){
        fsService.toString();
		return "FS Resource";
    	
    }
}
