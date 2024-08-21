package dev.sosnovsky.superkassa.controller;

import dev.sosnovsky.superkassa.dto.RequestDto;
import dev.sosnovsky.superkassa.dto.ResponseDto;
import dev.sosnovsky.superkassa.service.ObjService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modify")
@AllArgsConstructor
public class ObjController {
    private final ObjService objService;

    @PostMapping
    public ResponseDto modifyCurrent(@RequestBody @Valid RequestDto requestDto) {
        return objService.modifyCurrent(requestDto);
    }
}