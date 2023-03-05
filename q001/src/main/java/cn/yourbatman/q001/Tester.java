package cn.yourbatman.q001;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * 在此处添加备注信息
 *
 * @author YourBatman's home page. <a href=https://yourbatman.cn>https://yourbatman.cn</a>
 * @author YourBatman. <a href=mailto:yourbatman@aliyun.com>Send email to me</a>
 * @author wechat:fsx641385712
 * @since 0.0.1
 */
public class Tester {

    @Test
    public void fun() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(18);

        List newNumbers = numbers;
        newNumbers.add("YourBatman");

        System.out.println(numbers);
    }

    @Test
    public void fun1() {
        List<Integer> intList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        System.out.println(intList.getClass() == stringList.getClass());
    }

}
