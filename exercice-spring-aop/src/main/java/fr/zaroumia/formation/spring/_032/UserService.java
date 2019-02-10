package fr.zaroumia.formation.spring._032;

import java.util.ArrayList;
import java.util.List;

import fr.zaroumia.formation.spring.modele.User;

public class UserService {

	private MonLogger logger;
	private final List<User> usersCollection;

	public UserService() {
		usersCollection = new ArrayList<>();
		usersCollection.add(new User("zaroumia", "zaroumia@gmail.com"));
		usersCollection.add(new User("mowmow", "mowmow@gmail.com"));
		usersCollection.add(new User("younes", "younes@gmail.com"));
	}

	public boolean isUsernameExists(final String username) {
		logger.LogDebutMethode("UserService", "isUsernameExists");

		boolean anyMatch = usersCollection.stream().map(User::getUsername).anyMatch(e -> e.equals(username));

		logger.LogFinMethode("UserService", "isUsernameExists");

		return anyMatch;
	}

	public User getUser(final String username) {
		logger.LogDebutMethode("UserService", "isUsernameExists");

		User user = usersCollection.stream().filter(e -> e.getUsername().equals(username)).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("username introuvable"));

		logger.LogFinMethode("UserService", "isUsernameExists");

		return user;
	}
}
