package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView textStory;
    Button buttonTop;
    Button buttonBottom;
    int storyProgress = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        textStory = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyProgress == 1) {
                    storyProgress = 3;
                    textStory.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                } else if (storyProgress == 2){
                    storyProgress = 3;
                    textStory.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                } else if (storyProgress == 3) {
                    storyProgress = 6;
                    textStory.setText(R.string.T6_End);
                    buttonTop.setText("The End");
                    buttonBottom.setText("Restart");
                } else if (storyProgress == 4) {
                    textStory.setText(R.string.T1_Story);
                    buttonTop.setText(R.string.T1_Ans1);
                    buttonBottom.setText(R.string.T1_Ans2);
                    storyProgress = 1;
                } else if (storyProgress == 5) {
                    textStory.setText(R.string.T1_Story);
                    buttonTop.setText(R.string.T1_Ans1);
                    buttonBottom.setText(R.string.T1_Ans2);
                    storyProgress = 1;
                } else if (storyProgress == 6) {
                    textStory.setText(R.string.T1_Story);
                    buttonTop.setText(R.string.T1_Ans1);
                    buttonBottom.setText(R.string.T1_Ans2);
                    storyProgress = 1;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (storyProgress == 1) {
                    storyProgress = 2;
                    textStory.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                } else if (storyProgress == 2){
                    storyProgress = 4;
                    textStory.setText(R.string.T4_End);
                    buttonTop.setText("The End");
                    buttonBottom.setText("Restart");
                } else if (storyProgress == 3) {
                    storyProgress = 5;
                    textStory.setText(R.string.T5_End);
                    buttonTop.setText("The End");
                    buttonBottom.setText("Restart");
                } else if (storyProgress == 4) {
                    textStory.setText(R.string.T1_Story);
                    buttonTop.setText(R.string.T1_Ans1);
                    buttonBottom.setText(R.string.T1_Ans2);
                    storyProgress = 1;
                } else if (storyProgress == 5) {
                    textStory.setText(R.string.T1_Story);
                    buttonTop.setText(R.string.T1_Ans1);
                    buttonBottom.setText(R.string.T1_Ans2);
                    storyProgress = 1;
                } else if (storyProgress == 6) {
                    textStory.setText(R.string.T1_Story);
                    buttonTop.setText(R.string.T1_Ans1);
                    buttonBottom.setText(R.string.T1_Ans2);
                    storyProgress = 1;
                }

            }
        });

    }
}
