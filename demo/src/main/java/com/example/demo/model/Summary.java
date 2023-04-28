//package com.example.demo.model;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.List;
//import java.util.Set;
//
//@Table(name = "SPARK_RECON_RECONITEM")
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Summary{
//    @Id
//    @SequenceGenerator(schema = "super", name ="test_seq", sequenceName = "test_seq", allocationSize = 1)
//
//    private long id;
//    private long batchid;
//    private String reconitem;
//    private String reconcate;
//    private long reconrunfreq;
//    private long reconpriority;
//    private Long bank_id;
//    private Date creatd_at;
//    private Date modified_at;
//
////    @ManyToMany(mappedBy = "summaries", fetch = FetchType.LAZY)
////    private List<Table2Summary> table2Summaries;
//
//}
//
//
