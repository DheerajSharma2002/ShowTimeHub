package com.ravi.ShowTimeHub.Dto;

import com.ravi.ShowTimeHub.Entity.Booking;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserDto {

    private String userId;

    private String name;

    private String email;

    private String phone;

    private List<Booking> bookings;
}
