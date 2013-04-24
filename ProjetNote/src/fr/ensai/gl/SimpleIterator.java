package fr.ensai.gl;

import java.util.Iterator;
import java.util.List;

public class SimpleIterator<E>  implements Iterator<E>{

	private List<E> wrappe ;

	public SimpleIterator(List<E> wrappe) throws Exception {
		super();
		if (wrappe== null)
			throw new Exception();
		this.wrappe = wrappe;
	}

	private int currentPos=0;
	
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

}
