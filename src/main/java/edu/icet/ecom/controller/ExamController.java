package edu.icet.ecom.controller;

import edu.icet.ecom.dto.ExamDTO;
import edu.icet.ecom.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Exams")
@RequiredArgsConstructor
public class ExamController {

    final ExamService examService;

  @PostMapping("/Add")
    public void addExams(@RequestBody ExamDTO examDTO) {
        examService.addExams(examDTO);
    }

@PutMapping("/Update")
    public void updateExams(@RequestBody ExamDTO examDTO) {
    examService.updateExams(examDTO);
    }

@DeleteMapping("/Delete-By-Id{examId}")
    public void deleteExams(@PathVariable Integer examId) {
        examService.deleteExams(examId);
    }

@GetMapping("/Search-By-Id{examId}")
    public ExamDTO searchByID(@PathVariable Integer examId) {
        return examService.searchByID(examId);
    }

    @GetMapping("/GetAll")
    public List<ExamDTO> getAll() {
        return examService.getAll();
    }
}
