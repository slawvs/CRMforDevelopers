package pl.slawek.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class EnteredEvent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2146865010955655225L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_enteredEvent")
	private Long id;
	@OneToOne
	private Client client;
	@ManyToOne
	@JoinColumn(name = "agent_id")
	private Agent agent;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "user_original_id")
	private User userOriginal;
	private Timestamp whenn;
	private Date whenWas;
	private Integer confirmed;
	private Integer wasReservation;
	private Integer showContactMada;
    @ManyToMany
    @JoinTable(name = "event_investments",
       joinColumns = {@JoinColumn(name="EnteredEvent_id", referencedColumnName="id_enteredEvent")},
       inverseJoinColumns = {@JoinColumn(name="investment_id", referencedColumnName="id_investment")}
    )
	private List<Investment> investments;
	
    public EnteredEvent() {
	}
	
	public EnteredEvent(Long id, Client client) {
		this.id = id;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUserOriginal() {
		return userOriginal;
	}

	public void setUserOriginal(User userOriginal) {
		this.userOriginal = userOriginal;
	}

	public Timestamp getWhen() {
		return whenn;
	}

	public void setWhen(Timestamp whenn) {
		this.whenn = whenn;
	}

	public Date getWhenWas() {
		return whenWas;
	}

	public void setWhenWas(Date whenWas) {
		this.whenWas = whenWas;
	}

	public Integer getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}

	public Integer getWasReservation() {
		return wasReservation;
	}

	public void setWasReservation(Integer wasReservation) {
		this.wasReservation = wasReservation;
	}

	public Integer getShowContactMada() {
		return showContactMada;
	}

	public void setShowContactMada(Integer showContactMada) {
		this.showContactMada = showContactMada;
	}
	
	
}
