package com.example.demo.repo;

import com.example.demo.model.BaseSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface SummaryRepo extends JpaRepository<BaseSummary, Long> {

   @Query(value ="SELECT * FROM recon_summary2", nativeQuery = true )

   BaseSummary findBaseSummaries();

//   List<BaseSummary> findByRecondateAndReconarea(String recondate, String reconarea);


}
