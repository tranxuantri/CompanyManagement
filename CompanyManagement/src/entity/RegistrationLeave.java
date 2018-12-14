package entity;
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
 * RegistrationLeave generated by hbm2java
 */
@Entity
@Table(name = "registration_leave", catalog = "companymanagement")
public class RegistrationLeave implements java.io.Serializable {

	private Integer idAbsent;
	private Integer idEmployee;
	private Date day;
	private Date toDay;
	private String typeOfLeave;
	private Integer totalDay;
	private String status;

	public RegistrationLeave() {
	}

	public RegistrationLeave(Integer idEmployee, Date day, Date toDay, String typeOfLeave, Integer totalDay,
			String status) {
		this.idEmployee = idEmployee;
		this.day = day;
		this.toDay = toDay;
		this.typeOfLeave = typeOfLeave;
		this.totalDay = totalDay;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_absent", unique = true, nullable = false)
	public Integer getIdAbsent() {
		return this.idAbsent;
	}

	public void setIdAbsent(Integer idAbsent) {
		this.idAbsent = idAbsent;
	}

	@Column(name = "id_employee")
	public Integer getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "day", length = 10)
	public Date getDay() {
		return this.day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "to_day", length = 10)
	public Date getToDay() {
		return this.toDay;
	}

	public void setToDay(Date toDay) {
		this.toDay = toDay;
	}

	@Column(name = "typeOfLeave", length = 45)
	public String getTypeOfLeave() {
		return this.typeOfLeave;
	}

	public void setTypeOfLeave(String typeOfLeave) {
		this.typeOfLeave = typeOfLeave;
	}

	@Column(name = "total_day")
	public Integer getTotalDay() {
		return this.totalDay;
	}

	public void setTotalDay(Integer totalDay) {
		this.totalDay = totalDay;
	}

	@Column(name = "status", length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
