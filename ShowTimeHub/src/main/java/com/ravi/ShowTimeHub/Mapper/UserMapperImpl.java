package com.ravi.ShowTimeHub.Mapper;

import com.ravi.ShowTimeHub.Dto.UserDto;
import com.ravi.ShowTimeHub.Entity.User;

public class UserMapperImpl {

    public static UserDto toDto(User user){
    UserDto dto = new UserDto();
    dto.setUserId(user.getUserId());
    dto.setName(user.getName());
    dto.setEmail(user.getEmail());
    dto.setPhone(user.getPhone());
    dto.setBookings(user.getBookings());
    return dto;
    }

    public static User toEntity(UserDto dto){
    User user = new User();
    user.setUserId(dto.getUserId());
    user.setName(dto.getName());
    user.setEmail(dto.getEmail());
    user.setPhone(dto.getPhone());
    user.setBookings(dto.getBookings());
    return user;
    }
}
