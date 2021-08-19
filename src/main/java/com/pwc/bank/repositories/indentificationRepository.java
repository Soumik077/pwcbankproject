package com.pwc.bank.repositories;

import com.pwc.bank.entity.Identification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface indentificationRepository extends JpaRepository<Identification, Long> {
}
