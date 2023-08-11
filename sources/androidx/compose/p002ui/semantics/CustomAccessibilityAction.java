package androidx.compose.p002ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.CustomAccessibilityAction */
/* compiled from: SemanticsProperties.kt */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;
    private final C13074a<Boolean> action;
    private final String label;

    public CustomAccessibilityAction(String str, C13074a<Boolean> aVar) {
        C12775o.m28639i(str, "label");
        C12775o.m28639i(aVar, "action");
        this.label = str;
        this.action = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        if (C12775o.m28634d(this.label, customAccessibilityAction.label) && C12775o.m28634d(this.action, customAccessibilityAction.action)) {
            return true;
        }
        return false;
    }

    public final C13074a<Boolean> getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
