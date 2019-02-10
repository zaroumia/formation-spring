package fr.zaroumia.formation.spring._035;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import fr.zaroumia.formation.spring.modele.User;

@Component
public class UserService {

	private final List<User> usersCollection;

	public UserService() {
		usersCollection = new ArrayList<>();
		usersCollection.add(new User("zaroumia", "zaroumia@gmail.com"));
		usersCollection.add(new User("mowmow", "mowmow@gmail.com"));
		usersCollection.add(new User("younes", "younes@gmail.com"));
	}

	public boolean isUsernameExists(final String username) {

		return usersCollection.stream().map(User::getUsername).anyMatch(e -> e.equals(username));
	}

	public User getUser(final String username) {
		return usersCollection.stream().filter(e -> e.getUsername().equals(username)).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("username introuvable"));
	}
}
