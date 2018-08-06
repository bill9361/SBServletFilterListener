package cn.bill.sbsfl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description: <br/>
 * Date:2018年8月6日 下午1:03:26 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */

//方法3
@WebServlet(urlPatterns={"/my2"})
public class MyServlet2 extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("MyServlet2...doGet()");
		req.getSession().setAttribute("hello", "Hello Servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("MyServlet2...doPost()");
	}
	
	

}
