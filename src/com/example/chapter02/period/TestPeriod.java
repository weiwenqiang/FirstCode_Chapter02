package com.example.chapter02.period;

import com.example.chapter02.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class TestPeriod extends Activity implements OnClickListener {
	public static final String TAG = "TestPeriod";
	Button b1, b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate---����");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b3_period);
		Log.d(TAG, this.toString());
		if(savedInstanceState != null){
			String tempData = savedInstanceState.getString("data_key");
			Log.d(TAG, tempData);
		}
		
		
		b1 = (Button) findViewById(R.id.b3_normal);
		b2 = (Button) findViewById(R.id.b3_dialog);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b3_normal:
			startActivity(new Intent(TestPeriod.this, PeriodNormal.class));
			break;
		case R.id.b3_dialog:
			startActivity(new Intent(TestPeriod.this, PeriodDialog.class));
			break;

		default:
			break;
		}
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart---�ɼ�");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume---�ɽ���");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "onPause---��ͣ");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "onStop---���ɼ�");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy---����");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "onRestart---��������");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		String tempData = "�������ʱ��onSaveInstanceState������������";
		outState.putString("data_key", tempData);
	}
	
}
