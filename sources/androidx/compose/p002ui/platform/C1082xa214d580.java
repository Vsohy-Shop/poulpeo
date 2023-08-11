package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.semantics.SemanticsNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11906l;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1082xa214d580 extends C12777p implements Function1<C11906l<? extends Rect, ? extends List<SemanticsNode>>, Comparable<?>> {
    public static final C1082xa214d580 INSTANCE = new C1082xa214d580();

    C1082xa214d580() {
        super(1);
    }

    public final Comparable<?> invoke(C11906l<Rect, ? extends List<SemanticsNode>> lVar) {
        C12775o.m28639i(lVar, "it");
        return Float.valueOf(lVar.mo49111c().getBottom());
    }
}
