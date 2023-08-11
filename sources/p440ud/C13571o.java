package p440ud;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p440ud.C13551d;
import p440ud.C13574r;

/* renamed from: ud.o */
/* compiled from: TextInputLayoutWrapper */
public class C13571o extends C13574r {

    /* renamed from: c */
    private C13551d f21826c;

    public C13571o(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f21826c = new C13551d(textInputLayout.getEditText());
    }

    /* renamed from: f */
    public void mo53229f(C13574r.C13576b bVar) {
        this.f21826c.mo53229f(bVar);
    }

    /* renamed from: g */
    public void mo53230g(C13573q qVar) {
        mo53234l().setVisibility(qVar.f21831b);
    }

    /* renamed from: i */
    public void mo53231i(C13551d.C13554c cVar) {
        this.f21826c.mo53191n(cVar);
    }

    /* renamed from: j */
    public EditText mo53232j() {
        return this.f21826c.mo53192o();
    }

    /* renamed from: k */
    public String mo53233k() {
        return this.f21826c.mo53193p();
    }

    /* renamed from: l */
    public TextInputLayout mo53234l() {
        return (TextInputLayout) mo53243a();
    }

    /* renamed from: m */
    public void mo53235m(C13551d.C13555d dVar) {
        this.f21826c.mo53195r(dVar);
    }

    /* renamed from: n */
    public void mo53236n(int i) {
        this.f21826c.mo53196s(i);
    }

    /* renamed from: o */
    public void mo53237o(String str) {
        this.f21826c.mo53197t(str);
    }
}
