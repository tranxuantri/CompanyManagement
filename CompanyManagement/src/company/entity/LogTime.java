package company.entity;
// Generated Dec 14, 2018 12:08:36 PM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LogTime generated by hbm2java
 */
@Entity
@Table(name = "log_time", catalog = "companymanagement")
public class LogTime implements java.io.Serializable {

	private Integer idLog;
	private Integer idEmployee;
	private Integer idProject;
	private String role;
	private Integer time;
	private String describe;
	private Date dayLog;
	private String status;

	public LogTime() {
	}

	public LogTime(Integer idEmployee, Integer idProject, String role, Integer time, String describe, Date dayLog,
			String status) {
		this.idEmployee = idEmployee;
		this.idProject = idProject;
		this.role = role;
		this.time = time;
		this.describe = describe;
		this.dayLog = dayLog;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_log", unique = true, nullable = false)
	public Integer getIdLog() {
		return this.idLog;
	}

	public void setIdLog(Integer idLog) {
		this.idLog = idLog;
	}

	@Column(name = "id_employee")
	public Integer getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	@Column(name = "id_project")
	public Integer getIdProject() {
		return this.idProject;
	}

	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}

	@Column(name = "role", length = 45)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column(name = "time")
	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	@Column(name = "describe", length = 65535)
	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dayLog", length = 10)
	public Date getDayLog() {
		return this.dayLog;
	}

	public void setDayLog(Date dayLog) {
		this.dayLog = dayLog;
	}

	@Column(name = "status", length = 65535)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
