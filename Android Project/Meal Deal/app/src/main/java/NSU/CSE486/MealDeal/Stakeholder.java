package NSU.CSE486.MealDeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stakeholder extends AppCompatActivity {

    Button Chef,Customer,DeliveryBoy;
    Intent intent;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stakeholder);

        intent = getIntent();
        type = intent.getStringExtra("Home").toString().trim();

        Chef = (Button)findViewById(R.id.chef);
        DeliveryBoy = (Button)findViewById(R.id.delivery);
        Customer = (Button)findViewById(R.id.customer);


        Chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equals("Email")){
                    Intent loginemail  = new Intent(Stakeholder.this,Cheflogin.class);
                    startActivity(loginemail);
                    finish();
                }
                if(type.equals("Phone")){
                    Intent loginphone  = new Intent(Stakeholder.this,Chefloginphone.class);
                    startActivity(loginphone);
                    finish();
                }
                if(type.equals("SignUp")){
                    Intent Register  = new Intent(Stakeholder.this,ChefReg.class);
                    startActivity(Register);
                }
            }
        });

        Customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(type.equals("Email")){
                    Intent loginemailcustomer  = new Intent(Stakeholder.this,CustomerLogin.class);
                    startActivity(loginemailcustomer);
                    finish();
                }
                if(type.equals("Phone")){
                    Intent loginphonecustomer  = new Intent(Stakeholder.this,CustomerLoginphone.class);
                    startActivity(loginphonecustomer);
                    finish();
                }
                if(type.equals("SignUp")){
                    Intent Registercustomer  = new Intent(Stakeholder.this,CustomerReg.class);
                    startActivity(Registercustomer);
                }

            }
        });

        DeliveryBoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(type.equals("Email")){
                    Intent loginemail = new Intent(Stakeholder.this,DeliveryBoyLogin.class);
                    startActivity(loginemail);
                    finish();
                }
                if(type.equals("Phone")){
                    Intent loginphone  = new Intent(Stakeholder.this,DeliveryBoyLoginphone.class);
                    startActivity(loginphone);
                    finish();
                }
                if(type.equals("SignUp")){
                    Intent Registerdelivery  = new Intent(Stakeholder.this,DeliveryBoyReg.class);
                    startActivity(Registerdelivery);
                }

            }
        });

    }
}

