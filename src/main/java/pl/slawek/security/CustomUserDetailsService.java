package pl.slawek.security;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import pl.slawek.data.UserRepository;
import pl.slawek.model.User;


public class CustomUserDetailsService implements UserDetailsService {

	private UserRepository userRepository;
	
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found");
		}
        List<CustomGrantedAuthority> authorities = new LinkedList<CustomGrantedAuthority>();
        authorities.add(new CustomGrantedAuthority("user"));
		org.springframework.security.core.userdetails.User userDetails =
				new org.springframework.security.core.userdetails.User(
						user.getUsername(),
						user.getPassword(),
						authorities);
		return userDetails;
	}

}
