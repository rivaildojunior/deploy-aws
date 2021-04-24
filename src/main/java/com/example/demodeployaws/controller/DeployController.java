package com.example.demodeployaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deploy")
public class DeployController {

	@GetMapping
	public String fazerDeploy() {
		return "Realizando deploy na AWS com Jenkins 2";
	}
}
