package com.gwtpexample.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/v1/test")
public class RestResourceImpl {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRestResponse() {

		RestResponseDto restResponseDto = new RestResponseDto("ACCESS_TOKEN", "REFRESH_TOKEN");

		ResponseBuilder responseBuilder = Response.ok(restResponseDto, MediaType.APPLICATION_JSON);
		return responseBuilder.build();
	}
}