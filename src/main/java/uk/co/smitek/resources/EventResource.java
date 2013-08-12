package uk.co.smitek.resources;

import groovy.transform.CompileStatic;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Resource
//@CompileStatic
public class EventResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(@PathParam("id") String id) {

        return Response.ok(EventsResource.getData().get(id)).build();
    }

}
