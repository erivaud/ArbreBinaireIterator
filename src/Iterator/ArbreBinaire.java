package Iterator;

import java.util.Iterator;

public class ArbreBinaire implements Iterable<ArbreBinaire> {
	
	private String etiquette;
	public ArbreBinaire filsGauche;
	public ArbreBinaire filsDroit;

	public ArbreBinaire(String etiquette) {
		super();
		this.setEtiquette(etiquette);
	}


	@Override
	public ArbreIterator iterator() {
		return new ArbreIterator(this);
	}

	public String getEtiquette() {
		return etiquette;
	}
	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
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
	
	public ArbreBinaire getFilsGauche() {
		return filsGauche;
	}

}
