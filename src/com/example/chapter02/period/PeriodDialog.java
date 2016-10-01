package com.example.chapter02.period;

import com.example.chapter02.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class PeriodDialog extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.period_dialog);
	}

}
