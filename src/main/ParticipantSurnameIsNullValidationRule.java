package main;

public class ParticipantSurnameIsNullValidationRule implements ValidationRule {

    @Override
    public Error isValid(Participant participant) {
        if (participant.getSurname() == null) {
            return new Error("participantSurname", "Should not be empty");
        } else {
            return null;
        }
    }
}
