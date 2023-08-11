package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C12703l0;
import p436tf.C13528f;

/* compiled from: VectorizedAnimationSpec.kt */
public final class VectorizedAnimationSpecKt$createSpringAnimations$1 implements Animations {
    private final List<FloatSpringSpec> anims;

    VectorizedAnimationSpecKt$createSpringAnimations$1(V v, float f, float f2) {
        C13528f t = C13537l.m30893t(0, v.getSize$animation_core_release());
        ArrayList arrayList = new ArrayList(C12728x.m28544v(t, 10));
        Iterator it = t.iterator();
        while (it.hasNext()) {
            arrayList.add(new FloatSpringSpec(f, f2, v.get$animation_core_release(((C12703l0) it).nextInt())));
        }
        this.anims = arrayList;
    }

    public FloatSpringSpec get(int i) {
        return this.anims.get(i);
    }
}
