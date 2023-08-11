package androidx.compose.p002ui.graphics;

import android.graphics.Shader;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n1#2:656\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.ShaderBrush */
/* compiled from: Brush.kt */
public abstract class ShaderBrush extends Brush {
    private long createdSize = Size.Companion.m35499getUnspecifiedNHjbRc();
    private Shader internalShader;

    public ShaderBrush() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: applyTo-Pq9zytI  reason: not valid java name */
    public final void m36009applyToPq9zytI(long j, Paint paint, float f) {
        boolean z;
        C12775o.m28639i(paint, Constants.APPBOY_PUSH_PRIORITY_KEY);
        Shader shader = this.internalShader;
        if (shader == null || !Size.m35487equalsimpl0(this.createdSize, j)) {
            shader = m36010createShaderuvyYCjk(j);
            this.internalShader = shader;
            this.createdSize = j;
        }
        long r5 = paint.m35928getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m35672equalsimpl0(r5, companion.m35697getBlack0d7_KjU())) {
            paint.m35934setColor8_81llA(companion.m35697getBlack0d7_KjU());
        }
        if (!C12775o.m28634d(paint.getShader(), shader)) {
            paint.setShader(shader);
        }
        if (paint.getAlpha() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            paint.setAlpha(f);
        }
    }

    /* renamed from: createShader-uvyYCjk  reason: not valid java name */
    public abstract Shader m36010createShaderuvyYCjk(long j);
}
