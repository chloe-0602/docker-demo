package com.chloe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName: ${NAME}
 * Package: com.chloe
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/11/15 22:16
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.chloe.mapper") //import tk.mybatis.spring.annotation.MapperScan;
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}