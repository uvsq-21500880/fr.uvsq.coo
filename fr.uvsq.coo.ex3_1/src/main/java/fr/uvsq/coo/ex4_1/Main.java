package fr.uvsq.coo.ex4_1;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<NumeroTelephone> numerosTelephone = new List<NumeroTelephone>() {

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<NumeroTelephone> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public NumeroTelephone set(int index, NumeroTelephone element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public NumeroTelephone remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public ListIterator<NumeroTelephone> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<NumeroTelephone> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Iterator<NumeroTelephone> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public NumeroTelephone get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean addAll(int index,
					Collection<? extends NumeroTelephone> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends NumeroTelephone> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, NumeroTelephone element) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean add(NumeroTelephone e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		numerosTelephone.add(new NumeroTelephone(32568540,
				TypeNumero.FIXE_PERSO));

		// Element[] elements = new Element[5];
		Personnel p1, p2;
		Personnel.Builder builder1 = new Personnel.Builder("LEAO", "Robert",
				new Date(22215), numerosTelephone);
		p1 = builder1.build();
		Personnel.Builder builder2 = new Personnel.Builder("MANE", "Sira",
				new Date(78216), numerosTelephone);
		p2 = builder2.build();
		String filename = "carnet3.txt";

		p1.insertPersonnel(filename);
		p2.insertPersonnel(filename);

	}
}
