package RESTFulWebService.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_Status {
	
	private static final String api_version = "00.01.00";
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String returnTitle () 
	{
		return "Java Web Service";
 	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String returnVersion () 
	{
		return "Version: " + api_version;
 	}
}
