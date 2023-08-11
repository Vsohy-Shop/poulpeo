package androidx.compose.p002ui.viewinterop;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1 */
/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$NoOpUpdate$1 extends C12777p implements Function1<View, C11921v> {
    public static final AndroidView_androidKt$NoOpUpdate$1 INSTANCE = new AndroidView_androidKt$NoOpUpdate$1();

    AndroidView_androidKt$NoOpUpdate$1() {
        super(1);
    }

    public final void invoke(View view) {
        C12775o.m28639i(view, "$this$null");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C11921v.f18618a;
    }
}
