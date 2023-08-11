package androidx.compose.p002ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2 */
/* compiled from: TextInputServiceAndroid.android.kt */
final class TextInputServiceAndroid$baseInputConnection$2 extends C12777p implements C13074a<BaseInputConnection> {
    final /* synthetic */ TextInputServiceAndroid this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.this$0 = textInputServiceAndroid;
    }

    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.this$0.getView(), false);
    }
}
