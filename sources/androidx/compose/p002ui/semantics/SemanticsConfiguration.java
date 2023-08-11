package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.platform.JvmActuals_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p336ef.C11895c;
import p404of.C13074a;
import p412pf.C13212a;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.SemanticsConfiguration */
/* compiled from: SemanticsConfiguration.kt */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, C13212a {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;
    private final Map<SemanticsPropertyKey<?>, Object> props = new LinkedHashMap();

    public final void collapsePeer$ui_release(SemanticsConfiguration semanticsConfiguration) {
        C12775o.m28639i(semanticsConfiguration, "peer");
        if (semanticsConfiguration.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (semanticsConfiguration.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry next : semanticsConfiguration.props.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) next.getKey();
            Object value = next.getValue();
            if (!this.props.containsKey(semanticsPropertyKey)) {
                this.props.put(semanticsPropertyKey, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = this.props.get(semanticsPropertyKey);
                C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.props;
                String label = accessibilityAction.getLabel();
                if (label == null) {
                    label = ((AccessibilityAction) value).getLabel();
                }
                C11895c action = accessibilityAction.getAction();
                if (action == null) {
                    action = ((AccessibilityAction) value).getAction();
                }
                map.put(semanticsPropertyKey, new AccessibilityAction(label, action));
            }
        }
    }

    public final <T> boolean contains(SemanticsPropertyKey<T> semanticsPropertyKey) {
        C12775o.m28639i(semanticsPropertyKey, "key");
        return this.props.containsKey(semanticsPropertyKey);
    }

    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.props.putAll(this.props);
        return semanticsConfiguration;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        if (C12775o.m28634d(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics) {
            return true;
        }
        return false;
    }

    public final <T> T get(SemanticsPropertyKey<T> semanticsPropertyKey) {
        C12775o.m28639i(semanticsPropertyKey, "key");
        T t = this.props.get(semanticsPropertyKey);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(SemanticsPropertyKey<T> semanticsPropertyKey, C13074a<? extends T> aVar) {
        C12775o.m28639i(semanticsPropertyKey, "key");
        C12775o.m28639i(aVar, "defaultValue");
        T t = this.props.get(semanticsPropertyKey);
        if (t == null) {
            return aVar.invoke();
        }
        return t;
    }

    public final <T> T getOrElseNullable(SemanticsPropertyKey<T> semanticsPropertyKey, C13074a<? extends T> aVar) {
        C12775o.m28639i(semanticsPropertyKey, "key");
        C12775o.m28639i(aVar, "defaultValue");
        T t = this.props.get(semanticsPropertyKey);
        if (t == null) {
            return aVar.invoke();
        }
        return t;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    public final void mergeChild$ui_release(SemanticsConfiguration semanticsConfiguration) {
        C12775o.m28639i(semanticsConfiguration, "child");
        for (Map.Entry next : semanticsConfiguration.props.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) next.getKey();
            Object value = next.getValue();
            Object obj = this.props.get(semanticsPropertyKey);
            C12775o.m28637g(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object merge = semanticsPropertyKey.merge(obj, value);
            if (merge != null) {
                this.props.put(semanticsPropertyKey, merge);
            }
        }
    }

    public <T> void set(SemanticsPropertyKey<T> semanticsPropertyKey, T t) {
        C12775o.m28639i(semanticsPropertyKey, "key");
        this.props.put(semanticsPropertyKey, t);
    }

    public final void setClearingSemantics(boolean z) {
        this.isClearingSemantics = z;
    }

    public final void setMergingSemanticsOfDescendants(boolean z) {
        this.isMergingSemanticsOfDescendants = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb.append(str);
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry next : this.props.entrySet()) {
            Object value = next.getValue();
            sb.append(str);
            sb.append(((SemanticsPropertyKey) next.getKey()).getName());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, (String) null) + "{ " + sb + " }";
    }
}
