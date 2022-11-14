package com.codegym.utils;

import com.codegym.log.Log;

import java.io.IOException;
import java.util.logging.Level;

public class LogUtils {
    public static Log my_log;
    static {
        try {
            my_log = new Log("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\shop-template\\data\\log.txt");
            my_log.logger.setLevel(Level.ALL);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
