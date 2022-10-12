package com.ideas2it.ticketbookingportal.User.service;

import com.ideas2it.ticketbookingportal.User.dto.UserDto;
import com.ideas2it.ticketbookingportal.User.model.User;

public interface UserService {
    User SaveUser(UserDto userDto);
}
