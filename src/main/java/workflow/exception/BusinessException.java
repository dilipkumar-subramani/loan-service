package workflow.exception;

public class BusinessException extends WorkflowException{
    public BusinessException(String code, String message) {
        super(code, message);
    }
}
