package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "SUMM2")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    @SequenceGenerator(schema = "super", name ="test_seq", sequenceName = "test_seq", allocationSize = 1)
    private long BANK_ID;
    private String RECON_CATEGORY;
    private String RECON_AREA;
    private long BATCHID;
    @Id
    @Column(name = "ROW_ID", unique = true)
    private  Long row_id;
    private String UNIQUE_INDENTIFIER;
    private String DATA_CATEGORY;
    private String ACCOUNT_NUMBER;
    private String TRANSACTION_ID;
    private String TRANSACTION_DATE;
    private String VALUE_DATE;
    private String TRANSACTION_TIME;
    private String TRANSACTION_TYPE;
    private long AMOUNT;
    private String TRANSACTION_CURRENCY;
    private String TRANSACTION_PARTICULARS;
    private String ADDITIONAL_REFERENCE;
    private String DEVICE_NUMBER;
    private String CARD_OR_MOBILE_NUMBER;
    private String RECON_SATUS;
    private String RECON_COMMENTS;
    private String RECON_USER;
    private String CREATED_TIMESTAMP;
    private String MODIFIED_TIMESTAMP;
}
