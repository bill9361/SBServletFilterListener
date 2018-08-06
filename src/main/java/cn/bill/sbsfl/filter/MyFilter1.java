package cn.bill.sbsfl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Description: <br/>
 * Date:2018年8月6日 下午1:10:38 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@WebFilter(filterName="myFilter1",urlPatterns={"/*"})
public class MyFilter1 implements Filter
{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		System.out.println("MyFilter1...init()");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		System.out.println("MyFilter1...doFilter()");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy()
	{
		System.out.println("MyFilter1...destroy()");
	}

}
