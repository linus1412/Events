package uk.co.smitek.resources;



import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;


public class RestApplication extends ResourceConfig {

    public RestApplication() {
        super(RootResource.class);

        register(JacksonFeature.class);

    }

//    @Override
//    public Set<Class<?>> getClasses() {
//        System.out.print("*************");
//        Set<Class<?>> classes = new HashSet<>();
//        classes.add(RootResource.class);
//        return classes;
//    }
}
