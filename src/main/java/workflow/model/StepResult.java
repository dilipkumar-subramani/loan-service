package workflow.model;

import workflow.enums.StepStatus;

public record StepResult<T>(StepStatus status, T output, StepError error ) {
}
