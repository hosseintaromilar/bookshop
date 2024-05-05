package com.asiastar.bookleaf.service.user;

import com.asiastar.bookleaf.dto.request.UserRequest;
import com.asiastar.bookleaf.dto.response.UserResponse;

public interface UserService {
    UserResponse save(UserRequest userRequest);
}
