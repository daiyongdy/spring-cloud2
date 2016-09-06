/**
 * <b>项目名：</b>cloud-test-provider-A<br/>
 * <b>包名：</b>com.hbdiy.sc.controller<br/>
 * <b>文件名：</b>TestController.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月6日-上午8:21:54<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>类名称：</b>TestController <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月6日 上午8:21:54<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@RestController
public class TestController {
	
	@Value("${name}")
	private String name;

	@RequestMapping("/serviceA")
	public String serviveA() {
		return "this is service A";
	}
	
	@RequestMapping("/tb")
	public String tb() {
		return this.name;
	}
	
}
