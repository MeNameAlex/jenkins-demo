package com.example.jenkinsdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

@
public class JenkinsDemoTest {

	String funktioniert = "JUnit funktioniert";
	String funktioniertNicht = "JUnit funktioniert nicht";

	@Test
	public void testMethodeZumTestenMitErfolg(){
		assertEquals("JUnit funktioniert", funktioniert);
	}

	/*
	@Test
	public void testMethodeZumTestOhneErfolg(){
		assertEquals("JUnit funktioniert", funktioniertNicht);
	}
	*/
}
