package workflow.exception;

public class ExternalServiceException extends WorkflowException{
    public ExternalServiceException(String code, String message) {
        super(code, message);
    }
}
