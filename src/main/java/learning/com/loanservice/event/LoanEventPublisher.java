package learning.com.loanservice.event;

import org.springframework.kafka.support.SendResult;
import java.util.concurrent.CompletableFuture;

public interface LoanEventPublisher {
    CompletableFuture<SendResult<String, LoanEvent<?>>> publish(
            LoanEvent<?> loanEvent);
}
