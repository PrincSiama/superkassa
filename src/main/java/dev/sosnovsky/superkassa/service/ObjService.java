package dev.sosnovsky.superkassa.service;

import dev.sosnovsky.superkassa.dto.RequestDto;
import dev.sosnovsky.superkassa.dto.ResponseDto;

public interface ObjService {
    ResponseDto modifyCurrent(RequestDto requestDto);
}