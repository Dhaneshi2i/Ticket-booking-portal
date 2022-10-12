package com.ideas2it.ticketbookingportal.User.dto;

import com.ideas2it.ticketbookingportal.User.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@AllArgsConstructor
@Getter
public class UserDto implements Serializable {
    private final int id;
    private final String name;
    private final String emailId;
    private final String userName;
    private final String password;
    private final RoleDto role;
}