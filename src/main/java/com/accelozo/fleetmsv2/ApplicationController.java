/**
 * 
 */
package com.accelozo.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @Sasanka A.
 * @Updated on Jan 24, 2023
 *
 */
@Controller
public class ApplicationController {

	@GetMapping("/index")
	public String home() {
		return "index";
	}
}
