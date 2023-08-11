package androidx.compose.foundation.text;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: TextFieldCursor.kt */
final class TextFieldCursorKt$cursorAnimationSpec$1 extends C12777p implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, C11921v> {
    public static final TextFieldCursorKt$cursorAnimationSpec$1 INSTANCE = new TextFieldCursorKt$cursorAnimationSpec$1();

    TextFieldCursorKt$cursorAnimationSpec$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KeyframesSpec.KeyframesSpecConfig<Float>) (KeyframesSpec.KeyframesSpecConfig) obj);
        return C11921v.f18618a;
    }

    public final void invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
        C12775o.m28639i(keyframesSpecConfig, "$this$keyframes");
        keyframesSpecConfig.setDurationMillis(1000);
        Float valueOf = Float.valueOf(1.0f);
        keyframesSpecConfig.mo4121at(valueOf, 0);
        keyframesSpecConfig.mo4121at(valueOf, 499);
        Float valueOf2 = Float.valueOf(0.0f);
        keyframesSpecConfig.mo4121at(valueOf2, 500);
        keyframesSpecConfig.mo4121at(valueOf2, 999);
    }
}
