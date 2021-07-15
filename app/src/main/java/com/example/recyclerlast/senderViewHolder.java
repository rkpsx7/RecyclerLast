package com.example.recyclerlast;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class senderViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvSenderMessage;

    public senderViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvSenderMessage = itemView.findViewById(R.id.tvSenderMessage);

    }
    public void setData(senderModel senderModel){
        mTvSenderMessage.setText(senderModel.getSenderMessage());
    }
}
