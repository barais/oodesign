package fr.ensai.gl;

import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class SimpleIterator<E>  implements Iterator<E>, Observer{

	private List<E> wrappe ;

	public SimpleIterator(List<E> wrappe) throws Exception {
		super();
		if (wrappe== null)
			throw new Exception();
		this.wrappe = wrappe;
	}

	private int currentPos=0;
	private boolean initial=true;
	
	@Override
	public boolean hasNext() {
		return currentPos < wrappe.size();
	}

	@Override
	public E next() {
		currentPos =currentPos+1;
		return wrappe.get(currentPos-1);
	}

	@Override
	public void remove() {
		currentPos=0;

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg1 instanceof List<?> && initial){
			wrappe = (List<E>) arg1;
			initial =false;
		}
		
	}

}
