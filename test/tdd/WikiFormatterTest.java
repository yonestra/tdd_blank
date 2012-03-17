package tdd;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WikiFormatterTest {

	public WikiFormatter formatter = new WikiFormatter();
	
	@Test
	public void h1_Headline() throws Exception {
		String actual = formatter.h1("= Headline =");
		assertThat(actual, is("<h1>Headline</h1>"));
	}
	
	@Test
	public void h1_Footline() throws Exception {
		String actual = formatter.h1("= Footline =");
		assertThat(actual, is("<h1>Footline</h1>"));
	}
	
	@Test
	public void h1_Null() throws Exception {
		String actual = formatter.h1(null);
		assertThat(actual, is(""));
	}
	
	@Test
	public void h1_blank() throws Exception {
		String actual = formatter.h1("");
		assertThat(actual, is(""));
	}
}
