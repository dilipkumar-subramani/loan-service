package learning.com.loanservice.workflow.model;

import learning.com.loanservice.workflow.enums.ErrorCode;
import learning.com.loanservice.workflow.enums.ErrorType;

public record StepError(ErrorType type,
                        ErrorCode code,
                        String message) {
}
