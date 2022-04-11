package com.byulsoft.msa.sms.exam.controller;

import com.byulsoft.msa.sms.exam.dto.Sms;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Slf4j
@RestController
public class ExamController {


    @GetMapping("/api/sms/exam/getMessage")
    public ResponseEntity<Map<String, Object>> getMessage(@RequestParam Map<String, Object> params) throws Exception{

        log.info("getTicket Info : {}" , params.toString());

        Thread.sleep(1000 * 10);

        log.info("10초간 대기 후에 응답 처리");

        return ResponseEntity.status(HttpStatus.OK).header(null).body(params);
    }

    @PostMapping("/api/sms/exam/setMessage")
    public ResponseEntity<Sms> setMessage(@Valid @RequestBody Sms params) throws Exception {

        log.info("setTicket Info : {}" , params.toString());

        if(true) {
            throw new Exception("오류 발생....");
        }

        return ResponseEntity.status(HttpStatus.OK).header(null).body(params);
    }
}
