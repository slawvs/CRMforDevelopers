package pl.slawek.security;

import org.springframework.security.core.GrantedAuthority;

public class CustomGrantedAuthority implements GrantedAuthority {

	String role = "User";
	
	public void setRole(String role) {
		this.role = role;
	}

	public CustomGrantedAuthority(String role) {
		super();
		this.role = role;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return role;
	}

}
