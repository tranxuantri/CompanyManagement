package company.entity;
// Generated Dec 14, 2018 12:08:36 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProgramingLanguage generated by hbm2java
 */
@Entity
@Table(name = "programing_language", catalog = "companymanagement")
public class ProgramingLanguage implements java.io.Serializable {

	private Integer idLanguage;
	private String nameLanguage;

	public ProgramingLanguage() {
	}

	public ProgramingLanguage(String nameLanguage) {
		this.nameLanguage = nameLanguage;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_language", unique = true, nullable = false)
	public Integer getIdLanguage() {
		return this.idLanguage;
	}

	public void setIdLanguage(Integer idLanguage) {
		this.idLanguage = idLanguage;
	}

	@Column(name = "name_language", length = 45)
	public String getNameLanguage() {
		return this.nameLanguage;
	}

	public void setNameLanguage(String nameLanguage) {
		this.nameLanguage = nameLanguage;
	}

}
