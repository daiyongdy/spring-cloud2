/**
 * <b>项目名：</b>cloud-provider<br/>
 * <b>包名：</b>com.hbdiy.sc.controller<br/>
 * <b>文件名：</b>ComputeController.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月5日-下午4:42:13<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>类名称：</b>ComputeController <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月5日 下午4:42:13<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@RestController
public class ComputeController {

	@Autowired
	private DiscoveryClient DiscoveryClient;
	
	
	@RequestMapping("/add")
	public int add (int a, int b) {
		ServiceInstance serviceInstance = this.DiscoveryClient.getLocalServiceInstance();
		int r = a + b;
		System.out.println("/add, host:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId() + ", result:" + r);
		
		return r;
	}
	
}
