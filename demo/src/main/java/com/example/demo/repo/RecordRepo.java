//package com.example.demo.repo;
//
//import com.example.demo.model.Record;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//public interface RecordRepo extends JpaRepository <Record, Long> {
//    Record findByID(String ID);
//
//    @Query(value = "select distinct get_open_count from SPARK_RECON_UNMATCHED", nativeQuery = true)
//     int get_open_count();
//
//    @Query(value = "select distinct get_manual_count from SPARK_RECON_UNMATCHED", nativeQuery = true)
//    int get_manual_count();
//
//    @Query(value = "select distinct get_closed_count from SPARK_RECON_MATCHED", nativeQuery = true)
//    int get_closed_count();
//
//}
