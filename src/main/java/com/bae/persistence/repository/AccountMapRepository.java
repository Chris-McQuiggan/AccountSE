package com.bae.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.bae.persistence.domain.Account;
import com.bae.util.JSONUtil;

public class AccountMapRepository implements AccountRepository {

	Map<Integer, Account> accountMap = new HashMap<Integer, Account>();

	// You must provide concrete implementation for each of these methods
	// do not change the method signature
	// THINK - if the parameter is a String, or the return type is a String
	// How can I convert to a String from an Object?
	// What utility methods do I have available?

	// You must complete this section using TDD
	// You can use the suggested tests or build your own.

	public String getAllAccounts() {
		JSONUtil util = new JSONUtil();
		// Account acc1 = new Account(1, 123, "Bob", "Boone");
		// accountMap.put(1, acc1);
		return util.getJSONForObject(accountMap);
	}

	public String createAccount(String account) {
		try {
			Account acc1 = new JSONUtil().getObjectForJSON(account, Account.class);
			accountMap.put(acc1.getId(), acc1);
			return "Added Successfuly";
		} catch (Exception e) {
			return e.getMessage();
		}

	}

	public String deleteAccount(int accountNumber) {
		try {
			accountMap.remove(accountNumber);
			return "Account deleted";
		} catch (Exception e) {
			return e.getMessage();
		}

	}

	public String updateAccount(int accountNumber, String account) {

		return null;
	}

}