package com.xxl.job.executor.fade;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class MyXxlJobs {

    @XxlJob("testMethodJob")
    public void testMethodJob() {
        XxlJobHelper.log("xxl-job testMethodJob");
        XxlJobHelper.log("current time is {}", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }

}
