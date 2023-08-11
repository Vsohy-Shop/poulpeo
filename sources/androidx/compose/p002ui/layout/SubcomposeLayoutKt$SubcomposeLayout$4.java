package androidx.compose.p002ui.layout;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4 */
/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutKt$SubcomposeLayout$4 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ SubcomposeLayoutState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutKt$SubcomposeLayout$4(SubcomposeLayoutState subcomposeLayoutState) {
        super(0);
        this.$state = subcomposeLayoutState;
    }

    public final void invoke() {
        this.$state.forceRecomposeChildren$ui_release();
    }
}
