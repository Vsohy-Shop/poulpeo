package p334ed;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: ed.b */
/* compiled from: OverlayProgressFragment.kt */
public final class C11887b extends C11884a {

    /* renamed from: g */
    public Map<Integer, View> f18571g = new LinkedHashMap();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.loading_overlay_progress_layout, viewGroup);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        C12775o.m28639i(view, "view");
        super.onViewCreated(view, bundle);
        setStyle(2, 16973829);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
