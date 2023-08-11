package p440ud;

import android.widget.CompoundButton;
import android.widget.Switch;

/* renamed from: ud.n */
/* compiled from: SwitchWrapper */
public class C13568n extends C13574r {

    /* renamed from: c */
    private C13570b f21824c;

    /* renamed from: ud.n$a */
    /* compiled from: SwitchWrapper */
    class C13569a implements CompoundButton.OnCheckedChangeListener {
        C13569a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C13568n.this.mo53223j(z);
        }
    }

    /* renamed from: ud.n$b */
    /* compiled from: SwitchWrapper */
    public interface C13570b {
        /* renamed from: v */
        void mo53228v(C13568n nVar, boolean z);
    }

    public C13568n(Switch switchR) {
        super(switchR);
    }

    /* renamed from: i */
    public Switch mo53222i() {
        return (Switch) mo53243a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo53223j(boolean z) {
        C13570b bVar = this.f21824c;
        if (bVar != null) {
            bVar.mo53228v(this, z);
        }
    }

    /* renamed from: k */
    public boolean mo53224k() {
        return mo53222i().isChecked();
    }

    /* renamed from: l */
    public void mo53225l(boolean z) {
        mo53222i().setChecked(z);
    }

    /* renamed from: m */
    public void mo53226m(C13570b bVar) {
        this.f21824c = bVar;
        mo53222i().setOnCheckedChangeListener(new C13569a());
    }
}
