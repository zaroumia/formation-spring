package fr.zaroumia.formation.spring._008;

public class MaClasseSingleton {

	/**
	 * static Singleton instance.
	 */
	private static volatile MaClasseSingleton instance;

	/**
	 * Private constructor for singleton.
	 */
	private MaClasseSingleton() {
	}

	/**
	 * Return a singleton instance of MaClasseSingleton.
	 */
	public static MaClasseSingleton getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (MaClasseSingleton.class) {
				if (instance == null) {
					instance = new MaClasseSingleton();
				}
			}
		}
		return instance;
	}

	public void quiSuisJe() {
		System.out.println("je suis une classe Singleton");

	}
}
