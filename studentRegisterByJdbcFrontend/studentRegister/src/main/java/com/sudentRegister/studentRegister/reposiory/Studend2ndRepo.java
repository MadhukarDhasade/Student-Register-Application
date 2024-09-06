package com.sudentRegister.studentRegister.reposiory;

import com.sudentRegister.studentRegister.model.Students;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studend2ndRepo extends JpaRepository<Students,Integer> {
}
