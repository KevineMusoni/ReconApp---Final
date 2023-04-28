//package com.example.demo.resource;
//
//import com.example.demo.model.Response;
//import com.example.demo.model.Record;
////import com.example.demo.service.implementation.RecordServiceImpl;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import static java.time.LocalDateTime.now;
//import static java.util.Map.*;
//import static org.springframework.http.HttpStatus.CREATED;
//import static org.springframework.http.HttpStatus.OK;
//
//@RestController
//@RequestMapping("/record")
//@RequiredArgsConstructor
//public class RecordResource {
//    private final RecordServiceImpl recordService;
//    @GetMapping("/list")
//    public ResponseEntity<Response> getRecord() throws InterruptedException{
//        TimeUnit.SECONDS.sleep(3);
//        return ResponseEntity.ok(
//                Response.builder()
//                        .timeStamp(now())
//                        .data(of("records", recordService.list(5000)))
//                        .message("Records retrieved")
//                        .status(OK)
//                        .statusCode(OK.value())
//                        .build()
//        );
//    }
//
//    @PostMapping("/save")
//    public ResponseEntity<Response> saveRecord(@RequestBody @Valid Record record){
//        return ResponseEntity.ok(
//                Response.builder()
//                        .timeStamp(now())
//                        .data(of("record", recordService.create(record)))
//                        .message("Record saved")
//                        .status(CREATED)
//                        .statusCode(CREATED.value())
//                        .build()
//        );
//    }
//
//    @GetMapping("/get/{ID}")
//    public ResponseEntity<Response> getRecord(@PathVariable("ID") Long ID) {
//        return ResponseEntity.ok(
//                Response.builder()
//                        .timeStamp(now())
//                        .data(of("record", recordService.get(ID)))
//                        .message("Record retrieved")
//                        .status(OK)
//                        .statusCode(OK.value())
//                        .build()
//        );
//    }
//
//    @GetMapping("OpenCount")
//    public int get_open_count(){
//        return recordService.Get_open_count();
//    }
//
//    @GetMapping("ManualCount")
//    public int get_manual_count(){
//        return recordService.Get_manual_count();
//    }
//
//    @GetMapping("ClosedCount")
//    public int get_closed_count(){
//        return recordService.Get_closed_count();
//    }
//
//
//}
//
