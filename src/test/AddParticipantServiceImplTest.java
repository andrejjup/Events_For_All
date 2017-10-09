package test;

import main.*;
import main.Error;

import java.util.List;

public class AddParticipantServiceImplTest {
    public static void main(String[] args) {
        shouldFailWhenNameIsNull();
        shouldFailWhenSurnameIsNull();
        shouldFailWhenPhoneIsNull();
//        shouldFailWhenEmailIsNull();
//        shouldFailWhenDescriptionIsNull();
//        shouldFailWhenQuantityIsZeroOrLess();
    }

    private static void shouldFailWhenNameIsNull() {
        AddParticipantService service = new AddParticipantServiceImpl();
        Participant participant = new Participant(null, "Ivanov", "22113344", "ok@gmail.com");
        Response response = service.addParticipant(participant);

        if (response.isSuccess() == false) {
            System.out.println("FailWhenNameIsNull = OK");
        } else {
            System.out.println("FailWhenNameIsNull = FAIL");
        }

        List<Error> errors = response.getErrors();
        if (errors.size() == 1) {
            System.out.println("FailWhenNameIsNull = OK");
        } else {
            System.out.println("FailWhenNameIsNull = FAIL");
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

    private static void shouldFailWhenSurnameIsNull() {
        AddParticipantService service = new AddParticipantServiceImpl();
        Participant participant = new Participant("Vasilij", null, "22113344", "ok@gmail.com");
        Response response = service.addParticipant(participant);

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

    private static void shouldFailWhenPhoneIsNull() {
        AddParticipantService service = new AddParticipantServiceImpl();
        Participant participant = new Participant("Vasilij", "Ivanov", "22113344", "ok@gmail.com");
        Response response = service.addParticipant(participant);

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
