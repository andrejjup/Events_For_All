package main;

public class ParticipantPhoneIsNullValidationRule implements ValidationRule {

    @Override
    public Error isValid(Participant participant) {
        if (participant.getPhone() == null) {
            return new Error("participantPhone", "Should not be empty");
        } else {
            return null;
        }
    }
}
