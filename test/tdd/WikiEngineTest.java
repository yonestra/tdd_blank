package tdd;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WikiEngineTest {
	public WikiEngine wikiEngine = new WikiEngine();

	private String param;
	
	private String expected;
	
	@Parameters
	public static List<String[]> getParameters(){
		String[][] params = {
				{ "= Headline =", "<h1>Headline</h1>" },
				{ "= Footline =", "<h1>Footline</h1>" }, 
				{ null, "" },
				{ "", "" },
				{ "== Headline ==", "<h2>Headline</h2>" },
				{ "=== Headline ===", "<h3>Headline</h3>" },
				{ "==== Headline ====", "<h4>Headline</h4>" },
				{ "===== Headline =====", "<h5>Headline</h5>" },
				{ "====== Headline ======", "<h6>Headline</h6>" },
				{ "======= Headline =======", "======= Headline =======" },
				{ "== Headline ===", "== Headline ===" },
				{ " == Headline == ", "<h2>Headline</h2>" },
				{ "== Headline", "== Headline" },
				{ "= Headline =\n== Headline ==", "<h1>Headline</h1><br/><h2>Headline</h2>" },
				{ "== Headline\n== Headline", "== Headline<br/>== Headline" },
		};
		return Arrays.asList(params);
	}

	public WikiEngineTest(String param, String expected) {
		this.param = param;
		this.expected = expected;
	}
	
	@Test
	public void format() throws Exception {
		String actual = wikiEngine.format(param);
		assertThat(actual, is(expected));
	}
}
