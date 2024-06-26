package io.pivotal.cfapp.config;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import lombok.Data;

@Data
@RefreshScope
@ConfigurationProperties(prefix = "cf")
public class HooverSettings {

	private Map<String, String> butlers = new HashMap<>();
	private boolean sslValidationSkipped;
	private Duration timeout = Duration.ofMinutes(2);

}
