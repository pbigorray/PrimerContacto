package es.ieslavereda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private Button buttonCancel;
    private Button buttonAcept;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos);


        button=findViewById(R.id.button3);
        buttonCancel=findViewById(R.id.button5);
        buttonAcept=findViewById(R.id.button4);
        textView=findViewById(R.id.textView6);

        button.setOnClickListener(this);
        buttonAcept.setOnClickListener(this);
        buttonCancel.setOnClickListener(this);
        findViewById(R.id.imageView);

//        Button button = findViewById(R.id.button3);
//
////        button.setOnClickListener(this);
//        button.setOnClickListener((v)->{
//            TextView textView=findViewById(R.id.textView6);
//            textView.setText(R.string.click);
//        });
//        Button aux = findViewById(R.id.button5);
//        aux.setOnClickListener((v)->{
//            TextView textView=findViewById(R.id.textView6);
//            textView.setText(R.string.lore);
//        });
//
//        button.setOnClickListener((view -> {
//            TextView textView=findViewById(R.id.textView6);
//            textView.
//        }));
//    }
//
////    @Override
////    public void onClick(View view) {
////        TextView textView=findViewById(R.id.textView6);
////        textView.setText("Click");
    }

    @Override
    public void onClick(View view) {
        if (view instanceof Button){
            Button b =(Button) view;
            if(b==buttonAcept)
                textView.setText("aceptar");
            else if (b==buttonCancel)
                textView.setText("cancelar");
            else if (b==button);
            {
                textView.setText("button");
            }
        }
    }
}