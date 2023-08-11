package p260w0;

import android.view.View;
import android.view.animation.Animation;
import com.braze.configuration.C4218b;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p069e0.C7358a;
import p238u0.C9835j;
import p238u0.C9860n;
import p238u0.C9861o;
import p282y0.C10641g;

/* renamed from: w0.i */
/* compiled from: DefaultInAppMessageViewWrapperFactory.kt */
public class C10100i implements C9861o {
    /* renamed from: a */
    public C9860n mo44370a(View view, C7358a aVar, C10641g gVar, C4218b bVar, Animation animation, Animation animation2, View view2, List<? extends View> list, View view3) {
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(gVar, "inAppMessageViewLifecycleListener");
        C12775o.m28639i(bVar, "configurationProvider");
        return new C9835j(view, aVar, gVar, bVar, animation, animation2, view2, list, view3);
    }

    /* renamed from: b */
    public C9860n mo44371b(View view, C7358a aVar, C10641g gVar, C4218b bVar, Animation animation, Animation animation2, View view2) {
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(aVar, "inAppMessage");
        C10641g gVar2 = gVar;
        C12775o.m28639i(gVar2, "inAppMessageViewLifecycleListener");
        C4218b bVar2 = bVar;
        C12775o.m28639i(bVar2, "configurationProvider");
        return new C9835j(view, aVar, gVar2, bVar2, animation, animation2, view2, (List) null, (View) null, 384, (DefaultConstructorMarker) null);
    }
}
