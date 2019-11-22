package com.huidian.demo.service;

import com.huidian.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
}
