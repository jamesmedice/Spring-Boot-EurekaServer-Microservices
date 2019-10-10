package com.medici.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "INVOICE")
public class Invoice {

	@Id
	@GeneratedValue
	private Long id;

	private String partNumber;

	private String partDescription;

	private int quantity;

	private double priceperitem;

	private double amount;
}