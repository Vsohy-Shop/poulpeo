package p016q9;

import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: q9.b */
/* compiled from: ReviewMerchantViewHolder.kt */
public final class C2086b extends C14080a {

    /* renamed from: g */
    private final TextView f739g;

    /* renamed from: h */
    private final RatingBar f740h;

    /* renamed from: i */
    private final TextView f741i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2086b(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        View findViewById = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewTitle)");
        this.f739g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ratingBar);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.ratingBar)");
        this.f740h = (RatingBar) findViewById2;
        View findViewById3 = view.findViewById(R.id.textViewContent);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.textViewContent)");
        this.f741i = (TextView) findViewById3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        if (r1 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        if (r1 == null) goto L_0x004c;
     */
    /* renamed from: m2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23234m2(p463yc.C13867a r9, java.lang.Object r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x007f
            boolean r9 = r10 instanceof com.rmn.api.p322v2.poulpeo.model.ReviewMerchant
            if (r9 == 0) goto L_0x007f
            android.widget.TextView r9 = r8.f739g
            com.rmn.api.v2.poulpeo.model.ReviewMerchant r10 = (com.rmn.api.p322v2.poulpeo.model.ReviewMerchant) r10
            java.util.Date r0 = r10.getDate()
            if (r0 == 0) goto L_0x0064
            long r0 = r0.getTime()
            java.lang.String r0 = p446vd.C13622c.m31099a(r0)
            java.util.Date r1 = r10.getDateOrder()
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L_0x004c
            java.lang.String r5 = "dateOrder"
            kotlin.jvm.internal.C12775o.m28638h(r1, r5)
            android.content.Context r1 = r8.mo53843t0()
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r10.getUserName()
            r5[r3] = r6
            r5[r2] = r0
            java.util.Date r6 = r10.getDateOrder()
            long r6 = r6.getTime()
            java.lang.String r6 = p446vd.C13622c.m31099a(r6)
            r5[r4] = r6
            r6 = 2131952432(0x7f130330, float:1.9541307E38)
            java.lang.String r1 = r1.getString(r6, r5)
            if (r1 != 0) goto L_0x0061
        L_0x004c:
            android.content.Context r1 = r8.mo53843t0()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r10.getUserName()
            r4[r3] = r5
            r4[r2] = r0
            r0 = 2131952431(0x7f13032f, float:1.9541305E38)
            java.lang.String r1 = r1.getString(r0, r4)
        L_0x0061:
            if (r1 == 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            java.lang.String r1 = r10.getUserName()
        L_0x0068:
            r9.setText(r1)
            android.widget.RatingBar r9 = r8.f740h
            double r0 = r10.getScore()
            float r0 = (float) r0
            r9.setRating(r0)
            android.widget.TextView r9 = r8.f741i
            java.lang.String r10 = r10.getContent()
            r9.setText(r10)
            return
        L_0x007f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p016q9.C2086b.mo23234m2(yc.a, java.lang.Object):void");
    }
}
