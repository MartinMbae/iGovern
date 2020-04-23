package studios.luxurious.igovern.activities;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.robinhood.ticker.TickerView;

import studios.luxurious.igovern.Main3Activity;
import studios.luxurious.igovern.R;
import studios.luxurious.igovern.utils.BaseActivity;
import studios.luxurious.igovern.utils.SharedPref;

public class LaunchActivity extends BaseActivity {

    private TickerView tickerView;
SharedPref sharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_activity);
        tickerView = findViewById(R.id.ticker1);
        sharedPref = new SharedPref(this);

        tickerView.setPreferredScrollingDirection(TickerView.ScrollingDirection.ANY);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (sharedPref.getCountyName() != null){

                    startActivity(new Intent(LaunchActivity.this, Main3Activity.class));
                }else {
                    startActivity(new Intent(LaunchActivity.this, MapsActivity.class));
                }
                finish();

            }
        }, 4000);

    }


    @Override
    protected void onUpdate() {

        String name = (getString(R.string.app_name));
        tickerView.setText(name);
    }


}
