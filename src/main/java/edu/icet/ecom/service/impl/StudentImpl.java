package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.StudentDTO;
import edu.icet.ecom.entity.StudentEntity;
import edu.icet.ecom.repository.StudentRepository;
import edu.icet.ecom.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentImpl implements StudentService {

    final StudentRepository studentRepository;
    final ModelMapper modelMapper;
    @Override
    public void addStudents(StudentDTO studentDTO) {
        StudentEntity studentEntity = modelMapper.map(studentDTO,StudentEntity.class);
        studentRepository.save(studentEntity);
    }

    @Override
    public void updateStudents(StudentDTO studentDTO) {
        StudentEntity studentEntity = modelMapper.map(studentDTO,StudentEntity.class);
        studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudents(Integer studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public StudentDTO searchByID(Integer studentId) {
       StudentEntity studentEntity = studentRepository.findById(studentId).get();
       StudentDTO studentDTO = modelMapper.map(studentEntity, StudentDTO.class);
       return  studentDTO;
    }

    @Override
    public List<StudentDTO> getAll() {
        List<StudentEntity>studentEntities=studentRepository.findAll();
        ArrayList<StudentDTO>studentDTOArrayList= new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDTO studentDTO = modelMapper.map(studentEntity, StudentDTO.class);
            studentDTOArrayList.add(studentDTO);
        });
        return studentDTOArrayList;
    }

}
