package com.example.miwak;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {
    public wordAdapter(Activity context, ArrayList<word>androidWord){
        super(context,0,androidWord);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItemView=convertView;
        if(ListItemView==null){
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        word CurrentWord=getItem(position);

        TextView MiwakText=(TextView)ListItemView.findViewById(R.id.miwak_textview);
        MiwakText.setText(CurrentWord.getmMiwakTranslation());

        TextView Default=(TextView)ListItemView.findViewById(R.id.default_textview);
        Default.setText(CurrentWord.getmDefaultTranslation());

        ImageView  image=(ImageView)ListItemView.findViewById(R.id.image);
        image.setImageResource(CurrentWord.getmImageResourceId());
        return ListItemView;
    }
}
