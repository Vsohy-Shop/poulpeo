package androidx.compose.p002ui.graphics;

import android.graphics.Shader;

/* renamed from: androidx.compose.ui.graphics.Paint */
/* compiled from: Paint.kt */
public interface Paint {
    android.graphics.Paint asFrameworkPaint();

    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU  reason: not valid java name */
    int m35927getBlendMode0nO6VwU();

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    long m35928getColor0d7_KjU();

    ColorFilter getColorFilter();

    /* renamed from: getFilterQuality-f-v9h1I  reason: not valid java name */
    int m35929getFilterQualityfv9h1I();

    PathEffect getPathEffect();

    Shader getShader();

    /* renamed from: getStrokeCap-KaPHkGw  reason: not valid java name */
    int m35930getStrokeCapKaPHkGw();

    /* renamed from: getStrokeJoin-LxFBmk8  reason: not valid java name */
    int m35931getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* renamed from: getStyle-TiuSbCo  reason: not valid java name */
    int m35932getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f);

    void setAntiAlias(boolean z);

    /* renamed from: setBlendMode-s9anfk8  reason: not valid java name */
    void m35933setBlendModes9anfk8(int i);

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    void m35934setColor8_81llA(long j);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setFilterQuality-vDHp3xo  reason: not valid java name */
    void m35935setFilterQualityvDHp3xo(int i);

    void setPathEffect(PathEffect pathEffect);

    void setShader(Shader shader);

    /* renamed from: setStrokeCap-BeK7IIE  reason: not valid java name */
    void m35936setStrokeCapBeK7IIE(int i);

    /* renamed from: setStrokeJoin-Ww9F2mQ  reason: not valid java name */
    void m35937setStrokeJoinWw9F2mQ(int i);

    void setStrokeMiterLimit(float f);

    void setStrokeWidth(float f);

    /* renamed from: setStyle-k9PVt8s  reason: not valid java name */
    void m35938setStylek9PVt8s(int i);
}
