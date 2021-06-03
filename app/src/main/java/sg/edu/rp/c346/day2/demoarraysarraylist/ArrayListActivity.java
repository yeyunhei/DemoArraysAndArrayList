package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");
        //fruits.set(1, "theFruit");
        //fruits.remove(0);
        fruits.set(fruits.size()-1, "dragon fruit");

        String msg = "";
        msg += "Fruits\n=====\n";
        msg += "Size is " + fruits.size() + "\n";
        for (int i = 0; i<fruits.size(); i++) {
            msg += fruits.get(i) + "\n";
        }

        tv.setText(msg);

    }
}