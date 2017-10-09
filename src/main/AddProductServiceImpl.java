package main;

import java.util.ArrayList;
import java.util.List;

public class AddProductServiceImpl implements AddProductService {

    private List<ValidationRule> validationRules;

    public AddProductServiceImpl() {
        validationRules = new ArrayList<>();
        validationRules.add(new ProductTitleIsNullValidationRule());
        validationRules.add(new ProductDescriptionIsNullValidationRule());
        validationRules.add(new ProductQuantityValidationRule());
    }

    @Override
    public Response addProduct(Product product) {

        List<Error> errors = new ArrayList<>();
        for (int i = 0; i < validationRules.size(); i++) {
            ValidationRule rule = validationRules.get(i);
            Error error = rule.isValid(product);
            if (error != null) {
                errors.add(error);
            }
        }

        if (!errors.isEmpty()) {
            return new Response(false, errors);
        } else {
            return new Response(true, errors);
        }
    }

}