package androidx.compose.p002ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import p336ef.C11895c;

@StabilityInferred(parameters = 1)
/* renamed from: androidx.compose.ui.semantics.AccessibilityAction */
/* compiled from: SemanticsProperties.kt */
public final class AccessibilityAction<T extends C11895c<? extends Boolean>> {
    public static final int $stable = 0;
    private final T action;
    private final String label;

    public AccessibilityAction(String str, T t) {
        this.label = str;
        this.action = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        if (C12775o.m28634d(this.label, accessibilityAction.label) && C12775o.m28634d(this.action, accessibilityAction.action)) {
            return true;
        }
        return false;
    }

    public final T getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int i;
        String str = this.label;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t = this.action;
        if (t != null) {
            i2 = t.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
