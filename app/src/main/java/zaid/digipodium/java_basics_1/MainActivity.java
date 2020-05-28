package zaid.digipodium.java_basics_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    private TextView textCount;
    private EditText editStart;
    boolean isSet = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCount = findViewById(R.id.btnCount);
        Button btnReset = findViewById(R.id.btnReset);
        editStart = findViewById(R.id.editStart);
        textCount = findViewById(R.id.textCount);
    }

    public void increaseCount(View v){
        String val = editStart.getText().toString();
        if (val.length() >0 && !isSet){
            counter = Integer.parseInt(val);
            isSet = true;
        }
        counter++;
        textCount.setText(String.valueOf(counter));
    }

    public void resetCount(View v){
        counter = 0;
        isSet=false;
        textCount.setText(String.valueOf(counter));
    }
}
