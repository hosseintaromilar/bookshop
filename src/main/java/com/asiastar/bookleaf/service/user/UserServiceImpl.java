package com.asiastar.bookleaf.service.user;

import com.asiastar.bookleaf.Model.User;
import com.asiastar.bookleaf.dto.request.UserRequest;
import com.asiastar.bookleaf.dto.response.UserResponse;
import com.asiastar.bookleaf.exception.RuleException;
import com.asiastar.bookleaf.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse  save(UserRequest userRequest) {
        Optional <User> byUsername =
                userRepository.findByUsername(userRequest.getUsername());
        if(byUsername.isPresent())
            throw new RuleException("user.exists.please.choose.another.username");

        return CreateUserResponse(userRepository.save(createUser(userRequest)));
    }

    private UserResponse CreateUserResponse(User user){
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }

    private User createUser(UserRequest userRequest){

       return User.builder()
                .password(userRequest.getPassword())
                .username(userRequest.getUsername())
                .build();
    }
}
