package com.example.mybiodata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText name,phone,email,father,mother,address,n_place,birth;
    RadioGroup gender;
    CheckBox ch1,ch2,ch3,ch4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binding();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edu="";
                if (ch1.isChecked()){
                    edu=edu+"Ssc\n";
                }
                if (ch2.isChecked()){
                    edu=edu+"Hsc\n";
                }
                if (ch3.isChecked()){
                    edu=edu+"Graduate\n";
                }
                if (ch4.isChecked()){
                    edu=edu+"Post graduate";
                }

                String name1=name.getText().toString();
                String phone1=phone.getText().toString();
                String email1=email.getText().toString();
                String address1=address.getText().toString();
                String father1=father.getText().toString();
                String mother1=mother.getText().toString();
                String native1=n_place.getText().toString();
                String birth1=birth.getText().toString();

                int id=gender.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(id);
                String gen=radioButton.getText().toString();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                if(gen.equals("Male")){
                    intent.putExtra("Name",name1);
                    intent.putExtra("Phone",phone1);
                    intent.putExtra("Email",email1);
                    intent.putExtra("Address",address1);
                    intent.putExtra("Gender",gen);
                    intent.putExtra("Education",edu);
                    intent.putExtra("Father", father1);
                    intent.putExtra("Mother", mother1);
                    intent.putExtra("Native place", native1);
                    intent.putExtra("Birth Date", birth1);

                    startActivity(intent);

                }
                else
                {
                    intent.putExtra("Name",name1);
                    intent.putExtra("Phone",phone1);
                    intent.putExtra("Email",email1);
                    intent.putExtra("Address",address1);
                    intent.putExtra("Gender",gen);
                    intent.putExtra("Education",edu);
                    intent.putExtra("Father", father1);
                    intent.putExtra("Mother", mother1);
                    intent.putExtra("Native place", native1);
                    intent.putExtra("Birth Date", birth1);

                    startActivity(intent);
                }







            }
        });

    }

    private void Binding() {
        button = findViewById(R.id.submit);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        address = findViewById(R.id.address);
        gender = findViewById(R.id.gender);
        ch1 = findViewById(R.id.ssc);
        ch2 = findViewById(R.id.hsc);
        ch3 = findViewById(R.id.graduate);
        ch4 = findViewById(R.id.postgraduate);
        father = findViewById(R.id.father);
        mother = findViewById(R.id.mother);
        n_place = findViewById(R.id.n_place);
        birth = findViewById(R.id.birthdate);
    }
}
