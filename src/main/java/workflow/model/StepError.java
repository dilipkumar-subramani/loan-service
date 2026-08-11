package workflow.model;

import workflow.enums.ErrorType;

public record StepError(ErrorType type,
                        String code,
                        String message) {
}
