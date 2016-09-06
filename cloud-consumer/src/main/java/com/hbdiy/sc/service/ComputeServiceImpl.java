/**
 * <b>项目名：</b>cloud-consumer<br/>
 * <b>包名：</b>com.hbdiy.sc.service<br/>
 * <b>文件名：</b>ComputeServiceImpl.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月6日-上午8:02:52<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * <b>类名称：</b>ComputeServiceImpl <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月6日 上午8:02:52<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@Service
public class ComputeServiceImpl implements ComputeService{
	
	@Autowired
	private RestTemplate restTemplate;
	

	/**
	 * @author daiyong
	 */
	@Override
	@HystrixCommand(fallbackMethod = "addServiceFallback")
	public String add() {
		return this.restTemplate.getForEntity("http://compute-service/add?a=2&b=6", String.class).getBody();
	}
	
	public String addServiceFallback() {
		return "error";
	}

}
