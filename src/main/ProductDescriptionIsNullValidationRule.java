package main;

public class ProductDescriptionIsNullValidationRule
        implements ValidationRule{

    @Override
    public Error isValid(Product product) {
        if (product.getDescription() == null) {
            return new Error("productDescription", "Should not be empty");
        } else {
            return null;
        }
    }

}