package main;

public class ProductQuantityValidationRule implements ValidationRule {
    @Override
    public Error isValid(Product product) {
        if (product.getQuantity() <= 0) {
            return new Error("productQuantity", "Must be more then zero");
        } else {
            return null;
        }
    }
}
