package androidx.activity.result;

import kotlin.jvm.functions.Function1;

/* renamed from: androidx.activity.result.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0125a implements ActivityResultCallback {

    /* renamed from: a */
    public final /* synthetic */ Function1 f173a;

    public /* synthetic */ C0125a(Function1 function1) {
        this.f173a = function1;
    }

    public final void onActivityResult(Object obj) {
        ActivityResultCallerKt.registerForActivityResult$lambda$1(this.f173a, obj);
    }
}
