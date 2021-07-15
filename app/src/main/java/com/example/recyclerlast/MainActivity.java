package com.example.recyclerlast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EditText mEtChoice, mEtMessage;
    private ImageView mIvSend;
    private chatAdapter chatAdapter;

    private ArrayList<BaseModel> messageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        chatAdapter = new chatAdapter(messageList);
        recyclerView.setAdapter(chatAdapter);
    }

    private void buildData() {
        if (mEtChoice.getText().toString().equals("0")) {
            messageList.add(new senderModel(mEtMessage.getText().toString()));
            chatAdapter.notifyDataSetChanged();
        } else if (mEtChoice.getText().toString().equals("1")) {
            messageList.add(new receiverModel(mEtMessage.getText().toString()));
            chatAdapter.notifyDataSetChanged();
        }

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        mEtChoice = findViewById(R.id.etChoice);
        mEtMessage = findViewById(R.id.etSendMessage);
        mIvSend = findViewById(R.id.ivSend);
        mIvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildData();
            }
        });
    }
}