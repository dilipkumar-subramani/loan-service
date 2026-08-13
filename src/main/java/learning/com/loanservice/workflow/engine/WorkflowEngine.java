package learning.com.loanservice.workflow.engine;

import learning.com.loanservice.workflow.context.WorkflowContext;
import learning.com.loanservice.workflow.model.WorkflowResult;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface WorkflowEngine {

    CompletableFuture<WorkflowResult> startWorkflow(WorkflowContext context);

    CompletableFuture<WorkflowResult> resumeWorkflow(UUID workflowId);
}
