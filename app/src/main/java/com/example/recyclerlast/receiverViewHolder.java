package com.example.recyclerlast;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class receiverViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvReceiverSendMessage;

    public receiverViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvReceiverSendMessage = itemView.findViewById(R.id.tvReceiverMessage);
    }

    public void setData(receiverModel receiverModel){
        mTvReceiverSendMessage.setText(receiverModel.getMessage());
    }
}
