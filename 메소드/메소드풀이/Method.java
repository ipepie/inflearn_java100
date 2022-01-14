package java100.part3;

public class Method {
	
	
	public float addNum(int x, int y) {
		return x+y;
	}
	public int minusNum() {
		int num = 10;
		num-=1;
		return num;
	}
	public String upperString(String str) {
		return str.toUpperCase();
	}
	//a = 500
	//return은 하나의 값만 반환가능
	public String[] strongK(String big, String small) {
		return new String[]{big.toUpperCase(), small.toLowerCase()};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method q1 = new Method();
		String[] result = q1.strongK("korea","USA");
		System.out.println(result[0]+"-"+result[1]);
	}
	
	
}
