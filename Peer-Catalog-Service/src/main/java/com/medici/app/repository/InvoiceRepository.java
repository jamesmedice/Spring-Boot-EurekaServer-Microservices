package com.medici.app.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.medici.app.entity.Invoice;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "invoices", path = "invoices")
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {

	Invoice save(Invoice expense);

	List<Invoice> findAll();
}
