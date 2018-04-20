package iotwearable.gen.formatter;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormatterTest {

	@Test
	public void methodLevel0() {
		String src = "void name(){\nHello;\n}";
		String expected = "void name(){\n\tHello;\n}";
		assertEquals(expected, Formatter.format(src));
	}

}
