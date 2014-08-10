package trainings.management.system.service;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.slf4j.Logger;

public abstract class BaseService {

	abstract protected Logger getLogger();

	protected Response errResponse(String errorMessage, Throwable cause) {
		getLogger().error(errorMessage, cause);
		return Response.serverError().type(APPLICATION_JSON).entity(new ServiceResponse(ResponseStatus.ERROR, errorMessage)).build();
	}

	protected Response okResponse() {
		return okResponse(null);
	}

	protected Response okResponse(Object content) {
		ServiceResponse resp = new ServiceResponse(ResponseStatus.OK, content);
		ResponseBuilder rb = Response.ok(resp, APPLICATION_JSON);
		return rb.build();
	}
}
