package pl.slawek.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Investment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5240605327938064245L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_investment")
	private Long id;
	private String name;
	private String shortName;
	private Integer active;
	@ManyToMany(mappedBy = "investments")
	private List<EnteredEvent> events;
	public Investment() {
	}
	
	public Investment(Long id, String name, String shortName, Integer active) {
		this.id = id;
		this.name = name;
		this.shortName = shortName;
		this.active = active;
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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}
	
	
}
