package az.inheritedinterceptor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@ApplicationScoped
public class InheritedInterceptorResource {
    
    @Inject private Bean1A bean1a;
    @Inject private Bean1 bean1;

    @GET
    @Path("/bean1a")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return bean1a.service();
    }
    
    @GET
    @Path("/bean1")
    @Produces(MediaType.TEXT_PLAIN)
    public String test1() {
        return bean1.service();
    }
}
