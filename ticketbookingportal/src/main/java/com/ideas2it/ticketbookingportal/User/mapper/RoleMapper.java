package com.ideas2it.ticketbookingportal.User.mapper;

import com.ideas2it.ticketbookingportal.User.dto.RoleDto;
import com.ideas2it.ticketbookingportal.User.dto.UserDto;
import com.ideas2it.ticketbookingportal.User.model.Role;
import com.ideas2it.ticketbookingportal.User.model.User;

import java.util.List;

public class RoleMapper {

    public static Role convertDtoTOModel(RoleDto roleDto) {
        Role role = new Role();
        if (roleDto != null) {
            role.setId(roleDto.getId());
            role.setRole(roleDto.getRole());
            //role.setUsers(roleDto.getUsersDto());
            List<User> users = role.getUsers();
            List<UserDto> userDto = roleDto.getUsersDto();
            for (UserDto currentUserDto : userDto) {
                Role currentRole = new Role();
            }
        }
        return role;
    }

}
