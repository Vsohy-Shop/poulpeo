package androidx.compose.p002ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.geometry.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11905k;

@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n151#2,3:231\n33#2,4:234\n154#2,2:238\n38#2:240\n156#2:241\n37#3,2:242\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n96#1:231,3\n96#1:234,4\n96#1:238,2\n96#1:240\n96#1:241\n96#1:242,2\n*E\n"})
/* renamed from: androidx.compose.ui.autofill.AndroidAutofill_androidKt */
/* compiled from: AndroidAutofill.android.kt */
public final class AndroidAutofill_androidKt {
    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void performAutofill(AndroidAutofill androidAutofill, SparseArray<AutofillValue> sparseArray) {
        C12775o.m28639i(androidAutofill, "<this>");
        C12775o.m28639i(sparseArray, "values");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = sparseArray.get(keyAt);
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            C12775o.m28638h(autofillValue, "value");
            if (autofillApi26Helper.isText(autofillValue)) {
                androidAutofill.getAutofillTree().performAutofill(keyAt, autofillApi26Helper.textValue(autofillValue).toString());
            } else if (autofillApi26Helper.isDate(autofillValue)) {
                throw new C11905k("An operation is not implemented: " + "b/138604541: Add onFill() callback for date");
            } else if (autofillApi26Helper.isList(autofillValue)) {
                throw new C11905k("An operation is not implemented: " + "b/138604541: Add onFill() callback for list");
            } else if (autofillApi26Helper.isToggle(autofillValue)) {
                throw new C11905k("An operation is not implemented: " + "b/138604541:  Add onFill() callback for toggle");
            }
        }
    }

    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void populateViewStructure(AndroidAutofill androidAutofill, ViewStructure viewStructure) {
        ViewStructure viewStructure2 = viewStructure;
        C12775o.m28639i(androidAutofill, "<this>");
        C12775o.m28639i(viewStructure2, "root");
        int addChildCount = AutofillApi23Helper.INSTANCE.addChildCount(viewStructure2, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry next : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            AutofillNode autofillNode = (AutofillNode) next.getValue();
            AutofillApi23Helper autofillApi23Helper = AutofillApi23Helper.INSTANCE;
            ViewStructure newChild = autofillApi23Helper.newChild(viewStructure2, addChildCount);
            if (newChild != null) {
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
                AutofillId autofillId = autofillApi26Helper.getAutofillId(viewStructure2);
                C12775o.m28636f(autofillId);
                autofillApi26Helper.setAutofillId(newChild, autofillId, intValue);
                autofillApi23Helper.setId(newChild, intValue, androidAutofill.getView().getContext().getPackageName(), (String) null, (String) null);
                autofillApi26Helper.setAutofillType(newChild, 1);
                List<AutofillType> autofillTypes = autofillNode.getAutofillTypes();
                ArrayList arrayList = new ArrayList(autofillTypes.size());
                int size = autofillTypes.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i)));
                }
                autofillApi26Helper.setAutofillHints(newChild, (String[]) arrayList.toArray(new String[0]));
                Rect boundingBox = autofillNode.getBoundingBox();
                if (boundingBox == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int c = C13265c.m30134c(boundingBox.getLeft());
                    int c2 = C13265c.m30134c(boundingBox.getTop());
                    AutofillApi23Helper.INSTANCE.setDimens(newChild, c, c2, 0, 0, C13265c.m30134c(boundingBox.getRight()) - c, C13265c.m30134c(boundingBox.getBottom()) - c2);
                }
            }
            addChildCount++;
        }
    }
}
