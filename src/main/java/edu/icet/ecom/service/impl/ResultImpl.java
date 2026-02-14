package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.ResultDTO;
import edu.icet.ecom.entity.ResultEntity;
import edu.icet.ecom.repository.ResultRepository;
import edu.icet.ecom.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultImpl implements ResultService {

    final ResultRepository resultRepository;
    final ModelMapper modelMapper;

    @Override
    public void addResults(ResultDTO resultDTO) {
        ResultEntity resultEntity = modelMapper.map(resultDTO,ResultEntity.class);
        resultRepository.save(resultEntity);
    }

    @Override
    public void updateResults(ResultDTO resultDTO) {
        ResultEntity resultEntity = modelMapper.map(resultDTO,ResultEntity.class);
        resultRepository.save(resultEntity);
    }

    @Override
    public void deleteResults(Integer resultId) {
            resultRepository.deleteById(resultId);
    }

    @Override
    public ResultDTO searchByID(Integer resultId) {
       ResultEntity resultEntity=resultRepository.findById(resultId).get();
      ResultDTO resultDTO = modelMapper.map(resultEntity,ResultDTO.class);
      return resultDTO;
    }

    @Override
    public List<ResultDTO> getAll() {
       List<ResultEntity>resultEntities=resultRepository.findAll();
        ArrayList<ResultDTO>resultDTOArrayList= new ArrayList<>();
        resultEntities.forEach(resultEntity -> {
            ResultDTO resultDTO = modelMapper.map(resultEntity,ResultDTO.class);
            resultDTOArrayList.add(resultDTO);
        });
        return resultDTOArrayList;
    }
}
