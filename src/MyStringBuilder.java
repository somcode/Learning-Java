
public class MyStringBuilder {
	
	public static void main(String[] args) {
		String info = "";
		
		//inefficient method
		info += "My name id John.";
		info += " ";
		info += "I am a programmer.";
		System.out.println(info);
		
		//efficient method
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Chris.");
		sb.append(" ");
		sb.append("I am a web developer.");
		System.out.println(sb.toString());
		
		StringBuilder a = new StringBuilder("Hello");
		a.insert(1, "bb");
		System.out.println(a);
		
		StringBuilder s = new StringBuilder("java");
		s.replace(1,3, "bb");
		System.out.println(s);
		
	}

}
