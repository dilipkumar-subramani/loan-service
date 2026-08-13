package workflow.executor;

import workflow.context.WorkflowContext;
import workflow.model.ExecutableStep;
import workflow.model.StepResult;

public class CreditCheckExecutor implements StepExecutionService{

    @Override
    public StepResult<?> execute(ExecutableStep step, WorkflowContext context) {
        return null;
    }
}
