package com.wl.demo03;

/**
 * @Author: wl
 * @Date: 2020/6/19 21:48
 */

//房东
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
