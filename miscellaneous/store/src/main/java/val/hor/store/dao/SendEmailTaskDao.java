package val.hor.store.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import val.hor.store.entity.SendEmailTaskEntity;
import val.hor.store.repository.SendEmailTaskRepository;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class SendEmailTaskDao {

    private final SendEmailTaskRepository sendEmailTaskRepository;

    private static final Duration TASK_EXECUTE_DURATION = Duration.ofSeconds(10);

    @Transactional
    public SendEmailTaskEntity save(SendEmailTaskEntity entity) {
        return sendEmailTaskRepository.save(entity);
    }

    public List<Long> findNotProcessedIds() {

        Instant latestTryAtLte = Instant.now().minus(TASK_EXECUTE_DURATION);

        return sendEmailTaskRepository.findAllNotProcessed(latestTryAtLte);
    }

    public Optional<SendEmailTaskEntity> findNotProcessedById(Long id) {

        Instant latestTryAtLte = Instant.now().minus(TASK_EXECUTE_DURATION);

        return sendEmailTaskRepository.findNotProcessedById(id, latestTryAtLte);
    }

    @Transactional
    public void markAsProcessed(SendEmailTaskEntity entity) {
        sendEmailTaskRepository.markAsProcessed(entity.getId());
    }

    @Transactional
    public void updateLatestTryAt(SendEmailTaskEntity entity) {
        sendEmailTaskRepository.updateLatestTryAt(entity.getId());
    }
}
