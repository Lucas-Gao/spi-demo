package com.github.lucas.spi;

/**
 * @author lucas
 * @version 1.0
 * @date 2019/7/5 15:47
 **/
public interface Driver {

    /**
     * get connect
     */
    String connect(String url, String username, String password);

}
