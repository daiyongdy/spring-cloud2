/**
 * <b>项目名：</b>cloud-zuul<br/>
 * <b>包名：</b>com.hbdiy.sc.filter<br/>
 * <b>文件名：</b>HbdiyZuulFilter.java<br/>
 * <b>描述：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 * <b>日期：</b>2016年9月6日-上午9:04:28<br/>
 * <b>Copyright (c)</b> 2016<br/>
 */

package com.hbdiy.sc.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * <b>类名称：</b>HbdiyZuulFilter <br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>daiyong<br/>
 * <b>修改人：</b><br/>
 * <b>修改时间：</b>2016年9月6日 上午9:04:28<br/>
 * <b>修改备注：</b><br/>
 * <b>版本信息：</b>v1.0.0<br/>
 */

public class HbdiyZuulFilter extends ZuulFilter{

	/**
	 * @author daiyong
	 */
	@Override
	public boolean shouldFilter() {
		return false;
	}

	/**
	 * @author daiyong
	 */
	@Override
	public Object run() {
		
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		Object accessToken = request.getParameter("accessToken");
		if(accessToken == null) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
		return null;
	}

	/**
	 * @author daiyong
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * @author daiyong
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

}
