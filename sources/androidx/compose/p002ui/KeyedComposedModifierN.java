package androidx.compose.p002ui;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

@Stable
/* renamed from: androidx.compose.ui.KeyedComposedModifierN */
/* compiled from: ComposedModifier.kt */
final class KeyedComposedModifierN extends ComposedModifier {
    private final String fqName;
    private final Object[] keys;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyedComposedModifierN(String str, Object[] objArr, Function1<? super InspectorInfo, C11921v> function1, C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> pVar) {
        super(function1, pVar);
        C12775o.m28639i(str, "fqName");
        C12775o.m28639i(objArr, "keys");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "factory");
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifierN) {
            KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
            if (!C12775o.m28634d(this.fqName, keyedComposedModifierN.fqName) || !Arrays.equals(this.keys, keyedComposedModifierN.keys)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
