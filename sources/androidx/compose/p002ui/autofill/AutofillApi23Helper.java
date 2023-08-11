package androidx.compose.p002ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(23)
/* renamed from: androidx.compose.ui.autofill.AutofillApi23Helper */
/* compiled from: AndroidAutofill.android.kt */
public final class AutofillApi23Helper {
    public static final AutofillApi23Helper INSTANCE = new AutofillApi23Helper();

    private AutofillApi23Helper() {
    }

    @RequiresApi(23)
    @DoNotInline
    public final int addChildCount(ViewStructure viewStructure, int i) {
        C12775o.m28639i(viewStructure, "structure");
        return viewStructure.addChildCount(i);
    }

    @RequiresApi(23)
    @DoNotInline
    public final ViewStructure newChild(ViewStructure viewStructure, int i) {
        C12775o.m28639i(viewStructure, "structure");
        return viewStructure.newChild(i);
    }

    @RequiresApi(23)
    @DoNotInline
    public final void setDimens(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        C12775o.m28639i(viewStructure, "structure");
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    @RequiresApi(23)
    @DoNotInline
    public final void setId(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        C12775o.m28639i(viewStructure, "structure");
        viewStructure.setId(i, str, str2, str3);
    }
}
