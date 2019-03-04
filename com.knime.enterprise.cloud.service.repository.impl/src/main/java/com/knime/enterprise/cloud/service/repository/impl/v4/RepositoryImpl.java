package com.knime.enterprise.cloud.service.repository.impl.v4;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("foo")
@Produces(MediaType.APPLICATION_JSON)
public class RepositoryImpl {
    @GET
    public Response foo() {
        return Response.ok().build();
    }
}
