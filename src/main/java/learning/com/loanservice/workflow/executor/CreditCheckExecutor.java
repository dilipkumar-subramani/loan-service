package learning.com.loanservice.workflow.executor;

import learning.com.loanservice.workflow.context.WorkflowContext;
import learning.com.loanservice.workflow.model.ExecutableStep;
import learning.com.loanservice.workflow.model.StepResult;

public class CreditCheckExecutor implements StepExecutionService{

    @Override
    public StepResult<?> execute(ExecutableStep step, WorkflowContext context) {
        return null;
    }
}
