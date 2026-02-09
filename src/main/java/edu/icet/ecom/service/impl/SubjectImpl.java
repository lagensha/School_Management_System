package edu.icet.ecom.service.impl;


import edu.icet.ecom.dto.SubjectDTO;
import edu.icet.ecom.entity.SubjectEntity;
import edu.icet.ecom.repository.SubjectRepository;
import edu.icet.ecom.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectImpl implements SubjectService {

    final SubjectRepository subjectRepository;
    final ModelMapper modelMapper;

    @Override
    public void addSubjects(SubjectDTO subjectDTO) {
        SubjectEntity subjectEntity = modelMapper.map(subjectDTO,SubjectEntity.class);
        subjectRepository.save(subjectEntity);
    }

    @Override
    public void updateSubjects(SubjectDTO subjectDTO) {
        SubjectEntity subjectEntity = modelMapper.map(subjectDTO,SubjectEntity.class);
        subjectRepository.save(subjectEntity);
    }

    @Override
    public void deleteSubjects(Integer subjectId) {
        subjectRepository.deleteById(subjectId);
    }

    @Override
    public SubjectDTO searchByID(Integer subjectId) {
       SubjectEntity studentEntity = subjectRepository.findById(subjectId).get();
       SubjectDTO subjectDTO = modelMapper.map(studentEntity, SubjectDTO.class);
        return subjectDTO;
    }

    @Override
    public List<SubjectDTO> getAll() {
        List<SubjectEntity>subjectEntities=subjectRepository.findAll();
        ArrayList<SubjectDTO>subjectDTOArrayList= new ArrayList<>();
        subjectEntities.forEach(subjectEntity -> {
            SubjectDTO subjectDTO = modelMapper.map(subjectEntity, SubjectDTO.class);
            subjectDTOArrayList.add(subjectDTO);
        });
          return subjectDTOArrayList;
    }
}
