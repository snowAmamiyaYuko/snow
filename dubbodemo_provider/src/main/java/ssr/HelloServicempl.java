package ssr;

import com.alibaba.dubbo.config.annotation.Service;

@Service

public class HelloServicempl implements HelloService{


    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
