package val.hor.store;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("val.hor.store.dao")
@EntityScan("val.hor.store.entity")
@EnableJpaRepositories("val.hor.store.repository")

public class EnableStore {
}
