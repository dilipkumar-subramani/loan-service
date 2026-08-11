package workflow.exception;

public abstract class WorkflowException extends RuntimeException {
    private final String code;

    protected WorkflowException(String code, String message){
        super(message);
        this.code = code;
    }

    public String getCode(){
        return code;
    }
}
