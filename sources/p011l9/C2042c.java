package p011l9;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.SponsoredUser;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.C12775o;
import p432tb.C13477a;
import p446vd.C13629j;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: l9.c */
/* compiled from: SponsoredUserViewHolder.kt */
public final class C2042c extends C14080a {

    /* renamed from: g */
    private final C13477a f615g;

    /* renamed from: h */
    private SponsoredUser f616h;

    /* renamed from: i */
    private final TextView f617i;

    /* renamed from: j */
    private final TextView f618j;

    /* renamed from: k */
    private final ImageButton f619k;

    /* renamed from: l */
    private final SimpleDateFormat f620l = C13629j.m31131a("dd MMM yyyy");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2042c(View view, C13867a.C13868a aVar, C13477a aVar2) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(aVar2, "controller");
        this.f615g = aVar2;
        View findViewById = view.findViewById(R.id.dateTextView);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.dateTextView)");
        this.f617i = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.labelTextView);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.labelTextView)");
        this.f618j = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.groupStateImageButton);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.groupStateImageButton)");
        this.f619k = (ImageButton) findViewById3;
    }

    /* renamed from: n2 */
    private final void m1356n2() {
        C13477a aVar = this.f615g;
        SponsoredUser sponsoredUser = this.f616h;
        if (sponsoredUser == null) {
            C12775o.m28656z("currentItem");
            sponsoredUser = null;
        }
        if (aVar.mo53072Z2(sponsoredUser.getGroupId())) {
            this.f619k.setImageDrawable(ContextCompat.getDrawable(mo53843t0(), R.drawable.action_collapse_black));
        } else {
            this.f619k.setImageDrawable(ContextCompat.getDrawable(mo53843t0(), R.drawable.action_expand_black));
        }
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        String str;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.model.SponsoredUser");
        SponsoredUser sponsoredUser = (SponsoredUser) obj;
        this.f616h = sponsoredUser;
        SponsoredUser sponsoredUser2 = null;
        if (sponsoredUser == null) {
            C12775o.m28656z("currentItem");
            sponsoredUser = null;
        }
        Date date = sponsoredUser.getDate();
        if (date != null) {
            str = this.f620l.format(date);
            C12775o.m28638h(str, "dateFormatter.format(earningDate)");
        } else {
            str = "";
        }
        this.f617i.setText(str);
        TextView textView = this.f618j;
        SponsoredUser sponsoredUser3 = this.f616h;
        if (sponsoredUser3 == null) {
            C12775o.m28656z("currentItem");
        } else {
            sponsoredUser2 = sponsoredUser3;
        }
        textView.setText(sponsoredUser2.getDisplayName());
        m1356n2();
        this.itemView.setOnClickListener(this);
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (view == this.itemView) {
            C13867a.C13868a M0 = mo53841M0();
            C12775o.m28636f(M0);
            SponsoredUser sponsoredUser = this.f616h;
            if (sponsoredUser == null) {
                C12775o.m28656z("currentItem");
                sponsoredUser = null;
            }
            M0.mo46342E(sponsoredUser);
            m1356n2();
        }
    }
}
