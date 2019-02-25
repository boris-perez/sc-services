package csservices.edu;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
// Habilitando mecanismos de auditoria que provee JPA, para que ciertas columnas se llenen automaticamente
public class PersistenceConfig {
}
