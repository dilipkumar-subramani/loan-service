package learning.com.loanservice.workflow.model;

import learning.com.loanservice.workflow.enums.StepStatus;

public record StepResult<T>(StepStatus status, T output, StepError error ) {
}
