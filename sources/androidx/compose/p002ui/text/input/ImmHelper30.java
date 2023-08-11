package androidx.compose.p002ui.text.input;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.window.DialogWindowProvider;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(30)
@SourceDebugExtension({"SMAP\nInputMethodManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputMethodManager.kt\nandroidx/compose/ui/text/input/ImmHelper30\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.ImmHelper30 */
/* compiled from: InputMethodManager.kt */
final class ImmHelper30 implements ImmHelper {
    private ImmHelper21 _immHelper21;
    private final View view;

    public ImmHelper30(View view2) {
        C12775o.m28639i(view2, "view");
        this.view = view2;
    }

    private final Window findWindow(View view2) {
        while (!(view2 instanceof DialogWindowProvider)) {
            ViewParent parent = view2.getParent();
            View view3 = parent instanceof View ? (View) parent : null;
            if (view3 == null) {
                Context context = view2.getContext();
                C12775o.m28638h(context, "view.context");
                Window findWindow = findWindow(context);
                if (findWindow == null) {
                    return null;
                }
                View decorView = findWindow.getDecorView();
                C12775o.m28638h(decorView, "windowFromContext.decorView");
                if (decorView == view2) {
                    return findWindow;
                }
                return null;
            }
            view2 = view3;
        }
        return ((DialogWindowProvider) view2).getWindow();
    }

    private final ImmHelper21 getImmHelper21() {
        ImmHelper21 immHelper21 = this._immHelper21;
        if (immHelper21 != null) {
            return immHelper21;
        }
        ImmHelper21 immHelper212 = new ImmHelper21(this.view);
        this._immHelper21 = immHelper212;
        return immHelper212;
    }

    private final WindowInsetsControllerCompat getInsetsControllerCompat() {
        Window findWindow = findWindow(this.view);
        if (findWindow != null) {
            return new WindowInsetsControllerCompat(findWindow, this.view);
        }
        return null;
    }

    @DoNotInline
    public void hideSoftInput(InputMethodManager inputMethodManager) {
        C12775o.m28639i(inputMethodManager, "imm");
        WindowInsetsControllerCompat insetsControllerCompat = getInsetsControllerCompat();
        if (insetsControllerCompat != null) {
            insetsControllerCompat.hide(WindowInsetsCompat.Type.ime());
        } else {
            getImmHelper21().hideSoftInput(inputMethodManager);
        }
    }

    @DoNotInline
    public void showSoftInput(InputMethodManager inputMethodManager) {
        C12775o.m28639i(inputMethodManager, "imm");
        WindowInsetsControllerCompat insetsControllerCompat = getInsetsControllerCompat();
        if (insetsControllerCompat != null) {
            insetsControllerCompat.show(WindowInsetsCompat.Type.ime());
        } else {
            getImmHelper21().showSoftInput(inputMethodManager);
        }
    }

    private final Window findWindow(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C12775o.m28638h(context, "baseContext");
        }
        return ((Activity) context).getWindow();
    }
}
