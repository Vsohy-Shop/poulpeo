package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.graphics.vector.VNode */
/* compiled from: Vector.kt */
public abstract class VNode {
    public static final int $stable = 8;
    private C13074a<C11921v> invalidateListener;

    private VNode() {
    }

    public /* synthetic */ VNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void draw(DrawScope drawScope);

    public C13074a<C11921v> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        C13074a<C11921v> invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke();
        }
    }

    public void setInvalidateListener$ui_release(C13074a<C11921v> aVar) {
        this.invalidateListener = aVar;
    }
}
