package androidx.compose.p002ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.AndroidPaint */
/* compiled from: AndroidPaint.android.kt */
public final class AndroidPaint implements Paint {
    private int _blendMode;
    private ColorFilter internalColorFilter;
    private Paint internalPaint;
    private Shader internalShader;
    private PathEffect pathEffect;

    public AndroidPaint(Paint paint) {
        C12775o.m28639i(paint, "internalPaint");
        this.internalPaint = paint;
        this._blendMode = BlendMode.Companion.m35604getSrcOver0nO6VwU();
    }

    public Paint asFrameworkPaint() {
        return this.internalPaint;
    }

    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.internalPaint);
    }

    /* renamed from: getBlendMode-0nO6VwU  reason: not valid java name */
    public int m35535getBlendMode0nO6VwU() {
        return this._blendMode;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public long m35536getColor0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.internalPaint);
    }

    public ColorFilter getColorFilter() {
        return this.internalColorFilter;
    }

    /* renamed from: getFilterQuality-f-v9h1I  reason: not valid java name */
    public int m35537getFilterQualityfv9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.internalPaint);
    }

    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public Shader getShader() {
        return this.internalShader;
    }

    /* renamed from: getStrokeCap-KaPHkGw  reason: not valid java name */
    public int m35538getStrokeCapKaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.internalPaint);
    }

    /* renamed from: getStrokeJoin-LxFBmk8  reason: not valid java name */
    public int m35539getStrokeJoinLxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.internalPaint);
    }

    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.internalPaint);
    }

    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.internalPaint);
    }

    /* renamed from: getStyle-TiuSbCo  reason: not valid java name */
    public int m35540getStyleTiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.internalPaint);
    }

    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.internalPaint);
    }

    public void setAlpha(float f) {
        AndroidPaint_androidKt.setNativeAlpha(this.internalPaint, f);
    }

    public void setAntiAlias(boolean z) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.internalPaint, z);
    }

    /* renamed from: setBlendMode-s9anfk8  reason: not valid java name */
    public void m35541setBlendModes9anfk8(int i) {
        if (!BlendMode.m35573equalsimpl0(this._blendMode, i)) {
            this._blendMode = i;
            AndroidPaint_androidKt.m35547setNativeBlendModeGB0RdKg(this.internalPaint, i);
        }
    }

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public void m35542setColor8_81llA(long j) {
        AndroidPaint_androidKt.m35548setNativeColor4WTKRHQ(this.internalPaint, j);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.internalColorFilter = colorFilter;
        AndroidPaint_androidKt.setNativeColorFilter(this.internalPaint, colorFilter);
    }

    /* renamed from: setFilterQuality-vDHp3xo  reason: not valid java name */
    public void m35543setFilterQualityvDHp3xo(int i) {
        AndroidPaint_androidKt.m35549setNativeFilterQuality50PEsBU(this.internalPaint, i);
    }

    public void setPathEffect(PathEffect pathEffect2) {
        AndroidPaint_androidKt.setNativePathEffect(this.internalPaint, pathEffect2);
        this.pathEffect = pathEffect2;
    }

    public void setShader(Shader shader) {
        this.internalShader = shader;
        AndroidPaint_androidKt.setNativeShader(this.internalPaint, shader);
    }

    /* renamed from: setStrokeCap-BeK7IIE  reason: not valid java name */
    public void m35544setStrokeCapBeK7IIE(int i) {
        AndroidPaint_androidKt.m35550setNativeStrokeCapCSYIeUk(this.internalPaint, i);
    }

    /* renamed from: setStrokeJoin-Ww9F2mQ  reason: not valid java name */
    public void m35545setStrokeJoinWw9F2mQ(int i) {
        AndroidPaint_androidKt.m35551setNativeStrokeJoinkLtJ_vA(this.internalPaint, i);
    }

    public void setStrokeMiterLimit(float f) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.internalPaint, f);
    }

    public void setStrokeWidth(float f) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.internalPaint, f);
    }

    /* renamed from: setStyle-k9PVt8s  reason: not valid java name */
    public void m35546setStylek9PVt8s(int i) {
        AndroidPaint_androidKt.m35552setNativeStyle5YerkU(this.internalPaint, i);
    }

    public AndroidPaint() {
        this(AndroidPaint_androidKt.makeNativePaint());
    }
}
