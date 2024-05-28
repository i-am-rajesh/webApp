package com.hdsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hdsoft.entity.Register;

public interface RegisterRepository extends JpaRepository<Register, Long> {
}
