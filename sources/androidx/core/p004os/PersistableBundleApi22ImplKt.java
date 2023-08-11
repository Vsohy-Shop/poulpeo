package androidx.core.p004os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(22)
/* renamed from: androidx.core.os.PersistableBundleApi22ImplKt */
/* compiled from: PersistableBundle.kt */
final class PersistableBundleApi22ImplKt {
    public static final PersistableBundleApi22ImplKt INSTANCE = new PersistableBundleApi22ImplKt();

    private PersistableBundleApi22ImplKt() {
    }

    @DoNotInline
    public static final void putBoolean(PersistableBundle persistableBundle, String str, boolean z) {
        C12775o.m28639i(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z);
    }

    @DoNotInline
    public static final void putBooleanArray(PersistableBundle persistableBundle, String str, boolean[] zArr) {
        C12775o.m28639i(persistableBundle, "persistableBundle");
        C12775o.m28639i(zArr, "value");
        persistableBundle.putBooleanArray(str, zArr);
    }
}
