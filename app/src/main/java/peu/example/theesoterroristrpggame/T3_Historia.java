package peu.example.theesoterroristrpggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class T3_Historia extends AppCompatActivity {

    private TextView txtHistoria;
    private Button btnSeguinte;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t3_historia);

        txtHistoria = (TextView) findViewById( R.id.txtHistoria );
        btnSeguinte = (Button) findViewById(R.id.btnSeguinte);

        btnSeguinte.setOnClickListener( new Prosseguir() );
    }

    private class Prosseguir implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            if(i == 1)
                txtHistoria.setText("Para combater os Esoterroristas, existe a Ordo Veritatis, uma organização de elite formada por cidadãos comuns, recrutados das mais diversas camadas sociais e profissões, vivendo uma vida dupla combatendo o sobrenatural.\n" +
                        "\n" +
                        "Você enfrentará criaturas do universo sobrenatural para proteger a população e seus companheiros.\n" +
                        "\n" +
                        "Além disso, agentes especializados, armas e muito mais te ajudarão nessa jornada para derrotar a fonte do mal. \n" +
                        "\n");

            if(i == 2)
                txtHistoria.setText("Para começar a sua jornada, os agentes Donley e Washington irão te acompanhar enquanto lhe dou as instruções básicas.\n");



            Intent m = new Intent( getApplicationContext(), T4_Tutorial.class );
            if(i > 2)
                startActivity(m);
            i++;
        }
    }
}