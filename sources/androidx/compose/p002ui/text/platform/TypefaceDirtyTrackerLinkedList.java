package androidx.compose.p002ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList */
/* compiled from: AndroidParagraphIntrinsics.android.kt */
final class TypefaceDirtyTrackerLinkedList {
    private final Object initial;
    private final TypefaceDirtyTrackerLinkedList next;
    private final State<Object> resolveResult;

    public TypefaceDirtyTrackerLinkedList(State<? extends Object> state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        C12775o.m28639i(state, "resolveResult");
        this.resolveResult = state;
        this.next = typefaceDirtyTrackerLinkedList;
        this.initial = state.getValue();
    }

    public final Object getInitial() {
        return this.initial;
    }

    public final Typeface getTypeface() {
        Object obj = this.initial;
        C12775o.m28637g(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean isStaleResolvedFont() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
        if (this.resolveResult.getValue() != this.initial || ((typefaceDirtyTrackerLinkedList = this.next) != null && typefaceDirtyTrackerLinkedList.isStaleResolvedFont())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TypefaceDirtyTrackerLinkedList(State state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(state, (i & 2) != 0 ? null : typefaceDirtyTrackerLinkedList);
    }
}
