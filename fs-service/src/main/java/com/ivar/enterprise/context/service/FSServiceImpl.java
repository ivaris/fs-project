package com.ivar.enterprise.context.service;

import com.ivar.enterprise.context.bean.FS;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component("FSServiceImpl")
public class FSServiceImpl implements FSService {

	public FS get(String userId) {
		// TODO Auto-generated method stub
		return new FS();
	}
    
}
