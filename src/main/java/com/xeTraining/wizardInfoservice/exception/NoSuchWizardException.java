package com.xeTraining.wizardInfoservice.exception;

public class NoSuchWizardException extends RuntimeException{
    private String message;
    public NoSuchWizardException(){
    }
    public NoSuchWizardException(String msg) {
        super(msg);
        this.message = msg;
    }
}
