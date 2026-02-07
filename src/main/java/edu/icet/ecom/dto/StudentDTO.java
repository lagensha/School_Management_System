package edu.icet.ecom.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
   private Integer studentId;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String address;
    private String phone;
    private String  email;
    private String admissionDate;
    private String  classId;

}
