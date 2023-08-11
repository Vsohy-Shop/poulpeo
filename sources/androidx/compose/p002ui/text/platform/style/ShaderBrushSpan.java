package androidx.compose.p002ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ShaderBrush;
import androidx.compose.p002ui.text.platform.AndroidTextPaint_androidKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;

@SourceDebugExtension({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,57:1\n159#2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:58\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.style.ShaderBrushSpan */
/* compiled from: ShaderBrushSpan.android.kt */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    private final float alpha;
    private C11906l<Size, ? extends Shader> cachedShader;
    private final ShaderBrush shaderBrush;
    private long size = Size.Companion.m35499getUnspecifiedNHjbRc();

    public ShaderBrushSpan(ShaderBrush shaderBrush2, float f) {
        C12775o.m28639i(shaderBrush2, "shaderBrush");
        this.shaderBrush = shaderBrush2;
        this.alpha = f;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m38234getSizeNHjbRc() {
        return this.size;
    }

    /* renamed from: setSize-uvyYCjk  reason: not valid java name */
    public final void m38235setSizeuvyYCjk(long j) {
        this.size = j;
    }

    public void updateDrawState(TextPaint textPaint) {
        boolean z;
        Shader shader;
        C12775o.m28639i(textPaint, "textPaint");
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        if (this.size == Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C11906l<Size, ? extends Shader> lVar = this.cachedShader;
            if (lVar == null || !Size.m35487equalsimpl0(lVar.mo49111c().m35496unboximpl(), this.size)) {
                shader = this.shaderBrush.m36010createShaderuvyYCjk(this.size);
            } else {
                shader = (Shader) lVar.mo49112d();
            }
            textPaint.setShader(shader);
            this.cachedShader = C11915r.m25707a(Size.m35479boximpl(this.size), shader);
        }
    }
}
