package androidx.compose.p002ui.graphics;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.PathEffect */
/* compiled from: PathEffect.kt */
public interface PathEffect {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.graphics.PathEffect$Companion */
    /* compiled from: PathEffect.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PathEffect dashPathEffect$default(Companion companion, float[] fArr, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return companion.dashPathEffect(fArr, f);
        }

        public final PathEffect chainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
            C12775o.m28639i(pathEffect, "outer");
            C12775o.m28639i(pathEffect2, "inner");
            return AndroidPathEffect_androidKt.actualChainPathEffect(pathEffect, pathEffect2);
        }

        public final PathEffect cornerPathEffect(float f) {
            return AndroidPathEffect_androidKt.actualCornerPathEffect(f);
        }

        public final PathEffect dashPathEffect(float[] fArr, float f) {
            C12775o.m28639i(fArr, "intervals");
            return AndroidPathEffect_androidKt.actualDashPathEffect(fArr, f);
        }

        /* renamed from: stampedPathEffect-7aD1DOk  reason: not valid java name */
        public final PathEffect m35956stampedPathEffect7aD1DOk(Path path, float f, float f2, int i) {
            C12775o.m28639i(path, "shape");
            return AndroidPathEffect_androidKt.m35558actualStampedPathEffect7aD1DOk(path, f, f2, i);
        }
    }
}
