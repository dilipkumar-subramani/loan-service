package workflow.executor;

import workflow.model.ExecutableStep;
import workflow.model.StepResult;
import workflow.context.WorkflowContext;

public interface StepExecutionService {
   StepResult<?> execute(
            ExecutableStep step,
            WorkflowContext context);
}
