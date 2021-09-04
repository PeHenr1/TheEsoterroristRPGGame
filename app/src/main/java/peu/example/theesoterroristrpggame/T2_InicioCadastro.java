package peu.example.theesoterroristrpggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class T2_InicioCadastro extends AppCompatActivity {

    private EditText txtNick;
    private EditText txtSenha;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2_inicio_cadastro);

        txtNick = (EditText) findViewById( R.id.txtNick );
        txtSenha = (EditText) findViewById( R.id.txtSenha );
        btnSalvar = (Button) findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener( new SalvarDados() );
    }

    private class SalvarDados implements View.OnClickListener {

        // VAI CRIAR E SALVAR OS DADOS NO BDD E DEPOIS SEGUIR

        @Override
        public void onClick(View view) {

            String nick, senha;
            nick = txtNick.getText().toString();
            senha = txtSenha.getText().toString();
            //Toast.makeText(getApplicationContext(), nick + senha, Toast.LENGTH_SHORT).show();

            Intent i = new Intent( getApplicationContext(), T3_Historia.class );

            if (nick.equals("") || senha.equals("")) {
                Toast.makeText(getApplicationContext(), "Por favor, preencha todos os campos!", Toast.LENGTH_LONG).show();
            }
            else{
                startActivity(i);
            }

        }
    }
}