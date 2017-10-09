package main;

import java.util.ArrayList;
import java.util.List;

public class AddParticipantServiceImpl implements  AddParticipantService {
    private List<ValidationRule> validationRules;

    public AddParticipantServiceImpl() {
        validationRules = new ArrayList<>();
        validationRules.add(new ParticipantNameIsNullValidationRule());
        validationRules.add(new ParticipantSurnameIsNullValidationRule());
        validationRules.add(new ParticipantPhoneIsNullValidationRule());
        validationRules.add(new ParticipantEmailIsNullValidationRule());
        validationRules.add(new ParticipantNameValidationRule());
        validationRules.add(new ParticipantSurnameValidationRule());
        validationRules.add(new ParticipantPhoneValidationRule());
        validationRules.add(new ParticipantEmailValidationRule());
    }

    @Override
    public Response addParticipant(Participant participant) {

        List<Error> errors = new ArrayList<>();
        for (int i = 0; i < validationRules.size(); i++) {
            ValidationRule rule = validationRules.get(i);
            Error error = rule.isValid(participant);
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
