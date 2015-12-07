package fr.uvsq.coo.ex4_2;

public abstract class DAO<T> {

	public abstract T create(T e);

	public abstract T find(String id);

	public abstract T update(T e);

	public abstract T delete(T e);

}
