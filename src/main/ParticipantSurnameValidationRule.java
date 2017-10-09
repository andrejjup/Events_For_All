package main;

public class ParticipantSurnameValidationRule implements ValidationRule {
    @Override
    public Error isValid(Participant participant) {
        if (participant.getSurname() != "1") {
            return new Error("participantName", "Must be more then zero");
        } else {
            return null;
        }
    }
}
