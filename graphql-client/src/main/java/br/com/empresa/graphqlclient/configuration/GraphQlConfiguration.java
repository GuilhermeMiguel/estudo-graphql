package br.com.empresa.graphqlclient.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class GraphQlConfiguration {

    WebClient webClient() {
        return WebClient.builder().baseUrl("localhost:8095/graphql").build();
    }

    @Bean
    HttpGraphQlClient graphQlClient() {
        return HttpGraphQlClient.builder(webClient())
                .build();
    }
}
