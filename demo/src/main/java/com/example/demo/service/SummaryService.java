package com.example.demo.service;

import com.example.demo.model.BaseSummary;

import java.util.Collection;
import java.util.List;
public interface SummaryService {
    Collection<BaseSummary> findBaseSummaries(int limit);

//    List<BaseSummary> findByRecondateAndReconarea(String recondate, String reconarea);


}
