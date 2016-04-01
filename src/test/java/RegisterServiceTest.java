
import com.zhangyao.service.RegisterService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * RegisterService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Mar 24, 2016</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-common.xml")
public class RegisterServiceTest {

    @Resource
    RegisterService service = null;


} 
