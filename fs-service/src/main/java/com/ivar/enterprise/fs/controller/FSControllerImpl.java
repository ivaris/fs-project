package com.ivar.enterprise.fs.controller;

import com.ivar.enterprise.fs.bean.Job;
import com.ivar.enterprise.fs.service.FSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ivaris on 8/15/2016.
 */
@RestController
@RequestMapping("fs")
public class FSControllerImpl implements FSController {
    @Autowired
    @Qualifier("FSServiceImpl")
    FSService fsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String toString(){
		return "FS Resource";
    	
    }

    @RequestMapping(value = "/joblist", method = RequestMethod.GET)
    public List<Job> getJobList(){
        return fsService.getJobs();
    }
}
