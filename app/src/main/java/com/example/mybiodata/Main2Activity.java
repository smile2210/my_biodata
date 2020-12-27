package com.example.mybiodata;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    TextView name,phone,email,address,gen,edu,father,mother,n_place,birth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.name1);
        phone = findViewById(R.id.t2);
        email = findViewById(R.id.name2);
        address = findViewById(R.id.t4);
        gen = findViewById(R.id.t5);
        edu = findViewById(R.id.t6);
        father = findViewById(R.id.t8);
        mother = findViewById(R.id.t9);
        n_place = findViewById(R.id.t11);
        birth = findViewById(R.id.t1);

        String name1 = getIntent().getStringExtra("Name");
        String phone1 = getIntent().getStringExtra("Phone");
        String email1 = getIntent().getStringExtra("Email");
        String address1 = getIntent().getStringExtra("Address");
        String gen1 = getIntent().getStringExtra("Gender");
        String edu1 = getIntent().getStringExtra("Education");
        String father1 = getIntent().getStringExtra("Father");
        String mother1 = getIntent().getStringExtra("Mother");
        String n_place1 = getIntent().getStringExtra("Native place");
        String birth1 = getIntent().getStringExtra("Birth Date");


        name.setText(name1);
        birth.setText(birth1);
        phone.setText(phone1);
        email.setText(email1);
        address.setText(address1);
        gen.setText(gen1);
        edu.setText(edu1);
        father.setText(father1);
        mother.setText(mother1);
        n_place.setText(n_place1);

    }
}
