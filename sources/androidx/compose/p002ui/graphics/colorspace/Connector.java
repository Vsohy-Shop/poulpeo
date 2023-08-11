package androidx.compose.p002ui.graphics.colorspace;

import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.colorspace.ColorModel;
import androidx.compose.p002ui.graphics.colorspace.RenderIntent;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Arrays;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,339:1\n34#2:340\n41#2:341\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n162#1:340\n163#1:341\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.Connector */
/* compiled from: Connector.kt */
public class Connector {
    public static final Companion Companion;
    /* access modifiers changed from: private */
    public static final Connector OklabToSrgbPerceptual;
    /* access modifiers changed from: private */
    public static final Connector SrgbIdentity;
    /* access modifiers changed from: private */
    public static final Connector SrgbToOklabPerceptual;
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;

    /* renamed from: androidx.compose.ui.graphics.colorspace.Connector$Companion */
    /* compiled from: Connector.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4  reason: not valid java name */
        public final float[] m36125computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
            float[] fArr;
            float[] fArr2;
            if (!RenderIntent.m36134equalsimpl0(i, RenderIntent.Companion.m36138getAbsoluteuksYyKA())) {
                return null;
            }
            long r1 = colorSpace.m36118getModelxdoWZVw();
            ColorModel.Companion companion = ColorModel.Companion;
            boolean r12 = ColorModel.m36109equalsimpl0(r1, companion.m36116getRgbxdoWZVw());
            boolean r9 = ColorModel.m36109equalsimpl0(colorSpace2.m36118getModelxdoWZVw(), companion.m36116getRgbxdoWZVw());
            if (r12 && r9) {
                return null;
            }
            if (!r12 && !r9) {
                return null;
            }
            if (!r12) {
                colorSpace = colorSpace2;
            }
            C12775o.m28637g(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (r12) {
                fArr = rgb.getWhitePoint().toXyz$ui_graphics_release();
            } else {
                fArr = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            }
            if (r9) {
                fArr2 = rgb.getWhitePoint().toXyz$ui_graphics_release();
            } else {
                fArr2 = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            }
            return new float[]{fArr[0] / fArr2[0], fArr[1] / fArr2[1], fArr[2] / fArr2[2]};
        }

        public final Connector getOklabToSrgbPerceptual$ui_graphics_release() {
            return Connector.OklabToSrgbPerceptual;
        }

        public final Connector getSrgbIdentity$ui_graphics_release() {
            return Connector.SrgbIdentity;
        }

        public final Connector getSrgbToOklabPerceptual$ui_graphics_release() {
            return Connector.SrgbToOklabPerceptual;
        }

