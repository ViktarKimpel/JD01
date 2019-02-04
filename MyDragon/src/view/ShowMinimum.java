package view;

import java.util.Comparator;
import java.util.Collections;

import model.Artefact;
import model.Cave;

public class ShowMinimum {
	public Artefact minCost(Cave cave) {
		Artefact minCostArtefact = Collections.min(cave.getArtefacts(), new CostComparator());
		return minCostArtefact;
	}

	public class CostComparator implements Comparator<Artefact> {
		public int compare(Artefact a, Artefact b) {
			if (a.getCost() < b.getCost())
				return -1;
			if (a.getCost() == b.getCost())
				return 0;
			return 1;
		}
	}

}
