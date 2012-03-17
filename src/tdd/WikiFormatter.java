package tdd;

public class WikiFormatter {

	public String h1(String string) {
		if(string != null && string.length() > 0) { 
			String[] strArr = string.split(" ");
			if(strArr[0].equals("=")) {
				return "<h1>" + strArr[1] +  "</h1>";
			} else {
				return "<h2>" + strArr[1] +  "</h2>";
			}
		} else {
			return "";
		}
	}

}
