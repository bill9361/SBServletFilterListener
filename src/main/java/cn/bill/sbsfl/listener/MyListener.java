package cn.bill.sbsfl.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Description: <br/>
 * Date:2018年8月6日 下午1:14:45 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@WebListener
public class MyListener implements HttpSessionListener
{

	@Override
	public void sessionCreated(HttpSessionEvent se)
	{
		System.out.println("MyListener....sessionCreated()");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se)
	{
		System.out.println("MyListener....sessionDestroyed()");		
	}


}
