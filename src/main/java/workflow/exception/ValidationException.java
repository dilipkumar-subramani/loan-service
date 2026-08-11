package workflow.exception;

public class ValidationException extends WorkflowException{
    public ValidationException(String code, String message) {
        super(code, message);
    }
}
