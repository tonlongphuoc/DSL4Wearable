package iotwearable.gen.test;

import static org.junit.Assert.assertEquals;
import iotwearable.gen.CodeWriter;

import org.junit.Test;

public class CodeWriterTest {
	@Test
	public void writeInclude() {
		assertEquals("#include \"Keypad.h\"\n<include>",
				CodeWriter.write("<include>", "#include \"Keypad.h\"", CodeWriter.include));
	}
	@Test
	public void writeDefine() {
		assertEquals("This is define\n<define>",
				CodeWriter.write("<define>", "This is define", CodeWriter.define));
	}
	@Test
	public void writeFuncPrototype() {
		assertEquals("This is FuncPrototype\n<funcPrototype>",
				CodeWriter.write("<funcPrototype>", "This is FuncPrototype", CodeWriter.funcPrototype));
	}
	@Test
	public void writeFuncSetup() {
		assertEquals("This is FuncSetup\n\t<funcSetup>",
				CodeWriter.write("<funcSetup>", "This is FuncSetup", CodeWriter.funcSetup));
	}
	@Test
	public void writeFuncLoop() {
		assertEquals("This is FuncLoop\n\t<funcLoop>",
				CodeWriter.write("<funcLoop>", "This is FuncLoop", CodeWriter.funcLoop));
	}
	@Test
	public void writeFuncPrototyeImpl() {
		assertEquals("This is FuncImpl\n<funcImpl>",
				CodeWriter.write("<funcImpl>", "This is FuncImpl", CodeWriter.funcImpl));
	}
	@Test
	public void writeIdentifier() {
		assertEquals("This is Identifier\n<Identifier>",
				CodeWriter.write("<Identifier>", "This is Identifier", "<Identifier>"));
	}
}
