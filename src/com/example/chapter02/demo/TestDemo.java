package com.example.chapter02.demo;

import com.example.chapter02.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class TestDemo extends Activity implements OnClickListener {
	Button toast, finish;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 隐藏标题栏
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b1_demo);

		toast = (Button) findViewById(R.id.b1_toast);
		finish = (Button) findViewById(R.id.b1_finish);
		toast.setOnClickListener(this);
		finish.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// 添加菜单
		getMenuInflater().inflate(R.menu.b1_demo, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b1_toast:
			// Toast提示
			Toast.makeText(TestDemo.this, "Toast提示点击按钮事件",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.b1_finish:
			// 销毁活动
			finish();
			break;
		default:
			break;
		}
	}
}
