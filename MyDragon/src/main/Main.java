package main;

import java.util.ArrayList;
import model.Artefact;
import model.Cave;
import view.ShowAll;
import view.ShowMaximum;
import view.ShowMinimum;

public class Main {

	public static void main(String[] args) {
		Cave cave = new Cave(new ArrayList<Artefact>());
		ShowAll s = new ShowAll();
		s.fillCave(5, cave);
		System.out.println(cave);
		ShowMinimum sm = new ShowMinimum();
		sm.minCost(cave);
		System.out.println(sm.minCost(cave));
		ShowMaximum smax = new ShowMaximum();
		smax.maxCost(cave);
		System.out.println(smax.maxCost(cave));
		
	}

}
