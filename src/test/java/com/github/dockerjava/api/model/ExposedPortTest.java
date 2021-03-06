package com.github.dockerjava.api.model;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ExposedPortTest {

	@Test
	public void parse() {
		ExposedPort exposedPort = ExposedPort.parse("80/tcp");
		assertEquals(exposedPort.getPort(), 80);
	}

	@Test(expectedExceptions = IllegalArgumentException.class,
			expectedExceptionsMessageRegExp = "Error parsing ExposedPort 'nonsense'")
	public void parseInvalidInput() {
		ExposedPort.parse("nonsense");
	}

	@Test(expectedExceptions = IllegalArgumentException.class, 
			expectedExceptionsMessageRegExp = "Error parsing ExposedPort 'null'")
	public void parseNull() {
		ExposedPort.parse(null);
	}

	@Test
	public void stringify() {
		assertEquals(ExposedPort.parse("80/tcp").toString(), "80/tcp");
	}

}
