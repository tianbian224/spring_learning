package e_use_anotation.java_wired.config;

import e_use_anotation.java_wired.outerJavaClass.Computer;
import e_use_anotation.java_wired.outerJavaClass.Mouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cang.lv
 * @date 2018/8/1
 */
@Configuration
public class JavaConfig {

    /**
     * 相当于 在 xml中声名一个bean ，默认和方法名称一样。
     * <bean id="abcd" class="e_use_anotation.java_wired.outerJavaClass.Mouse"/>
     * 也可以通过 @Bean(name="heihei")取一个id
     *
     * @return
     */
    @Bean(name = "heihei")
    public Mouse abcd() {
        return new Mouse();
    }


    /**
     * aaaaa和bbbbb传递的abcd是 同一个对象
     * 说白了这个相当于是使用xml中的构造函数进行注入
     *
     * @return
     */
    @Bean
    public Computer bbbbb() {
        return new Computer(abcd());
    }

    @Bean
    public Computer aaaaa() {
        return new Computer(abcd());
    }


}
