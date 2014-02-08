package com.devadvance.circularseekbardemo;

import com.devadvance.circularseekbar.CircularSeekBar;
import com.devadvance.circularseekbar.CircularSeekBar.OnCircularSeekBarChangeListener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	CircularSeekBar circularSeekBar1;
	CircularSeekBar circularSeekBar2;
	TextView textViewDemo2Progress;
	CircularSeekBar circularSeekBar3;
	CircularSeekBar circularSeekBar4;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		circularSeekBar1 = (CircularSeekBar)findViewById(R.id.circularSeekBar1);
		circularSeekBar2 = (CircularSeekBar)findViewById(R.id.circularSeekBar2);
		textViewDemo2Progress = (TextView)findViewById(R.id.textViewDemo2Progress);
		circularSeekBar2.setOnSeekBarChangeListener(new CircleSeekBarListener());
		//circularSeekBar = (CircularSeekBar)findViewById(R.id.circularSeekBar);
		//circularSeekBar = (CircularSeekBar)findViewById(R.id.circularSeekBar);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public class CircleSeekBarListener implements OnCircularSeekBarChangeListener {
	    @Override
	    public void onProgressChanged(CircularSeekBar circularSeekBar, int progress, boolean fromUser) {
	    	textViewDemo2Progress.setText("Progress: " + progress);

	    }

		@Override
		public void onStopTrackingTouch(CircularSeekBar seekBar) {
			Toast.makeText(getApplicationContext(), "onStopTrackingTouch called!", Toast.LENGTH_SHORT).show();
		}

		@Override
		public void onStartTrackingTouch(CircularSeekBar seekBar) {
			Toast.makeText(getApplicationContext(), "onStartTrackingTouch called!", Toast.LENGTH_SHORT).show();
		}
	}

}
