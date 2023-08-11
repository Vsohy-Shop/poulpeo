package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

public final class MediaTransferReceiver extends BroadcastReceiver {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean isDeclared(@NonNull Context context) {
        Intent intent = new Intent(context, MediaTransferReceiver.class);
        intent.setPackage(context.getPackageName());
        if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
            return true;
        }
        return false;
    }

    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
    }
}
