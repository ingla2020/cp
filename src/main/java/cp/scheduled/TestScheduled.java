package cp.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
//@EnableScheduling
@Slf4j
@Profile("!dev")
public class TestScheduled {

    @Scheduled(cron = "0 0/1 * * * *")
    public void Test1(){
        log.info("Inicie Sheduled");
    }
}
