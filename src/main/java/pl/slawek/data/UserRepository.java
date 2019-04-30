package pl.slawek.data;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.slawek.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
