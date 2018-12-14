package entity;
// Generated Dec 14, 2018 12:08:36 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name = "department", catalog = "companymanagement")
public class Department implements java.io.Serializable {

	private Integer idDepartment;
	private String nameDepartment;
	private String quest;
	private String describe;

	public Department() {
	}

	public Department(String nameDepartment, String quest, String describe) {
		this.nameDepartment = nameDepartment;
		this.quest = quest;
		this.describe = describe;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_department", unique = true, nullable = false)
	public Integer getIdDepartment() {
		return this.idDepartment;
	}

	public void setIdDepartment(Integer idDepartment) {
		this.idDepartment = idDepartment;
	}

	@Column(name = "name_department", length = 45)
	public String getNameDepartment() {
		return this.nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	@Column(name = "quest", length = 45)
	public String getQuest() {
		return this.quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	@Column(name = "describe", length = 65535)
	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

}
