package fr.uvsq.coo.ex3_9;

import java.util.Hashtable;
import java.util.Stack;

public class Interpreter {

	protected Stack history = new Stack();
	protected Hashtable set = new Hashtable();

	public void session() {
		while (true) {
			Command command = getNewCommand();
			command.execute();
			if (command instanceof Quit) {
				return;
			} else {
				command.execute();
			}
		}
	}

	protected Command getNewCommand() {
		return null;
	}

}
