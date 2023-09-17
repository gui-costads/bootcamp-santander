package com.apirest.bootcampsantander.domain.repository;

import com.apirest.bootcampsantander.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
