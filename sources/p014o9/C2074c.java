package p014o9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import p078e9.C7527a;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: o9.c */
/* compiled from: MerchantInSectionCellViewHolderOld.kt */
public final class C2074c extends C2072b {

    /* renamed from: l */
    private final String f706l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2074c(View view, C13867a.C13868a aVar, boolean z, String str) {
        super(view, aVar, 0, true, z);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(str, "sliderTag");
        this.f706l = str;
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        C13867a.C13868a M0 = mo53841M0();
        if (M0 != null) {
            M0.mo46342E(new C7527a(this.f706l, mo23258q2()));
        }
    }
}
