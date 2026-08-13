package learning.com.loanservice.producer;

import learning.com.loanservice.event.LoanEvent;
import learning.com.loanservice.event.LoanEventPublisher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.support.SendResult;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class LoanEventProducer implements LoanEventPublisher {
    private final KafkaTemplate<String, LoanEvent<?>> kafkaTemplate;

    @Value("${app.kafka.topics.loan-events}")
    private  String loanEventsTopic;


    public LoanEventProducer(KafkaTemplate<String, LoanEvent<?>> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public CompletableFuture<SendResult<String, LoanEvent<?>>> publish(LoanEvent<?> loanEvent){
        CompletableFuture<SendResult<String, LoanEvent<?>>> future = kafkaTemplate.send(loanEventsTopic,
                loanEvent.transactionId().toString(),
                loanEvent);

      return  future;

    }
}
