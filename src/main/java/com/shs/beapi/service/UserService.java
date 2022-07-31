package com.shs.beapi.service;

import com.shs.beapi.domain.User;
import com.shs.beapi.dto.UserDto;
import com.shs.beapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User saveUser(UserDto userDto) {
        User user = new User(userDto.getUserId(), userDto.getName(), userDto.getUserId(), userDto.getRegNo());
        return userRepository.save(user);
    }
}
