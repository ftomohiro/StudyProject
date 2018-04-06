package masukura.opst.co.jp.studyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.Gravity;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {
	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		if (event.getAction() == KeyEvent.ACTION_DOWN) {
			switch (event.getKeyCode()) {
				case KeyEvent.KEYCODE_BACK:
					return true;
			}
		}
		return super.dispatchKeyEvent(event);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button button1 = (Button) findViewById(R.id.button1);
		final Button button2 = (Button) findViewById(R.id.button2);

		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				if (view == button1) {
					finishAndRemoveTask();
				}
			}
		});

		button2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				if (view == button2) {
					Toast toast2 = Toast.makeText(MainActivity.this, "ボタン2を押下しました", Toast.LENGTH_SHORT);
					toast2.setGravity(Gravity.CENTER, 0, -200);
					toast2.show();
				}
			}
		});
	}
}
