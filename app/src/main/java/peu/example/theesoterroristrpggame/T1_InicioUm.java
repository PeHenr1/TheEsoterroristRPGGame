package peu.example.theesoterroristrpggame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class T1_InicioUm extends AppCompatActivity {

    private Button btnNovoJogo;
    private Button btnConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_inicio_um);

        btnNovoJogo = (Button) findViewById(R.id.btnNovoJogo);
        btnNovoJogo.setOnClickListener( new IniciarNovoJogo() );

        btnConfig = (Button) findViewById(R.id.btnConfig);
        //btnConfig.setOnClickListener( new AbrirConfig() );
    }

    private class IniciarNovoJogo implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            //cria caixa de dialogo, deefine titulo, texto, btn ação positiva e negativa
            AlertDialog.Builder dialogo = new AlertDialog.Builder( T1_InicioUm.this);
            dialogo.setTitle("DESEJA SALVAR O PROGRESSO ?");
            dialogo.setMessage("Seu progresso é salvo automaticamente");
            dialogo.setPositiveButton( "Sim", new EscutadorSim() );
            dialogo.setNegativeButton( "Não", new EscutadorNao() );

            //proibe usuario de fazer outra coisa, TEM QUE ESCOLHER
            dialogo.setCancelable( false );

            //cria e exibe
            dialogo.create();
            dialogo.show();

        }
    }

    private class EscutadorNao implements DialogInterface.OnClickListener {

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
            Intent j = new Intent( getApplicationContext(), T3_Historia.class );
            startActivity(j);
        }
    }

    private class EscutadorSim implements DialogInterface.OnClickListener {

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent j = new Intent( getApplicationContext(), T2_InicioCadastro.class );
            startActivity(j);
        }
    }

    /*private class AbrirConfig implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            Intent i = new Intent( getApplicationContext(), NOME.class );
            startActivity(i);
        }
    }*/
}