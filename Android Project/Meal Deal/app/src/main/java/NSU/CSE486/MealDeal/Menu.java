package NSU.CSE486.MealDeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button signinemail,signinphone,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        signinemail=(Button)findViewById(R.id.SignwithEmail);
        signinphone=(Button)findViewById(R.id.SignwithPhone);
        signup=(Button)findViewById(R.id.Signup);

        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signemail = new Intent(Menu.this,Stakeholder.class);
                signemail.putExtra("Home","Email");
                startActivity(signemail);
                finish();
            }
        });

        signinphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signphone = new Intent(Menu.this,Stakeholder.class);
                signphone.putExtra("Home","Phone");
                startActivity(signphone);
                finish();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(Menu.this,Stakeholder.class);
                signup.putExtra("Home","SignUp");
                startActivity(signup);
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
    }
}




