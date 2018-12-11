package pl.slawek.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8561491908877666255L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_client")
	private Long id;
	private String name;
	private String surname;
	private String local;
	private String phoneNumber;
	private String email;
	private Integer agreement;
	private Integer credit;
	private String note;
	private Integer status;
	private Integer aboutOfert;
	private Integer pContact;
	
	public Client() {
	}
	
	public Client(Long id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAgreement() {
		return agreement;
	}

	public void setAgreement(Integer agreement) {
		this.agreement = agreement;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAboutOfert() {
		return aboutOfert;
	}

	public void setAboutOfert(Integer aboutOfert) {
		this.aboutOfert = aboutOfert;
	}

	public Integer getpContact() {
		return pContact;
	}

	public void setpContact(Integer pContact) {
		this.pContact = pContact;
	}
	
	
	
}
