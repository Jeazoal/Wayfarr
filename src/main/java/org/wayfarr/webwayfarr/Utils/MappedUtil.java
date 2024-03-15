package org.wayfarr.webwayfarr.Utils;

import org.wayfarr.webwayfarr.Entity.User;
import org.wayfarr.webwayfarr.Payload.Request.UserRequest;
import org.wayfarr.webwayfarr.Payload.Responses.UserResponse;

public class MappedUtil {
    public static User toUserEntity(UserRequest userRequest){
        User user=new User();
        user.setUsername(userRequest.getUsername());
        user.setCorreo(userRequest.getCorreo());
        user.setPassword(userRequest.getPassword());
        user.setSexo(userRequest.getSexo());
        user.setFoto(userRequest.getFoto());
        return user;
    }

    public static UserResponse toUserResponse(User user){
        UserResponse response=new UserResponse();
        response.setIduser(user.getIduser());
        response.setUsername(user.getUsername());
        response.setCorreo(user.getCorreo());
        response.setPassword(user.getPassword());
        response.setSexo(user.getSexo());
        response.setFoto(user.getFoto());
        return response;
    }

}
