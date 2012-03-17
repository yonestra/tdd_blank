package tdd;

public class WikiFormatter {

	public String h1(String string) {
		if(string != null && string.length() > 0) { 
			String[] strArr = string.split(" ");
			return "<h1>" + strArr[1] +  "</h1>";
		} else {
			return "";
		}
	}

}
