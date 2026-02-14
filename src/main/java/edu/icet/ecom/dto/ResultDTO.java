package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResultDTO {
    private Integer resultId;
    private String studentId;
    private String examId;
    private String marks;
    private Integer grade;
}
