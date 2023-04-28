package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "SPARK_RECON_MATCHED")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comment {
    @SequenceGenerator(schema = "super", name ="test_seq", sequenceName = "test_seq", allocationSize = 1)
    @Id
    @Column(name = "row_id", unique = true)
    private  Long row_id;
    private String RECON_COMMENTS;
    private String RECON_USER;
    private String DS_A_STATUS_FLAG;
}
