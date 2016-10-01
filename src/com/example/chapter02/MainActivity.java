package com.example.chapter02;

import com.example.chapter02.demo.TestDemo;
import com.example.chapter02.intent.TestIntent;
import com.example.chapter02.period.TestPeriod;
import com.example.chapter02.start.TestStart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {
	Button b1, b2, b3, b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.c02_b1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.c02_b2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.c02_b3);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.c02_b4);
        b4.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.c02_b1:
			startActivity(new Intent(MainActivity.this, TestDemo.class));
			break;
		case R.id.c02_b2:
			startActivity(new Intent(MainActivity.this, TestIntent.class));
			break;
		case R.id.c02_b3:
			startActivity(new Intent(MainActivity.this, TestPeriod.class));
			break;
		case R.id.c02_b4:
			startActivity(new Intent(MainActivity.this, TestStart.class));
			break;
		default:
			break;
		}
	}
}
