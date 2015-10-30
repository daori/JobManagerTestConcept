package com.example.daori.jobmanagertestconcept;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int storyCounter = 0;
    private int commentCounter = 0;
    private DefaultJobManager defaultJobManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defaultJobManager = new DefaultJobManager(getApplicationContext());
    }

    public void postStory(View view){
        storyCounter++;

        PostStoryJob postStoryJob = new PostStoryJob(JobPriority.HIGH, storyCounter);
        defaultJobManager.addJob(postStoryJob);

        Log.i("POST_STORY", "Post Story " + storyCounter);
    }

    public void postComment(View view){
        commentCounter++;

        PostCommentJob postCommentJob = new PostCommentJob(JobPriority.MEDIUM, commentCounter);
        defaultJobManager.addJob(postCommentJob);

        Log.i("POST_COMMENT", "Post Comment " + commentCounter);
    }
}
