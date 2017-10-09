package main;

public interface ValidationRule {

    Error isValid(Participant participant);

}