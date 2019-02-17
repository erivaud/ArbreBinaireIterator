package model;

import java.util.Iterator;

import Iterator.ArbreBinaireIterator;

public class ArbreBinaire implements ArbreBinaireIterator{
	
	private String etiquette;
	private ArbreBinaire filsGauche;
	private ArbreBinaire filsDroit;
	
	public ArbreBinaire(String etiquette) {
		this.setEtiquette(etiquette);
	}

	public ArbreBinaire getFilsGauche() {
		return filsGauche;
	}

	public void setFilsGauche(ArbreBinaire filsGauche) {
		this.filsGauche = filsGauche;
	}

	public ArbreBinaire getFilsDroit() {
		return filsDroit;
	}

	public void setFilsDroit(ArbreBinaire filsDroit) {
		this.filsDroit = filsDroit;
	}

	public String getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}

	@Override
	public Iterator<ArbreBinaire> createIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
