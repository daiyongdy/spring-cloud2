/**
 * <b>项目名：</b>cloud-provider<br/>
 * <b>包名：</b>com.hbdiy.sc<br/>
 * <b>文件名：</b>ProviderApplication.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月5日-下午4:41:04<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b>类名称：</b>ProviderApplication <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月5日 下午4:41:04<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}
	
}
