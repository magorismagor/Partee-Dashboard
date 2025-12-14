package com.yneeds.partee.dashboard;

import com.yneeds.partee.dashboard.config.AsyncSyncConfiguration;
import com.yneeds.partee.dashboard.config.EmbeddedKafka;
import com.yneeds.partee.dashboard.config.EmbeddedSQL;
import com.yneeds.partee.dashboard.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ParteeDashBoardApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {}
