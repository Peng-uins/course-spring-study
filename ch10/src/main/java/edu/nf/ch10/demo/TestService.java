package edu.nf.ch10.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * @author 0.0
 * @date 2020/12/4
 * classpath：从编译路径去找,找到打他.properties文件
 * 使用@PropertySource找到指定的.properties文件
 */
@Service
@PropertySource(value = "classpath:daata.properties")
public class TestService {

    /**
     * value注解中使用SpEl表达式，指定资源文件的的key
     * 不写表达式就直接会把里面( @Value("name"))的内容直接赋值到name中
     */
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    public void say(){
        System.out.println(name+","+age);
    }

}