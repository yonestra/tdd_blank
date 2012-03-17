package tdd;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WikiFormatterTest {

	@Test
	public void h1() throws Exception {
		WikiFormatter formatter = new WikiFormatter();
		String actual = formatter.h1("= Headline =");
		assertThat(actual, is("<h1>Headline</h1>"));
	}
}
