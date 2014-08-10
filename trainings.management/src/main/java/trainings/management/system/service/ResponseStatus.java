package trainings.management.system.service;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize
public enum ResponseStatus {
	OK, ERROR;
}
