package com.rmn.p324ui.screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.rmn.iosadapters.android.content.ContextContainer;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p327dc.C11801a;
import p360id.C12138f;
import p404of.C13074a;
import p462yb.C13857a;

/* renamed from: com.rmn.ui.screens.AnimatedActivity */
/* compiled from: AnimatedActivity.kt */
public abstract class AnimatedActivity extends AppCompatActivity {

    /* renamed from: h */
    public static final C11645a f18092h = new C11645a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private static final String f18093i = "skip_override_pending_transition";

    /* renamed from: j */
    private static final String f18094j = "enter_anim_res_id";

    /* renamed from: k */
    private static final String f18095k = "exit_anim_res_id";

    /* renamed from: b */
    private final Lazy f18096b = C11901h.m25690b(new C11646b(this));

    /* renamed from: c */
    private final int f18097c;

    /* renamed from: d */
    private final int f18098d;

    /* renamed from: e */
    private final int f18099e;

    /* renamed from: f */
    private final int f18100f;

    /* renamed from: g */
    private boolean f18101g;

    /* renamed from: com.rmn.ui.screens.AnimatedActivity$a */
    /* compiled from: AnimatedActivity.kt */
    public static final class C11645a {
        private C11645a() {
        }

        public /* synthetic */ C11645a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.rmn.ui.screens.AnimatedActivity$b */
    /* compiled from: AnimatedActivity.kt */
    static final class C11646b extends C12777p implements C13074a<ContextContainer> {

        /* renamed from: g */
        final /* synthetic */ AnimatedActivity f18102g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11646b(AnimatedActivity animatedActivity) {
            super(0);
            this.f18102g = animatedActivity;
        }

        /* renamed from: b */
        public final ContextContainer invoke() {
            return new ContextContainer(this.f18102g);
        }
    }

    public AnimatedActivity() {
        C13857a aVar = C13857a.f22382a;
        this.f18097c = aVar.mo53541d();
        this.f18098d = aVar.mo53542e();
        this.f18099e = aVar.mo53538a();
        this.f18100f = aVar.mo53539b();
    }

    /* renamed from: m2 */
    private final void m25053m2() {
        Integer c = C13857a.f22382a.mo53540c();
        if (c != null) {
            int intValue = c.intValue();
            Toolbar toolbar = (Toolbar) findViewById(C11801a.toolBar);
            if (toolbar != null) {
                int childCount = toolbar.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = toolbar.getChildAt(i);
                    if (childAt instanceof TextView) {
                        TextView textView = (TextView) childAt;
                        if (C12775o.m28634d(textView.getText(), toolbar.getTitle())) {
                            C12138f.m26471a(textView, intValue);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void finish() {
        super.finish();
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra(f18093i, false);
        }
        if (z) {
            getIntent().removeExtra(f18093i);
        } else {
            overridePendingTransition(mo46409p2(), mo46410q2());
        }
    }

    /* renamed from: n2 */
    public final void mo47877n2() {
        getIntent().putExtra(f18093i, true);
        finish();
    }

    /* renamed from: o2 */
    public final ContextContainer mo47878o2() {
        return (ContextContainer) this.f18096b.getValue();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f18101g = false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18101g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public int mo46409p2() {
        return this.f18099e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public int mo46410q2() {
        return this.f18100f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public int mo47879r2() {
        return this.f18097c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s2 */
    public int mo47880s2() {
        return this.f18098d;
    }

    public void setTitle(int i) {
        if (i <= 0) {
            super.setTitle("");
            return;
        }
        super.setTitle(i);
        m25053m2();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C12775o.m28639i(intent, "intent");
        if (!this.f18101g) {
            this.f18101g = true;
            super.startActivityForResult(intent, i, bundle);
            String str = f18093i;
            if (intent.getBooleanExtra(str, false)) {
                intent.removeExtra(str);
                return;
            }
            int intExtra = intent.getIntExtra(f18094j, -1);
            int intExtra2 = intent.getIntExtra(f18095k, -1);
            if (intExtra == -1) {
                intExtra = mo47879r2();
            }
            if (intExtra2 == -1) {
                intExtra2 = mo47880s2();
            }
            overridePendingTransition(intExtra, intExtra2);
        }
    }

    /* renamed from: t2 */
    public final void mo47883t2(Intent intent) {
        C12775o.m28639i(intent, "intent");
        mo47884u2(intent, -1);
    }

    /* renamed from: u2 */
    public final void mo47884u2(Intent intent, int i) {
        C12775o.m28639i(intent, "intent");
        intent.putExtra(f18093i, true);
        startActivityForResult(intent, i, (Bundle) null);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m25053m2();
    }
}
