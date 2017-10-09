package main;

public class ParticipantEmailValidationRule implements ValidationRule {
    @Override
    public Error isValid(Participant participant) {
        if (participant.getEmail() != "1") {
            return new Error("participantName", "Must be more then zero");
        } else {
            return null;
        }
    }
}
