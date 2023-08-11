package com.rmn.p324ui.screens;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p327dc.C11801a;
import p327dc.C11802b;
import p368jd.C12618d;

/* renamed from: com.rmn.ui.screens.a */
/* compiled from: TrackableFragmentActivity.kt */
public abstract class C11647a extends C12618d {

    /* renamed from: m */
    public static final C11648a f18103m = new C11648a((DefaultConstructorMarker) null);

    /* renamed from: n */
    private static final String f18104n = "TAG_FRAGMENT";

    /* renamed from: com.rmn.ui.screens.a$a */
    /* compiled from: TrackableFragmentActivity.kt */
    public static final class C11648a {
        private C11648a() {
        }

        public /* synthetic */ C11648a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11802b.activity_fragment_no_actionbar);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C12775o.m28638h(supportFragmentManager, "supportFragmentManager");
        String str = f18104n;
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().show(findFragmentByTag).commit();
            return;
        }
        supportFragmentManager.beginTransaction().add(C11801a.fragment_container, mo46178y2(), str).commit();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public abstract Fragment mo46178y2();
}
