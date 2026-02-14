package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.TeacherDTO;
import edu.icet.ecom.entity.TeacherEntity;
import edu.icet.ecom.repository.TeacherRepository;
import edu.icet.ecom.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherImpl implements TeacherService {

  final TeacherRepository teacherRepository;
    final ModelMapper modelMapper;

    @Override
    public void addTeachers(TeacherDTO teacherDTO) {
        TeacherEntity teacherEntity = modelMapper.map(teacherDTO , TeacherEntity.class);
        teacherRepository.save(teacherEntity);
    }

    @Override
    public void updateTeachers(TeacherDTO teacherDTO) {
        TeacherEntity teacherEntity = modelMapper.map(teacherDTO , TeacherEntity.class);
        teacherRepository.save(teacherEntity);
    }

    @Override
    public void deleteTeachers(Integer teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    @Override
    public TeacherDTO searchByID(Integer teacherId) {
        TeacherEntity teacherEntity = teacherRepository.findById(teacherId).get();
        TeacherDTO teacherDTO = modelMapper.map(teacherEntity,TeacherDTO.class);
        return teacherDTO;
    }

    @Override
    public List<TeacherDTO> getAll() {
      List<TeacherEntity>teacherEntities=teacherRepository.findAll();
        ArrayList<TeacherDTO>teacherDTOArrayList= new ArrayList<>();
        teacherEntities.forEach(teacherEntity -> {
            TeacherDTO teacherDTO=modelMapper.map(teacherEntity, TeacherDTO.class);
            teacherDTOArrayList.add(teacherDTO);
        });
        return teacherDTOArrayList;
    }
}
