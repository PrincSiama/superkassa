package dev.sosnovsky.superkassa.service;

import dev.sosnovsky.superkassa.dto.RequestDto;
import dev.sosnovsky.superkassa.dto.ResponseDto;
import dev.sosnovsky.superkassa.exception.NotFoundException;
import dev.sosnovsky.superkassa.model.Obj;
import dev.sosnovsky.superkassa.repository.ObjRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ObjServiceImpl implements ObjService {
    private final ObjRepository objRepository;
    private final ModelMapper mapper;

    @Override
    @Transactional
    public ResponseDto modifyCurrent(RequestDto requestDto) {
        Obj obj = objRepository.findById(requestDto.getId())
                .orElseThrow(() -> new NotFoundException("Невозможно изменить current. Объект с id "
                        + requestDto.getId() + " отсутствует"));
        int newCurrent = obj.getObj().getCurrent() + requestDto.getAdd();
        obj.getObj().setCurrent(newCurrent);
        return mapper.map(objRepository.save(obj).getObj(), ResponseDto.class);
    }
}