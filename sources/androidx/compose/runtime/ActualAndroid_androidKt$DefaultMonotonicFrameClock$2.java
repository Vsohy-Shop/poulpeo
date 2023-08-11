package androidx.compose.runtime;

import android.os.Looper;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: ActualAndroid.android.kt */
final class ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 extends C12777p implements C13074a<MonotonicFrameClock> {
    public static final ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 INSTANCE = new ActualAndroid_androidKt$DefaultMonotonicFrameClock$2();

    ActualAndroid_androidKt$DefaultMonotonicFrameClock$2() {
        super(0);
    }

    public final MonotonicFrameClock invoke() {
        if (Looper.getMainLooper() != null) {
            return DefaultChoreographerFrameClock.INSTANCE;
        }
        return SdkStubsFallbackFrameClock.INSTANCE;
    }
}
