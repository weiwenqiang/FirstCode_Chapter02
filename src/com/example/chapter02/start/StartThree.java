package com.example.chapter02.start;

import com.example.chapter02.R;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class StartThree extends BaseActivity implements OnClickListener {
	Button one;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("StartThree", this.toString());
		Log.d("StartThree", "ÈÎÎñÕ»IDÎª£º"+getTaskId());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.start_three);
		one = (Button) findViewById(R.id.start_three);
		one.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.start_three:
			startActivity(new Intent(StartThree.this, StartTwo.class));
			break;

		default:
			break;
		}
	}
}
