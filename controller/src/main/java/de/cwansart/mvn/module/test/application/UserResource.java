package de.cwansart.mvn.module.test.application;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("users")
public class UserResource {

    @GET
    public Response getUsers() {
        return null;
    }
}
