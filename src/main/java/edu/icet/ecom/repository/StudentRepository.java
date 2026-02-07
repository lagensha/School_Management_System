package edu.icet.ecom.repository;

import edu.icet.ecom.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <StudentEntity ,Integer> {
}
