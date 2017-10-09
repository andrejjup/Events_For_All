package main;

public class ParticipantNameIsNullValidationRule implements ValidationRule {

    @Override
    public Error isValid(Participant participant) {
        if (participant.getName() == null) {
            return new Error("participantName", "Should not be empty");
        } else {
            return null;
        }
    }
}
