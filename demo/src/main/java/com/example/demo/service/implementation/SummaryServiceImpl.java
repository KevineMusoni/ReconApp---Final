package com.example.demo.service.implementation;

import com.example.demo.model.BaseSummary;
import com.example.demo.repo.SummaryRepo;
import com.example.demo.service.SummaryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepo summaryRepo;

    @Override
    public Collection<BaseSummary> findBaseSummaries(int limit) {
        log.info("Fetching all Items");
        return summaryRepo.findAll();
    }



}