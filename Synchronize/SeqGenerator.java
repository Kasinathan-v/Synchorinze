//$Id$
package Synchronize;

public class SeqGenerator {
	
	private static int count = 1;
	
	public int generateUniqueValue() {	
		synchronized (this) {
		int genValue= count*100;
		count++;
		return genValue;
		}
	}

}
