package val.hor.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import val.hor.store.EnableStore;

@Import({
        EnableStore.class
})
@EnableScheduling
@Configuration
public class ImportConfig {
}
