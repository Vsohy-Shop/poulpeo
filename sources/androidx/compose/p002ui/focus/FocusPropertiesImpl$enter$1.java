package androidx.compose.p002ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.focus.FocusPropertiesImpl$enter$1 */
/* compiled from: FocusProperties.kt */
final class FocusPropertiesImpl$enter$1 extends C12777p implements Function1<FocusDirection, FocusRequester> {
    public static final FocusPropertiesImpl$enter$1 INSTANCE = new FocusPropertiesImpl$enter$1();

    FocusPropertiesImpl$enter$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m35370invoke3ESFkO8(((FocusDirection) obj).m35347unboximpl());
    }

    /* renamed from: invoke-3ESFkO8  reason: not valid java name */
    public final FocusRequester m35370invoke3ESFkO8(int i) {
        return FocusRequester.Companion.getDefault();
    }
}
