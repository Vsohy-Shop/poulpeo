package androidx.compose.foundation;

import androidx.compose.p002ui.MotionDurationScale;
import p355hf.C12079g;
import p404of.C13088o;

/* compiled from: BasicMarquee.kt */
final class FixedMotionDurationScale implements MotionDurationScale {
    public static final FixedMotionDurationScale INSTANCE = new FixedMotionDurationScale();

    private FixedMotionDurationScale() {
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return MotionDurationScale.DefaultImpls.fold(this, r, oVar);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    public float getScaleFactor() {
        return 1.0f;
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    public C12079g plus(C12079g gVar) {
        return MotionDurationScale.DefaultImpls.plus(this, gVar);
    }
}
