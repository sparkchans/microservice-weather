package studyspringcloud.weathercollectioneurekafeign.config;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import studyspringcloud.weathercollectioneurekafeign.job.WeatherDataSyncJob;

/**
 * @author sparkchan
 * @date 2019/12/29
 */
@Configuration
public class QuartzConfiguration {
    private static final int TIME = 1800;

    @Bean
    public JobDetail weatherDataSyncJobDetail() {
        return JobBuilder.newJob(WeatherDataSyncJob.class)
            .withIdentity("weatherDataSyncJob")
            .storeDurably()
            .build();
    }

    @Bean
    public Trigger weatherDataSyncTrigger() {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder
            .simpleSchedule()
            .withIntervalInSeconds(TIME)
            .repeatForever();
        return TriggerBuilder
            .newTrigger()
            .forJob(weatherDataSyncJobDetail())
            .withIdentity("weatherDataSyncTrigger")
            .withSchedule(scheduleBuilder)
            .build();
    }
}
