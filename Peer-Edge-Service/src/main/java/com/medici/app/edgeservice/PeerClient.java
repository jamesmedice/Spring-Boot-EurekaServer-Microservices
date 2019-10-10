package com.medici.app.edgeservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;

import com.medici.app.entity.Invoice;

@FeignClient("Peer-Catalog-Service")
public interface PeerClient {

	@GetMapping("/invoices")
	Resources<Invoice> allInvoices();

}
