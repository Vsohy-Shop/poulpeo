package androidx.compose.p002ui.autofill;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.autofill.AutofillTree */
/* compiled from: AutofillTree.kt */
public final class AutofillTree {
    public static final int $stable = 8;
    private final Map<Integer, AutofillNode> children = new LinkedHashMap();

    public final Map<Integer, AutofillNode> getChildren() {
        return this.children;
    }

    public final C11921v performAutofill(int i, String str) {
        Function1<String, C11921v> onFill;
        C12775o.m28639i(str, "value");
        AutofillNode autofillNode = this.children.get(Integer.valueOf(i));
        if (autofillNode == null || (onFill = autofillNode.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(str);
        return C11921v.f18618a;
    }

    public final void plusAssign(AutofillNode autofillNode) {
        C12775o.m28639i(autofillNode, "autofillNode");
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}
