package es.solusoft.analytics;

import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;

public class AnalyticsActivity extends Activity {

	@Override
	public void onStart() {
		super.onStart();
		EasyTracker.getInstance().activityStart(this); 
	}

	@Override
	public void onStop() {
		super.onStop();
		EasyTracker.getInstance().activityStop(this); 
	}
}