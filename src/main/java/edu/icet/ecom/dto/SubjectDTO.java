package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubjectDTO {
    private Integer subjectId;
    private String subjectName;
    private String classId;
    private String teacherId;

}
