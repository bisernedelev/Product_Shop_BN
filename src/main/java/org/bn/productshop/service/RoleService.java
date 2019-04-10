package org.bn.productshop.service;

import java.util.Set;
import org.bn.productshop.domain.models.service.RoleServiceModel;


public interface RoleService {

    void seedRolesInDb();

//    void assignUserRoles(UserServiceModel userServiceModel, long numberOfUsers);

    Set<RoleServiceModel> findAllRoles();

    RoleServiceModel findByAuthority(String authority);
}
