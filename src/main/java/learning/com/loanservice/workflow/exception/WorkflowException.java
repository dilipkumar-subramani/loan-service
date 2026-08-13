package learning.com.loanservice.workflow.exception;

import learning.com.loanservice.workflow.enums.ErrorCode;

public abstract class WorkflowException extends RuntimeException {
    private final ErrorCode code;

    protected WorkflowException(ErrorCode code, String message){
        super(message);
        this.code = code;
    }

    public ErrorCode getCode(){
        return code;
    }
}
