package masukura.opst.co.jp.studyproject;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.Gravity;
import android.view.KeyEvent;
import android.app.AlertDialog;

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
					new AlertDialog.Builder(MainActivity.this)
							.setMessage("アプリを終了しますか？")
							.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog, int i) {
									finishAndRemoveTask();
								}
							})
							.setNegativeButton("No", null)
							.show();
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
