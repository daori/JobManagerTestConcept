package com.example.daori.jobmanagertestconcept;

import android.util.Log;

import com.path.android.jobqueue.Params;

/**
 * Created by daori on 10/31/15.
 */
public class PostCommentJob extends AbstractJob {

    private final int counterPost;

    public PostCommentJob(int priority, int counterPost) {
        super(new Params(priority).requireNetwork());

        this.counterPost = counterPost;
    }

    @Override
    protected boolean isOkToIgnore(Throwable throwable) {
        return false;
    }

    @Override
    public void onRun() throws Throwable {
        Log.i("JOB_COMMENT", "Post Comment job onRun : counter " + counterPost);
    }

    @Override
    protected int getRetryLimit() {
        return super.getRetryLimit();
    }
}
