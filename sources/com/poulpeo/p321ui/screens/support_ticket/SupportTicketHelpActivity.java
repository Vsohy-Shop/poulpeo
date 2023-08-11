package com.poulpeo.p321ui.screens.support_ticket;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.api.p322v2.poulpeo.model.GenericElement;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketHelp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p360id.C12134b;
import p368jd.C12616b;
import p381lb.C12802e;
import p381lb.C12803f;
import p381lb.C12804g;
import p381lb.C12808h;
import p394nb.C12980e;
import p434td.C13487a;
import p440ud.C13548a;
import p445vc.C13618g;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.support_ticket.SupportTicketHelpActivity */
/* compiled from: SupportTicketHelpActivity.kt */
public final class SupportTicketHelpActivity extends C12616b implements C12808h {

    /* renamed from: p */
    public static final C11219a f17730p = new C11219a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17731q = 8;

    /* renamed from: m */
    private final int f17732m = R.string.support_ticket_help_title;

    /* renamed from: n */
    private C12804g f17733n;

    /* renamed from: o */
    public Map<Integer, View> f17734o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.support_ticket.SupportTicketHelpActivity$a */
    /* compiled from: SupportTicketHelpActivity.kt */
    public static final class C11219a {
        private C11219a() {
        }

        public /* synthetic */ C11219a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46511a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, SupportTicketHelpActivity.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m24821D2(SupportTicketHelpActivity supportTicketHelpActivity, String str, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(supportTicketHelpActivity, "this$0");
        C12775o.m28639i(str, "$url");
        C13618g.f21930b.mo53278b("support", "redirect-browser");
        WebActivity.f17745z.mo46532k(supportTicketHelpActivity, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m24822E2(C13487a aVar, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        C12775o.m28639i(aVar, "$floatingButtonAddSupportTicket");
        C12775o.m28639i(nestedScrollView, "<anonymous parameter 0>");
        int i5 = i2 - i4;
        if (i5 > 1) {
            aVar.mo53092c();
        } else if (i5 < 0) {
            aVar.mo53093g();
        }
    }

    /* renamed from: C2 */
    public View mo46507C2(int i) {
        Map<Integer, View> map = this.f17734o;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: Z0 */
    public void mo46508Z0(String str) {
        C12775o.m28639i(str, "url");
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setTitle((int) R.string.add_support_ticket_add_in_browser_dialog_title).setMessage((CharSequence) getString(R.string.add_support_ticket_add_in_browser_dialog_message)).setPositiveButton((CharSequence) getString(R.string.add_support_ticket_add_in_browser_dialog_ok), (DialogInterface.OnClickListener) new C12803f(this, str)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        C12775o.m28638h(negativeButton, "Builder(this)\n          …id.R.string.cancel, null)");
        C12134b.m26457c(negativeButton, this, (Function1) null, 2, (Object) null);
    }

    /* renamed from: l1 */
    public void mo46509l1(SupportTicketHelp supportTicketHelp) {
        List<GenericElement> help;
        ((LinearLayout) mo46507C2(C13865f.layoutHelpContainer)).removeAllViews();
        if (supportTicketHelp != null && (help = supportTicketHelp.getHelp()) != null) {
            for (GenericElement genericElement : help) {
                int i = C13865f.layoutHelpContainer;
                LinearLayout linearLayout = (LinearLayout) mo46507C2(i);
                C12775o.m28638h(linearLayout, "layoutHelpContainer");
                C12775o.m28638h(genericElement, "genericElement");
                ((LinearLayout) mo46507C2(i)).addView(new C12980e(this, linearLayout, genericElement).mo50886c());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("SupportTicketHelpActivity", true);
        setContentView(R.layout.activity_support_ticket_help);
        int i = C13865f.buttonAddSupportTicket;
        Button button = (Button) mo46507C2(i);
        C12775o.m28638h(button, "buttonAddSupportTicket");
        ((NestedScrollView) mo46507C2(C13865f.scrollViewHelp)).setOnScrollChangeListener(new C12802e(new C13487a(button)));
        C12804g gVar = new C12804g(this, new C12804g.C12807c(mo47878o2(), new C13548a((Button) mo46507C2(i))));
        this.f17733n = gVar;
        gVar.mo50706p2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C12775o.m28639i(menu, "menu");
        getMenuInflater().inflate(R.menu.support_ticket_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12804g gVar = this.f17733n;
        if (gVar == null) {
            C12775o.m28656z("controller");
            gVar = null;
        }
        gVar.mo50707q2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        if (menuItem.getItemId() != R.id.action_ask) {
            return super.onOptionsItemSelected(menuItem);
        }
        WebActivity.f17745z.mo46529h(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12804g gVar = this.f17733n;
        if (gVar == null) {
            C12775o.m28656z("controller");
            gVar = null;
        }
        gVar.mo50708r2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12804g gVar = this.f17733n;
        if (gVar == null) {
            C12775o.m28656z("controller");
            gVar = null;
        }
        gVar.mo50709s2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17732m;
    }
}
