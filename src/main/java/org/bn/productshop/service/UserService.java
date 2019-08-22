package org.bn.productshop.service;

import java.util.List;
import org.bn.productshop.domain.models.service.UserServiceModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserServiceModel registerUser(UserServiceModel userServiceModel);

    
    UserServiceModel findUserByUserName(String username);

    
    UserServiceModel editUserProfile(UserServiceModel userServiceModel, String oldPassword);
    

    List<UserServiceModel> findAllUsers();
    

    void setUserRole(String id, String role);
}
