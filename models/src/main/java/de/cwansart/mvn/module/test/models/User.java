package de.cwansart.mvn.module.test.models;

public class User implements IUser {

    private final String username;
    private final int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
