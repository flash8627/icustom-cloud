
package com.gwtjs.icustom.cloud.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主应用入口
 * @author <a href="http://icustom.com">icustom.com</a>
 * @date 2016年3月19日
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World."
                + "<br />Welcome to <a href='http://icustom.com'>icustom.com</a></li>";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}




