package com.example.recyclerlast;

public class receiverModel extends BaseModel{
    private String receiverMessage;

    public receiverModel(String receiverMessage) {
        this.receiverMessage = receiverMessage;
    }

    public String getMessage() {
        return receiverMessage;
    }

    @Override
    int getViewType() {
        return 1;
    }
}
