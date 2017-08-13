package corejavainterviewpractice;

public class CompressStringJavaProgramming_04 {
	String s1 = "aaabbttttiiii";
	public void compressString(String s1){
		int count = 0;
		char temp = s1.charAt(0);
		for (int i = 0; i <s1.length(); i++) {
			if(s1.charAt(i) == temp){
				count++;
			}else{
				System.out.println(temp+""+count);
				count = 1;
				temp = s1.charAt(i);
			}
		}
	}
	public static void main(String[] args) {
		
		CompressStringJavaProgramming_04 obj = new CompressStringJavaProgramming_04();
		obj.compressString(obj.s1);
	}

}
