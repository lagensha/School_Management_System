package edu.icet.ecom.service;

import edu.icet.ecom.dto.ClassDTO;

import java.util.List;

public interface ClassService {
    void addClasses(ClassDTO classDTO);
    void updateClasses(ClassDTO classDTO);
    void deleteClasses(Integer classId);
    ClassDTO  searchByID(Integer classId);
    List<ClassDTO> getAll();
}
