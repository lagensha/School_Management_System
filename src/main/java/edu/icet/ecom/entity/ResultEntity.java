package edu.icet.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ResultEntity {
    @Id
    @GeneratedValue
    private Integer resultId;
    private String studentId;
    private String examId;
    private String marks;
    private Integer grade;
}
