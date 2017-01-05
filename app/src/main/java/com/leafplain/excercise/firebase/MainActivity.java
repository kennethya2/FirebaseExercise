package com.leafplain.excercise.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button mFirebaseDBBTN;
    private Button mFirebaseChatRoomBTN;
    private Button mDynamicLinkBTN;

    private AppCompatActivity mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mFirebaseDBBTN = (Button) findViewById(R.id.firebaseDBBTN);
        mFirebaseDBBTN.setOnClickListener(clickListener);

        mFirebaseChatRoomBTN = (Button) findViewById(R.id.firebaseChatRoomBTN);
        mFirebaseChatRoomBTN.setOnClickListener(clickListener);

        mDynamicLinkBTN = (Button) findViewById(R.id.dynamicLinkBTN);
        mDynamicLinkBTN.setOnClickListener(clickListener);


        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

    private View.OnClickListener clickListener= new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id) {
                case (R.id.firebaseDBBTN):
                    Intent intent = new Intent();
                    intent.setClass(mContext, ActivityRealtimeDB.class);
                    mContext.startActivity(intent);
                    break;
                case (R.id.firebaseChatRoomBTN):
                    Intent intentChatroom = new Intent();
                    intentChatroom.setClass(mContext, ActivityChatroom.class);
                    mContext.startActivity(intentChatroom);
                    break;
                case (R.id.dynamicLinkBTN):
                    Intent intentDynamicLink = new Intent();
                    intentDynamicLink.setClass(mContext, DynamicLinkActivity.class);
                    mContext.startActivity(intentDynamicLink);
                    break;
            }
        }
    };
}
