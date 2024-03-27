package val.hor.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Duration;

@RequiredArgsConstructor
@Component
public class RedisLockWrapper {

    private final RedisLock redisLock;

    public void lockAndExecuteTask(String key, Duration duration, Runnable runnable) {

        try {

            if (!redisLock.acquireLock(key, duration)) {
                return;
            }

            runnable.run();

        } finally {
            redisLock.releaseLock(key);
        }
    }




}
