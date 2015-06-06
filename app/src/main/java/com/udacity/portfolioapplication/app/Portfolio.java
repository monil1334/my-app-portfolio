package com.udacity.portfolioapplication.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Portfolio extends Activity {

    private Button mSpotifyButton;
    private Button mScoresAppButton;
    private Button mLibraryAppButton;
    private Button mBuildButton;
    private Button mReaderButton;
    private Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portfolio_main);

        mSpotifyButton = (Button) findViewById(R.id.spotifyStreamer);
        mSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(R.string.spotifyToast);
            }
        });

        mScoresAppButton = (Button) findViewById(R.id.scoresApp);
        mScoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(R.string.scoresToast);
            }
        });

        mLibraryAppButton = (Button) findViewById(R.id.libraryApp);
        mLibraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(R.string.libraryToast);
            }
        });

        mBuildButton = (Button) findViewById(R.id.builditBigger);
        mBuildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(R.string.buildToast);
            }
        });

        mReaderButton = (Button) findViewById(R.id.xyzReader);
        mReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(R.string.xyzToast);
            }
        });

        mCapstoneButton = (Button) findViewById(R.id.capstoneProject);
        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(R.string.capstoneToast);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void displayToast(int textId) {
        Toast.makeText(getApplicationContext(), getString(textId), Toast.LENGTH_SHORT).show();
    }
}
