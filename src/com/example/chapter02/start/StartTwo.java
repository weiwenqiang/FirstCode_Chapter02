package com.example.chapter02.start;

import com.example.chapter02.R;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class StartTwo extends BaseActivity implements OnClickListener {
	Button two;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("StartTwo", "任务栈ID为："+getTaskId());
		Log.d("StartTwo", this.toString());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.start_two);
		two = (Button) findViewById(R.id.start_two);
		two.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.start_two:
			startActivity(new Intent(StartTwo.this, TestStart.class));
			break;

		default:
			break;
		}
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("StartTwo", "onRestart方法被执行了");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("StartTwo", "onDestroy方法被执行了");
	}
	
	
}
