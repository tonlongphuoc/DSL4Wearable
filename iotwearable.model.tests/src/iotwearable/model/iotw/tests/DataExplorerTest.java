/**
 */
package iotwearable.model.iotw.tests;

import iotwearable.model.iotw.DataExplorer;
import iotwearable.model.iotw.IotwFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Explorer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataExplorerTest extends TestCase {

	/**
	 * The fixture for this Data Explorer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataExplorer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataExplorerTest.class);
	}

	/**
	 * Constructs a new Data Explorer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExplorerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Explorer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataExplorer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Explorer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataExplorer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotwFactory.eINSTANCE.createDataExplorer());
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

} //DataExplorerTest
