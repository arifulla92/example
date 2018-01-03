
public class Reverse {

	public static void main(String[] args) {
		
		
		String str="hello,nsdffff,nnnnn,nmmmnjk";
		
		String reverse="";
		
		int len=str.length()-1;
		
		for (int i=len;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		
		System.out.println(reverse);

	}

}
