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
			String[] lines = string.trim().split("\n");
			if(lines.length == 1 && lines[0].equals("")) {
				return "<br/>";
			} else {
				StringBuilder sb = new StringBuilder();
				boolean isFirst = true;
				for(String line : lines) {
					String[] strArr = line.trim().split(" ");
					if(!isFirst) {
						sb.append("<br/>");
					}
					if(strArr.length == 3) {
						String tagBefore = patterns.get(strArr[0]);
						String tagAfter = patterns.get(strArr[2]);
						if(tagBefore != null && tagAfter != null && tagBefore.equals(tagAfter)) {
							sb.append("<").append(tagBefore).append(">").append(strArr[1]).append("</").append(tagAfter).append(">");
						} else {
							sb.append(line);
						}
					} else {
						sb.append(line);
					}
					isFirst = false;
				}
				return sb.toString();
			}
		} else {
			return "";
		}
	}

}
