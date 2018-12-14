package company.entity;
// Generated Dec 14, 2018 12:08:36 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rights generated by hbm2java
 */
@Entity
@Table(name = "rights", catalog = "companymanagement")
public class Rights implements java.io.Serializable {

	private Integer idRights;
	private String describe;

	public Rights() {
	}

	public Rights(String describe) {
		this.describe = describe;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_rights", unique = true, nullable = false)
	public Integer getIdRights() {
		return this.idRights;
	}

	public void setIdRights(Integer idRights) {
		this.idRights = idRights;
	}

	@Column(name = "describe", length = 65535)
	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

}