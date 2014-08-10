package trainings.management.system.persistence.model;

import static javax.persistence.TemporalType.DATE;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

import trainings.management.system.persistence.DbQueries;

@Entity
@NamedQueries({ @NamedQuery(name = DbQueries.GET_ALL_TEST_DB_ENTITIES, query = "SELECT req FROM DbTestEntity req"),
		@NamedQuery(name = DbQueries.GET_ALL_TEST_DB_ENTITIES_2, query = "SELECT req FROM DbTestEntity req") })
@Table(name = "DB_TEST_ENTITY"/* , uniqueConstraints = { @UniqueConstraint(columnNames = { "HCP_ACCOUNT_NAME" }) } */)
public class DbTestEntity implements IDBEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID")
	private long id;

	@Temporal(DATE)
	@Column(name = "JOB_START_DATE")
	private Date jobStartDate;

	@Column(name = "SALARY")
	private Double salary;

	@Column(name = "FIRST_NAME")
	private String firstName;

	private String lastName;

	public DbTestEntity() {
	}

	@Override
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getJobStartDate() {
		return jobStartDate;
	}

	public void setJobStartDate(Date jobStartDate) {
		this.jobStartDate = jobStartDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String param) {
		this.lastName = param;
	}

}
