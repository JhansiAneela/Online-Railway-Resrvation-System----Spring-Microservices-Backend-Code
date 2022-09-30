
package com.usermicroservice.controller;

import com.usermicroservice.model.user;
import com.usermicroservice.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController 
{
    @Autowired
    private userService service;

    @PostMapping("/registeruser")
    @CrossOrigin(origins="http://localhost:4200")
    public user register_user(@RequestBody user user) throws Exception 
    {
        String temp_EmailId = user.getEmailId();
        if(temp_EmailId !=null && !"".equals(temp_EmailId))
        {
            user new_user_obj = service.fetch_user_by_EmailId(temp_EmailId);
            if(new_user_obj != null)
            {
                throw new Exception("User with same email exists, please Login!!");
            }
        }
        return service.save_user(user);
    }

    @PostMapping("/login")
    @CrossOrigin(origins="http://localhost:4200")
    public user login_user(@RequestBody user user) throws Exception 
    {
        String temp_EmailId = user.getEmailId();
        String temp_password = user.getPassword();
        user user_object = null;
        if(temp_EmailId != null && temp_password != null)
        {
            user user_obj = service.fetch_user_by_EmailId(temp_EmailId);
            /*if(user_obj == null)
            {
                throw new Exception("Account does not Exists, please register");
            }*/
            user_object = service.fetch_user_by_EmailId_and_password(temp_EmailId, temp_password);
            if(user_object == null)
            {
                throw new Exception("Invalid Credentials");
            }
        }
        return user_object;
    }
    
}
