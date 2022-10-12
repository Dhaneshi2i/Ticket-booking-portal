package com.ideas2it.ticketbookingportal.User.service;

import com.ideas2it.ticketbookingportal.User.dto.UserDto;
import com.ideas2it.ticketbookingportal.User.mapper.UserMapper;
import com.ideas2it.ticketbookingportal.User.model.User;
import com.ideas2it.ticketbookingportal.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /*public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }*/

    /**
     * @param userDto
     * @return
     */
    @Override
    public User SaveUser(UserDto userDto) {
        User user = UserMapper.convertDtoToModel(userDto);
        return userRepository.save(user);
    }
}
