package com.example.chapter02.intent;

import com.example.chapter02.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IntentSkip extends Activity {
	Button tv_result;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intent_skip);
		findViewById(R.id.intent_result).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putExtra("data_return", "setResult(RESULT_OK, intent)将我返回调用页面");
				setResult(RESULT_OK, intent);
				finish();
			}
		});
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		//调用方需要页面有返回值，如果用户直接点Back，重写onBackPressed()方法，将解决返回数据的逻辑
		Intent intent = new Intent();
		intent.putExtra("data_return", "setResult(RESULT_OK, intent)将我返回调用页面");
		setResult(RESULT_OK, intent);
		finish();
	}
	

}
