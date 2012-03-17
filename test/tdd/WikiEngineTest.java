package tdd;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class WikiEngineTest {

	public WikiEngine wikiEngine = new WikiEngine();
	
	@DataPoints
	public static String[][] getParameters(){
		String[][] params = {
				{"= Headline =", "<h1>Headline</h1>"},
				{"= Footline =", "<h1>Footline</h1>"},
				{null, ""},
				{"", ""},
				{"== Headline ==", "<h2>Headline</h2>"},
		};
		return params;
	}
	
	@Theory
	public void format(String[] args){
		String param = args[0];
		String expected = args[1];

		String actual = wikiEngine.format(param);
		assertThat(actual, is(expected));
	}
}
