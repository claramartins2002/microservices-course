package com.clara.hrpayroll.entity;

import lombok.Data;

import java.io.Serializable;

 @Data
public class Worker implements Serializable {
private long id;
private String name;
private Double dailyIncome;
}
