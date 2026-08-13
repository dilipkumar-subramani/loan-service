package workflow.executor;

import workflow.enums.ErrorCode;
import workflow.enums.ErrorType;
import workflow.enums.StepStatus;
import workflow.exception.BusinessException;
import workflow.exception.ExternalServiceException;
import workflow.exception.ValidationException;
import workflow.model.ExecutableStep;
import workflow.model.StepError;
import workflow.model.StepResult;
import workflow.context.WorkflowContext;

public class StepExecutionServiceImpl implements StepExecutionService {

    private final StepExecutorRegistry executorRegistry;

    public StepExecutionServiceImpl(StepExecutorRegistry executorRegistry){
        this.executorRegistry = executorRegistry;
    }

    @Override
    public StepResult<?> execute(ExecutableStep step, WorkflowContext context) {
        try {
            var stepType = step.stepType();
            var executor = executorRegistry.getExecutor(stepType);
            return executor.execute(context);
        } catch (ExternalServiceException ex) {
            return new StepResult<>(
                    StepStatus.TECHNICAL_FAILURE,
                    null,
                    new StepError(
                            ErrorType.EXTERNAL_SERVICE,
                            ex.getCode(),
                            ex.getLocalizedMessage()
                    )
            );
        } catch (BusinessException ex) {
            return new StepResult<>(
                    StepStatus.BUSINESS_FAILURE,
                    null,
                    new StepError(
                            ErrorType.BUSINESS,
                            ErrorCode.INVALID_CUSTOMER,
                            ex.getMessage()
                    )
            );

        } catch (ValidationException ex) {
            return new StepResult<>(
                    StepStatus.BUSINESS_FAILURE,
                   null,
                    new StepError(
                            ErrorType.VALIDATION,
                            ErrorCode.CUSTOMER_VALIDATION_FAILED,
                            ex.getMessage()
                    )
            );

        }
        catch (Exception ex) {
            return new StepResult<>(
                    StepStatus.TECHNICAL_FAILURE,
                    null,
                    new StepError(
                            ErrorType.SYSTEM,
                            ErrorCode.UNEXPECTED_ERROR,
                            ex.getLocalizedMessage()
                    )
            );

        }
    }
}
