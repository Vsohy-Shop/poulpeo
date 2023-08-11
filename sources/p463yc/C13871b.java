package p463yc;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.p324ui.views.listview.C11660i;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p463yc.C13867a;
import p469zc.C14080a;
import p469zc.C14085e;

@StabilityInferred(parameters = 0)
/* renamed from: yc.b */
/* compiled from: BaseSpaceableAdapter.kt */
public class C13871b extends C13867a {

    /* renamed from: s */
    protected static final C13872a f22605s = new C13872a((DefaultConstructorMarker) null);

    /* renamed from: yc.b$a */
    /* compiled from: BaseSpaceableAdapter.kt */
    protected static final class C13872a {
        private C13872a() {
        }

        public /* synthetic */ C13872a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13871b(C13867a.C13868a aVar) {
        super(aVar, 0, 2, (DefaultConstructorMarker) null);
        C12775o.m28639i(aVar, "listener");
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType != C13867a.f22581i.mo53577d() || !(getItem(i) instanceof C11660i)) {
            return itemViewType;
        }
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == 5) {
            return R.layout.row_spacing;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i == 5) {
            return new C14085e(view, mo53565o());
        }
        return super.mo23226t(view, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13871b(C13867a.C13868a aVar, int i) {
        super(aVar, i);
        C12775o.m28639i(aVar, "listener");
    }
}
