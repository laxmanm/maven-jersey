package com.ace.holidays.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ace.holidays.service.TestService;

@Component
@Path("/test")
public class TestController {

	@Autowired
	TestService testService;

	@GET
	@Path("/hello")
	public Response helloworld() {
		String result = testService.sayHello();
		return Response.status(200).entity(result).build();
	}
}