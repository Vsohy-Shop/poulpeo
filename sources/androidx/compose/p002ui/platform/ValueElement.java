package androidx.compose.p002ui.platform;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.platform.ValueElement */
/* compiled from: InspectableValue.kt */
public final class ValueElement {
    public static final int $stable = 8;
    private final String name;
    private final Object value;

    public ValueElement(String str, Object obj) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        this.name = str;
        this.value = obj;
    }

    public static /* synthetic */ ValueElement copy$default(ValueElement valueElement, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = valueElement.name;
        }
        if ((i & 2) != 0) {
            obj = valueElement.value;
        }
        return valueElement.copy(str, obj);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final ValueElement copy(String str, Object obj) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        return new ValueElement(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) obj;
        if (C12775o.m28634d(this.name, valueElement.name) && C12775o.m28634d(this.value, valueElement.value)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        int hashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }
}
