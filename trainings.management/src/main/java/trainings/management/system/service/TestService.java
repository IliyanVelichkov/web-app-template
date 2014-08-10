package trainings.management.system.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import trainings.management.system.persistence.DbQueries;
import trainings.management.system.persistence.manager.EntityManagerProvider;
import trainings.management.system.persistence.model.DbTestEntity;

@Produces(MediaType.APPLICATION_JSON)
@Path("/test")
public class TestService extends BaseService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings("unchecked")
	@GET
	@Path("/dbtestentities")
	public Response getSfSfRequisitions() {
		EntityManager em = EntityManagerProvider.INSTANCE.get();

		Query query = em.createNamedQuery(DbQueries.GET_ALL_TEST_DB_ENTITIES);
		List<DbTestEntity> resultList = query.getResultList();

		return okResponse(resultList);
	}

	@Override
	protected Logger getLogger() {
		return this.logger;
	}

}
