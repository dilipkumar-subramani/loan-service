package learning.com.loanservice.workflow.exception;

import learning.com.loanservice.workflow.enums.ErrorCode;

public class BusinessException extends WorkflowException{
    public BusinessException(ErrorCode code, String message) {
        super(code, message);
    }
}
