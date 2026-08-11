package workflow.resolver;

import workflow.model.ExecutableStep;
import workflow.context.StepResultStore;
import workflow.model.WorkflowDefinition;

import java.util.List;

public interface WorkflowStepResolver {
    List<ExecutableStep> resolveNextSteps(
            WorkflowDefinition definition,
            StepResultStore resultStore);
}
