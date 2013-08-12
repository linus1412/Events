package uk.co.smitek.resources;

import com.alibaba.fastjson.JSONObject;
import groovy.transform.CompileStatic;
import org.codehaus.groovy.runtime.DefaultGroovyMethods;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import uk.co.smitek.resources.Event;

//@CompileStatic
@Resource
public class EventsResource {

    public static Map<String, Event> getData() {
        return data;
    }

    public static void setData(Map<String, Event> data) {
        EventsResource.data = data;
    }

    private static Map<String, Event> data = new LinkedHashMap<>();

    static {
        Event e = new Event();
        e.setId("abc");
        e.setDescription("I know my alphabet");
        e.setDate(new Date());
        data.put("abc", e);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@Context UriInfo ui, String entity) {
        String id = java.util.UUID.randomUUID().toString();
        JSONObject json = JSONObject.parseObject(entity);
        json.put("id", id);
        DefaultGroovyMethods.println(this, json);

        Event e = new Event();
        e.setId(json.getString("id"));
        e.setDate(json.getDate("date"));
        e.setDescription(json.getString("description"));

        data.put(id, e);

        URI uri = ui.getAbsolutePathBuilder().path(id).build();

        return Response.created(uri).build();

    }

    @Path("/{id}")
    public Class<EventResource> event() {
        return EventResource.class;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response pants(@Context UriInfo ui) {
        return Response.ok(data.values()).build();
    }


}
