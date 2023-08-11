package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n76#2:370\n76#2:371\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n*L\n85#1:370\n88#1:371\n*E\n"})
/* renamed from: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 */
/* compiled from: TextFieldScroll.kt */
public final class C0646x4ee6fee2 implements ScrollableState {
    private final /* synthetic */ ScrollableState $$delegate_0;
    private final State canScrollBackward$delegate;
    private final State canScrollForward$delegate;

    C0646x4ee6fee2(ScrollableState scrollableState, TextFieldScrollerPosition textFieldScrollerPosition) {
        this.$$delegate_0 = scrollableState;
        this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new C0648xe39168d8(textFieldScrollerPosition));
        this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new C0647x355dcd8c(textFieldScrollerPosition));
    }

    public float dispatchRawDelta(float f) {
        return this.$$delegate_0.dispatchRawDelta(f);
    }

    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public boolean isScrollInProgress() {
        return this.$$delegate_0.isScrollInProgress();
    }

    public Object scroll(MutatePriority mutatePriority, C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        return this.$$delegate_0.scroll(mutatePriority, oVar, dVar);
    }
}
