package org.wayfarr.webwayfarr.Payload.Responses;

import lombok.Data;

@Data
public class UserResponse {
    private Integer iduser;
    private String username;
    private String correo;
    private String password;
    private String sexo;
    private String foto;
}
