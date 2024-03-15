package org.wayfarr.webwayfarr.Payload.Request;


import lombok.Data;

@Data
public class UserRequest {
    private String username;
    private String correo;
    private String password;
    private String sexo;
    private String foto;
}
