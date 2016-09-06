/**
 * <b>项目名：</b>cloud-zuul<br/>
 * <b>包名：</b>com.hbdiy.sc.config<br/>
 * <b>文件名：</b>FilterConfig.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月6日-上午9:09:35<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hbdiy.sc.filter.HbdiyZuulFilter;

/**
 * <b>类名称：</b>FilterConfig <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月6日 上午9:09:35<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

@Configuration
public class FilterConfig {

	@Bean
	public HbdiyZuulFilter HbdiyFilter() {
		HbdiyZuulFilter filter = new HbdiyZuulFilter();
		return filter;
	}
	
}
