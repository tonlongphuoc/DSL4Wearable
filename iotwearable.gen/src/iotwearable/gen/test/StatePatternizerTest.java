package iotwearable.gen.test;

import static org.junit.Assert.*;
import iotwearable.gen.analyzer.StatePattern;
import iotwearable.gen.analyzer.StatePatternizer;
import iotwearable.gen.analyzer.StatePattern.StatePatternType;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateFrame;
import iotwearable.model.iotw.StateSchema;

import org.junit.Test;

public class StatePatternizerTest {
	StateSchema schema;
	StartPoint startPoint;
	StateFrame frame;
	StateFrame frame1;
	Connection conn;
	Connection conn1;
	StatePatternizer patternizer;
	
	public StatePatternizerTest() {
		schema = IotwFactory.eINSTANCE.createStateSchema();
		startPoint = IotwFactory.eINSTANCE.createStartPoint();
		frame = IotwFactory.eINSTANCE.createStateFrame();
		frame1 = IotwFactory.eINSTANCE.createStateFrame();
		conn = IotwFactory.eINSTANCE.createConnection();
		conn1 = IotwFactory.eINSTANCE.createConnection();
		
		schema.getControls().add(startPoint);
		schema.getControls().add(frame);
		schema.getControls().add(frame1);
		
		conn.setSource(startPoint);
		conn.setTarget(frame);
		conn1.setSource(frame);
		conn1.setTarget(frame1);
		frame.getIncomings().add(conn);
		frame1.getOutgoings().add(conn1);
		schema.getConnnections().add(conn);
		schema.getConnnections().add(conn);
		patternizer = new StatePatternizer();
	}
	@Test
	public void patternize_StartPoint_StateFrameTest() {
		StatePattern pattern = patternizer.patternize(frame);
		assertEquals(pattern.getType(), StatePatternType.S_F);
	}
	@Test
	public void patternize_StateFrame_StateFrameTest() {
		StatePattern pattern = patternizer.patternize(frame1);
		assertEquals(pattern.getType(), StatePatternType.F_F);
	}
}
