package Test;

public class Test {

	public static int Verificationcode = TestRandom.Verificationcode();
	
	public Test(){
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int x = 1605155603;
		if("1605155603".equals(""+x)){
			System.out.println("ok");
		}else{
			System.out.println("no");
		}
	}
}
