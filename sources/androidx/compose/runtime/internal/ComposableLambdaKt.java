package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
/* compiled from: ComposableLambda.kt */
public final class ComposableLambdaKt {
    private static final int BITS_PER_SLOT = 3;
    public static final int SLOTS_PER_INT = 10;

    public static final int bitsForSlot(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    @ComposeCompilerApi
    public static final ComposableLambda composableLambda(Composer composer, int i, boolean z, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        C12775o.m28639i(composer, "composer");
        C12775o.m28639i(obj, "block");
        composer.startReplaceableGroup(i);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaImpl = new ComposableLambdaImpl(i, z);
            composer.updateRememberedValue(composableLambdaImpl);
        } else {
            C12775o.m28637g(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) rememberedValue;
        }
        composableLambdaImpl.update(obj);
        composer.endReplaceableGroup();
        return composableLambdaImpl;
    }

    @ComposeCompilerApi
    public static final ComposableLambda composableLambdaInstance(int i, boolean z, Object obj) {
        C12775o.m28639i(obj, "block");
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i, z);
        composableLambdaImpl.update(obj);
        return composableLambdaImpl;
    }

    public static final int differentBits(int i) {
        return bitsForSlot(2, i);
    }

    public static final boolean replacableWith(RecomposeScope recomposeScope, RecomposeScope recomposeScope2) {
        C12775o.m28639i(recomposeScope2, "other");
        if (recomposeScope != null) {
            if ((recomposeScope instanceof RecomposeScopeImpl) && (recomposeScope2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
                if (!recomposeScopeImpl.getValid() || C12775o.m28634d(recomposeScope, recomposeScope2) || C12775o.m28634d(recomposeScopeImpl.getAnchor(), ((RecomposeScopeImpl) recomposeScope2).getAnchor())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final int sameBits(int i) {
        return bitsForSlot(1, i);
    }
}
