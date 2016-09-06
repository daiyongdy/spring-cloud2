/**
 * <b>项目名：</b>cloud-consumer<br/>
 * <b>包名：</b>com.hbdiy.sc<br/>
 * <b>文件名：</b>ComsumerApplication.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月5日-下午5:03:01<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <b>类名称：</b>ComsumerApplication <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月5日 下午5:03:01<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker	//断路器功能
public class ComsumerApplication {
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ComsumerApplication.class, args);
	}
	
}
