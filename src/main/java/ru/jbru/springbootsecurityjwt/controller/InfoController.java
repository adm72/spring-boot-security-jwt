package ru.jbru.springbootsecurityjwt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.jbru.springbootsecurityjwt.model.dto.InfoDTO;

@RestController
@RequestMapping("/v1/info")
public class InfoController {

    @Value("${appInfo.version}")
    private String apiVersion;

    @Value("${appInfo.dbUrl}")
    private String dbUrl;

    @Value("${appInfo.dbUsername}")
    private String dbUsername;

    @GetMapping()
    public ResponseEntity<InfoDTO> getInfo() {
        InfoDTO infoDTO = InfoDTO.builder()
                .appVersion(apiVersion)
                .dbUrl(dbUrl)
                .dbUsername(dbUsername)
                .build();
        return ResponseEntity.ok(infoDTO);
    }
}
