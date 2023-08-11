package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.p002ui.semantics.SemanticsPropertyKey;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(boolean z, long j) {
        super(1);
        this.$isStartHandle = z;
        this.$position = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Handle handle;
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertyKey<SelectionHandleInfo> selectionHandleInfoKey = SelectionHandlesKt.getSelectionHandleInfoKey();
        if (this.$isStartHandle) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        semanticsPropertyReceiver.set(selectionHandleInfoKey, new SelectionHandleInfo(handle, this.$position, (DefaultConstructorMarker) null));
    }
}
