package com.example.rachit.projectmovie.Search;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rachit.projectmovie.R;

public class SearchMainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView tv;
    Button B;
    String url,s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText3);
        B=(Button)findViewById(R.id.button);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                url="http://www.omdbapi.com/?t="+s1+"&y="+s2+"&plot=full&r=json";
                Intent intent=new Intent(SearchMainActivity.this,SearchMain2Activity.class);
                intent.putExtra("url",url);
                startActivity(intent);
                e1.setText("");
                e2.setText("");
            }
        });
    }
}
