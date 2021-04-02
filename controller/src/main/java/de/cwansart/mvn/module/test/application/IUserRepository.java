package de.cwansart.mvn.module.test.application;

import de.cwansart.mvn.module.test.models.IUser;

import java.util.List;

public interface IUserRepository {
    List<IUser> getUsers();
}
