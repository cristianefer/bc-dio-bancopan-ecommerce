package br.com.cris.pan.ecommerce.ecommerce.infra;


import br.com.cris.pan.ecommerce.ecommerce.infra.deserializer.LocalDateTimeDeserializer;
import br.com.cris.pan.ecommerce.ecommerce.infra.deserializer.LocalDateDeserializer;
import br.com.cris.pan.ecommerce.ecommerce.infra.serializer.LocalDateSerializer;
import br.com.cris.pan.ecommerce.ecommerce.infra.serializer.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class ObjectMapperConfig implements Jackson2ObjectMapperBuilderCustomizer {

    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
        jacksonObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .serializerByType(LocalDate.class, new LocalDateSerializer())
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer())
                .deserializerByType(LocalDate.class, new LocalDateDeserializer())
                .deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer());
    }
}
