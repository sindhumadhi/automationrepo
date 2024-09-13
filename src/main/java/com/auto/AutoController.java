package com.auto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController 
{
	@GetMapping("/getAuto")
	public String getThis()
	{
		return "hii automation Building";
	}

}
