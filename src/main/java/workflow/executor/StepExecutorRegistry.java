package workflow.executor;

import workflow.enums.StepType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class StepExecutorRegistry {
    private final Map<StepType, StepExecutor> executors;

    public StepExecutorRegistry(List<StepExecutor> executorList){
        this.executors = executorList.stream()
                .collect(Collectors.toMap(
                        StepExecutor::getStepType,
                        Function.identity()
                ));
    }

    public StepExecutor getExecutor(StepType stepType){
        StepExecutor executor = executors.get(stepType);

        if(executor == null){
            throw new IllegalArgumentException(
                    "No executor registered for step: "+ stepType);
        }
        return  executor;
    }
}
