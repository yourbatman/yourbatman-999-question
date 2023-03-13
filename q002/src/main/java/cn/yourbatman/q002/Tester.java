package cn.yourbatman.q002;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

/**
 * 在此处添加备注信息
 *
 * @author YourBatman's home page. <a href=https://yourbatman.cn>https://yourbatman.cn</a>
 * @author YourBatman. <a href=mailto:yourbatman@aliyun.com>Send email to me</a>
 * @author wechat:yourbatman-u
 * @since 0.0.1
 */
public class Tester {

    @Test
    public void fun() {
        System.out.println(new BigDecimal(Double.NaN));
    }

    @Test
    public void fun1() {
        System.out.println(Double.NaN < 0);
    }

    @Test
    public void fun2() {
        // 等于Double.POSITIVE_INFINITY的场景
        System.out.println(1.0 / 0 == Double.POSITIVE_INFINITY); // true
        System.out.println(2.0 / 0 == Double.POSITIVE_INFINITY); // true
        System.out.println(1 / 0.0 == Double.POSITIVE_INFINITY); // true
        System.out.println(2 / 0.0 == Double.POSITIVE_INFINITY); // true
        System.out.println(new Double(Double.POSITIVE_INFINITY) == Double.POSITIVE_INFINITY); // true

        // 等于Double.NEGATIVE_INFINITY的场景
        System.out.println(-1.0 / 0 == Double.NEGATIVE_INFINITY); // true
        System.out.println(-2.0 / 0 == Double.NEGATIVE_INFINITY); // true
        System.out.println(-1 / 0.0 == Double.NEGATIVE_INFINITY); // true
        System.out.println(-2 / 0.0 == Double.NEGATIVE_INFINITY); // true
        System.out.println(new Double(Double.NEGATIVE_INFINITY) == Double.NEGATIVE_INFINITY); // true

        // 需特别注意的特殊case：
        System.out.println(1.0 / -0 == Double.POSITIVE_INFINITY); // -0和0没有区别，所以结果是POSITIVE(true)
        System.out.println(1.0 / -0.0 == Double.NEGATIVE_INFINITY); // -0.0和0.0是有区别的，所以结果是POSITIVE(false)
    }

    @Test
    public void fun3() {
        double d = 0.0d / 0.0;
        // double d = 0.0d / 0; // 结果一样

        System.out.println(d == Double.NaN);
        System.out.println(d == d);
        System.out.println(Double.isNaN(d));
    }


    @Test
    public void fun4() {
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);
    }

    @Test
    public void fun5() {
        System.out.println(Double.POSITIVE_INFINITY == Float.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY == Float.NEGATIVE_INFINITY);
        System.out.println(Double.NaN == Float.NaN);
    }

    @Test
    public void fun6() {
        System.out.println("正无穷大 > 任何数吗？ -> " + (Double.POSITIVE_INFINITY > Double.MAX_VALUE)); // true
        System.out.println("正无穷大 > 任何数吗？ -> " + (Double.POSITIVE_INFINITY > Long.MAX_VALUE)); // true
        System.out.println("负无穷大 < 任何数吗？ -> " + (Double.POSITIVE_INFINITY > Double.MIN_VALUE)); // true
        System.out.println("负无穷大 < 任何数吗？ -> " + (Double.POSITIVE_INFINITY > Long.MIN_VALUE)); // true

        System.out.println("NaN参与比较：" + (Double.NaN == Double.NaN)); // false
        System.out.println("NaN参与比较：" + (Double.NaN > Double.NaN)); // false
        System.out.println("NaN参与比较：" + (Double.NaN < Double.NaN)); // false
        System.out.println("NaN参与比较：" + (Double.NaN < 1)); // false
        System.out.println("NaN参与比较：" + (Double.NaN < -1)); // false

        System.out.println("NaN参与比较：" + (Double.NaN != -1)); // true
        System.out.println("NaN参与比较：" + (Double.NaN != Double.NaN)); // true
    }

    @Test
    public void fun7() {
        System.out.println("正无穷大参与运算：" + (Double.POSITIVE_INFINITY + 1)); // Infinity
        System.out.println("正无穷大参与运算：" + (Double.POSITIVE_INFINITY - 1)); // Infinity
        System.out.println("负无穷大参与运算：" + (Double.NEGATIVE_INFINITY * 1)); // -Infinity
        System.out.println("负无穷大参与运算：" + (Double.NEGATIVE_INFINITY / 1)); // -Infinity
        System.out.println("负无穷大参与运算：" + (Double.NEGATIVE_INFINITY / 0)); // -Infinity

        System.out.println("NaN参与运算：" + (Double.NaN + 1)); // NaN
        System.out.println("NaN参与运算：" + (Double.NaN - 1)); // NaN
        System.out.println("NaN参与运算：" + (Double.NaN * 1)); // NaN
        System.out.println("NaN参与运算：" + (Double.NaN / 1)); // NaN
        System.out.println("NaN参与运算：" + (Double.NaN / 0)); // NaN

        // 特殊场景
        System.out.println(Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY); // NaN
        System.out.println(Double.NEGATIVE_INFINITY - Double.NEGATIVE_INFINITY); // NaN
        System.out.println(Double.POSITIVE_INFINITY + Double.NEGATIVE_INFINITY); // NaN

        System.out.println("负无穷大参与运算：" + (Double.POSITIVE_INFINITY / -0.0)); // -Infinity
        System.out.println("负无穷大参与运算：" + (Double.NEGATIVE_INFINITY / -0.0)); // Infinity
    }


}
