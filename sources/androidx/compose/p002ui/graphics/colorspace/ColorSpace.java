package androidx.compose.p002ui.graphics.colorspace;

import androidx.compose.p002ui.graphics.ColorKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,796:1\n25#2,3:797\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n288#1:797,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpace */
/* compiled from: ColorSpace.kt */
public abstract class ColorSpace {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int MaxId = 63;
    public static final int MinId = -1;

    /* renamed from: id */
    private final int f263id;
    private final long model;
    private final String name;

    /* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpace$Companion */
    /* compiled from: ColorSpace.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ColorSpace(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.f263id == colorSpace.f263id && C12775o.m28634d(this.name, colorSpace.name)) {
            return ColorModel.m36109equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    public final float[] fromXyz(float f, float f2, float f3) {
        float[] fArr = new float[ColorModel.m36110getComponentCountimpl(this.model)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return fromXyz(fArr);
    }

    public abstract float[] fromXyz(float[] fArr);

    public final int getComponentCount() {
        return ColorModel.m36110getComponentCountimpl(this.model);
    }

    public final int getId$ui_graphics_release() {
        return this.f263id;
    }

    public abstract float getMaxValue(int i);

    public abstract float getMinValue(int i);

    /* renamed from: getModel-xdoWZVw  reason: not valid java name */
    public final long m36118getModelxdoWZVw() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m36111hashCodeimpl(this.model)) * 31) + this.f263id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    public String toString() {
        return this.name + " (id=" + this.f263id + ", model=" + ColorModel.m36112toStringimpl(this.model) + ')';
    }

    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float[] xyz = toXyz(f, f2, f3);
        return (((long) Float.floatToIntBits(xyz[0])) << 32) | (((long) Float.floatToIntBits(xyz[1])) & 4294967295L);
    }

    public final float[] toXyz(float f, float f2, float f3) {
        return toXyz(new float[]{f, f2, f3});
    }

    public abstract float[] toXyz(float[] fArr);

    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        return toXyz(f, f2, f3)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release  reason: not valid java name */
    public long m36119xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        C12775o.m28639i(colorSpace, "colorSpace");
        float[] fromXyz = fromXyz(f, f2, f3);
        return ColorKt.Color(fromXyz[0], fromXyz[1], fromXyz[2], f4, colorSpace);
    }

    public /* synthetic */ ColorSpace(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    private ColorSpace(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.f263id = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private ColorSpace(String str, long j) {
        this(str, j, -1, (DefaultConstructorMarker) null);
    }
}
