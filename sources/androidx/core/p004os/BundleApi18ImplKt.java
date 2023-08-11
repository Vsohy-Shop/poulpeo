package androidx.core.p004os;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(18)
/* renamed from: androidx.core.os.BundleApi18ImplKt */
/* compiled from: Bundle.kt */
final class BundleApi18ImplKt {
    public static final BundleApi18ImplKt INSTANCE = new BundleApi18ImplKt();

    private BundleApi18ImplKt() {
    }

    @DoNotInline
    public static final void putBinder(Bundle bundle, String str, IBinder iBinder) {
        C12775o.m28639i(bundle, "bundle");
        C12775o.m28639i(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
