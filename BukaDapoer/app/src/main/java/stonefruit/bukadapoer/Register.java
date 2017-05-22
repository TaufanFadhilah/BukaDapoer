package stonefruit.bukadapoer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        TextView txtLogin = (TextView)findViewById(R.id.txtLogin);
        Button btnRegister = (Button)findViewById(R.id.btnRegister);

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoLogin();
                finishActivity(1);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoLogin();
                finishActivity(1);
            }
        });
    }

    private void gotoLogin(){
        Intent i = new Intent(Register.this, Login.class);
        startActivity(i);
        finish();
    }
}
