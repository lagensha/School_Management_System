package edu.icet.ecom.service;

import edu.icet.ecom.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    void addStudents(StudentDTO studentDTO);
    void updateStudents(StudentDTO studentDTO);
    void deleteStudents(Integer studentId);
    StudentDTO  searchByID(Integer studentId);
    List<StudentDTO> getAll();
}
