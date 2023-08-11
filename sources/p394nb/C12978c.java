package p394nb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;
import p440ud.C13549b;

@StabilityInferred(parameters = 0)
/* renamed from: nb.c */
/* compiled from: SupportTicketDetailHistoryView.kt */
public final class C12978c {

    /* renamed from: a */
    private final View f20770a;

    public C12978c(Context context, ViewGroup viewGroup, C13549b bVar, String str, String str2) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(viewGroup, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(bVar, "indicatorColor");
        C12775o.m28639i(str, "subtitle");
        C12775o.m28639i(str2, "title");
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_support_ticket_detail_history, viewGroup, false);
        this.f20770a = inflate;
        View findViewById = inflate.findViewById(R.id.viewIndicator);
        C12775o.m28638h(findViewById, "view.findViewById(R.id.viewIndicator)");
        View findViewById2 = inflate.findViewById(R.id.textViewSubtitle);
        C12775o.m28638h(findViewById2, "view.findViewById(R.id.textViewSubtitle)");
        View findViewById3 = inflate.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById3, "view.findViewById(R.id.textViewTitle)");
        findViewById.setBackgroundColor(bVar.f21807a);
        ((TextView) findViewById2).setText(str);
        ((TextView) findViewById3).setText(str2);
    }

    /* renamed from: a */
    public final View mo50884a() {
        return this.f20770a;
    }
}
