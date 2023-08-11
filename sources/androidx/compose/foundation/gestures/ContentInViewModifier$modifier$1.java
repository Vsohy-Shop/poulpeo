package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ContentInViewModifier.kt */
final class ContentInViewModifier$modifier$1 extends C12777p implements Function1<LayoutCoordinates, C11921v> {
    final /* synthetic */ ContentInViewModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ContentInViewModifier$modifier$1(ContentInViewModifier contentInViewModifier) {
        super(1);
        this.this$0 = contentInViewModifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        this.this$0.focusedChild = layoutCoordinates;
    }
}
