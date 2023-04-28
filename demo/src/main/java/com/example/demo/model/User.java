package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "users")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @SequenceGenerator(schema = "super", name ="test_seq", sequenceName = "test_seq", allocationSize = 1)

    @Id
    @Column(name = "ID", unique = true)
    private long ID;
    private String EMAIL;
    private String PASSWORD;
}
