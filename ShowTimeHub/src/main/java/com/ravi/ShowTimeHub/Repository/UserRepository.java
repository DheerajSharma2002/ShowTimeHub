package com.ravi.ShowTimeHub.Repository;

import com.ravi.ShowTimeHub.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
