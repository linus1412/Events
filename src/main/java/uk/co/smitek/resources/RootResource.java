package uk.co.smitek.resources;

import javax.annotation.Resource;
import javax.ws.rs.Path;

/**
 * Created with IntelliJ IDEA.
 * User: martins
 * Date: 09/07/2013
 * Time: 01:16
 * To change this template use File | Settings | File Templates.
 */

@Resource
@Path("/")
public class RootResource {

    @Path("events")
    public Class<EventsResource> events() {
        System.out.print("In root");
        return EventsResource.class;
    }


}
