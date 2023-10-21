package com.org.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MAPI-PROVIDER")
public interface IMsgFeignclient {
	
	
	@GetMapping("/msg")
	public String getMsg() ;

	
	
}
