package androidx.compose.p002ui;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

@Stable
/* renamed from: androidx.compose.ui.KeyedComposedModifier3 */
/* compiled from: ComposedModifier.kt */
final class KeyedComposedModifier3 extends ComposedModifier {
    private final String fqName;
    private final Object key1;
    private final Object key2;
    private final Object key3;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyedComposedModifier3(String str, Object obj, Object obj2, Object obj3, Function1<? super InspectorInfo, C11921v> function1, C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> pVar) {
        super(function1, pVar);
        C12775o.m28639i(str, "fqName");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "factory");
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifier3) {
            KeyedComposedModifier3 keyedComposedModifier3 = (KeyedComposedModifier3) obj;
            if (!C12775o.m28634d(this.fqName, keyedComposedModifier3.fqName) || !C12775o.m28634d(this.key1, keyedComposedModifier3.key1) || !C12775o.m28634d(this.key2, keyedComposedModifier3.key2) || !C12775o.m28634d(this.key3, keyedComposedModifier3.key3)) {
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

    public final Object getKey2() {
        return this.key2;
    }

    public final Object getKey3() {
        return this.key3;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        Object obj2 = this.key2;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object obj3 = this.key3;
        if (obj3 != null) {
            i3 = obj3.hashCode();
        }
        return i5 + i3;
    }
}
