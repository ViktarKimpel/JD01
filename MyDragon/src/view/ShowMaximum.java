package view;

import java.util.Collections;
import java.util.Comparator;

import model.Artefact;
import model.Cave;

public class ShowMaximum {
	public Artefact maxCost(Cave cave) {
		Artefact maxCostArtefact = Collections.min(cave.getArtefacts(), new CostComparator());
		return maxCostArtefact;
	}

	public class CostComparator implements Comparator<Artefact> {
		public int compare(Artefact a, Artefact b) {
			if (a.getCost() > b.getCost())
				return -1;
			if (a.getCost() == b.getCost())
				return 0;
			return 1;
		}
	}
}