package com.pwc.bank.repositories;

import com.pwc.bank.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface addressRepository extends JpaRepository<Address , Long> {
}
