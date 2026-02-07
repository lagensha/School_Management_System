package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ParentsDTO {
    private Integer parentId;
    private String fatherName;
    private String motherName;
    private String phone;
    private String email;
    private String address;


}
