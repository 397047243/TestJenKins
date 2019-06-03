package cn.xrz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XRZ
 * @date 2019-06-03
 * @Description :
 */
@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }


    @GetMapping("/")
    public String t(){
//        return "66678";
        return "Hello JenKins!";
    }
}
