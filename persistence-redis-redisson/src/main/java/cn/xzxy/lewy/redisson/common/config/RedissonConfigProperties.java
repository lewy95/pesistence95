package cn.xzxy.lewy.redisson.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lewy95
 */
@ConfigurationProperties(prefix = "spring.redis.redisson")
@Data
public class RedissonConfigProperties {
    String configPath;
    String fastJsonAcceptPackage;
}
