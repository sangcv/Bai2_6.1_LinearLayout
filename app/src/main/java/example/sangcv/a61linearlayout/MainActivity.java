package example.sangcv.a61linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    RadioButton rbRed,rbWhite,rbBlue;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        rbRed = (RadioButton) findViewById(R.id.rbRed);
        rbWhite = (RadioButton) findViewById(R.id.rbWhite);
        rbBlue = (RadioButton) findViewById(R.id.rbBlue);

    }
    public void setColor(View v) {
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.rbRed:
                tv.setBackgroundResource(R.color.red);
                break;
            case R.id.rbWhite:
                tv.setBackgroundResource(R.color.white);
                break;
            case R.id.rbBlue:
                tv.setBackgroundResource(R.color.blue);
                break;
        }
    }
    public void cancelColor(View v) {
        tv.setBackgroundResource(R.color.brown);
    }
}
