package de.cwansart.mvn.module.test.application;

import de.cwansart.mvn.module.test.models.IUser;
import de.cwansart.mvn.module.test.models.User;

import java.util.Arrays;
import java.util.List;

public class UserRepository implements IUserRepository {

    private final List<IUser> users = Arrays.asList(
            new User("Karl", 21),
            new User("Kristina", 25),
            new User("Foo", 50)
    );

    @Override
    public List<IUser> getUsers() {
        return users;
    }
}
