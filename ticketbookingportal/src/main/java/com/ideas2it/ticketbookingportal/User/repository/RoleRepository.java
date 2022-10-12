package com.ideas2it.ticketbookingportal.User.repository;

import com.ideas2it.ticketbookingportal.User.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
