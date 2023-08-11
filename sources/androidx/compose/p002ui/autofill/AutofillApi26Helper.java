package androidx.compose.p002ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.autofill.AutofillApi26Helper */
/* compiled from: AndroidAutofill.android.kt */
public final class AutofillApi26Helper {
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    @RequiresApi(26)
    @DoNotInline
    public final AutofillId getAutofillId(ViewStructure viewStructure) {
        C12775o.m28639i(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    @RequiresApi(26)
    @DoNotInline
    public final boolean isDate(AutofillValue autofillValue) {
        C12775o.m28639i(autofillValue, "value");
        return autofillValue.isDate();
    }

    @RequiresApi(26)
    @DoNotInline
    public final boolean isList(AutofillValue autofillValue) {
        C12775o.m28639i(autofillValue, "value");
        return autofillValue.isList();
    }

    @RequiresApi(26)
    @DoNotInline
    public final boolean isText(AutofillValue autofillValue) {
        C12775o.m28639i(autofillValue, "value");
        return autofillValue.isText();
    }

    @RequiresApi(26)
    @DoNotInline
    public final boolean isToggle(AutofillValue autofillValue) {
        C12775o.m28639i(autofillValue, "value");
        return autofillValue.isToggle();
    }

    @RequiresApi(26)
    @DoNotInline
    public final void setAutofillHints(ViewStructure viewStructure, String[] strArr) {
        C12775o.m28639i(viewStructure, "structure");
        C12775o.m28639i(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    @RequiresApi(26)
    @DoNotInline
    public final void setAutofillId(ViewStructure viewStructure, AutofillId autofillId, int i) {
        C12775o.m28639i(viewStructure, "structure");
        C12775o.m28639i(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i);
    }

    @RequiresApi(26)
    @DoNotInline
    public final void setAutofillType(ViewStructure viewStructure, int i) {
        C12775o.m28639i(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    @RequiresApi(26)
    @DoNotInline
    public final CharSequence textValue(AutofillValue autofillValue) {
        C12775o.m28639i(autofillValue, "value");
        CharSequence a = autofillValue.getTextValue();
        C12775o.m28638h(a, "value.textValue");
        return a;
    }
}
