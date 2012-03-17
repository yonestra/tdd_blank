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
		patterns.put("=====", "h5");
		patterns.put("======", "h6");
		
		if(string != null && string.length() > 0) {
			String[] strArr = string.trim().split(" ");
			if(strArr.length == 3) {
				String tagBefore = patterns.get(strArr[0]);
				String tagAfter = patterns.get(strArr[2]);
				if(tagBefore != null && tagAfter != null && tagBefore.equals(tagAfter)) {
					return "<" + tagBefore + ">" + strArr[1] + "</" + tagAfter + ">";
				}
			}
			return string;
		} else {
			return "";
		}
	}

}
