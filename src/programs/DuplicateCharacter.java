package programs;
import java.util.HashSet;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 ="yasha";
char[] ch =str1.toCharArray();

HashSet<Character> thehash = new HashSet();

for(char char1 :ch) {
	
	thehash.add(char1);
	
}

if(thehash.size()==ch.length) {
	
	System.out.println("no duplicate in string");
}

else {
	
	System.out.println("duplicate chaarter in string");
}

	}

}
