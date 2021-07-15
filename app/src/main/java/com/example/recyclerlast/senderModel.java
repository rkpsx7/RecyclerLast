package com.example.recyclerlast;

public class senderModel extends BaseModel{
    private String senderMessage;

    public senderModel(String senderMessage){
        this.senderMessage = senderMessage;
    }

    public String getSenderMessage() {
        return senderMessage;
    }

    @Override
    int getViewType() {
        return 0;
    }
}
