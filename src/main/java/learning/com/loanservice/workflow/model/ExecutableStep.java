package learning.com.loanservice.workflow.model;

import learning.com.loanservice.workflow.enums.ExecutionMode;
import learning.com.loanservice.workflow.enums.StepType;

public record ExecutableStep(StepType stepType,
                             ExecutionMode executionMode) {
}
