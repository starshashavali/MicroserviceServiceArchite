package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.feign.IMsgFeignclient;

@RestController
public class MsgRestController {
	
	@Autowired
	private IMsgFeignclient feignClient;
	
	@GetMapping("/msg")
	public String getMsg() {
		return "hello::"
				+ ""+feignClient.getMsg();
	}

}
