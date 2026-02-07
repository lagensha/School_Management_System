package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherDTO {
   private Integer teacherId;
   private String firstName;
   private String lastName;
   private String subjectSpecialization;
    private String phone;
    private String  email;
    private String hireDate;

}
