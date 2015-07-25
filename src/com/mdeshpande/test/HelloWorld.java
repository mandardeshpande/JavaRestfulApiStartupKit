package com.mdeshpande.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/greet")
public class HelloWorld {

	@GET
	@Path("/hello")
	public String greet() {
 
		return "HelloWorld";
	}

}
