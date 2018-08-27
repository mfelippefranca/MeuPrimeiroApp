package br.usjt.sin.progmulti.meuprimeiroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Nome: Matheus Carvalho Felippe França
 * RA: 816117823
 */
public class MainActivity extends Activity {

    private EditText editText;

    publc static final String MENSAGEM = "br.usjt.sin.progmulti.meuprimeiroapp.texto";

    /**
     * Nome: Matheus Carvalho Felippe França
     * RA: 816117823
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text);
    }

    /**
     * Nome: Matheus Carvalho Felippe França
     * RA: 816117823
     */
    public void enviarMensagem(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String texto = editText.getText().toString();
        intent.putExtra(MENSAGEM, texto);
        startActivity(intent);
    }
}
