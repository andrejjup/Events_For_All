package main;

public class ParticipantEmailIsNullValidationRule implements ValidationRule {

    @Override
    public Error isValid(Participant participant) {
        if (participant.getEmail() == null) {
            return new Error("participantPhone", "Should not be empty");
        } else {
            return null;
        }
    }
}
