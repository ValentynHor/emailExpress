package val.hor.store.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "send_email_task")
public class SendEmailTaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    @Column(updatable = false , nullable = false)
    private Instant createdAt = Instant.now();

    private Instant processedAt;

    private Instant latestTryAt;

    private String destinationEmail;

    private String message;

}
