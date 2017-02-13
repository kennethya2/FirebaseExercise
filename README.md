#FirebaseExercise


### MainActivity
----
Firebase Exercise 入口

#### 1. RealTimeDB CRUD 

#### 2. RealTimeDB 即時聊天室 

#### 3. Dynamic Link Demo (Deep Link Invatation Recieve) 

#### 4. Remote Config For A/B Test

<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-ManActivity.png" width="220">

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

<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-ActivityRealtimeDB.png" width="220">



### Demo 2. RealTimeDB 即時聊天室
----

#### 1. 聊天室列表 
ActivityChatroom

<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-chatroom-list.png" width="220">
<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-chatroom-add.png"  width="220">
<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-chatroom-nickname.png" width="220">

#### 2. 聊天頁面 
ActivityChatPost

<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-chat-alice.png" width="220">
<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-chat-kenneth.png" width="220">


### Demo 3. Dynamic Link Demo (Deep Link Invatation Recieve)
----

DynamicLinkActivity (點擊外部連結 觸發deeplink)

<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-dynamiclink-link.png" width="220" >
<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-dynamiclink-deeplink.png" width="220">


### Demo 4. Remote Config For A/B Test
----

<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-RemoteConfigABTest-default.png" width="220">
<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-RemoteConfigABTest-a.png" width="220">
<img src="https://raw.githubusercontent.com/kennethya2/FirebaseExercise/master/images/firebase-RemoteConfigABTest-b.png" width="220">

