package androidx.compose.p002ui.semantics;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1\n*L\n1#1,1195:1\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1 */
/* compiled from: SemanticsProperties.kt */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends C12777p implements C13088o<AccessibilityAction<T>, AccessibilityAction<T>, AccessibilityAction<T>> {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    public final AccessibilityAction<T> invoke(AccessibilityAction<T> accessibilityAction, AccessibilityAction<T> accessibilityAction2) {
        String str;
        T t;
        C12775o.m28639i(accessibilityAction2, "childValue");
        if (accessibilityAction == null || (str = accessibilityAction.getLabel()) == null) {
            str = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == null || (t = accessibilityAction.getAction()) == null) {
            t = accessibilityAction2.getAction();
        }
        return new AccessibilityAction<>(str, t);
    }
}
