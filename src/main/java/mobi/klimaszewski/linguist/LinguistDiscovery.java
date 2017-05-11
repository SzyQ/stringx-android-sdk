package mobi.klimaszewski.linguist;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LinguistDiscovery extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //TODO do in Intent service
        LL.v("Discovery requested");
        Linguist.getInstance().replyToService();
    }
}