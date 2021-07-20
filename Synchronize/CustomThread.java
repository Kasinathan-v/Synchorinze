//$Id$
package Synchronize;

public class CustomThread extends Thread {
	SeqGenerator obj;
	
	public CustomThread(SeqGenerator obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		System.out.println("sequence generated value" +obj.generateUniqueValue());
	}
}
