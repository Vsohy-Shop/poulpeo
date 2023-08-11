package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.C0003a;
import android.support.customtabs.C0009c;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PostMessageService extends Service {
    private C0009c.C0010a mBinder = new C0009c.C0010a() {
        public void onMessageChannelReady(@NonNull C0003a aVar, @Nullable Bundle bundle) {
            aVar.onMessageChannelReady(bundle);
        }

        public void onPostMessage(@NonNull C0003a aVar, @NonNull String str, @Nullable Bundle bundle) {
            aVar.onPostMessage(str, bundle);
        }
    };

    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}
