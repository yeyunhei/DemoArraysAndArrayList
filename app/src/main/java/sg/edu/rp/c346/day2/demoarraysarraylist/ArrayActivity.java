package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ArrayActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        tv = findViewById(R.id.textView1);

        //continue view the code in the worksheet
        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        //fruits[1] = null;
        String msg = "";
        msg += "Fruits\n=====\n";
        msg += ("Size is : " + fruits.length + "\n");
        for (int i = 0; i < fruits.length; i++) {
            msg += fruits[i] + "\n";
        }
        tv.setText(msg);

    }
}