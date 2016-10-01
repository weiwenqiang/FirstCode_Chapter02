package com.example.chapter02.intent;

import com.example.chapter02.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class IntentData extends Activity {
	TextView tv_data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intent_data);
		findViewById(R.id.intent_data).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						// 获取传递的数据
						Intent intent = getIntent();
						String data = intent.getStringExtra("extra_data");
						Log.i("Extra", data);
					}
				});
	}

}
