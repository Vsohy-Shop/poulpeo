package com.poulpeo.p321ui.screens.comment;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.appboy.Constants;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.UserSuggestSource;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p366jb.C12610d;
import p372ka.C12641a;
import p372ka.C12643b;
import p438ub.C13542a;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.comment.CommentActivity */
/* compiled from: CommentActivity.kt */
public final class CommentActivity extends C12610d implements C12643b, View.OnClickListener, TextWatcher {

    /* renamed from: v */
    public static final C11107a f17250v = new C11107a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f17251w = 8;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final IntentDelegate.StringNullable f17252x = new IntentDelegate.StringNullable("commentHint");
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final IntentDelegate.StringNullable f17253y = new IntentDelegate.StringNullable("title");
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final IntentDelegate.String f17254z = new IntentDelegate.String(APIParams.SOURCE);

    /* renamed from: o */
    private final int f17255o = R.string.menu_comment;

    /* renamed from: p */
    private final int f17256p = R.string.comment_error_title;

    /* renamed from: q */
    private final int f17257q = R.string.comment_success_title;

    /* renamed from: r */
    private final int f17258r = R.string.comment_success_subtitle;

    /* renamed from: s */
    private C12641a f17259s;

    /* renamed from: t */
    private final Pattern f17260t = Pattern.compile("(\\n|\\b)*");

    /* renamed from: u */
    public Map<Integer, View> f17261u = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.comment.CommentActivity$a */
    /* compiled from: CommentActivity.kt */
    public static final class C11107a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17262a;

        static {
            Class<C11107a> cls = C11107a.class;
            f17262a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "commentHint", "getCommentHint(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "title", "getTitle(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, APIParams.SOURCE, "getSource(Landroid/content/Intent;)Ljava/lang/String;", 0))};
        }

        private C11107a() {
        }

        public /* synthetic */ C11107a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String m23948d(Intent intent) {
            return CommentActivity.f17252x.getValue(intent, (KProperty<?>) f17262a[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final String m23949e(Intent intent) {
            return CommentActivity.f17254z.getValue(intent, (KProperty<?>) f17262a[2]);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final String m23950f(Intent intent) {
            return CommentActivity.f17253y.getValue(intent, (KProperty<?>) f17262a[1]);
        }

        /* renamed from: h */
        private final void m23951h(Intent intent, String str) {
            CommentActivity.f17252x.setValue(intent, (KProperty<?>) f17262a[0], str);
        }

        /* renamed from: i */
        private final void m23952i(Intent intent, String str) {
            CommentActivity.f17254z.setValue(intent, (KProperty<?>) f17262a[2], str);
        }

        /* renamed from: j */
        private final void m23953j(Intent intent, String str) {
            CommentActivity.f17253y.setValue(intent, (KProperty<?>) f17262a[1], str);
        }

        /* renamed from: g */
        public final Intent mo46200g(Context context, String str, String str2, UserSuggestSource userSuggestSource) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(userSuggestSource, APIParams.SOURCE);
            Intent intent = new Intent(context, CommentActivity.class);
            C11107a aVar = CommentActivity.f17250v;
            aVar.m23951h(intent, str);
            aVar.m23953j(intent, str2);
            String userSuggestSource2 = userSuggestSource.toString();
            C12775o.m28638h(userSuggestSource2, "source.toString()");
            aVar.m23952i(intent, userSuggestSource2);
            return intent;
        }
    }

    /* renamed from: D2 */
    public View mo46191D2(int i) {
        Map<Integer, View> map = this.f17261u;
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

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public int mo46192G2() {
        return this.f17256p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public int mo46193H2() {
        return this.f17258r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I2 */
    public int mo46194I2() {
        return this.f17257q;
    }

    public void afterTextChanged(Editable editable) {
        C12775o.m28639i(editable, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C12775o.m28639i(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        C12641a aVar = null;
        if (view == ((ImageButton) mo46191D2(C13865f.imageButtonSubmit))) {
            mo50335I0();
            String obj = ((EditText) mo46191D2(C13865f.editTextComment)).getText().toString();
            C12641a aVar2 = this.f17259s;
            if (aVar2 == null) {
                C12775o.m28656z("controller");
            } else {
                aVar = aVar2;
            }
            aVar.mo50397u2(obj);
        } else if (view == ((TextView) mo46191D2(C13865f.textViewCancel))) {
            mo50334E2();
            C12641a aVar3 = this.f17259s;
            if (aVar3 == null) {
                C12775o.m28656z("controller");
            } else {
                aVar = aVar3;
            }
            aVar.mo50392n2();
        }
    }

    public void onCreate(Bundle bundle) {
        ActionBar supportActionBar;
        super.onCreate(bundle);
        setContentView(R.layout.activity_comment);
        mo50358x2("CommentActivity", true);
        ((ProgressBar) mo46191D2(C13865f.progress)).getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(this, R.color.background_alternative), PorterDuff.Mode.SRC_IN);
        C11107a aVar = f17250v;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String a = aVar.m23948d(intent);
        if (!TextUtils.isEmpty(a)) {
            ((EditText) mo46191D2(C13865f.editTextComment)).setHint(a);
        }
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        String c = aVar.m23950f(intent2);
        if (!TextUtils.isEmpty(c) && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.setTitle((CharSequence) c);
        }
        Intent intent3 = getIntent();
        C12775o.m28638h(intent3, "intent");
        String b = aVar.m23949e(intent3);
        ((ImageButton) mo46191D2(C13865f.imageButtonSubmit)).setOnClickListener(this);
        ((TextView) mo46191D2(C13865f.textViewCancel)).setOnClickListener(this);
        int i = C13865f.editTextComment;
        ((EditText) mo46191D2(i)).addTextChangedListener(this);
        mo50336L2((EditText) mo46191D2(i));
        C12641a aVar2 = new C12641a(this, new C12641a.C12642a(mo47878o2(), new C13689a(mo47878o2()), C13542a.f21790p.mo53187a(this).mo53178c(), b));
        this.f17259s = aVar2;
        aVar2.mo50393p2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12641a aVar = this.f17259s;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo50394q2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12641a aVar = this.f17259s;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo50395r2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12641a aVar = this.f17259s;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo50396s2();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C12775o.m28639i(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        if (!this.f17260t.matcher(charSequence).matches()) {
            ((ImageButton) mo46191D2(C13865f.imageButtonSubmit)).setVisibility(0);
        } else {
            ((ImageButton) mo46191D2(C13865f.imageButtonSubmit)).setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17255o;
    }
}
