package val.hor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import val.hor.store.dao.SendEmailTaskDao;
import val.hor.store.entity.SendEmailTaskEntity;

@RequiredArgsConstructor
@RestController
public class SendEmailTaskController {

    private final SendEmailTaskDao sendEmailTaskDao;

    public static final String SEND_EMAIL = "api/email/send";




    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping(SEND_EMAIL)
    public void sendEmail(
            @RequestParam("destination_email") String destinationEmail,
            @RequestParam String message) {

        sendEmailTaskDao.save(
                SendEmailTaskEntity.builder()
                        .destinationEmail(destinationEmail)
                        .message(message)
                        .build()
        );

    }

}
