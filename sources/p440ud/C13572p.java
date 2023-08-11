package p440ud;

import android.widget.TextView;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import p446vd.C13629j;

/* renamed from: ud.p */
/* compiled from: TextViewWrapper */
public class C13572p extends C13574r {
    public C13572p(TextView textView) {
        super(textView);
    }

    /* renamed from: i */
    public TextView mo53238i() {
        return (TextView) mo53243a();
    }

    /* renamed from: j */
    public void mo53239j(int i) {
        mo53238i().setText(String.format(C13629j.m31133c(), TimeModel.NUMBER_FORMAT, new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: k */
    public void mo53240k(ResourceStringWrapper resourceStringWrapper) {
        mo53238i().setText(resourceStringWrapper.f18146a);
    }

    /* renamed from: l */
    public void mo53241l(String str) {
        mo53238i().setText(str);
    }

    /* renamed from: m */
    public void mo53242m(C13549b bVar) {
        mo53238i().setTextColor(bVar.f21807a);
    }
}
