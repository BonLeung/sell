package com.imooc.utils;

import java.util.Random;

/**
 * Created by liangweibang on 2017/10/13.
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     * @return
     */
    public static synchronized String genUniqueKey() {

        Random random = new Random();

        Integer numnber = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(numnber);

    }
}
