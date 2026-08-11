package workflow.model;

import workflow.enums.StepType;
import workflow.enums.WorkflowStatus;

import java.util.UUID;

public record WorkflowResult(UUID workflowId,
                             WorkflowStatus status,
                             StepType currentStep,
                             String reason) {
}
