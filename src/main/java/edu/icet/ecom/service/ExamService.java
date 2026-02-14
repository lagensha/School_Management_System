package edu.icet.ecom.service;


import edu.icet.ecom.dto.ExamDTO;

import java.util.List;

public interface ExamService {
    void addExams(ExamDTO examDTO);
    void updateExams(ExamDTO examDTO);
    void deleteExams(Integer examId);
  ExamDTO  searchByID(Integer examId);
    List<ExamDTO> getAll();
}
