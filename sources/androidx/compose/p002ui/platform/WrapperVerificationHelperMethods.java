package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.platform.WrapperVerificationHelperMethods */
/* compiled from: Wrapper.android.kt */
public final class WrapperVerificationHelperMethods {
    public static final WrapperVerificationHelperMethods INSTANCE = new WrapperVerificationHelperMethods();

    private WrapperVerificationHelperMethods() {
    }

    @RequiresApi(29)
    @DoNotInline
    public final Map<Integer, Integer> attributeSourceResourceMap(View view) {
        C12775o.m28639i(view, "view");
        Map<Integer, Integer> a = view.getAttributeSourceResourceMap();
        C12775o.m28638h(a, "view.attributeSourceResourceMap");
        return a;
    }
}
