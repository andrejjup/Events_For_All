package main;

public class ParticipantNameValidationRule implements ValidationRule {
    @Override
    public Error isValid(Participant participant) {
        if (participant.getName() != "1") {
            return new Error("participantName", "Must be more then zero");
        } else {
            return null;
        }
    }
}
