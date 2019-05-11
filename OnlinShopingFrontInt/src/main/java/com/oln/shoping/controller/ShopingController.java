package com.oln.shoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ShopingController {
 @GetMapping(value="/")
	public String buy(Model modle) {
		modle.addAttribute("buy", "welcome");

		return "shoping";
	}

}
