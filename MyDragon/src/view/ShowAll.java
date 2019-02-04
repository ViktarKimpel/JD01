package view;

import java.util.ArrayList;

import command.Command;
import model.Artefact;
import model.Cave;

public class ShowAll implements Command {
	@Override
	public Cave fillCave(int size, Cave cave) {
		ArrayList<Artefact> artefacts = new ArrayList<Artefact>();
		for (int i = 0; i < size; i++) {
			artefacts.add(new Artefact("Ring" + i,(int)(Math.random() * 10)));
		}
		cave.setArtefacts(artefacts);
		return cave;
		
	}
}
