package org.wayfarr.webwayfarr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wayfarr.webwayfarr.Entity.User;
import org.wayfarr.webwayfarr.Payload.Request.UserRequest;
import org.wayfarr.webwayfarr.Services.UserServices;
import org.wayfarr.webwayfarr.Shared.BaseResponse;
import org.wayfarr.webwayfarr.Utils.MappedUtil;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserServices userServices;


    @PostMapping("")
    public ResponseEntity<BaseResponse> createUser(@RequestBody UserRequest userRequest) {
        try {
            User user= userServices.createUser(MappedUtil.toUserEntity(userRequest));
            return new ResponseEntity<BaseResponse>(BaseResponse.success(MappedUtil.toUserResponse(user)), HttpStatus.CREATED) ;
        } catch (Exception e) {
            return new ResponseEntity<BaseResponse>(BaseResponse.error(e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{iduser}")
    public ResponseEntity<BaseResponse> listUserForId(@PathVariable Integer iduser) {
        try {
            User user=userServices.listUserForId(iduser);

            return new ResponseEntity<BaseResponse>(BaseResponse.success(MappedUtil.toUserResponse(user)),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<BaseResponse>(BaseResponse.error(e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{idUser}")
    public ResponseEntity<BaseResponse>editUser(@PathVariable Integer idUser ,@RequestBody UserRequest userRequest){
        try {
            User user=MappedUtil.toUserEntity(userRequest);
            user.setIduser(idUser);

            User newUser = userServices.editUser(user);
            return new ResponseEntity<BaseResponse>(
                    BaseResponse.success(MappedUtil.toUserResponse(newUser)),
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<BaseResponse>(
                    BaseResponse.error(e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

    @PatchMapping("/delete/{idUser}")
    public ResponseEntity<BaseResponse> deleteUser(@PathVariable Integer idUser) {
        try {
            userServices.deleteUser(idUser);
            return new ResponseEntity<BaseResponse>(BaseResponse.success(null), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<BaseResponse>(
                    BaseResponse.error(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }





}
