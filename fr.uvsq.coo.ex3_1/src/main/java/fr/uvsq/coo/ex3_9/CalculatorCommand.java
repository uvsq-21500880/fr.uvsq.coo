package fr.uvsq.coo.ex3_9;

import java.util.Stack;

public abstract class CalculatorCommand extends Command {

	// protected Stack history;
	protected Stack valuehistory;

	private Undo undoer = new Undo(valuehistory);

	public Stack undo() {
		return undoer.execute();
	}

	public abstract Stack execute();

}
