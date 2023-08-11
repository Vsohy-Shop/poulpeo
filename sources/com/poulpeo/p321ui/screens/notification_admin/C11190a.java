package com.poulpeo.p321ui.screens.notification_admin;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p334ed.C11884a;
import p334ed.C11887b;
import p360id.C12134b;
import p360id.C12136d;
import p368jd.C12616b;
import p467za.C14063a;
import p467za.C14064b;
import p467za.C14065c;
import p467za.C14075j;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.notification_admin.a */
/* compiled from: BaseNotificationAdminActivity.kt */
public abstract class C11190a extends C12616b implements C14075j {

    /* renamed from: p */
    public static final C11191a f17603p = new C11191a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17604q = 8;

    /* renamed from: m */
    private MenuItem f17605m;

    /* renamed from: n */
    private boolean f17606n;

    /* renamed from: o */
    public Map<Integer, View> f17607o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.notification_admin.a$a */
    /* compiled from: BaseNotificationAdminActivity.kt */
    public static final class C11191a {
        private C11191a() {
        }

        public /* synthetic */ C11191a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m24536E2(C11190a aVar, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(aVar, "this$0");
        aVar.mo46415C2().mo53825C2();
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m24537F2(C11190a aVar, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(aVar, "this$0");
        aVar.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public abstract C14065c mo46415C2();

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public abstract int mo46416D2();

    /* renamed from: Y */
    public void mo46426Y() {
        C12136d.m26467i(this, R.string.notification_admin_save_preferences_success);
        finish();
    }

    /* renamed from: c1 */
    public void mo46427c1() {
        MenuItem menuItem = this.f17605m;
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
    }

    /* renamed from: h0 */
    public void mo46428h0(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AlertDialog.Builder cancelable = new AlertDialog.Builder(this).setMessage((CharSequence) str).setPositiveButton((int) R.string.loading_error_retry, (DialogInterface.OnClickListener) new C14063a(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) new C14064b(this)).setCancelable(false);
            C12775o.m28638h(cancelable, "Builder(this)\n          …    .setCancelable(false)");
            C12134b.m26457c(cancelable, this, (Function1) null, 2, (Object) null);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public void mo46429i() {
        C11887b bVar = new C11887b();
        bVar.setCancelable(true);
        C11884a.f18565e.mo49090c(this, "overlay_fragment", bVar);
    }

    /* renamed from: i0 */
    public void mo46430i0() {
        C12136d.m26467i(this, R.string.notification_admin_save_preferences_error);
        this.f17606n = false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo46416D2());
        mo46415C2().mo53829x2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C12775o.m28639i(menu, "menu");
        getMenuInflater().inflate(R.menu.notification_admin_menu, menu);
        this.f17605m = menu.findItem(R.id.action_ok);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo46415C2().mo53830y2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        if (this.f17606n) {
            return true;
        }
        if (menuItem != this.f17605m) {
            return super.onOptionsItemSelected(menuItem);
        }
        mo46415C2().mo53826D2();
        this.f17606n = true;
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        mo46415C2().mo53831z2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo46415C2().mo53824A2();
    }

    /* renamed from: r */
    public void mo46432r() {
        C11884a.f18565e.mo49089a(this, "overlay_fragment");
    }
}
