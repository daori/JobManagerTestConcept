package com.example.daori.jobmanagertestconcept;

import android.util.Log;

import com.path.android.jobqueue.Job;
import com.path.android.jobqueue.Params;

/**
 * Created by daori on 10/31/15.
 */
public abstract class AbstractJob extends Job {
    private static final String TAG = "oresama";

    protected AbstractJob(Params params) {
        super(params);
    }

    @Override
    public void onAdded() {
    }

    @Override
    protected void onCancel() {
    }

    @Override
    protected boolean shouldReRunOnThrowable(Throwable throwable) {
        Log.w(TAG, createLogMessage("Found error on job"), throwable);
        return isOkToIgnore(throwable);
    }

    private String createLogMessage(String message) {
        StringBuilder sb = new StringBuilder(message);
        sb.append(' ');
        sb.append(getClass().getSimpleName());
        sb.append(' ');
        sb.append(hashCode());
        return sb.toString();
    }

    protected abstract boolean isOkToIgnore(Throwable throwable);
}
