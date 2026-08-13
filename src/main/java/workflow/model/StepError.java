package workflow.model;

import workflow.enums.ErrorCode;
import workflow.enums.ErrorType;

public record StepError(ErrorType type,
                        ErrorCode code,
                        String message) {
}
