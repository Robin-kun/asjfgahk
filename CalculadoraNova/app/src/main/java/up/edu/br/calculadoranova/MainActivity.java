package up.edu.br.calculadoranova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Double valor1=0.0, valor2=0.0;
    int ponto=0;
    String op, opp="normal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicar(View v){

        EditText txtResultado = findViewById(R.id.txtResultado);

        if(v.getId()==R.id.btnLimpar) {
            txtResultado.setText("");
        }
        if(v.getId()==R.id.btnZero) {
            txtResultado.setText(txtResultado.getText() + "0");
        }
        if(v.getId()==R.id.btnUm) {
            txtResultado.setText(txtResultado.getText() + "1");
        }
        if(v.getId()==R.id.btnDois) {
            txtResultado.setText(txtResultado.getText() + "2");
        }
        if(v.getId()==R.id.btnTres) {
            txtResultado.setText(txtResultado.getText() + "3");
        }
        if(v.getId()==R.id.btnQuatro) {
            txtResultado.setText(txtResultado.getText() + "4");
        }
        if(v.getId()==R.id.btnCinco) {
            txtResultado.setText(txtResultado.getText() + "5");
        }
        if(v.getId()==R.id.btnSeis) {
            txtResultado.setText(txtResultado.getText() + "6");
        }
        if(v.getId()==R.id.btnSete) {
            txtResultado.setText(txtResultado.getText() + "7");
        }
        if(v.getId()==R.id.btnOito) {
            txtResultado.setText(txtResultado.getText() + "8");
        }
        if(v.getId()==R.id.btnNove) {
            txtResultado.setText(txtResultado.getText() + "9");
        }
        if(v.getId()==R.id.btnPonto) {
            if(ponto==0) {
                ponto=1;
                txtResultado.setText(txtResultado.getText() + ".");
            }
        }
        if(v.getId()==R.id.btnSoma) {
            valor1 = Double.parseDouble(txtResultado.getText().toString());
            op="+";
            ponto=0;
            txtResultado.setText("");
        }
        if(v.getId()==R.id.btnSub) {
            valor1 = Double.parseDouble(txtResultado.getText().toString());
            op="-";
            ponto=0;
            txtResultado.setText("");
        }
        if(v.getId()==R.id.btnMult) {
            valor1 = Double.parseDouble(txtResultado.getText().toString());
            op="*";
            ponto=0;
            txtResultado.setText("");
        }
        if(v.getId()==R.id.btnDivs) {
            valor1 = Double.parseDouble(txtResultado.getText().toString());
            op="/";
            ponto=0;
            txtResultado.setText("");
        }
        if(v.getId()==R.id.btnPorcentagem) {
            valor2 = Double.parseDouble(txtResultado.getText().toString());
            opp="%";
            ponto=0;
        }
        if(v.getId()==R.id.btnPotencia) {
            valor1 = Double.parseDouble(txtResultado.getText().toString());
            op="^";
            txtResultado.setText("");
            ponto=0;
        }
        if(v.getId()==R.id.btnRaiz) {
            valor1 = Double.parseDouble(txtResultado.getText().toString());
            valor2 = Math.sqrt(valor1);
            ponto=0;
            txtResultado.setText(valor2.toString());
        }
        if(v.getId()==R.id.btnIgual) {
            valor2 = Double.parseDouble(txtResultado.getText().toString());
            if(op.equals("+")) {
                if(opp.equals("%")) {
                    Double resultado = valor1 + (valor1*(valor2/100));
                    txtResultado.setText(resultado.toString());
                }
                else {
                    Double resultado = valor1 + valor2;
                    txtResultado.setText(resultado.toString());
                }
            }
            if(op.equals("-")) {
                if(opp.equals("%")) {
                    Double resultado = valor1 - (valor1*(valor2/100));
                    txtResultado.setText(resultado.toString());
                }
                else {
                    Double resultado = valor1 - valor2;
                    txtResultado.setText(resultado.toString());
                }
            }
            if(op.equals("*")) {
                if(opp.equals("%")) {
                    Double resultado = valor1 * (valor1*(valor2/100));
                    txtResultado.setText(resultado.toString());
                }
                else {
                    Double resultado = valor1 * valor2;
                    txtResultado.setText(resultado.toString());
                }
            }
            if(op.equals("/")) {
                if(opp.equals("%")) {
                    Double resultado = valor1 / (valor1*(valor2/100));
                    txtResultado.setText(resultado.toString());
                }
                else {
                    Double resultado = valor1 / valor2;
                    txtResultado.setText(resultado.toString());
                }
            }
            if(op.equals("^")){
                Double resultado = Math.pow(valor1, valor2);
                txtResultado.setText(resultado.toString());
            }
            valor2=0.0;
            opp="normal";
            ponto=0;
        }

        Toast.makeText(getApplicationContext(), "WHY?!", Toast.LENGTH_SHORT).show();

    }
}

