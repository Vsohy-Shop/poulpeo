package androidx.compose.p002ui.graphics.vector;

import java.util.Iterator;
import p412pf.C13212a;

/* renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1 */
/* compiled from: ImageVector.kt */
public final class VectorGroup$iterator$1 implements Iterator<VectorNode>, C13212a {

    /* renamed from: it */
    private final Iterator<VectorNode> f326it;

    VectorGroup$iterator$1(VectorGroup vectorGroup) {
        this.f326it = vectorGroup.children.iterator();
    }

    public final Iterator<VectorNode> getIt() {
        return this.f326it;
    }

    public boolean hasNext() {
        return this.f326it.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public VectorNode next() {
        return this.f326it.next();
    }
}
