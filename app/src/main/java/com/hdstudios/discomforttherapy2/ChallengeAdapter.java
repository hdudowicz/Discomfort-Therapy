package com.hdstudios.discomforttherapy2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ChallengeAdapter extends ArrayAdapter<Challenge> {

    private Context mContext;
    private ArrayList<Challenge> challengeList = new ArrayList<>();

    public ChallengeAdapter(@NonNull Context context, @NonNull ArrayList<Challenge> objects) {
        super(context, 0, objects);
        mContext = context;
        challengeList = objects;
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {

        if (contentView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            contentView = inflater.inflate(R.layout.card_view, parent, false);


        } else {

            ImageView image = (ImageView) contentView.findViewById(R.id.cardImage);
            TextView name = (TextView) contentView.findViewById(R.id.titleTextView);
            Challenge currentChallenge = challengeList.get(position);

            Glide.with(getContext()).load("https://afinde-production.s3.amazonaws.com/uploads/c0db6872-9be3-4eaf-9255-20dbe9809e33.jpg")
                    .into(image);
            name.setText(challengeList.get(position).title);
        }

        return contentView;
    }

}