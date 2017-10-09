package main;

public interface ValidationRule {

    Error isValid(Product product);

}