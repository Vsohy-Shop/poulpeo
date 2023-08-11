package p340fd;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.C12775o;
import p327dc.C11803c;

/* renamed from: fd.a */
/* compiled from: SlideInDialogAnimation.kt */
public final class C11943a {
    /* renamed from: a */
    public final void mo49176a(Dialog dialog) {
        Window window;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = C11803c.slide_animation;
            }
            Context context = window.getContext();
            if (context != null) {
                C12775o.m28638h(context, "context");
                window.setStatusBarColor(ContextCompat.getColor(window.getContext(), 17170445));
            }
        }
    }
}
