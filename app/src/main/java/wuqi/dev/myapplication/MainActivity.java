package wuqi.dev.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private EditText input;
    private TextView textDisplay;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        input = findViewById(R.id.inputPassword);
        textDisplay = findViewById(R.id.textDisplay);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {
        String inputText = input.getText().toString();
        textDisplay.setText(inputText);
        Log.d("TTT", inputText);
    }
}
