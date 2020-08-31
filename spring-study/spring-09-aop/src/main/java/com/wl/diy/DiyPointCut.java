package com.wl.diy;

import java.awt.*;

/**
 * @Author: wl
 * @Date: 2020/6/20 21:11
 */
public class DiyPointCut {
    public void before() {
        System.out.println("===========方法执行前=============");
    }

    public void after() {
        System.out.println("=============方法执行后=============");
    }
}
