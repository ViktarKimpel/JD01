package command;

import model.Cave;

public interface Command {
	public Cave fillCave(int size, Cave cave);
	
}
