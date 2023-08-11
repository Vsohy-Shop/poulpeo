package p440ud;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: ud.d */
/* compiled from: EditTextWrapper */
public class C13551d extends C13574r {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C13555d f21809c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21810d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f21811e = null;

    /* renamed from: ud.d$a */
    /* compiled from: EditTextWrapper */
    class C13552a implements TextWatcher {

        /* renamed from: b */
        final /* synthetic */ C13554c f21812b;

        C13552a(C13554c cVar) {
            this.f21812b = cVar;
        }

        public void afterTextChanged(Editable editable) {
            boolean i = C13551d.this.f21810d;
            String k = C13551d.this.f21811e;
            C13551d.this.f21810d = true;
            C13551d.this.f21811e = null;
            if (i) {
                this.f21812b.mo49571R0(C13551d.this, editable.toString());
            } else {
                editable.replace(0, editable.length(), k);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13551d dVar = C13551d.this;
            dVar.f21811e = dVar.mo53192o().getText().toString();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13551d.this.f21810d = this.f21812b.mo49572b0(charSequence.toString());
        }
    }

    /* renamed from: ud.d$b */
    /* compiled from: EditTextWrapper */
    class C13553b implements TextView.OnEditorActionListener {
        C13553b() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            C13551d.this.f21809c.mo50787b(C13551d.this);
            return false;
        }
    }

    /* renamed from: ud.d$c */
    /* compiled from: EditTextWrapper */
    public interface C13554c {
        /* renamed from: R0 */
        void mo49571R0(C13551d dVar, String str);

        /* renamed from: b0 */
        boolean mo49572b0(String str);
    }

    /* renamed from: ud.d$d */
    /* compiled from: EditTextWrapper */
    public interface C13555d {
        /* renamed from: b */
        void mo50787b(C13551d dVar);
    }

    public C13551d(EditText editText) {
        super(editText);
    }

    /* renamed from: n */
    public void mo53191n(C13554c cVar) {
        if (cVar != null) {
            mo53192o().addTextChangedListener(new C13552a(cVar));
        }
    }

    /* renamed from: o */
    public EditText mo53192o() {
        return (EditText) mo53243a();
    }

    /* renamed from: p */
    public String mo53193p() {
        return mo53192o().getText().toString();
    }

    /* renamed from: q */
    public void mo53194q() {
        mo53192o().requestFocus();
    }

    /* renamed from: r */
    public void mo53195r(C13555d dVar) {
        if (dVar == null) {
            this.f21809c = null;
            mo53192o().setOnEditorActionListener((TextView.OnEditorActionListener) null);
            return;
        }
        if (this.f21809c == null) {
            mo53192o().setOnEditorActionListener(new C13553b());
        }
        this.f21809c = dVar;
    }

    /* renamed from: s */
    public void mo53196s(int i) {
        mo53192o().setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* renamed from: t */
    public void mo53197t(String str) {
        mo53192o().setText(str);
        if (mo53192o().hasSelection()) {
            mo53192o().setSelection(mo53192o().length());
        }
    }
}
