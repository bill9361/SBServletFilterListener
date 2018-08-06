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
@WebServlet(urlPatterns={"/my1"})
public class MyServlet1 extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		super.doGet(req, resp);
		System.out.println("MyServlet1...doGet()");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		super.doPost(req, resp);
		System.out.println("MyServlet1...doPost()");
	}
	
	

}
