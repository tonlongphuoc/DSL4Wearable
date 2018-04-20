package iotwearable.gen.generator;

import java.util.List;

import iotwearable.gen.analyzer.Token;
import iotwearable.gen.utilities.LibraryNameUtil;
import iotwearable.model.iotw.IOControl;

/**
 * 
 * Used for classes to generate source code on {@link Mainboard}.
 * The generated code may not be complete.
 * Which have keywords to mark the position that needs to be replaced in the process next.
 *
 */
public interface IDevicesGenerator{
	/**
	 * Generate code for the {@linkplain include} part.
	 * Use {@link LibraryNameUtil} to get library name.
	 * 
	 * @return {@literal #include <Library_Name.h>} or ""
	 */
	String generateInclude();
	/**
	 * Generate code for define part of {@link IOControl}.
	 * @return String or ""
	 */
	String generateDefine();
	/**
	 * Generate code the setup for the device in the setup function.
	 * @return String or ""
	 */
	String generateSetupFuncSetup();
	/**
	 * Generate code the setup for the device in the loop function.
	 * @return String or ""
	 */
	String generateSetupFuncLoop();
	/**
	 * Generate code from the command.
	 * @param syntax
	 * @param tokens
	 * @return String or ""
	 */
	String generateCommand(String syntax, List<Token> tokens);
}