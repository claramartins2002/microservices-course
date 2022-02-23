package com.clara.hruser.entity;

import lombok.Data;

import javax.persistence.*;

@Data @Entity @Table(name = "tb_role")
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleName;
}
