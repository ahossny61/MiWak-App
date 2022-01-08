package com.example.miwak;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt_color=(TextView)findViewById(R.id.colors);
        TextView txt_number=(TextView)findViewById(R.id.numbers);
        TextView txt_family=(TextView)findViewById(R.id.family);
        TextView txt_phrase=(TextView)findViewById(R.id.phrases);
        txt_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ColorActivity.class);
                startActivity(i);
            }
        });

        txt_phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,PhraseActivity.class);
                startActivity(i);
            }
        });

        txt_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,NumberActivity.class);
                startActivity(i);
            }
        });

        txt_family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(i);
            }
        });
    }
}
