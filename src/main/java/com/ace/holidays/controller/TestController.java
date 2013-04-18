package com.ace.holidays.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ace.holidays.model.User;
import com.ace.holidays.service.TestService;

@Component
@Path("/greet")
public class TestController {

	@Autowired
	TestService testService;

	@GET
	@Path("/name/{name}")
	public Response helloworld(@PathParam("name") String name) {
		User user = new User();
		user.setName(name);
		String result = testService.sayHello(user);
		return Response.status(200).entity(result).build();
	}
}