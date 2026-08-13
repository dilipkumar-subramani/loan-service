package learning.com.loanservice.workflow.executor;

import learning.com.loanservice.workflow.model.ExecutableStep;
import learning.com.loanservice.workflow.model.StepResult;
import learning.com.loanservice.workflow.context.WorkflowContext;

public interface StepExecutionService {
   StepResult<?> execute(
            ExecutableStep step,
            WorkflowContext context);
}
