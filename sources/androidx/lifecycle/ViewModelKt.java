package androidx.lifecycle;

import kotlin.jvm.internal.C12775o;
import p466yf.C13933b1;
import p466yf.C13995l0;
import p466yf.C14039u2;
import p466yf.C14054y1;

/* compiled from: ViewModel.kt */
public final class ViewModelKt {
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    public static final C13995l0 getViewModelScope(ViewModel viewModel) {
        C12775o.m28639i(viewModel, "<this>");
        C13995l0 l0Var = (C13995l0) viewModel.getTag(JOB_KEY);
        if (l0Var != null) {
            return l0Var;
        }
        Object tagIfAbsent = viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(C14039u2.m32561b((C14054y1) null, 1, (Object) null).plus(C13933b1.m32212c().mo49059t0())));
        C12775o.m28638h(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (C13995l0) tagIfAbsent;
    }
}
