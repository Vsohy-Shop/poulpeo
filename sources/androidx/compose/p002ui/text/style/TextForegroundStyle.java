package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ShaderBrush;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.text.style.TextForegroundStyle */
/* compiled from: TextForegroundStyle.kt */
public interface TextForegroundStyle {
    public static final Companion Companion = Companion.$$INSTANCE;

    @SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n77#1:149\n*E\n"})
    /* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$Companion */
    /* compiled from: TextForegroundStyle.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final TextForegroundStyle from(Brush brush, float f) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m38368from8_81llA(TextDrawStyleKt.m38366modulateDxMtmZc(((SolidColor) brush).m36036getValue0d7_KjU(), f));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: from-8_81llA  reason: not valid java name */
        public final TextForegroundStyle m38368from8_81llA(long j) {
            boolean z;
            if (j != Color.Companion.m35707getUnspecified0d7_KjU()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new ColorStyle(j, (DefaultConstructorMarker) null);
            }
            return Unspecified.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$Unspecified */
    /* compiled from: TextForegroundStyle.kt */
    public static final class Unspecified implements TextForegroundStyle {
        public static final int $stable = 0;
        public static final Unspecified INSTANCE = new Unspecified();

        private Unspecified() {
        }

        public float getAlpha() {
            return Float.NaN;
        }

        public Brush getBrush() {
            return null;
        }

        /* renamed from: getColor-0d7_KjU  reason: not valid java name */
        public long m38369getColor0d7_KjU() {
            return Color.Companion.m35707getUnspecified0d7_KjU();
        }
    }

    float getAlpha();

    Brush getBrush();

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    long m38367getColor0d7_KjU();

    TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        C12775o.m28639i(textForegroundStyle, "other");
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (z && (this instanceof BrushStyle)) {
            return new BrushStyle(((BrushStyle) textForegroundStyle).getValue(), TextDrawStyleKt.takeOrElse(textForegroundStyle.getAlpha(), new TextForegroundStyle$merge$1(this)));
        }
        if (z && !(this instanceof BrushStyle)) {
            return textForegroundStyle;
        }
        if (z || !(this instanceof BrushStyle)) {
            return textForegroundStyle.takeOrElse(new TextForegroundStyle$merge$2(this));
        }
        return this;
    }

    TextForegroundStyle takeOrElse(C13074a<? extends TextForegroundStyle> aVar) {
        C12775o.m28639i(aVar, "other");
        if (!C12775o.m28634d(this, Unspecified.INSTANCE)) {
            return this;
        }
        return (TextForegroundStyle) aVar.invoke();
    }
}
