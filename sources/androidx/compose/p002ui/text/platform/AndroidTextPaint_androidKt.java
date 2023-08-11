package androidx.compose.p002ui.text.platform;

import android.text.TextPaint;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.AndroidTextPaint_androidKt */
/* compiled from: AndroidTextPaint.android.kt */
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(TextPaint textPaint, float f) {
        C12775o.m28639i(textPaint, "<this>");
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(C13265c.m30134c(C13537l.m30885l(f, 0.0f, 1.0f) * ((float) 255)));
        }
    }
}
