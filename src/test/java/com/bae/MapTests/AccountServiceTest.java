package com.bae.MapTests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.bae.persistence.repository.AccountMapRepository;

public class AccountServiceTest {
	@Before
	public void setup() {

	}

	@Test
	public void addAccountTest() {
		AccountMapRepository amr = new AccountMapRepository();
		amr.createAccount("{\"id\":1,\"accountNumber\":123,\"firstName\":\"Bob\",\"lastName\":\"Boone\"}");
		System.out.println(amr.getAllAccounts());
	}

	@Test
	public void add2AccountsTest() {
		AccountMapRepository amr = new AccountMapRepository();
		String acc1 = amr
				.createAccount("{\"id\":1,\"accountNumber\":123,\"firstName\":\"Bob\",\"lastName\":\"Boone\"}");
		String acc2 = amr
				.createAccount("{\"id\":2,\"accountNumber\":321,\"firstName\":\"Suzzi\",\"lastName\":\"Boone\"}");

		assertTrue("Added Successfuly".equals(acc1) && "Added Successfuly".equals(acc2));
		// fail("TODO");
	}

	@Test
	public void removeAccountTest() {
		fail("TODO");
	}

	@Test
	public void remove2AccountsTest() {
		fail("TODO");
	}

	@Test
	public void remove2AccountTestAnd1ThatDoesntExist() {
		fail("TODO");
	}

	@Test
	public void jsonStringToAccountConversionTest() {
		// testing JSONUtil
		fail("TODO");
	}

	@Test
	public void accountConversionToJSONTest() {
		// testing JSONUtil
		fail("TODO");
	}

	@Test
	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
		// For a later piece of functionality
		fail("TODO");
	}

	@Test
	public void getCountForFirstNamesInAccountWhenOne() {
		// For a later piece of functionality
		fail("TODO");
	}

	@Test
	public void getCountForFirstNamesInAccountWhenTwo() {
		// For a later piece of functionality
		fail("TODO");
	}
}
