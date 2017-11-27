package yhh.fcmtest;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Iterator;
import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";

    /**
     * Called when message is received.
     *
     * @param remoteMessage Object representing the message received from Firebase Cloud Messaging.
     */
    // [START receive_message]
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "QQQQ: " + remoteMessage.getFrom());
        Map<String, String> map = remoteMessage.getData();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Log.e("QQQQ", "" + entry.getKey() + ", " + entry.getValue());
        }
    }
    // [END receive_message]

}