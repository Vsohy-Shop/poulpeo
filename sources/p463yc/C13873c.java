package p463yc;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.api.p322v2.poulpeo.model.IExpandableGroup;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: yc.c */
/* compiled from: ExpandableAdapter.kt */
public abstract class C13873c extends C13871b {

    /* renamed from: t */
    protected static final C13874a f22606t = new C13874a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final int f22607u = 10;

    /* renamed from: yc.c$a */
    /* compiled from: ExpandableAdapter.kt */
    protected static final class C13874a {
        private C13874a() {
        }

        public /* synthetic */ C13874a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo53580a() {
            return C13873c.f22607u;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13873c(C13867a.C13868a aVar) {
        super(aVar);
        C12775o.m28639i(aVar, "listener");
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType != C13867a.f22581i.mo53577d() || !(getItem(i) instanceof IExpandableGroup)) {
            return itemViewType;
        }
        return f22607u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        return super.mo23226t(view, i);
    }
}
