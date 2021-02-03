import demo.CacheService;
import demo.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "小傅哥", 0);
        String val01 = cacheService.get("user_name_01", 0);
        System.out.println("测试结果：" + val01);

    }

}

