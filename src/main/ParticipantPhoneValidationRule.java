package main;

public class ParticipantPhoneValidationRule implements ValidationRule {
    @Override
    public Error isValid(Participant participant) {
        if (participant.getPhone() != "1") {
            return new Error("participantName", "Must be more then zero");
        } else {
            return null;
        }
    }

}
