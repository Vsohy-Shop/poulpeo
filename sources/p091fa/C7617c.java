package p091fa;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionTitle;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: fa.c */
/* compiled from: TitleSectionViewHolder.kt */
public final class C7617c extends C14080a {

    /* renamed from: g */
    private final TextView f10592g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7617c(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.textViewSectionTitle);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewSectionTitle)");
        this.f10592g = (TextView) findViewById;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionTitle");
        this.f10592g.setText(((PageSectionTitle) obj).content);
    }
}
