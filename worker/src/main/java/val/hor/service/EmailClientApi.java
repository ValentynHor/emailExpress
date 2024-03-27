package val.hor.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import val.hor.store.entity.SendEmailTaskEntity;

import java.util.Random;

@RequiredArgsConstructor
@Component
public class EmailClientApi {

    Random random = new Random();


    /**
     *
     * @return true if email delivered to destination email
     */
    public boolean sendEmail(String destinationEmail, String message) {

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            return false;
        }

        return random.nextInt(11) < 5;
    }
}
