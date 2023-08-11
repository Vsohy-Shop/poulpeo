package androidx.compose.p002ui.text.input;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1 */
/* compiled from: TextInputServiceAndroid.android.kt */
final class TextInputServiceAndroid$onEditCommand$1 extends C12777p implements Function1<List<? extends EditCommand>, C11921v> {
    public static final TextInputServiceAndroid$onEditCommand$1 INSTANCE = new TextInputServiceAndroid$onEditCommand$1();

    TextInputServiceAndroid$onEditCommand$1() {
        super(1);
    }

    public final void invoke(List<? extends EditCommand> list) {
        C12775o.m28639i(list, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends EditCommand>) (List) obj);
        return C11921v.f18618a;
    }
}
