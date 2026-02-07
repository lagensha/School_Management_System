package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.ClassDTO;
import edu.icet.ecom.entity.ClassEntity;
import edu.icet.ecom.repository.ClassRepository;
import edu.icet.ecom.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassImpl implements ClassService {

    final ClassRepository classRepository;
    final ModelMapper modelMapper;

    @Override
    public void addClasses(ClassDTO classDTO) {
        ClassEntity classEntity=modelMapper.map(classDTO, ClassEntity.class);
        classRepository.save(classEntity);
    }

    @Override
    public void updateClasses(ClassDTO classDTO) {
        ClassEntity classEntity=modelMapper.map(classDTO, ClassEntity.class);
        classRepository.save(classEntity);
    }

    @Override
    public void deleteClasses(Integer classId) {
        classRepository.deleteById(classId);
    }

    @Override
    public ClassDTO searchByID(Integer classId) {
       ClassEntity classEntity = classRepository.findById(classId).get();
       ClassDTO classDTO=modelMapper.map(classEntity,ClassDTO.class);
       return classDTO;
    }

    @Override
    public List<ClassDTO> getAll() {
       List<ClassEntity>classEntities=classRepository.findAll();
        ArrayList<ClassDTO>classDTOArrayList=new ArrayList<>();
        classEntities.forEach(classEntity -> {
            ClassDTO classDTO = modelMapper.map(classEntity,ClassDTO.class);
            classDTOArrayList.add(classDTO);
        });
        return classDTOArrayList;
    }
}
