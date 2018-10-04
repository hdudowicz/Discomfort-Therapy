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

public class ChallengeAdapter extends ArrayAdapter<Challenge> {

    public ChallengeAdapter(@NonNull Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        ViewHolder holder;

        if (contentView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            contentView = inflater.inflate(R.layout.card_view, parent, false);
            holder = new ViewHolder(contentView);
            contentView.setTag(holder);
            Glide.with(getContext()).load("https://afinde-production.s3.amazonaws.com/uploads/c0db6872-9be3-4eaf-9255-20dbe9809e33.jpg")
                    .into(holder.image);
        } else {
            holder = (ViewHolder) contentView.getTag();
        }

        return contentView;
    }

    private static class ViewHolder {
        public TextView name;
        public ImageView image;

        public ViewHolder(View view) {
            this.name = (TextView) view.findViewById(R.id.titleTextView);
            this.image = (ImageView) view.findViewById(R.id.cardImage);
        }
    }
}