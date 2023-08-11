package androidx.compose.p002ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.geometry.Rect;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.autofill.AndroidAutofill */
/* compiled from: AndroidAutofill.android.kt */
public final class AndroidAutofill implements Autofill {
    private final AutofillManager autofillManager;
    private final AutofillTree autofillTree;
    private final View view;

    public AndroidAutofill(View view2, AutofillTree autofillTree2) {
        C12775o.m28639i(view2, "view");
        C12775o.m28639i(autofillTree2, "autofillTree");
        this.view = view2;
        this.autofillTree = autofillTree2;
        AutofillManager autofillManager2 = (AutofillManager) view2.getContext().getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.autofillManager = autofillManager2;
            view2.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    public void cancelAutofillForNode(AutofillNode autofillNode) {
        C12775o.m28639i(autofillNode, "autofillNode");
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final View getView() {
        return this.view;
    }

    public void requestAutofillForNode(AutofillNode autofillNode) {
        C12775o.m28639i(autofillNode, "autofillNode");
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox != null) {
            this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(C13265c.m30134c(boundingBox.getLeft()), C13265c.m30134c(boundingBox.getTop()), C13265c.m30134c(boundingBox.getRight()), C13265c.m30134c(boundingBox.getBottom())));
            return;
        }
        throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
    }
}
