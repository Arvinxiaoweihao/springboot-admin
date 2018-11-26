package com.spring.boot.admin.server.springbootadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author weihao.xiao
 */
@Configuration
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class AdminServerApp {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApp.class, args);
    }

//    // tag::configuration-filtering-notifier[]
//    @Configuration
//    public static class NotifierConfig {
//        private final InstanceRepository repository;
//        private final ObjectProvider<List<Notifier>> otherNotifiers;
//
//        public NotifierConfig(InstanceRepository repository, ObjectProvider<List<Notifier>> otherNotifiers) {
//            this.repository = repository;
//            this.otherNotifiers = otherNotifiers;
//        }
//
//
//        @Bean
//        public FilteringNotifier filteringNotifier() { // <1>
//            CompositeNotifier delegate = new CompositeNotifier(otherNotifiers.getIfAvailable(Collections::emptyList));
//            return new FilteringNotifier(delegate, repository);
//        }
//
//        @Primary
//        @Bean(initMethod = "start", destroyMethod = "stop")
//        public RemindingNotifier remindingNotifier() { // <2>
//            RemindingNotifier notifier = new RemindingNotifier(filteringNotifier(), repository);
//            notifier.setReminderPeriod(Duration.ofMinutes(10));
//            notifier.setCheckReminderInverval(Duration.ofSeconds(10));
//            return notifier;
//        }
//    }
//    // end::configuration-filtering-notifier[]

}
