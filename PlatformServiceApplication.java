package com.opsmx;

import com.opsmx.secrets.cyberark.configuration.EnableCyberArkAutoConfiguration;
import com.opsmx.secrets.vault.configuration.EnableVaultAutoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableCyberArkAutoConfiguration
@EnableVaultAutoConfiguration
@EnableJpaAuditing
@EnableTransactionManagement
@EnableCaching
@EnableAsync
@Slf4j
@EnableFeignClients
@EnableRetry
@EnableScheduling
public class PlatformServiceApplication {

    public static void main(String[] args) {
        log.info("Starting Platform service...");
        SpringApplication.run(PlatformServiceApplication.class, args);
    }
}
