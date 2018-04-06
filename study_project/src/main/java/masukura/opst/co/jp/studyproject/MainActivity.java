package masukura.opst.co.jp.studyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button button1 = (Button) findViewById(R.id.button1);

		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				if (view == button1) {
					Toast toast1 = Toast.makeText(MainActivity.this, "ボタン1を押下しました", Toast.LENGTH_SHORT);
					toast1.setGravity(Gravity.CENTER, 0, -200);
					toast1.show();
				}
			}
		});
	}
}
