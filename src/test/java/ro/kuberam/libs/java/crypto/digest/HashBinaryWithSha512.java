package ro.kuberam.libs.java.crypto.digest;

import java.io.InputStream;

import ro.kuberam.libs.java.crypto.digest.Hash;
import org.junit.Assert;
import org.junit.Test;

import ro.kuberam.tests.junit.BaseTest;

public class HashBinaryWithSha512 extends BaseTest {

	@Test
	public void hashBinaryWithSha512() throws Exception {
		InputStream input = getClass().getResourceAsStream("../../keystore.ks");
		String result = Hash.hashBinary(input, "SHA-512", "base64");

		Assert.assertTrue(result.equals("Be+hlGy9TNibbaE+6DA2gu6kNj2GS+7b4egFcJDMzQSFQiGgFtTh/mD61ta4pDvc+jqHFlqOyJLH\r\nirkROd86Mw=="));
	}
}
