package com.example.chapter02.start;

import com.example.chapter02.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class TestStart extends Activity implements OnClickListener {
	Button b1, b2, b3, b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("TestStart", "ÈÎÎñÕ»IDÎª£º"+getTaskId());
		Log.d("TestStart", this.toString());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b4_start);
		b1 = (Button) findViewById(R.id.b4_b1);
		b2 = (Button) findViewById(R.id.b4_b2);
		b3 = (Button) findViewById(R.id.b4_b3);
		b4 = (Button) findViewById(R.id.b4_b4);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b4_b1:
			startActivity(new Intent(TestStart.this, TestStart.class));
			break;
		case R.id.b4_b2:
			startActivity(new Intent(TestStart.this, StartOne.class));
			break;
		case R.id.b4_b3:
			startActivity(new Intent(TestStart.this, StartTwo.class));
			break;
		case R.id.b4_b4:
			startActivity(new Intent(TestStart.this, StartThree.class));
			break;

		default:
			break;
		}
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		ActivityCollector.finishAll();
	}

}
