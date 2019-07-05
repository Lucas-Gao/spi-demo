package com.github.lucas.spi;

import java.util.ServiceLoader;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lucas
 * @version 1.0
 * @date 2019/7/5 16:05
 **/
@Slf4j
public class ConnectionFactory {

    public static void main(String[] args) {
        ServiceLoader<Driver> driverServiceLoader = ServiceLoader.load(Driver.class);
        for (Driver driver : driverServiceLoader) {
            String connection = driver.connect("localhost:1234", "root", "");

            log.info("connect from spi, implement class: [{}], result: [{}]",driver.getClass().getSimpleName(), connection);
        }
    }
}
