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
 * Certificate generated by hbm2java
 */
@Entity
@Table(name = "certificate", catalog = "companymanagement")
public class Certificate implements java.io.Serializable {

	private Integer idCertificate;
	private String typeOfCertificate;
	private String issuedBy;
	private Date duration;
	private String attachedFiles;
	private String note;

	public Certificate() {
	}

	public Certificate(String typeOfCertificate, String issuedBy, Date duration, String attachedFiles, String note) {
		this.typeOfCertificate = typeOfCertificate;
		this.issuedBy = issuedBy;
		this.duration = duration;
		this.attachedFiles = attachedFiles;
		this.note = note;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_certificate", unique = true, nullable = false)
	public Integer getIdCertificate() {
		return this.idCertificate;
	}

	public void setIdCertificate(Integer idCertificate) {
		this.idCertificate = idCertificate;
	}

	@Column(name = "typeOfCertificate", length = 45)
	public String getTypeOfCertificate() {
		return this.typeOfCertificate;
	}

	public void setTypeOfCertificate(String typeOfCertificate) {
		this.typeOfCertificate = typeOfCertificate;
	}

	@Column(name = "issued_by", length = 45)
	public String getIssuedBy() {
		return this.issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "duration", length = 10)
	public Date getDuration() {
		return this.duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	@Column(name = "attached_files", length = 45)
	public String getAttachedFiles() {
		return this.attachedFiles;
	}

	public void setAttachedFiles(String attachedFiles) {
		this.attachedFiles = attachedFiles;
	}

	@Column(name = "note", length = 65535)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
