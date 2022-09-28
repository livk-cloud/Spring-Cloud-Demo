package com.livk.gateway;

import com.livk.spring.LivkSpring;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * LivkGateway
 * </p>
 *
 * @author livk
 * @date 2022/8/29
 */
@SpringBootApplication
public class LivkGateway {
    public static void main(String[] args) {
        LivkSpring.run(LivkGateway.class, args);
    }
}