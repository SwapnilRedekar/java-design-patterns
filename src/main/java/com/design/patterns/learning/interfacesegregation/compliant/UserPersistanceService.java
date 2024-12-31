package com.design.patterns.learning.interfacesegregation.compliant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserPersistanceService implements PersistanceService<User> {

    private static final List<User> USERS = new ArrayList<>();

    @Override
    public void save(User user) {
        USERS.add(user);
    }

    @Override
    public void delete(User user) {
        USERS.remove(user);
    }

    @Override
    public User findById(long id) {
        return USERS.stream()
        .filter(user -> user.getId() == id)
        .findFirst()
        .orElse(null);
    }

    /* This method is specific to UserPersistanceService. It is not required in OrderPersistanceService.
     * Hence, it is not defined in PersistanceService interface.
     * This is an example of Interface Segregation Principle.
     */
    public User findByName(String name) {
        return USERS.stream()
        .filter(user -> Objects.equals(user.getName(), name))
        .findFirst()
        .orElse(null);
    }

}
