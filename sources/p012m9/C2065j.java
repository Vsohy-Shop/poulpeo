package p012m9;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import kotlin.jvm.internal.C12775o;
import p393na.C12959b;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: m9.j */
/* compiled from: EarningsHeaderViewHolder.kt */
public final class C2065j extends C14080a {

    /* renamed from: g */
    private final TextView f683g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2065j(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewTitle)");
        this.f683g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.imageButtonFilter);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.imageButtonFilter)");
        ImageButton imageButton = (ImageButton) findViewById2;
        imageButton.setOnClickListener(new C2063h(this, imageButton, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m1396p2(C2065j jVar, ImageButton imageButton, C13867a.C13868a aVar, View view) {
        C12775o.m28639i(jVar, "this$0");
        C12775o.m28639i(imageButton, "$imageButtonFilter");
        C12775o.m28639i(aVar, "$listener");
        PopupMenu popupMenu = new PopupMenu(jVar.mo53843t0(), imageButton);
        popupMenu.getMenuInflater().inflate(R.menu.earnings_filter_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new C2064i(aVar));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final boolean m1397q2(C13867a.C13868a aVar, MenuItem menuItem) {
        C12959b bVar;
        C12775o.m28639i(aVar, "$listener");
        switch (menuItem.getItemId()) {
            case R.id.menu_earnings_all /*2131362499*/:
                bVar = C12959b.ALL;
                break;
            case R.id.menu_earnings_cashback /*2131362500*/:
                bVar = C12959b.CASHBACK;
                break;
            case R.id.menu_earnings_review /*2131362501*/:
                bVar = C12959b.REVIEW;
                break;
            case R.id.menu_earnings_sponsorship /*2131362502*/:
                bVar = C12959b.SPONSORSHIP;
                break;
            default:
                bVar = null;
                break;
        }
        C12775o.m28636f(bVar);
        aVar.mo46342E(bVar);
        return true;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.ui.wrappers.ResourceStringWrapper");
        this.f683g.setText(((ResourceStringWrapper) obj).mo47912a(new ContextContainer(this.f683g.getContext())));
    }
}
