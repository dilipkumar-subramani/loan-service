package learning.com.loanservice.config;

import learning.com.loanservice.event.LoanEvent;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JacksonJsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    @Bean
    ProducerFactory<String, LoanEvent<?>> producerFactory(){
        Map<String, Object> props = new HashMap<>();
        props.put("bootstrap.servers","localhost:9092");

        return new DefaultKafkaProducerFactory<>(
                props,
                new StringSerializer(),
                new JacksonJsonSerializer<>()
        );

    }

    @Bean
    KafkaTemplate<String, LoanEvent<?>> kafkaTemplate(ProducerFactory<String, LoanEvent<?>> producerFactory){
        return  new KafkaTemplate<>(producerFactory);

    }
}
