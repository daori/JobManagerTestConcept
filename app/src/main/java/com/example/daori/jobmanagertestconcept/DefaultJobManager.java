package com.example.daori.jobmanagertestconcept;

import android.content.Context;

import com.path.android.jobqueue.JobManager;
import com.path.android.jobqueue.config.Configuration;

/**
 * Created by daori on 10/31/15.
 */
public class DefaultJobManager extends JobManager {
    public DefaultJobManager(Context context) {
        super(context, new Configuration.Builder(context).build());
    }
}
