package cn.bill.sbsfl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Description: Servlet，Filter，Listener注册方式2<br/>
 * Date:2018年8月6日 下午1:16:31 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@SpringBootApplication
@ServletComponentScan
public class SbServletFilterListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbServletFilterListenerApplication.class, args);
	}

}
