/**
 */
package iotwearable.model.iotw.tests;

import iotwearable.model.iotw.I2CLCD2004;
import iotwearable.model.iotw.IotwFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>I2CLCD2004</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class I2CLCD2004Test extends OutputControlTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(I2CLCD2004Test.class);
	}

	/**
	 * Constructs a new I2CLCD2004 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CLCD2004Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this I2CLCD2004 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected I2CLCD2004 getFixture() {
		return (I2CLCD2004)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotwFactory.eINSTANCE.createI2CLCD2004());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //I2CLCD2004Test
