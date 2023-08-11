package androidx.compose.p002ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.colorspace.Adaptation */
/* compiled from: Adaptation.kt */
public abstract class Adaptation {
    /* access modifiers changed from: private */
    public static final Adaptation Bradford = new Adaptation$Companion$Bradford$1(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    /* access modifiers changed from: private */
    public static final Adaptation Ciecat02 = new Adaptation$Companion$Ciecat02$1(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Adaptation VonKries = new Adaptation$Companion$VonKries$1(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});
    private final float[] transform;

    /* renamed from: androidx.compose.ui.graphics.colorspace.Adaptation$Companion */
    /* compiled from: Adaptation.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Adaptation getBradford() {
            return Adaptation.Bradford;
        }

        public final Adaptation getCiecat02() {
            return Adaptation.Ciecat02;
        }

        public final Adaptation getVonKries() {
            return Adaptation.VonKries;
        }
    }

    public /* synthetic */ Adaptation(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    private Adaptation(float[] fArr) {
        this.transform = fArr;
    }
}
