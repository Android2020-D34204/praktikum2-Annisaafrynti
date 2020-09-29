package com.example.kalkulatoranisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText AngkaKe1;
    EditText AngkaKe2;
    EditText OP;
    TextView Jawaban;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AngkaKe1 = (EditText) findViewById(R.id.AngkaKe1);
        AngkaKe2 = (EditText) findViewById(R.id.AngkaKe2);
        OP = (EditText) findViewById(R.id.OP);
        Jawaban   = (TextView) findViewById(R.id.Jawaban);
        button  = (Button) findViewById(R.id.eksekusi);

    }

    public void Aritmatik (View aritmatika){

        double A1 = Double.parseDouble(AngkaKe1.getText().toString());
        double A2 = Double.parseDouble(AngkaKe2.getText().toString());
        double hasilHitung;
        String Kata = "hasil Operasi adalah ";

        String mulaiHitung = OP.getText().toString();

        if (mulaiHitung.equals("+")){
            hasilHitung = A1 + A2;
            Jawaban.setText(String.valueOf( Kata + hasilHitung));
        }else if (mulaiHitung.equals("*")){
            hasilHitung = A1 * A2;
            Jawaban.setText(String.valueOf( Kata + hasilHitung));
        }else if (mulaiHitung.equals("-")){
            hasilHitung = A1 - A2;
            Jawaban.setText(String.valueOf( Kata + hasilHitung));
        }else if (mulaiHitung.equals("/")){
            hasilHitung = A1 / A2;
            Jawaban.setText(String.valueOf( Kata + hasilHitung));
        }else {
            Jawaban.setText("OPERASI ARITMATIK NOT SESUAI!");
        }
    }
}