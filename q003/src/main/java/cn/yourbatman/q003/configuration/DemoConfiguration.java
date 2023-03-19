package cn.yourbatman.q003.configuration;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * 在此处添加备注信息
 *
 * @author YourBatman's home page. <a href=https://yourbatman.cn>https://yourbatman.cn</a>
 * @author YourBatman. <a href=mailto:yourbatman@aliyun.com>Send email to me</a>
 * @author wechat:yourbatman-u
 * @since 0.0.1
 */
@Configuration(proxyBeanMethods = false)
public class DemoConfiguration implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(getClass().getSimpleName() + "所属IoC容器的地址值："
                + ("@" + Integer.toHexString(applicationContext.hashCode())));
    }

}
