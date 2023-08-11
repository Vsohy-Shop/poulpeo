package androidx.compose.p002ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.p004os.HandlerCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1 */
/* compiled from: AndroidUiDispatcher.android.kt */
public final class AndroidUiDispatcher$Companion$currentThread$1 extends ThreadLocal<C12079g> {
    AndroidUiDispatcher$Companion$currentThread$1() {
    }

    /* access modifiers changed from: protected */
    public C12079g initialValue() {
        Choreographer instance = Choreographer.getInstance();
        C12775o.m28638h(instance, "getInstance()");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            Handler createAsync = HandlerCompat.createAsync(myLooper);
            C12775o.m28638h(createAsync, "createAsync(\n           …d\")\n                    )");
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(instance, createAsync, (DefaultConstructorMarker) null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
        throw new IllegalStateException("no Looper on this thread".toString());
    }
}
