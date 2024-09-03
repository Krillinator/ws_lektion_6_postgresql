package com.krillinator.ws_lektion_6_postgresql.repository;

import com.krillinator.ws_lektion_6_postgresql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
