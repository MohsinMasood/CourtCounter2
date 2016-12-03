package com.example.ahmedraza.courtcounter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    int scoreA;
    int scoreB;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void displayForTeamA(int score1) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score1));
    }

    public void q(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);


    }

    public void p(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);


    }

    public void l(View view) {
        scoreA = scoreA + 1;

        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int score1) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score1));
    }

    public void B1(View view) {
        scoreB = scoreB + 3;

        displayForTeamB(scoreB);


    }

    public void B2(View view) {
        scoreB = scoreB + 2;

        displayForTeamB(scoreB);


    }

    public void B3(View view) {

        scoreB = scoreB + 1;

        displayForTeamB(scoreB);
    }

    public void reset(View view) {

        displayForTeamA(0);
        displayForTeamB(0);


    }


}