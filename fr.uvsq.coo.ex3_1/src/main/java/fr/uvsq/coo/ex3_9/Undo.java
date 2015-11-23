package fr.uvsq.coo.ex3_9;

import java.util.Stack;

public class Undo extends Command {

	protected Stack history;

	public Undo(Stack h) {
		history = h;
	}

	@Override
	public Stack execute() {
		history.pop();
		return history;
	}

}
