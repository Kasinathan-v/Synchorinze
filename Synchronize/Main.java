//$Id$
package Synchronize;

public class Main {

	public static void main(String[] args) {
			SeqGenerator obj = new SeqGenerator();
			CustomThread t1 = new CustomThread(obj);
			CustomThread t2 = new CustomThread(obj);
			t1.start();
			t2.start();
	}

}
