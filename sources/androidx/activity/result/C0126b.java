package androidx.activity.result;

import kotlin.jvm.functions.Function1;

/* renamed from: androidx.activity.result.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0126b implements ActivityResultCallback {

    /* renamed from: a */
    public final /* synthetic */ Function1 f174a;

    public /* synthetic */ C0126b(Function1 function1) {
        this.f174a = function1;
    }

    public final void onActivityResult(Object obj) {
        ActivityResultCallerKt.registerForActivityResult$lambda$0(this.f174a, obj);
    }
}
