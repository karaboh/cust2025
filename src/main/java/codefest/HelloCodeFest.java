package codefest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloCodeFest {

  @GET
    @Produces("text/*")
    //@Path("/{message}")
    public Response echoService(@QueryParam("message") String message)
    {
     return Response.status(200).entity(message).build();
     // return "World";
        }
}