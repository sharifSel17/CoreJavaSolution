package corejavainterviewpractice;

public class CheckIsAnagramprogrammingInJava_05 {
	String s1 = "abc";
	String s2 = "aca";
	
	public boolean checkAnagram(String a1, String a2){
		char[] chars = a1.toCharArray();
		StringBuilder secondString  = new StringBuilder(a2);
		for(Character ch:chars){
			int index =secondString.indexOf(""+ch);		
			System.out.println(index);
			if (index != -1) {
				
			}
		}
		if(secondString.length()==0){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		CheckIsAnagramprogrammingInJava_05 obj = new CheckIsAnagramprogrammingInJava_05();
		boolean returnData = obj.checkAnagram("abc", "bca");
		System.out.println(returnData);

	}

}
