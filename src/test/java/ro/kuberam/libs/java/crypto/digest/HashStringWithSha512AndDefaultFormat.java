package ro.kuberam.libs.java.crypto.digest;

import ro.kuberam.libs.java.crypto.digest.Hash;
import org.junit.Assert;
import org.junit.Test;

import ro.kuberam.tests.junit.BaseTest;

public class HashStringWithSha512AndDefaultFormat extends BaseTest {

	@Test
	public void hashStringWithSha512hexOutput() throws Exception {
		String input = "Short string for tests.";
		
		String result = Hash.hashString(input, "SHA-512");

		Assert.assertTrue(result
				.equals("+YpeZRBrctlL1xr6plZOScp/6ArUw3GihjtKys1e3qQ6/aWLFjoOFEfuiUJA3uLIkebH1OG+rDdM\r\nFZ0+/JFK2g=="));
	}
}
