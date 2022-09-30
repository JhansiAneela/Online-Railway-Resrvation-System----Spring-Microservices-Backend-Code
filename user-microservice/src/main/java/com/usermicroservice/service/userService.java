package com.usermicroservice.service;

import com.usermicroservice.model.user;
import com.usermicroservice.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//import java.util.List;
//import java.util.Optional;

//@Repository
@Service
public class userService 
{

    @Autowired
    private userRepository userRepository;

    public user save_user(user user)
    {
        return userRepository.save(user);
    }

    public user fetch_user_by_EmailId(String emailId)
    {
        return userRepository.findByEmailId(emailId);
    }

    public user fetch_user_by_EmailId_and_password(String emailId, String password)
    {
        return userRepository.findByEmailIdAndPassword(emailId,password);
    }

}
