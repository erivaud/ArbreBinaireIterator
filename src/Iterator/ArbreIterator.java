package Iterator;

import java.util.Iterator;

public class ArbreIterator implements Iterator<ArbreBinaire> {

	ArbreBinaire abToIterate;
	boolean gaveMyself;
	
	ArbreIterator fgIterator;
	ArbreIterator fdIterator;
	
	public ArbreIterator(ArbreBinaire abToIterate) {
		super();
		gaveMyself = false;
		this.abToIterate = abToIterate;
		if(abToIterate.getFilsGauche()!=null) {
			this.fgIterator = abToIterate.getFilsGauche().iterator();
		}
		if(abToIterate.getFilsDroit()!=null) {
			this.fdIterator = abToIterate.getFilsDroit().iterator();
		}
	}

	@Override
	public boolean hasNext() {
		if(this.fgIterator!=null && this.fgIterator.hasNext()) {
			return true;
		}
		else if(this.fdIterator!=null && this.fdIterator.hasNext()) {
			return true;
		}
		else if(!gaveMyself) {
			return true;
		}
		return false;
	}

	@Override
	public ArbreBinaire next() {
		if(this.fgIterator!=null && this.fgIterator.hasNext()) {
			return fgIterator.next();
		}
		else if(this.fdIterator!=null && this.fdIterator.hasNext()) {
			return fdIterator.next();
		}
		else if(!gaveMyself) {
			gaveMyself = true ;
			return this.abToIterate;
		}
		return null;
	}

}
