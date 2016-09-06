/**
 * <b>项目名：</b>cloud-test-provider-A<br/>
 * <b>包名：</b>com.hbdiy.sc<br/>
 * <b>文件名：</b>TestProviderApplicationA.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月6日-上午8:18:04<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>类名称：</b>TestProviderApplicationA <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月6日 上午8:18:04<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@SpringBootApplication
@EnableDiscoveryClient
public class TestProviderApplicationA {
	public static void main(String[] args) {
		SpringApplication.run(TestProviderApplicationA.class, args);
	}
}
