package workflow.engine;

import workflow.context.WorkflowContext;
import workflow.model.WorkflowResult;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface WorkflowEngine {

    CompletableFuture<WorkflowResult> startWorkflow(WorkflowContext context);

    CompletableFuture<WorkflowResult> resumeWorkflow(UUID workflowId);
}
