/**
 * <b>项目名：</b>cloud-consumer<br/>
 * <b>包名：</b>com.hbdiy.sc.controller<br/>
 * <b>文件名：</b>ComsumerController.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月5日-下午5:05:16<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hbdiy.sc.service.ComputeService;

/**
 * <b>类名称：</b>ComsumerController <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月5日 下午5:05:16<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@RestController
public class ComsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ComputeService computeService;
	
	@RequestMapping("/c-add")
	public String cadd() {
		return this.restTemplate.getForEntity("http://compute-service/add?a=1&b=5", String.class).getBody();
	}
	
	@RequestMapping("/add2")
	public String add2() {
		return this.computeService.add();
	}
	
}
