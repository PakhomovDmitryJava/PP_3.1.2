package com.pakhomov.PP_311.repositories;

import com.pakhomov.PP_311.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {

}