        public final Connector identity$ui_graphics_release(ColorSpace colorSpace) {
            C12775o.m28639i(colorSpace, APIParams.SOURCE);
            return new Connector$Companion$identity$1(colorSpace, RenderIntent.Companion.m36140getRelativeuksYyKA());
        }
    }

    /* renamed from: androidx.compose.ui.graphics.colorspace.Connector$RgbConnector */
    /* compiled from: Connector.kt */
    public static final class RgbConnector extends Connector {
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }

        /* renamed from: computeTransform-YBCOT_4  reason: not valid java name */
        private final float[] m36127computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics_release(), rgb.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = rgb.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = rgb2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                float[] transform$ui_graphics_release2 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                C12775o.m28638h(copyOf, "copyOf(this, size)");
                transform$ui_graphics_release = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release2, xyz$ui_graphics_release, copyOf), rgb.getTransform$ui_graphics_release());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                float[] transform$ui_graphics_release3 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release2 = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                C12775o.m28638h(copyOf2, "copyOf(this, size)");
                inverseTransform$ui_graphics_release = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release3, xyz$ui_graphics_release2, copyOf2), rgb2.getTransform$ui_graphics_release()));
            }
            if (RenderIntent.m36134equalsimpl0(i, RenderIntent.Companion.m36138getAbsoluteuksYyKA())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics_release, transform$ui_graphics_release);
        }

        public float[] transform(float[] fArr) {
            C12775o.m28639i(fArr, "v");
            fArr[0] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke((double) fArr[0]);
            fArr[1] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke((double) fArr[1]);
            fArr[2] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke((double) fArr[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, fArr);
            fArr[0] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((double) fArr[0]);
            fArr[1] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((double) fArr[1]);
            fArr[2] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((double) fArr[2]);
            return fArr;
        }

        /* renamed from: transformToColor-wmQWz5c$ui_graphics_release  reason: not valid java name */
        public long m36128transformToColorwmQWz5c$ui_graphics_release(float f, float f2, float f3, float f4) {
            float invoke = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke((double) f);
            float invoke2 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke((double) f2);
            float invoke3 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke((double) f3);
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((double) ColorSpaceKt.mul3x3Float3_0(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((double) ColorSpaceKt.mul3x3Float3_1(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((double) ColorSpaceKt.mul3x3Float3_2(this.mTransform, invoke, invoke2, invoke3)), f4, this.mDestination);
        }

        private RgbConnector(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, (float[]) null, (DefaultConstructorMarker) null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m36127computeTransformYBCOT_4(rgb, rgb2, i);
        }
    }

    static {
        Companion companion = new Companion((DefaultConstructorMarker) null);
        Companion = companion;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        SrgbIdentity = companion.identity$ui_graphics_release(colorSpaces.getSrgb());
        Rgb srgb = colorSpaces.getSrgb();
        ColorSpace oklab = colorSpaces.getOklab();
        RenderIntent.Companion companion2 = RenderIntent.Companion;
        SrgbToOklabPerceptual = new Connector(srgb, oklab, companion2.m36139getPerceptualuksYyKA(), (DefaultConstructorMarker) null);
        OklabToSrgbPerceptual = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion2.m36139getPerceptualuksYyKA(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i);
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* renamed from: getRenderIntent-uksYyKA  reason: not valid java name */
    public final int m36122getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    public final float[] transform(float f, float f2, float f3) {
        return transform(new float[]{f, f2, f3});
    }

    /* renamed from: transformToColor-wmQWz5c$ui_graphics_release  reason: not valid java name */
    public long m36123transformToColorwmQWz5c$ui_graphics_release(float f, float f2, float f3, float f4) {
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(f, f2, f3);
        C12763h hVar = C12763h.f20419a;
        float intBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(f, f2, f3);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f5 = intBitsToFloat2;
        float f6 = intBitsToFloat;
        return this.transformDestination.m36119xyzaToColorJlNiLsg$ui_graphics_release(f6, f5, z$ui_graphics_release, f4, this.destination);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i, fArr);
    }

    public float[] transform(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        float[] xyz = this.transformSource.toXyz(fArr);
        float[] fArr2 = this.transform;
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i;
        this.transform = fArr;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Connector(androidx.compose.p002ui.graphics.colorspace.ColorSpace r13, androidx.compose.p002ui.graphics.colorspace.ColorSpace r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.m36118getModelxdoWZVw()
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r2 = androidx.compose.p002ui.graphics.colorspace.ColorModel.Companion
            long r3 = r2.m36116getRgbxdoWZVw()
            boolean r0 = androidx.compose.p002ui.graphics.colorspace.ColorModel.m36109equalsimpl0(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001e
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.p002ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.p002ui.graphics.colorspace.ColorSpaceKt.adapt$default(r13, r0, r3, r1, r3)
            r7 = r0
            goto L_0x001f
        L_0x001e:
            r7 = r13
        L_0x001f:
            long r4 = r14.m36118getModelxdoWZVw()
            long r8 = r2.m36116getRgbxdoWZVw()
            boolean r0 = androidx.compose.p002ui.graphics.colorspace.ColorModel.m36109equalsimpl0(r4, r8)
            if (r0 == 0) goto L_0x0039
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.p002ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.p002ui.graphics.colorspace.ColorSpaceKt.adapt$default(r14, r0, r3, r1, r3)
            r8 = r0
            goto L_0x003a
        L_0x0039:
            r8 = r14
        L_0x003a:
            androidx.compose.ui.graphics.colorspace.Connector$Companion r0 = Companion
            float[] r10 = r0.m36125computeTransformYBCOT_4(r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }
}
