package com.github.lucas.spi.imp;

import com.github.lucas.spi.Driver;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lucas
 * @version 1.0
 * @date 2019/7/5 15:57
 **/
@Slf4j
public class CommonDriver implements Driver {

    @Override
    public String connect(String url, String username, String password) {
        log.info("connect from [{}], username: [{}], password: [{}]", url, username, password);
        return "connected";
    }
}
