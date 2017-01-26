#FirebaseExercise


### MainActivity
----
Firebase Exercise 入口

#### 1. RealTimeDB CRUD 

#### 2. RealTimeDB 即時聊天室 

#### 3. Dynamic Link Demo (Deep Link Invatation Recieve) 

#### 4. Remote Config For A/B Test

<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-ManActivity.png?raw=true"  width="216" height="384"">

<pre><code>
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

                case (R.id.remoteConfigABTestBTN):
                    Intent intentRemoteConfigABTest = new Intent();
                    intentRemoteConfigABTest.setClass(mContext, RemoteConfigABTest.class);
                    mContext.startActivity(intentRemoteConfigABTest);
                    break;
            }
        }
</code></pre>



### Demo 1. RealTimeDB CRUD 
----

ActivityRealtimeDB (CRUD 操作)

<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-ActivityRealtimeDB.png"  width="216" height="384"">



### Demo 2. RealTimeDB 即時聊天室
----

#### 1. 聊天室列表 
ActivityChatroom

<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-chatroom-list.png"  width="216" height="384"">
<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-chatroom-add.png"  width="216" height="384"">
<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-chatroom-nickname.png"  width="216" height="384">

#### 2. 聊天頁面 
ActivityChatPost

<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-chat-alice.png"  width="216" height="384">
<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-chat-kenneth.png"  width="216" height="384">


### Demo 3. Dynamic Link Demo (Deep Link Invatation Recieve)
----

DynamicLinkActivity (點擊外部連結 觸發deeplink)

<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-dynamiclink-link.png"  width="216" height="384"">
<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-dynamiclink-deeplink.png"  width="216" height="384"">


### Demo 4. Remote Config For A/B Test
----

<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-RemoteConfigABTest-default.png"  width="216" height="384"">
<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-RemoteConfigABTest-a.png"  width="216" height="384"">
<img src="https://s3-ap-northeast-1.amazonaws.com/marktdown/FirebaseExercise/firebase-RemoteConfigABTest-b.png"  width="216" height="384"">

