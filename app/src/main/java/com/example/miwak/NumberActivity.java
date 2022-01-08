package com.example.miwak;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class NumberActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        final ArrayList<word>numbers=new ArrayList<word>();
        numbers.add(new word("one","lutti",R.drawable.number_one,R.raw.number_one));
        numbers.add(new word("two","otiiko",R.drawable.number_two,R.raw.number_two));
        numbers.add(new word("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        numbers.add(new word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        numbers.add(new word("five","massoka",R.drawable.number_five,R.raw.number_five));
        numbers.add(new word("sex","temmokka",R.drawable.number_six,R.raw.number_six));
        numbers.add(new word("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        numbers.add(new word("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        numbers.add(new word("nine","wo e",R.drawable.number_nine,R.raw.number_nine));
        wordAdapter itemsAdapter=new wordAdapter(this,numbers);
        ListView listview=(ListView) findViewById(R.id.list);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mediaPlayer=MediaPlayer.create(NumberActivity.this,numbers.get(i).getmAudioResource());
                mediaPlayer.start();
            }
        });
        }
    }

