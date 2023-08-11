package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.MotionDurationScale;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12079g;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,426:1\n76#2:427\n102#2,2:428\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n*L\n424#1:427\n424#1:428,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.MotionDurationScaleImpl */
/* compiled from: WindowRecomposer.android.kt */
final class MotionDurationScaleImpl implements MotionDurationScale {
    private final MutableState scaleFactor$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), (SnapshotMutationPolicy) null, 2, (Object) null);

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return MotionDurationScale.DefaultImpls.fold(this, r, oVar);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    public float getScaleFactor() {
        return ((Number) this.scaleFactor$delegate.getValue()).floatValue();
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    public C12079g plus(C12079g gVar) {
        return MotionDurationScale.DefaultImpls.plus(this, gVar);
    }

    public void setScaleFactor(float f) {
        this.scaleFactor$delegate.setValue(Float.valueOf(f));
    }
}
