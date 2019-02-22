package com.luo.springboot01cache.entity;

import java.io.Serializable;

/**
 * @author：罗金星 date 2019/1/21 10:51
 **/
public class GirlEntity implements Serializable {
    private int id;
    private int age;
    private String cupsize;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCupsize() {
        return cupsize;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "GirlEntity{" +
                "id=" + id +
                ", age=" + age +
                ", cupsize='" + cupsize + '\'' +
                ", money=" + money +
                '}';
    }
}
