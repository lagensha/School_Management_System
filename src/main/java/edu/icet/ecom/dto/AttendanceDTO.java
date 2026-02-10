package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AttendanceDTO {
    private Integer  attendanceId;
     private String studentId;
   private String date;
   private Boolean isPresent;
}
