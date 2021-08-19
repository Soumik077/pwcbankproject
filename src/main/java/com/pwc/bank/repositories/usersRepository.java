package com.pwc.bank.repositories;

import com.pwc.bank.entity.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends PagingAndSortingRepository<Users , Long> {
}
