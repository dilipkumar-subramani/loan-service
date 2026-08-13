package learning.com.loanservice.workflow.resolver;

import learning.com.loanservice.workflow.model.ExecutableStep;
import learning.com.loanservice.workflow.context.StepResultStore;
import learning.com.loanservice.workflow.model.WorkflowDefinition;

import java.util.List;

public interface WorkflowStepResolver {
    List<ExecutableStep> resolveNextSteps(
            WorkflowDefinition definition,
            StepResultStore resultStore);
}
