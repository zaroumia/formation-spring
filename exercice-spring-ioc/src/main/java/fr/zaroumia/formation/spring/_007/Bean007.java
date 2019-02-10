package fr.zaroumia.formation.spring._007;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Bean007 {

	private int entier;
	private double reel;
	private String chaine;
	private boolean booleen;
	private char caractere;
	private Properties properties;
	private Locale localisation;
	private URL url;
	private File fichier;
	private byte[] tableauBytes;
	private String[] tableauChaines;
	private Map<String, String> map;
	private List<String> list;
	private Set<String> set;

	public int getEntier() {
		return entier;
	}

	public void setEntier(final int entier) {
		this.entier = entier;
	}

	public double getReel() {
		return reel;
	}

	public void setReel(final double reel) {
		this.reel = reel;
	}

	public String getChaine() {
		return chaine;
	}

	public void setChaine(final String chaine) {
		this.chaine = chaine;
	}

	public boolean isBooleen() {
		return booleen;
	}

	public void setBooleen(final boolean booleen) {
		this.booleen = booleen;
	}

	public char getCaractere() {
		return caractere;
	}

	public void setCaractere(final char caractere) {
		this.caractere = caractere;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(final Properties properties) {
		this.properties = properties;
	}

	public Locale getLocalisation() {
		return localisation;
	}

	public void setLocalisation(final Locale localisation) {
		this.localisation = localisation;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(final URL url) {
		this.url = url;
	}

	public File getFichier() {
		return fichier;
	}

	public void setFichier(final File fichier) {
		this.fichier = fichier;
	}

	public byte[] getTableauBytes() {
		return tableauBytes;
	}

	public void setTableauBytes(final byte[] tableayBytes) {
		this.tableauBytes = tableayBytes;
	}

	public String[] getTableauChaines() {
		return tableauChaines;
	}

	public void setTableauChaines(final String[] tableauChaines) {
		this.tableauChaines = tableauChaines;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(final Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(final List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(final Set<String> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
