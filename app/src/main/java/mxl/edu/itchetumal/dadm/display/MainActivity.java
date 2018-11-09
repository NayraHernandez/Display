package mxl.edu.itchetumal.dadm.display;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLimpiar, btnGenerar;
    TextView Seg1, Seg2, Seg3, Seg4, Seg5, Seg6, Seg7;
    EditText EditNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditNum = (EditText) findViewById(R.id.EditNum);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnGenerar = (Button) findViewById(R.id.btnGenerar);

        Seg1 = (TextView) findViewById(R.id.Seg1);
        Seg2 = (TextView) findViewById(R.id.Seg2);
        Seg3= (TextView) findViewById(R.id.Seg3);
        Seg4 = (TextView) findViewById(R.id.Seg4);
        Seg5= (TextView) findViewById(R.id.Seg5);
        Seg6 = (TextView) findViewById(R.id.Seg6);
        Seg7= (TextView) findViewById(R.id.Seg7);

        //Borrar
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText) findViewById(R.id.EditNum)).setText("1111110-1111110");
                //valor1
                ((TextView) findViewById(R.id.Segm1)).setText(" ");
                ((TextView) findViewById(R.id.Segm2)).setText(" ");
                ((TextView) findViewById(R.id.Segm3)).setText(" ");
                ((TextView) findViewById(R.id.Segm4)).setText("");
                ((TextView) findViewById(R.id.Segm5)).setText(" ");
                ((TextView) findViewById(R.id.Segm6)).setText(" ");
                ((TextView) findViewById(R.id.Segm7)).setText(" ");
                //Valor 2
                ((TextView) findViewById(R.id.Seg1)).setText(" ");
                ((TextView) findViewById(R.id.Seg2)).setText(" ");
                ((TextView) findViewById(R.id.Seg3)).setText(" ");
                ((TextView) findViewById(R.id.Seg4)).setText("");
                ((TextView) findViewById(R.id.Seg5)).setText(" ");
                ((TextView) findViewById(R.id.Seg6)).setText(" ");
                ((TextView) findViewById(R.id.Seg7)).setText(" ");
            }
        });

        //Verificar
        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditNum.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Por favor introduzca el valor binario", Toast.LENGTH_SHORT).show();
                    EditNum.setError ("CampoObligatorio");
                }if (EditNum.getText().toString().length()==15){
                   Pantalla1(v);
                   Pantalla2(v);
                   EditNum.setError(null);
                }if (EditNum.getText().toString().length()==7){
                    Pantalla1(v);
                    EditNum.setError(null);
                }
            }
        });
    }
    public void Pantalla1 (View v) {
        String valor1 = (EditNum.getText().toString().trim().substring(0, 7));
        switch (valor1){
            //1
            case "0110000":
                ((TextView) findViewById(R.id.Segm1)).setText(" ");
                ((TextView) findViewById(R.id.Segm2)).setText(" ");
                ((TextView) findViewById(R.id.Segm3)).setText("     |");
                ((TextView) findViewById(R.id.Segm4)).setText(" ");
                ((TextView) findViewById(R.id.Segm5)).setText(" ");
                ((TextView) findViewById(R.id.Segm6)).setText("     |");
                ((TextView) findViewById(R.id.Segm7)).setText(" ");
                break;
            //2
            case "1101101":
                ((TextView) findViewById(R.id.Segm1)).setText("- - -");
                ((TextView) findViewById(R.id.Segm2)).setText(" ");
                ((TextView) findViewById(R.id.Segm3)).setText("     |");
                ((TextView) findViewById(R.id.Segm4)).setText("- - -");
                ((TextView) findViewById(R.id.Segm5)).setText("  |");
                ((TextView) findViewById(R.id.Segm6)).setText(" ");
                ((TextView) findViewById(R.id.Segm7)).setText("- - -");
                break;
            //3
            case "1111001":
                ((TextView) findViewById(R.id.Segm1)).setText("- - -");
                ((TextView) findViewById(R.id.Segm2)).setText(" ");
                ((TextView) findViewById(R.id.Segm3)).setText("     |");
                ((TextView) findViewById(R.id.Segm4)).setText("- - -");
                ((TextView) findViewById(R.id.Segm5)).setText(" ");
                ((TextView) findViewById(R.id.Segm6)).setText("     |");
                ((TextView) findViewById(R.id.Segm7)).setText("- - -");

                break;
            //4
            case "0110011":
                ((TextView) findViewById(R.id.Segm1)).setText(" ");
                ((TextView) findViewById(R.id.Segm2)).setText("  |");
                ((TextView) findViewById(R.id.Segm3)).setText("     |");
                ((TextView) findViewById(R.id.Segm4)).setText("- - -");
                ((TextView) findViewById(R.id.Segm5)).setText(" ");
                ((TextView) findViewById(R.id.Segm6)).setText("     |");
                ((TextView) findViewById(R.id.Segm7)).setText(" ");
                break;
            //5
            case "1011011":
                ((TextView) findViewById(R.id.Segm1)).setText("- - -");
                ((TextView) findViewById(R.id.Segm2)).setText("  |");
                ((TextView) findViewById(R.id.Segm3)).setText(" ");
                ((TextView) findViewById(R.id.Segm4)).setText("- - -");
                ((TextView) findViewById(R.id.Segm5)).setText(" ");
                ((TextView) findViewById(R.id.Segm6)).setText("     |");
                ((TextView) findViewById(R.id.Segm7)).setText("- - -");
                break;
            //6
            case "1011111":
                ((TextView) findViewById(R.id.Segm1)).setText("- - -");
                ((TextView) findViewById(R.id.Segm2)).setText("  |");
                ((TextView) findViewById(R.id.Segm3)).setText(" ");
                ((TextView) findViewById(R.id.Segm4)).setText("- - -");
                ((TextView) findViewById(R.id.Segm5)).setText("  |");
                ((TextView) findViewById(R.id.Segm6)).setText("     |");
                ((TextView) findViewById(R.id.Segm7)).setText("- - -");
                break;
            //7
            case "1110000":
                ((TextView) findViewById(R.id.Segm1)).setText("- - -");
                ((TextView) findViewById(R.id.Segm2)).setText(" ");
                ((TextView) findViewById(R.id.Segm3)).setText("     |");
                ((TextView) findViewById(R.id.Segm4)).setText(" ");
                ((TextView) findViewById(R.id.Segm5)).setText(" ");
                ((TextView) findViewById(R.id.Segm6)).setText("     |");
                ((TextView) findViewById(R.id.Segm7)).setText(" ");
                break;
            //8
            case "1111111":
                ((TextView) findViewById(R.id.Segm1)).setText("- - -");
                ((TextView) findViewById(R.id.Segm2)).setText("  |");
                ((TextView) findViewById(R.id.Segm3)).setText("     |");
                ((TextView) findViewById(R.id.Segm4)).setText("- - -");
                ((TextView) findViewById(R.id.Segm5)).setText("  |");
                ((TextView) findViewById(R.id.Segm6)).setText("     |");
                ((TextView) findViewById(R.id.Segm7)).setText("- - -");
                break;
            //9
            case "1111011":
                ((TextView) findViewById(R.id.Segm1)).setText("- - -");
                ((TextView) findViewById(R.id.Segm2)).setText("  |");
                ((TextView) findViewById(R.id.Segm3)).setText("     |");
                ((TextView) findViewById(R.id.Segm4)).setText("- - -");
                ((TextView) findViewById(R.id.Segm5)).setText(" ");
                ((TextView) findViewById(R.id.Segm6)).setText("     |");
                ((TextView) findViewById(R.id.Segm7)).setText(" ");
                break;
            //0
            case "1111110":
                ((TextView) findViewById(R.id.Segm1)).setText("- - -");
                ((TextView) findViewById(R.id.Segm2)).setText("  |");
                ((TextView) findViewById(R.id.Segm3)).setText("     |");
                ((TextView) findViewById(R.id.Segm4)).setText(" ");
                ((TextView) findViewById(R.id.Segm5)).setText("  |");
                ((TextView) findViewById(R.id.Segm6)).setText("     |");
                ((TextView) findViewById(R.id.Segm7)).setText("- - -");
                break;


        }
    }
    //Mostrar numero
    public void Pantalla2(View v){

            EditNum = (EditText) findViewById(R.id.EditNum);
            String valor2 = (EditNum.getText().toString().trim().substring(8,15));


        switch (valor2){
            //1
            case "0110000":
                ((TextView) findViewById(R.id.Seg1)).setText(" ");
                ((TextView) findViewById(R.id.Seg2)).setText(" ");
                ((TextView) findViewById(R.id.Seg3)).setText("     |");
                ((TextView) findViewById(R.id.Seg4)).setText(" ");
                ((TextView) findViewById(R.id.Seg5)).setText(" ");
                ((TextView) findViewById(R.id.Seg6)).setText("     |");
                ((TextView) findViewById(R.id.Seg7)).setText(" ");
                break;
            //2
            case "1101101":
                ((TextView) findViewById(R.id.Seg1)).setText("- - -");
                ((TextView) findViewById(R.id.Seg2)).setText(" ");
                ((TextView) findViewById(R.id.Seg3)).setText("     |");
                ((TextView) findViewById(R.id.Seg4)).setText("- - -");
                ((TextView) findViewById(R.id.Seg5)).setText("  |");
                ((TextView) findViewById(R.id.Seg6)).setText(" ");
                ((TextView) findViewById(R.id.Seg7)).setText("- - -");
                break;
            //3
            case "1111001":
                ((TextView) findViewById(R.id.Seg1)).setText("- - -");
                ((TextView) findViewById(R.id.Seg2)).setText(" ");
                ((TextView) findViewById(R.id.Seg3)).setText("     |");
                ((TextView) findViewById(R.id.Seg4)).setText("- - -");
                ((TextView) findViewById(R.id.Seg5)).setText(" ");
                ((TextView) findViewById(R.id.Seg6)).setText("     |");
                ((TextView) findViewById(R.id.Seg7)).setText("- - -");

                break;
            //4
            case "0110011":
                ((TextView) findViewById(R.id.Seg1)).setText(" ");
                ((TextView) findViewById(R.id.Seg2)).setText("  |");
                ((TextView) findViewById(R.id.Seg3)).setText("     |");
                ((TextView) findViewById(R.id.Seg4)).setText("- - -");
                ((TextView) findViewById(R.id.Seg5)).setText(" ");
                ((TextView) findViewById(R.id.Seg6)).setText("     |");
                ((TextView) findViewById(R.id.Seg7)).setText(" ");
                break;
            //5
            case "1011011":
                ((TextView) findViewById(R.id.Seg1)).setText("- - -");
                ((TextView) findViewById(R.id.Seg2)).setText("  |");
                ((TextView) findViewById(R.id.Seg3)).setText(" ");
                ((TextView) findViewById(R.id.Seg4)).setText("- - -");
                ((TextView) findViewById(R.id.Seg5)).setText(" ");
                ((TextView) findViewById(R.id.Seg6)).setText("     |");
                ((TextView) findViewById(R.id.Seg7)).setText("- - -");
                break;
            //6
            case "1011111":
                ((TextView) findViewById(R.id.Seg1)).setText("- - -");
                ((TextView) findViewById(R.id.Seg2)).setText("  |");
                ((TextView) findViewById(R.id.Seg3)).setText(" ");
                ((TextView) findViewById(R.id.Seg4)).setText("- - -");
                ((TextView) findViewById(R.id.Seg5)).setText("  |");
                ((TextView) findViewById(R.id.Seg6)).setText("     |");
                ((TextView) findViewById(R.id.Seg7)).setText("- - -");
                break;
            //7
            case "1110000":
                ((TextView) findViewById(R.id.Seg1)).setText("- - -");
                ((TextView) findViewById(R.id.Seg2)).setText(" ");
                ((TextView) findViewById(R.id.Seg3)).setText("     |");
                ((TextView) findViewById(R.id.Seg4)).setText(" ");
                ((TextView) findViewById(R.id.Seg5)).setText(" ");
                ((TextView) findViewById(R.id.Seg6)).setText("     |");
                ((TextView) findViewById(R.id.Seg7)).setText(" ");
                break;
            //8
            case "1111111":
                ((TextView) findViewById(R.id.Seg1)).setText("- - -");
                ((TextView) findViewById(R.id.Seg2)).setText("  |");
                ((TextView) findViewById(R.id.Seg3)).setText("     |");
                ((TextView) findViewById(R.id.Seg4)).setText("- - -");
                ((TextView) findViewById(R.id.Seg5)).setText("  |");
                ((TextView) findViewById(R.id.Seg6)).setText("     |");
                ((TextView) findViewById(R.id.Seg7)).setText("- - -");
                break;
            //9
            case "1111011":
                ((TextView) findViewById(R.id.Seg1)).setText("- - -");
                ((TextView) findViewById(R.id.Seg2)).setText("  |");
                ((TextView) findViewById(R.id.Seg3)).setText("     |");
                ((TextView) findViewById(R.id.Seg4)).setText("- - -");
                ((TextView) findViewById(R.id.Seg5)).setText(" ");
                ((TextView) findViewById(R.id.Seg6)).setText("     |");
                ((TextView) findViewById(R.id.Seg7)).setText(" ");
                break;
            //0
            case "1111110":
                ((TextView) findViewById(R.id.Seg1)).setText("- - -");
                ((TextView) findViewById(R.id.Seg2)).setText("  |");
                ((TextView) findViewById(R.id.Seg3)).setText("     |");
                ((TextView) findViewById(R.id.Seg4)).setText(" ");
                ((TextView) findViewById(R.id.Seg5)).setText("  |");
                ((TextView) findViewById(R.id.Seg6)).setText("     |");
                ((TextView) findViewById(R.id.Seg7)).setText("- - -");
                break;


        }

    }

}

