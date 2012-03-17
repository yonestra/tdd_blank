package tdd;

public class WikiFormatter {

	public String h1(String string) {
		String[] strArr = string.split(" ");
		return "<h1>" + strArr[1] +  "</h1>";
	}

}
