package com.clara.hrworker.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Data @Table(name = "tb_worker")
public class Worker implements Serializable {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;
private Double dailyIncome;
}
