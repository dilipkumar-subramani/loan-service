package learning.com.loanservice.workflow.exception;

import learning.com.loanservice.workflow.enums.ErrorCode;

public class ExternalServiceException extends WorkflowException{
    public ExternalServiceException(ErrorCode code, String message) {
        super(code, message);
    }
}
