package com.data.sesson06_javawebservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees") // Đặt tên bảng
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "salary", nullable = false)
    private Double salary;
}
