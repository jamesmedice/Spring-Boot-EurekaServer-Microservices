CREATE DATABASE IF NOT EXISTS TaxGateway;

USE TaxGateway;

		
CREATE TABLE IF NOT EXISTS INVOICE (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  partNumber VARCHAR(255) NULL DEFAULT NULL,
  partDescription VARCHAR(255) NULL DEFAULT NULL,
  quantity BIGINT(20) NULL DEFAULT NULL,
  priceperitem DOUBLE NULL DEFAULT NULL,
  amount DOUBLE NULL DEFAULT NULL,
  ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  
  PRIMARY KEY (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1; 