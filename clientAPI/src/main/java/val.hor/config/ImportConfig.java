package val.hor.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import val.hor.store.EnableStore;

@Import({
        EnableStore.class
})
@Configuration
public class ImportConfig {
}
