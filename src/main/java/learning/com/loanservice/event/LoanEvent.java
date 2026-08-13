package learning.com.loanservice.event;

import java.time.Instant;
import java.util.UUID;

public record LoanEvent<T> (UUID eventId,
                            LoanEventType eventType,
                            int eventVersion,
                            UUID transactionId,
                            UUID loanId,
                            Instant occurredAt,
                            T payload
) {
    public static <T> LoanEvent<T> create(
            LoanEventType eventType,
            UUID transactionId,
            UUID loanId,
            T payload){

        return  new LoanEvent<>(
                UUID.randomUUID(),
                eventType,
                1,
                transactionId,
                loanId,
                Instant.now(),
                payload
        );

    }

}
