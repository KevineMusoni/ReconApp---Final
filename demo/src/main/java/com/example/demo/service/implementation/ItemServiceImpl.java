package com.example.demo.service.implementation;

import com.example.demo.model.Items;
import com.example.demo.repo.ItemRepo;
import com.example.demo.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j

public class ItemServiceImpl implements ItemService {
    private final ItemRepo itemRepo;
    @Override
    public List<Items> list(int limit){
        log.info("Fetching all Items");
        return itemRepo.findAll(of(0,limit)).toList();
    }

}
