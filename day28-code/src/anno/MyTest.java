package anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    元注解：
        @Target 指定了注解能在哪里使用
        @Retention 可以理解为保留时间(生命周期)
            可使用的值定义在 RetentionPolicy 枚举类中，常用值如下:
                SOURCE:注解只作用在源码阶段，生成的字节码文件中不存在
                CLASS:注解作用在源码阶段，字节码文件阶段，运行阶段不存在，默认值
                RUNTIME:注解作用在源码阶段，字节码文件阶段，运行阶段
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {

}
