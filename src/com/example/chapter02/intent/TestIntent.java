package com.example.chapter02.intent;

import com.example.chapter02.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class TestIntent extends Activity implements OnClickListener {
	Button b1, b2, b3, b4, b5, b6, b7, b8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b2_intent);
		b1 = (Button) findViewById(R.id.b2_b1);
		b2 = (Button) findViewById(R.id.b2_b2);
		b3 = (Button) findViewById(R.id.b2_b3);
		b4 = (Button) findViewById(R.id.b2_b4);
		b5 = (Button) findViewById(R.id.b2_b5);
		b6 = (Button) findViewById(R.id.b2_b6);
		b7 = (Button) findViewById(R.id.b2_b7);
		b8 = (Button) findViewById(R.id.b2_b8);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b2_b1:
			Intent intent1 = new Intent(TestIntent.this, IntentSkip.class);
			startActivity(intent1);
			break;
		case R.id.b2_b2:
			Intent intent2 = new Intent("test.action.intent.skip");
			startActivity(intent2);
			break;
		case R.id.b2_b3:
			Intent intent3 = new Intent("test.action.intent.skip");
			intent3.addCategory("test.category.intent.MY_CATEGORY");
			startActivity(intent3);
			break;
		case R.id.b2_b4:
			Intent intent4 = new Intent(Intent.ACTION_VIEW);
			intent4.setData(Uri.parse("http://www.baidu.com"));
			startActivity(intent4);
			break;
		case R.id.b2_b5:
			Intent intent5 = new Intent("android.intent.action.VIEW");
			startActivity(intent5);
			break;
		case R.id.b2_b6:
			Intent intent6 = new Intent(Intent.ACTION_DIAL);
			intent6.setData(Uri.parse("tel:10086"));
			startActivity(intent6);
			break;
		case R.id.b2_b7:
			String data = "我是putExtra传递的数据";
			Intent intent7 = new Intent(TestIntent.this, IntentData.class);
			//向下一个活动传递值
			intent7.putExtra("extra_data", data);
			startActivity(intent7);
			break;
		case R.id.b2_b8:
			Intent intent8 = new Intent(TestIntent.this, IntentSkip.class);
			//要求有返回值
			startActivityForResult(intent8, 1);
			break;

		default:
			break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		switch (requestCode) {
		case 1:
			//接收调用ID号为1的页面返回数据
			if(resultCode == RESULT_OK){
				String returnedData = data.getStringExtra("data_return");
				Log.i("onActivityResult", returnedData);
			}
			break;

		default:
			break;
		}
	}
	
}
