package androidx.core.p004os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(21)
/* renamed from: androidx.core.os.BundleApi21ImplKt */
/* compiled from: Bundle.kt */
final class BundleApi21ImplKt {
    public static final BundleApi21ImplKt INSTANCE = new BundleApi21ImplKt();

    private BundleApi21ImplKt() {
    }

    @DoNotInline
    public static final void putSize(Bundle bundle, String str, Size size) {
        C12775o.m28639i(bundle, "bundle");
        C12775o.m28639i(str, "key");
        bundle.putSize(str, size);
    }

    @DoNotInline
    public static final void putSizeF(Bundle bundle, String str, SizeF sizeF) {
        C12775o.m28639i(bundle, "bundle");
        C12775o.m28639i(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
