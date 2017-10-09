package main;

public class ProductTitleIsNullValidationRule
        implements ValidationRule {

    @Override
    public Error isValid(Product product) {
        if (product.getTitle() == null) {
            return new Error("productTitle", "Should not be empty");
        } else {
            return null;
        }
    }

}