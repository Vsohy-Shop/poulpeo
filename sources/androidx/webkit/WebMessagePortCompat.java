package androidx.webkit;

import android.os.Handler;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationHandler;

public abstract class WebMessagePortCompat {
    public abstract void close();

    @RequiresApi(23)
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract WebMessagePort getFrameworkPort();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract InvocationHandler getInvocationHandler();

    public abstract void postMessage(@NonNull WebMessageCompat webMessageCompat);

    public abstract void setWebMessageCallback(@Nullable Handler handler, @NonNull WebMessageCallbackCompat webMessageCallbackCompat);

    public abstract void setWebMessageCallback(@NonNull WebMessageCallbackCompat webMessageCallbackCompat);

    public static abstract class WebMessageCallbackCompat {
        public void onMessage(@NonNull WebMessagePortCompat webMessagePortCompat, @Nullable WebMessageCompat webMessageCompat) {
        }
    }
}
