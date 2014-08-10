package trainings.management.system.service;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
public class ServiceResponse {

	private ResponseStatus status;
	private Object response;

	public ServiceResponse() {

	}

	public ServiceResponse(ResponseStatus status, Object response) {
		this.status = status;
		this.response = response;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

}
