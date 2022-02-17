package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.NUMBER1);
        number2 = findViewById(R.id.NUMBER2);
        result = findViewById(R.id.RESULT_SUM);
    }

    //SUM of number 1 and number 2
    public void SUM(View view){
        int value1 = Integer.parseInt(number1.getText().toString());
        int value2 = Integer.parseInt(number2.getText().toString());
        int sum = value1+value2;
        String result2 = String.valueOf(sum);
        result.setText(result2);

    }


//CLASE NUMERO 2
        /* //CLASE NUMERO 2
        int mate=6;



        int quimi=5;
        int fisica=5;
        int promedio=0;

        promedio = (mate+quimi+fisica)/3;
        if (promedio >= 6) {
            Toast.makeText(this, "Curso Aprobaodo", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Nota: "+promedio, Toast.LENGTH_SHORT).show();



        }else if (promedio <= 5) {
            Toast.makeText(this, "REPROBADO", Toast.LENGTH_LONG).show();

        }

    }*/

//CLASE NUMERO 1
      /*  @Override
        protected void onStart() {
            super.onStart();
            Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
            // La actividad está a punto de hacerse visible.
        }
        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
            // La actividad se ha vuelto visible (ahora se "reanuda").
        }
        @Override
        protected void onPause() {
            super.onPause();
            Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
            // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
        }
        @Override
        protected void onStop() {
            super.onStop();
            Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
            // La actividad ya no es visible (ahora está "detenida")
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
            // La actividad está a punto de ser destruida.
        }*/

}