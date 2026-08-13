package learning.com.loanservice.workflow.model;

import learning.com.loanservice.workflow.enums.StepType;
import learning.com.loanservice.workflow.enums.WorkflowStatus;

import java.util.UUID;

public record WorkflowResult(UUID workflowId,
                             WorkflowStatus status,
                             StepType currentStep,
                             String reason) {
}
