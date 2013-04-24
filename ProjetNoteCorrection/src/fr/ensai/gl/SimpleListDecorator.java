package fr.ensai.gl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class  SimpleListDecorator<E>  extends java.util.Observable implements List<E>{

	private List<E> wrappe;	

	public SimpleListDecorator(List<E> wrappe) {
		super();
		this.wrappe = wrappe;
	}

	@Override
	public boolean add(E e) {
		List<E> copy = new SimpleList<E>();
		copy.addAll(wrappe);
		this.setChanged();
		this.notifyObservers(copy);
		return wrappe.add(e);
	}

	@Override
	public void add(int index, E element) {
		List<E> copy = new SimpleList<E>();
		copy.addAll(wrappe);
		this.notifyObservers(copy);
		this.setChanged();
		wrappe.add(index, element);

	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		List<E> copy = new SimpleList<E>();
		copy.addAll(wrappe);
		this.notifyObservers(copy);
		this.setChanged();

		return wrappe.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		List<E> copy = new SimpleList<E>();
		copy.addAll(wrappe);
		this.notifyObservers(copy);
		this.setChanged();

		return wrappe.addAll(index, c);
	}

	@Override
	public void clear() {
		List<E> copy = new SimpleList<E>();
		copy.addAll(wrappe);
		this.notifyObservers(copy);
		this.setChanged();

		wrappe.clear();
	}

	public Iterator<E> iterator() {

		try {
			SimpleIterator<E> it =new SimpleIterator<E>(wrappe);
			this.addObserver(it);
			return it;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	@Override
	public boolean contains(Object o) {

		return wrappe.contains(o);
	}


	@Override
	public E get(int index) {

		return wrappe.get(index);
	}

	@Override
	public int indexOf(Object o) {

		return wrappe.indexOf(o);
	}

	@Override
	public boolean isEmpty() {

		return wrappe.isEmpty();
	}

	@Override
	public int lastIndexOf(Object o) {

		return wrappe.lastIndexOf(o);
	}

	@Override
	public E remove(int index) {

		return wrappe.remove(index);
	}

	@Override
	public boolean remove(Object o) {

		return wrappe.remove(o);
	}


	@Override
	public E set(int index, E element) {

		return wrappe.set(index, element);
	}

	@Override
	public int size() {

		return wrappe.size();
	}

	@Override
	public Object[] toArray() {

		return wrappe.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {

		return wrappe.toArray(a);
	}

	@Override
	public boolean equals(Object arg0) {

		return wrappe.equals(arg0);
	}

	@Override
	public int hashCode() {

		return wrappe.hashCode();
	}


	@Override
	public ListIterator<E> listIterator() {

		return wrappe.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {

		return wrappe.listIterator(arg0);
	}

	@Override
	public List<E> subList(int arg0, int arg1) {

		return wrappe.subList(arg0, arg1);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {

		return wrappe.containsAll(arg0);
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {

		return wrappe.removeAll(arg0);
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {

		return wrappe.retainAll(arg0);
	}

	@Override
	public String toString() {

		return wrappe.toString();
	}


}
