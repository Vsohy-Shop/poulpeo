package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.trusted.C0012a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TrustedWebActivityCallbackRemote {
    private final C0012a mCallbackBinder;

    private TrustedWebActivityCallbackRemote(@NonNull C0012a aVar) {
        this.mCallbackBinder = aVar;
    }

    @Nullable
    static TrustedWebActivityCallbackRemote fromBinder(@Nullable IBinder iBinder) {
        C0012a aVar;
        if (iBinder == null) {
            aVar = null;
        } else {
            aVar = C0012a.C0013a.asInterface(iBinder);
        }
        if (aVar == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(aVar);
    }

    public void runExtraCallback(@NonNull String str, @NonNull Bundle bundle) {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
