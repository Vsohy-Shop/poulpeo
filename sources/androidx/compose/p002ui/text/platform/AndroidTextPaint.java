package androidx.compose.p002ui.text.platform;

import android.graphics.Shader;
import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.graphics.PaintingStyle;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.Fill;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import androidx.compose.p002ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.p002ui.text.style.TextDecoration;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12779r;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,143:1\n646#2:144\n646#2:145\n152#3:146\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n83#1:144\n92#1:145\n93#1:146\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.AndroidTextPaint */
/* compiled from: AndroidTextPaint.android.kt */
public final class AndroidTextPaint extends TextPaint {
    private final Paint composePaint = AndroidPaint_androidKt.toComposePaint(this);
    private DrawStyle drawStyle;
    private Shadow shadow = Shadow.Companion.getNone();
    private TextDecoration textDecoration = TextDecoration.Companion.getNone();

    public AndroidTextPaint(int i, float f) {
        super(i);
        this.density = f;
    }

    /* renamed from: getBlendMode-0nO6VwU$delegate  reason: not valid java name */
    private static Object m38210getBlendMode0nO6VwU$delegate(AndroidTextPaint androidTextPaint) {
        return C12764h0.m28588d(new C12779r(androidTextPaint.composePaint, Paint.class, "blendMode", "getBlendMode-0nO6VwU()I", 0));
    }

    /* renamed from: setBrush-12SF9DM$default  reason: not valid java name */
    public static /* synthetic */ void m38211setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        androidTextPaint.m38214setBrush12SF9DM(brush, j, f);
    }

    /* renamed from: getBlendMode-0nO6VwU  reason: not valid java name */
    public final int m38212getBlendMode0nO6VwU() {
        return this.composePaint.m35927getBlendMode0nO6VwU();
    }

    public final Shadow getShadow$ui_text_release() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8  reason: not valid java name */
    public final void m38213setBlendModes9anfk8(int i) {
        this.composePaint.m35933setBlendModes9anfk8(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r1 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r0 = r7.composePaint;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (java.lang.Float.isNaN(r11) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r11 = r7.composePaint.getAlpha();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r11 = p436tf.C13537l.m30885l(r11, 0.0f, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r8.m35608applyToPq9zytI(r9, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0 == false) goto L_0x001c;
     */
    /* renamed from: setBrush-12SF9DM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m38214setBrush12SF9DM(androidx.compose.p002ui.graphics.Brush r8, long r9, float r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.p002ui.graphics.SolidColor
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = r8
            androidx.compose.ui.graphics.SolidColor r0 = (androidx.compose.p002ui.graphics.SolidColor) r0
            long r3 = r0.m36036getValue0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.p002ui.graphics.Color.Companion
            long r5 = r0.m35707getUnspecified0d7_KjU()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            r0 = r1
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            if (r0 != 0) goto L_0x002e
        L_0x001c:
            boolean r0 = r8 instanceof androidx.compose.p002ui.graphics.ShaderBrush
            if (r0 == 0) goto L_0x0048
            androidx.compose.ui.geometry.Size$Companion r0 = androidx.compose.p002ui.geometry.Size.Companion
            long r3 = r0.m35499getUnspecifiedNHjbRc()
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            if (r1 == 0) goto L_0x0048
        L_0x002e:
            androidx.compose.ui.graphics.Paint r0 = r7.composePaint
            boolean r1 = java.lang.Float.isNaN(r11)
            if (r1 == 0) goto L_0x003d
            androidx.compose.ui.graphics.Paint r11 = r7.composePaint
            float r11 = r11.getAlpha()
            goto L_0x0044
        L_0x003d:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r11 = p436tf.C13537l.m30885l(r11, r1, r2)
        L_0x0044:
            r8.m35608applyToPq9zytI(r9, r0, r11)
            goto L_0x0050
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            androidx.compose.ui.graphics.Paint r8 = r7.composePaint
            r9 = 0
            r8.setShader(r9)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.platform.AndroidTextPaint.m38214setBrush12SF9DM(androidx.compose.ui.graphics.Brush, long, float):void");
    }

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public final void m38215setColor8_81llA(long j) {
        boolean z;
        if (j != Color.Companion.m35707getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.composePaint.m35934setColor8_81llA(j);
            this.composePaint.setShader((Shader) null);
        }
    }

    public final void setDrawStyle(DrawStyle drawStyle2) {
        if (drawStyle2 != null && !C12775o.m28634d(this.drawStyle, drawStyle2)) {
            this.drawStyle = drawStyle2;
            if (C12775o.m28634d(drawStyle2, Fill.INSTANCE)) {
                this.composePaint.m35938setStylek9PVt8s(PaintingStyle.Companion.m35946getFillTiuSbCo());
            } else if (drawStyle2 instanceof Stroke) {
                this.composePaint.m35938setStylek9PVt8s(PaintingStyle.Companion.m35947getStrokeTiuSbCo());
                Stroke stroke = (Stroke) drawStyle2;
                this.composePaint.setStrokeWidth(stroke.getWidth());
                this.composePaint.setStrokeMiterLimit(stroke.getMiter());
                this.composePaint.m35937setStrokeJoinWw9F2mQ(stroke.m36355getJoinLxFBmk8());
                this.composePaint.m35936setStrokeCapBeK7IIE(stroke.m36354getCapKaPHkGw());
                this.composePaint.setPathEffect(stroke.getPathEffect());
            }
        }
    }

    public final void setShadow(Shadow shadow2) {
        if (shadow2 != null && !C12775o.m28634d(this.shadow, shadow2)) {
            this.shadow = shadow2;
            if (C12775o.m28634d(shadow2, Shadow.Companion.getNone())) {
                clearShadowLayer();
            } else {
                setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Offset.m35422getXimpl(this.shadow.m36024getOffsetF1C5BW0()), Offset.m35423getYimpl(this.shadow.m36024getOffsetF1C5BW0()), ColorKt.m35725toArgb8_81llA(this.shadow.m36023getColor0d7_KjU()));
            }
        }
    }

    public final void setShadow$ui_text_release(Shadow shadow2) {
        C12775o.m28639i(shadow2, "<set-?>");
        this.shadow = shadow2;
    }

    public final void setTextDecoration(TextDecoration textDecoration2) {
        if (textDecoration2 != null && !C12775o.m28634d(this.textDecoration, textDecoration2)) {
            this.textDecoration = textDecoration2;
            TextDecoration.Companion companion = TextDecoration.Companion;
            setUnderlineText(textDecoration2.contains(companion.getUnderline()));
            setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }
}
