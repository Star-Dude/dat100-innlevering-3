package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	private Innlegg[] innleggtabell;
	private int nesteledig;
	private static int Lengde = 20;

	public Blogg() {
		nesteledig = 0;
		innleggtabell = new Innlegg[Lengde];
	}

	public Blogg(int lengde) {
		nesteledig = 0;
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innlegg.erLik(innleggtabell[i])) {
				return i;
			}
		}

		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] == null) {
				return true;
			}
		}

		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (!ledigPlass() || finnes(innlegg)) {
			return false;
		}

		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] == null) {
				innleggtabell[i] = innlegg;
				return true;
			}
		}

		return false;
	}
	
	public String toString() {
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] != null) {
				nesteledig++;
			}
		}

		String text = Integer.toString(nesteledig) + "\n";

		for (int i = 0; i < nesteledig; i++) {
			text = text + innleggtabell[i].toString();
		}

		return text;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}