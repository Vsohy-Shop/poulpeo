package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.p002ui.geometry.Offset;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SelectionHandles.kt */
public final class SelectionHandleInfo {
    private final Handle handle;
    private final long position;

    public /* synthetic */ SelectionHandleInfo(Handle handle2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(handle2, j);
    }

    /* renamed from: copy-Uv8p0NA$default  reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m33782copyUv8p0NA$default(SelectionHandleInfo selectionHandleInfo, Handle handle2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            handle2 = selectionHandleInfo.handle;
        }
        if ((i & 2) != 0) {
            j = selectionHandleInfo.position;
        }
        return selectionHandleInfo.m33784copyUv8p0NA(handle2, j);
    }

    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0  reason: not valid java name */
    public final long m33783component2F1C5BW0() {
        return this.position;
    }

    /* renamed from: copy-Uv8p0NA  reason: not valid java name */
    public final SelectionHandleInfo m33784copyUv8p0NA(Handle handle2, long j) {
        C12775o.m28639i(handle2, "handle");
        return new SelectionHandleInfo(handle2, j, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        if (this.handle == selectionHandleInfo.handle && Offset.m35419equalsimpl0(this.position, selectionHandleInfo.position)) {
            return true;
        }
        return false;
    }

    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m33785getPositionF1C5BW0() {
        return this.position;
    }

    public int hashCode() {
        return (this.handle.hashCode() * 31) + Offset.m35424hashCodeimpl(this.position);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + Offset.m35430toStringimpl(this.position) + ')';
    }

    private SelectionHandleInfo(Handle handle2, long j) {
        this.handle = handle2;
        this.position = j;
    }
}
