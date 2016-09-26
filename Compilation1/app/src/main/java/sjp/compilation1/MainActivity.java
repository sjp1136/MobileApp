package sjp.compilation1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import sjp.compilation1.R;
//for seekbar: https://examples.javacodegeeks.com/android/core/widget/seekbar/android-seekbar-example/
public class MainActivity extends AppCompatActivity {
    int i=1;
    Editable entered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.editTextname);
        editText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TextView Pressed"+ ""+i+" times!", Toast.LENGTH_SHORT).show();
            }
        });
        //entered= editText.getText();
        final TextView textView = (TextView) findViewById(R.id.textViewcolor);
        textView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                i++;
                if(i==1)
                    textView.setBackgroundResource(R.color.foo);
                else if(i==2)
                    textView.setBackgroundResource(R.color.colorAccent);
                else if(i==3)
                    textView.setBackgroundResource(R.color.purple);
                else if(i==4) {
                    textView.setBackgroundResource(R.color.green);
                    i = 1;
                }

            }
        });
        Button button = (Button) findViewById(R.id.buttons);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                entered= editText.getText();
                textView.setText(entered);
                Toast.makeText(MainActivity.this,"Hello, "+""+entered+".",Toast.LENGTH_SHORT).show();
            }
        });

        SeekBar seekbar = (SeekBar) findViewById(R.id.seekBarfont);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress=progresValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Font set! " + "Covered: " + progress + "/" + seekBar.getMax(), Toast.LENGTH_SHORT).show();
                textView.setTextSize(progress*2);

            }
        });
//        seekbar.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                Toast.makeText(MainActivity.this, "TextView3 Pressed" + ""+i3+" times!", Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}