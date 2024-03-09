package com.EmailSending.ScheduledTasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    @Scheduled(cron = "0 26 15 * * *")
    public void sendReminderEmail(){

        System.out.println("Reminder Email Sent Successfully");

    }
}
