package com.example.daori.jobmanagertestconcept;

import android.util.Log;

import com.path.android.jobqueue.Params;

/**
 * Created by daori on 10/31/15.
 */
public class PostStoryJob extends AbstractJob {

    private final int counterPost;

    public PostStoryJob(int priority, int counterPost) {
        super(new Params(priority).requireNetwork().persist());

        this.counterPost = counterPost;
    }

    @Override
    protected boolean isOkToIgnore(Throwable throwable) {
        return false;
    }

    @Override
    protected boolean shouldReRunOnThrowable(Throwable throwable) {
        return super.shouldReRunOnThrowable(throwable);
    }

    @Override
    public void onRun() throws Throwable {
        Log.i("JOB_STORY", "Post Story job onRun : counter " + counterPost);
    }
}
