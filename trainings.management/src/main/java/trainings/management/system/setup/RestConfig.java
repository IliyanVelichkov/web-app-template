package trainings.management.system.setup;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import trainings.management.system.service.TestService;
import trainings.management.system.service.UserService;

public class RestConfig extends Application {
	private Set<Object> singletons = new HashSet<>();

	public RestConfig() {
		singletons.add(new JacksonJsonProvider());
		singletons.add(new TestService());
		singletons.add(new UserService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
