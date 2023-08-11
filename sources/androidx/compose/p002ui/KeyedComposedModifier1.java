package androidx.compose.p002ui;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

@Stable
/* renamed from: androidx.compose.ui.KeyedComposedModifier1 */
/* compiled from: ComposedModifier.kt */
final class KeyedComposedModifier1 extends ComposedModifier {
    private final String fqName;
    private final Object key1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyedComposedModifier1(String str, Object obj, Function1<? super InspectorInfo, C11921v> function1, C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> pVar) {
        super(function1, pVar);
        C12775o.m28639i(str, "fqName");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "factory");
        this.fqName = str;
        this.key1 = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifier1) {
            KeyedComposedModifier1 keyedComposedModifier1 = (KeyedComposedModifier1) obj;
            if (!C12775o.m28634d(this.fqName, keyedComposedModifier1.fqName) || !C12775o.m28634d(this.key1, keyedComposedModifier1.key1)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object getKey1() {
        return this.key1;
    }

    public int hashCode() {
        int i;
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
