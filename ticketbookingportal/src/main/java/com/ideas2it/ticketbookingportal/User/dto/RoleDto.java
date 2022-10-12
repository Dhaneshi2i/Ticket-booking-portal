package com.ideas2it.ticketbookingportal.User.dto;

import com.ideas2it.ticketbookingportal.User.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link Role} entity
 */
@AllArgsConstructor
@Getter
public class RoleDto implements Serializable {
    private final int id;
    private final String role;
    private final List<UserDto> usersDto;
}