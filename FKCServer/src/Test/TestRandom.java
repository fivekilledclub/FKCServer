package Test;

import java.util.Random;

public class TestRandom {

	public static int Verificationcode(){
		int max=999999;
        int min=100000;
        int Verificationcode;
        Random random = new Random();
        Verificationcode = random.nextInt(max)%(max-min+1) + min;
		return Verificationcode;
	}
	
}
