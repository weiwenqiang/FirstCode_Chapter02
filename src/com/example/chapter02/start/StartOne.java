package com.example.chapter02.start;

import com.example.chapter02.R;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class StartOne extends BaseActivity implements OnClickListener {
	Button one;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("StartOne", "����ջIDΪ��"+getTaskId());
		Log.d("StartOne", this.toString());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.start_one);
		one = (Button) findViewById(R.id.start_one);
		one.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.start_one:
			//����������д��
			StartOne.actionStart(StartOne.this, "��������1", "��������2");
			break;

		default:
			break;
		}
	}
	/*
	 * ���д�����Ժ������֪����ͼ��Ҫ������Щֵ�������Ŷӿ���
	 */
	public static void actionStart(Context context, String data1, String data2){
		Intent intent = new Intent(context, TestStart.class);
		intent.putExtra("param1", data1);
		intent.putExtra("param2", data2);
		context.startActivity(intent);
	}
}
