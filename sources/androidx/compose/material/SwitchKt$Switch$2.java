package androidx.compose.material;

import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: Switch.kt */
final class SwitchKt$Switch$2 extends C12777p implements C13088o<Boolean, Boolean, ThresholdConfig> {
    public static final SwitchKt$Switch$2 INSTANCE = new SwitchKt$Switch$2();

    SwitchKt$Switch$2() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }

    public final ThresholdConfig invoke(boolean z, boolean z2) {
        return new FractionalThreshold(0.5f);
    }
}
