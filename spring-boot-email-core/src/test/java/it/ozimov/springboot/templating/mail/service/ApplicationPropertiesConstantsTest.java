package it.ozimov.springboot.templating.mail.service;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;
import org.junit.Test;

import static it.ozimov.springboot.templating.mail.service.ApplicationPropertiesConstants.*;

public class ApplicationPropertiesConstantsTest {

    @Rule
    public final JUnitSoftAssertions assertions = new JUnitSoftAssertions();

    @Test
    public void shouldConstantsRemainUnchanged() {
        assertions.assertThat(__SPRING_MAIL_SCHEDULER).isEqualTo("spring.mail.scheduler");
        assertions.assertThat(SPRING_MAIL_HOST).isEqualTo("spring.mail.host");
        assertions.assertThat(SPRING_MAIL_PORT).isEqualTo("spring.mail.port");
        assertions.assertThat(SPRING_MAIL_USERNAME).isEqualTo("spring.mail.username");
        assertions.assertThat(SPRING_MAIL_PASSWORD).isEqualTo("spring.mail.password");
        assertions.assertThat(SPRING_MAIL_PROPERTIES_MAIL_SMTP_AUTH).isEqualTo("spring.mail.properties.mail.smtp.auth");
        assertions.assertThat(SPRING_MAIL_PROPERTIES_MAIL_SMTP_STARTTLS_ENABLE).isEqualTo("spring.mail.properties.mail.smtp.starttls.enable");
        assertions.assertThat(SPRING_MAIL_PROPERTIES_MAIL_SMTP_STARTTLS_REQUIRED).isEqualTo("spring.mail.properties.mail.smtp.starttls.required");
        assertions.assertThat(SPRING_MAIL_SCHEDULER_ENABLED).isEqualTo("spring.mail.scheduler.enabled");
        assertions.assertThat(SPRING_MAIL_SCHEDULER_PRIORITY_LEVELS).isEqualTo("spring.mail.scheduler.priorityLevels");
        assertions.assertThat(SPRING_MAIL_PERSISTENCE_ENABLED).isEqualTo("spring.mail.scheduler.persistence.enabled");
        assertions.assertThat(SPRING_MAIL_SCHEDULER_PERSISTENCE_DESIRED_BATCH_SIZE).isEqualTo("spring.mail.scheduler.persistence.desiredBatchSize");
        assertions.assertThat(SPRING_MAIL_SCHEDULER_PERSISTENCE_MIN_KEPT_IN_MEMORY).isEqualTo("spring.mail.scheduler.persistence.minKeptInMemory");
        assertions.assertThat(SPRING_MAIL_SCHEDULER_PERSISTENCE_MAX_KEPT_IN_MEMORY).isEqualTo("spring.mail.scheduler.persistence.maxKeptInMemory");
        assertions.assertThat(SPRING_MAIL_PERSISTENCE_REDIS_ENABLED).isEqualTo("spring.mail.scheduler.persistence.redis.enabled");
        assertions.assertThat(SPRING_MAIL_PERSISTENCE_REDIS_EMBEDDED).isEqualTo("spring.mail.scheduler.persistence.redis.embedded");
        assertions.assertThat(SPRING_MAIL_PERSISTENCE_REDIS_HOST).isEqualTo("spring.mail.scheduler.persistence.redis.host");
        assertions.assertThat(SPRING_MAIL_PERSISTENCE_REDIS_PORT).isEqualTo("spring.mail.scheduler.persistence.redis.port");
    }

}