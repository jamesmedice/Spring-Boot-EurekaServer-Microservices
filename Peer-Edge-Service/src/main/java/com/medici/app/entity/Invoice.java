package com.medici.app.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Invoice {

	private Long id;

	private String partNumber;

	private String partDescription;

	private int quantity;

	private double priceperitem;

	private double amount;
}