package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table(name = "recon_summary2")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BaseSummary {
    @Column(name = "BANK_ID")
    private Long BANK_ID;
    private String RECON_CATEGORY;
    private String RECON_AREA;
    private String RECON_DATE;
    private Integer SYSTEM_CLOSED;
    @Id
    @Column(name = "OPEN_ITEMS", unique = true)
    private Integer OPEN_ITEMS;

    private Long BATCHID;
    private String RUN_COMMENTS;
    private String RUN_STATUS;
    private String RUN_DATE;

}
