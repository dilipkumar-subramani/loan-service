package learning.com.loanservice.workflow.executor;

import learning.com.loanservice.workflow.model.StepResult;
import learning.com.loanservice.workflow.context.WorkflowContext;
import learning.com.loanservice.workflow.enums.StepType;

public interface StepExecutor {
    StepType getStepType();

    StepResult<?> execute(WorkflowContext context);
}
