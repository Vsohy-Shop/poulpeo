package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;

/* renamed from: androidx.core.view.inputmethod.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1815g implements InputConnectionCompat.OnCommitContentListener {

    /* renamed from: a */
    public final /* synthetic */ View f527a;

    public /* synthetic */ C1815g(View view) {
        this.f527a = view;
    }

    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(this.f527a, inputContentInfoCompat, i, bundle);
    }
}
