package fr.ensai.gl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class  SimpleList<E>  implements List<E>{

	private ArrayList<E> wrappe = new ArrayList<E>();	

	@Override
	public boolean add(E e) {
		return wrappe.add(e);
	}

	@Override
	public void add(int index, E element) {

		wrappe.add(index, element);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {

		return wrappe.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {

		return wrappe.addAll(index, c);
	}

	@Override
	public void clear() {

		wrappe.clear();
	}

	@Override
	public Object clone() {

		return wrappe.clone();
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

	public void trimToSize() {
		wrappe.trimToSize();
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
	public Iterator<E> iterator() {

		try {
			return new SimpleIterator<E>(wrappe);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
