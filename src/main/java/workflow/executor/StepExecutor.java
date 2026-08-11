package workflow.executor;

import workflow.model.StepResult;
import workflow.context.WorkflowContext;
import workflow.enums.StepType;

public interface StepExecutor {
    StepType getStepType();

    StepResult<?> execute(WorkflowContext context);
}
