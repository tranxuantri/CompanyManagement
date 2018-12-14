package company.entity;
// Generated Dec 14, 2018 12:08:36 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MemberProject generated by hbm2java
 */
@Entity
@Table(name = "member_project", catalog = "companymanagement")
public class MemberProject implements java.io.Serializable {

	private MemberProjectId id;
	private Integer idRole;

	public MemberProject() {
	}

	public MemberProject(MemberProjectId id) {
		this.id = id;
	}

	public MemberProject(MemberProjectId id, Integer idRole) {
		this.id = id;
		this.idRole = idRole;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idEmployee", column = @Column(name = "id_employee", nullable = false)),
			@AttributeOverride(name = "idProject", column = @Column(name = "id_project", nullable = false)) })
	public MemberProjectId getId() {
		return this.id;
	}

	public void setId(MemberProjectId id) {
		this.id = id;
	}

	@Column(name = "id_role")
	public Integer getIdRole() {
		return this.idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}

}