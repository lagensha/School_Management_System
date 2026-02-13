package edu.icet.ecom.service.impl;


import edu.icet.ecom.dto.ExamDTO;
import edu.icet.ecom.entity.ExamEntity;
import edu.icet.ecom.repository.ExamRepository;
import edu.icet.ecom.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamImpl implements ExamService {

    final ExamRepository examRepository;
    final ModelMapper modelMapper;
    @Override
    public void addExams(ExamDTO examDTO) {
        ExamEntity examEntity = modelMapper.map(examDTO,ExamEntity.class);
        examRepository.save(examEntity);
    }

    @Override
    public void updateExams(ExamDTO examDTO) {
        ExamEntity examEntity = modelMapper.map(examDTO,ExamEntity.class);
        examRepository.save(examEntity);
    }

    @Override
    public void deleteExams(Integer examId) {
        examRepository.deleteById(examId);
    }

    @Override
    public ExamDTO searchByID(Integer examId) {
        ExamEntity examEntity = examRepository.findById(examId).get();
      ExamDTO examDTO = modelMapper.map(examEntity,ExamDTO.class);
        return examDTO;
    }

    @Override
    public List<ExamDTO> getAll() {
       List<ExamEntity>examEntities=examRepository.findAll();
        ArrayList<ExamDTO>examDTOArrayList=new ArrayList<>();
        examEntities.forEach(examEntity -> {
            ExamDTO examDTO = modelMapper.map(examEntity,ExamDTO.class);
            examDTOArrayList.add(examDTO);
        });
        return examDTOArrayList;
    }
}
