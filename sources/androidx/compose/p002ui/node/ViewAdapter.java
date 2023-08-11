package androidx.compose.p002ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.compose.ui.node.ViewAdapter */
/* compiled from: ViewInterop.android.kt */
public interface ViewAdapter {
    void didInsert(View view, ViewGroup viewGroup);

    void didUpdate(View view, ViewGroup viewGroup);

    int getId();

    void willInsert(View view, ViewGroup viewGroup);
}
