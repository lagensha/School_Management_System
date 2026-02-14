package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExamDTO {
    private  String examId;
    private  String name;
    private String subjectId;
    private String date;
    private Integer totalMarks;
}
