package main;

import java.util.List;

public class AddProductServiceImplTest {

    public static void main(String[] args) {
        shouldFailWhenTitleIsNull();
        shouldFailWhenDescriptionIsNull();
        shouldFailWhenQuantityIsZeroOrLess();
    }

    private static void shouldFailWhenTitleIsNull() {
        AddProductService service = new AddProductServiceImpl();
        Product product = new Product(null, "description", 1);
        Response response = service.addProduct(product);

        if (response.isSuccess() == false) {
            System.out.println("FailWhenTitleIsNull = OK");
        } else {
            System.out.println("FailWhenTitleIsNull = FAIL");
        }

        List<Error> errors = response.getErrors();
        if (errors.size() == 1) {
            System.out.println("FailWhenTitleIsNull = OK");
        } else {
            System.out.println("FailWhenTitleIsNull = FAIL");
        }

        if (errors.get(0).getField().equals("productTitle")) {
            System.out.println("FailWhenTitleIsNull = OK");
        } else {
            System.out.println("FailWhenTitleIsNull = FAIL");
        }

        if (errors.get(0).getErrorMessage().equals("Should not be empty")) {
            System.out.println("FailWhenTitleIsNull = OK");
        } else {
            System.out.println("FailWhenTitleIsNull = FAIL");
        }
    }

    private static void shouldFailWhenDescriptionIsNull() {
        AddProductService service = new AddProductServiceImpl();
        Product product = new Product("Milk", null, 1);
        Response response = service.addProduct(product);

        if (response.isSuccess() == false) {
            System.out.println("FailWhenDescriptionIsNull = OK");
        } else {
            System.out.println("FailWhenDescriptionIsNull = FAIL");
        }

        List<Error> errors = response.getErrors();
        if (errors.size() == 1) {
            System.out.println("FailWhenDescriptionIsNull = OK");
        } else {
            System.out.println("FailWhenDescriptionIsNull = FAIL");
        }

        if (errors.get(0).getField().equals("productDescription")) {
            System.out.println("FailWhenDescriptionIsNull = OK");
        } else {
            System.out.println("FailWhenDescriptionIsNull = FAIL");
        }

        if (errors.get(0).getErrorMessage().equals("Should not be empty")) {
            System.out.println("FailWhenDescriptionIsNull = OK");
        } else {
            System.out.println("FailWhenDescriptionIsNull = FAIL");
        }
    }

    private static void shouldFailWhenQuantityIsZeroOrLess() {
        AddProductService service = new AddProductServiceImpl();
        Product product = new Product("Milk", "description", 0);
        Response response = service.addProduct(product);

        if (response.isSuccess() == false) {
            System.out.println("FailWhenQuantityIsNull = OK");
        } else {
            System.out.println("FailWhenQuantityIsNull = FAIL");
        }

        List<Error> errors = response.getErrors();
        if (errors.size() == 1) {
            System.out.println("FailWhenQuantityIsNull = OK");
        } else {
            System.out.println("FailWhenQuantityIsNull = FAIL");
        }

        if (errors.get(0).getField().equals("productQuantity")) {
            System.out.println("FailWhenQuantityIsNull = OK");
        } else {
            System.out.println("FailWhenQuantityIsNull = FAIL");
        }

        if (errors.get(0).getErrorMessage().equals("Must be more then zero")) {
            System.out.println("FailWhenQuantityIsNull = OK");
        } else {
            System.out.println("FailWhenQuantityIsNull = FAIL");
        }
    }

}
