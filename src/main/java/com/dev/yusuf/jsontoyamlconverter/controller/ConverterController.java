package com.dev.yusuf.jsontoyamlconverter.controller;

import com.dev.yusuf.jsontoyamlconverter.business.abstracts.ConverterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class ConverterController {

    @Autowired
    private final ConverterService converterService;

    @PostMapping("/convert")
    public ResponseEntity<String> convertJsonToYaml(@RequestBody String jsonInput) {
        try {
            String result = converterService.convertJsonToYaml(jsonInput);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred during conversion.");
        }
    }
}
