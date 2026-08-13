package learning.com.loanservice.workflow.exception;

import learning.com.loanservice.workflow.enums.ErrorCode;

public class ValidationException extends WorkflowException{
    public ValidationException(ErrorCode code, String message) {
        super(code, message);
    }
}
