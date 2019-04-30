package pl.slawek.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 638028842738620999L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nameOnWebPage;
	private String description;
	private String fileName;
	private Integer active;
	
	public Document() {
	}

	public Document(Long id, String nameOnWebPage, String description, String fileName, Integer active) {
		this.id = id;
		this.nameOnWebPage = nameOnWebPage;
		this.description = description;
		this.fileName = fileName;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameOnWebPage() {
		return nameOnWebPage;
	}

	public void setNameOnWebPage(String nameOnWebPage) {
		this.nameOnWebPage = nameOnWebPage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}
	
}
