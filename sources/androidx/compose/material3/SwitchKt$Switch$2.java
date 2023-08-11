package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Switch.kt */
final class SwitchKt$Switch$2 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ float $minBound;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $offset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwitchKt$Switch$2(Animatable<Float, AnimationVector1D> animatable, float f) {
        super(0);
        this.$offset = animatable;
        this.$minBound = f;
    }

    public final void invoke() {
        Animatable.updateBounds$default(this.$offset, Float.valueOf(this.$minBound), (Object) null, 2, (Object) null);
    }
}
