package demo.resolve.issue.java;

import org.biojava.nbio.core.exceptions.CompoundNotFoundException;
import org.biojava.nbio.core.sequence.DNASequence;

public class JustAnExample {
	
	public JustAnExample() throws CompoundNotFoundException {
		 new DNASequence("GTAC");
	}
	
}
