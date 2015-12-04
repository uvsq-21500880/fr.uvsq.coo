package fr.uvsq.coo.ex4_1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ElementDAO implements DAO {

	public Element createElement(Element e) {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(filename)))) {

			out.writeObject(e);
			return e;
		} catch (Exception ex) {
			return null;
		}

	}

	@Override
	public Element find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element updateElement(Element e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element deleteElement(Element e) {
		// TODO Auto-generated method stub
		return null;
	}

}
