package sjp.buttonpresses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import sjp.buttonpresses.R;

public class MainActivity extends AppCompatActivity {

    int i=0;
    int i2=0;
    int i3=0;
    int i4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i=i+1;
                Toast.makeText(MainActivity.this, "TextView Pressed"+ ""+i+" times!", Toast.LENGTH_SHORT).show();
                Log.i("onCreate","TextView Pressed" + ""+i+" times!");
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                i2=i2+1;
                Toast.makeText(MainActivity.this, "TextView2 Pressed"+ ""+i2+" times!",Toast.LENGTH_SHORT).show();
                Log.i("onCreate","TextView2 Pressed" + ""+i2+" times!");
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                i3=i3+1;
                Toast.makeText(MainActivity.this, "TextView3 Pressed" + ""+i3+" times!", Toast.LENGTH_SHORT).show();
                Log.i("onCreate","TextView3 Pressed" + ""+i3+" times!");
            }
        });
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                i4=i4+1;
                Toast.makeText(MainActivity.this, "TextView4 Pressed"+ ""+i4+" times!", Toast.LENGTH_SHORT).show();
                Log.i("onCreate","TextView4 Pressed" + ""+i4+" times!");
            }
        });

    }
}
