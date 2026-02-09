package edu.icet.ecom.service;

import edu.icet.ecom.dto.SubjectDTO;


import java.util.List;

public interface SubjectService {
    void addSubjects(SubjectDTO subjectDTO);
    void updateSubjects(SubjectDTO subjectDTO);
    void deleteSubjects(Integer subjectId);
  SubjectDTO searchByID(Integer subjectId);
    List<SubjectDTO> getAll();
}
