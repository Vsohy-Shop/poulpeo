package androidx.compose.p002ui.platform;

import android.content.res.Configuration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$configurationChangeObserver$1 extends C12777p implements Function1<Configuration, C11921v> {
    public static final AndroidComposeView$configurationChangeObserver$1 INSTANCE = new AndroidComposeView$configurationChangeObserver$1();

    AndroidComposeView$configurationChangeObserver$1() {
        super(1);
    }

    public final void invoke(Configuration configuration) {
        C12775o.m28639i(configuration, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return C11921v.f18618a;
    }
}
