package workflow.model;

import workflow.enums.ExecutionMode;
import workflow.enums.StepType;

public record ExecutableStep(StepType stepType,
                             ExecutionMode executionMode) {
}
