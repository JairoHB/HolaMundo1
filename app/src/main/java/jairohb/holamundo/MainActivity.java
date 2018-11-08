package jairohb.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.Texto);

    }

    public void CambiaTexto (View v){
        EditText nombre = (EditText) findViewById(R.id.nombre);
        texto.setText("Hola Mundo es: "+ nombre.getText().toString());
    }
}
