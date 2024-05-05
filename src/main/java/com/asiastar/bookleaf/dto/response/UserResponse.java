package com.asiastar.bookleaf.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class UserResponse {
    private final Long id;
    private final String  username;

//    public  static Builder builder(){
//        return new Builder();
//    }
//
//    public static class Builder{
//        private  Long id;
//        private  String  username;
//
//
//        public  Builder id(Long id){
//            this.id = id;
//            return this;
//        }
//        public Builder username(String username){
//            this.username = username;
//            return this;
//        }
//
//        public UserResponse build(){
//            return new UserResponse(id,username);
//        }
//    }

}
