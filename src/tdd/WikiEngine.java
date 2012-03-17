package tdd;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.HashMap;
import java.util.Map;

public class WikiEngine {

	public String format(String string) {
		Map<String, String> patterns = new HashMap<String, String>();
		patterns.put("=", "h1");
		patterns.put("==", "h2");
		patterns.put("===", "h3");
		patterns.put("====", "h4");
		
		if(string != null && string.length() > 0) {
			String[] strArr = string.split(" ");
			String tag = patterns.get(strArr[0]);
			if(tag != null) {
				return "<" + tag + ">" + strArr[1] + "</" + tag + ">";
			} else {
				return string;
			}
		} else {
			return "";
		}
	}

}
