package workflow.exception;

import workflow.enums.ErrorCode;

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
