package androidx.compose.p002ui.semantics;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1 */
/* compiled from: SemanticsProperties.kt */
final class SemanticsProperties$IsPopup$1 extends C12777p implements C13088o<C11921v, C11921v, C11921v> {
    public static final SemanticsProperties$IsPopup$1 INSTANCE = new SemanticsProperties$IsPopup$1();

    SemanticsProperties$IsPopup$1() {
        super(2);
    }

    public final C11921v invoke(C11921v vVar, C11921v vVar2) {
        C12775o.m28639i(vVar2, "<anonymous parameter 1>");
        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
    }
}
