package fr.uvsq.coo.ex4_1;

public interface DAO {

	final String filename = "database";

	public abstract Element createElement(Element e);

	public abstract Element find(String id);

	public abstract Element updateElement(Element e);

	public abstract Element deleteElement(Element e);

}
