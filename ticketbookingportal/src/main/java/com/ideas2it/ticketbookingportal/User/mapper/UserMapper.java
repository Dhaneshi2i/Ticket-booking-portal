package com.ideas2it.ticketbookingportal.User.mapper;

import com.ideas2it.ticketbookingportal.User.dto.RoleDto;
import com.ideas2it.ticketbookingportal.User.dto.UserDto;
import com.ideas2it.ticketbookingportal.User.model.Role;
import com.ideas2it.ticketbookingportal.User.model.User;

import java.util.List;

public class UserMapper {

    public static User convertDtoToModel(UserDto userDto) {
        User user = new User();
        if (userDto != null) {
            user.setId(user.getId());
            user.setName(userDto.getName());
            user.setEmailId(userDto.getEmailId());
            user.setUserName(userDto.getUserName());
            user.setPassword(userDto.getPassword());

            RoleDto roleDto = userDto.getRole();
            if (roleDto != null) {
                Role role = new Role();
                role.setId(roleDto.getId());
                role.setRole(roleDto.getRole());
                List<User> users = role.getUsers();
                List<UserDto> usersDto = roleDto.getUsersDto();
                for (UserDto currentUserDto : usersDto) {
                    User currentUser = new User();
                    if (currentUserDto.getId() != 0) {
                        currentUser.setId(currentUserDto.getId());
                        currentUser.setName(currentUserDto.getName());
                        currentUser.setEmailId(currentUserDto.getEmailId());
                        currentUser.setUserName(currentUserDto.getUserName());
                        currentUser.setPassword(currentUserDto.getPassword());
                        users.add(currentUser);
                    }
                }
                role.setUsers(users);
                user.setRole(role);
            }
        }
        return user;
    }
}
