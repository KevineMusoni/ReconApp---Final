//package com.example.demo.service.implementation;
//
//import com.example.demo.model.Record;
//import com.example.demo.repo.RecordRepo;
//import com.example.demo.service.RecordService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import javax.transaction.Transactional;
//
//import java.util.Collection;
//
//
//import static org.springframework.data.domain.PageRequest.*;
//
//@RequiredArgsConstructor
//@Service
//@Transactional
//@Slf4j
//public class RecordServiceImpl implements RecordService {
//    private final RecordRepo recordRepo;
//
//
//    @Override
//    public Record create(Record record) {
//        log.info("Saving comment: {}", record.getID());
//        return recordRepo.save(record);
//    }
//
//    @Override
//    public Collection<Record> list(int limit) {
//        log.info("Fetching all Records");
//        return recordRepo.findAll(of(0,limit)).toList();
//    }
//
//    @Override
//    public Record get(Long ID) {
//        log.info("Fetching record: {}", ID);
//        return recordRepo.findById(ID).get();
//    }
//
//    @Override
//    public int Get_open_count(){
//        return recordRepo.get_open_count();
//    }
//
//    @Override
//    public int Get_manual_count(){
//        return recordRepo.get_manual_count();
//    }
//
//    @Override
//    public int Get_closed_count(){
//        return recordRepo.get_closed_count();
//    }
//}
