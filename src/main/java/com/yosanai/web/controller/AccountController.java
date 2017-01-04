package com.yosanai.web.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.loststolen.AccountInquiry;
import com.yosanai.web.model.AccountRequest;

@RestController
public class AccountController {

	@RequestMapping(value = "/checkAccountNumber", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody AccountInquiry checkAccountNumber(@RequestBody AccountRequest req) throws Exception {
		RequestMap map = new RequestMap();
		map.set("AccountInquiry.AccountNumber", req.getAccountNumber());
		return new AccountInquiry(map).update();
	}

}
