package workflow.executor;

import workflow.model.ExecutableStep;
import workflow.model.StepResult;
import workflow.context.WorkflowContext;

public class StepExecutionServiceImpl implements StepExecutionService {

    private final StepExecutorRegistry executorRegistry;

    public StepExecutionServiceImpl(StepExecutorRegistry executorRegistry){
        this.executorRegistry = executorRegistry;
    }

    @Override
    public StepResult<?> execute(ExecutableStep step, WorkflowContext context) {
        var stepType =  step.stepType();
        var executor = executorRegistry.getExecutor(stepType);
        return executor.execute(context);
    }
}
