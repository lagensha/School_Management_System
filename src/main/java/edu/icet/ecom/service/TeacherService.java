package edu.icet.ecom.service;

import edu.icet.ecom.dto.StudentDTO;
import edu.icet.ecom.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {
    void addTeachers(TeacherDTO teacherDTO);
    void updateTeachers(TeacherDTO teacherDTO);
    void deleteTeachers(Integer teacherId);
    TeacherDTO  searchByID(Integer teacherId);
    List<TeacherDTO> getAll();
}
