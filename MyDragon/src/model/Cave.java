package model;

import java.util.ArrayList;

public class Cave {
	public ArrayList<Artefact> artefacts;

	public Cave(ArrayList<Artefact> artefacts) {
		this.artefacts = artefacts;
	}

	public ArrayList<Artefact> getArtefacts() {
		return artefacts;
	}

	public void setArtefacts(ArrayList<Artefact> artefacts) {
		this.artefacts = artefacts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artefacts == null) ? 0 : artefacts.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cave other = (Cave) obj;
		if (artefacts == null) {
			if (other.artefacts != null)
				return false;
		} else if (!artefacts.equals(other.artefacts))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cave [artefacts=" + artefacts + "]";
	}

}
