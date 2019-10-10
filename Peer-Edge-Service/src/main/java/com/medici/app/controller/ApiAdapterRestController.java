package com.medici.app.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medici.app.edgeservice.PeerClient;
import com.medici.app.entity.Invoice;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ApiAdapterRestController {

	@Autowired
	private PeerClient peerClient;

	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping("/invoices")
	@CrossOrigin(origins = "*")
	public Collection<Invoice> allInvoices() {
		return peerClient.allInvoices().getContent().stream().collect(Collectors.toList());
	}

	public Collection<Invoice> fallback() {
		return new ArrayList<>();
	}

}
