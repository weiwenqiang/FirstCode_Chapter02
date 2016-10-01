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
				intent.putExtra("data_return", "setResult(RESULT_OK, intent)���ҷ��ص���ҳ��");
				setResult(RESULT_OK, intent);
				finish();
			}
		});
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		//���÷���Ҫҳ���з���ֵ������û�ֱ�ӵ�Back����дonBackPressed()������������������ݵ��߼�
		Intent intent = new Intent();
		intent.putExtra("data_return", "setResult(RESULT_OK, intent)���ҷ��ص���ҳ��");
		setResult(RESULT_OK, intent);
		finish();
	}
	

}
