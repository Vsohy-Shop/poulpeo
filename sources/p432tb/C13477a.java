package p432tb;

import com.rmn.api.p322v2.poulpeo.model.AbstractExpandableChild;
import com.rmn.api.p322v2.poulpeo.model.IExpandableGroup;
import com.rmn.p324ui.views.listview.C11654c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p311bd.C10930a;
import p311bd.C10934d;

/* renamed from: tb.a */
/* compiled from: ExpandableListViewController */
public class C13477a extends C10930a {

    /* renamed from: s */
    private Set<String> f21635s = new HashSet();

    public C13477a(C10934d dVar, Integer num) {
        super(dVar, num);
    }

    /* renamed from: Y2 */
    private int m30701Y2(Object obj) {
        int y2 = super.mo45977y2();
        for (int i = 0; i < y2; i++) {
            if (obj == mo45974v2(i)) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: D2 */
    public void mo45947D2(Object obj) {
        boolean z;
        ArrayList arrayList;
        boolean z2;
        if (obj != null) {
            if (!(obj instanceof IExpandableGroup)) {
                super.mo45947D2(obj);
                return;
            }
            IExpandableGroup iExpandableGroup = (IExpandableGroup) obj;
            List<AbstractExpandableChild> children = iExpandableGroup.getChildren();
            if (this.f21635s.contains(iExpandableGroup.getGroupId())) {
                for (AbstractExpandableChild L2 : children) {
                    mo45954L2(L2);
                }
                this.f21635s.remove(iExpandableGroup.getGroupId());
                return;
            }
            int Y2 = m30701Y2(iExpandableGroup) + 1;
            if (Y2 >= mo45977y2()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            if (mo45976x2() || !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            for (int i = 0; i < children.size(); i++) {
                AbstractExpandableChild abstractExpandableChild = children.get(i);
                abstractExpandableChild.setChildrenInfo(children.size(), i, z2);
                if (z) {
                    arrayList.add(abstractExpandableChild);
                } else {
                    mo45944A2(abstractExpandableChild, Y2);
                    Y2++;
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                mo45967o2(arrayList, true);
            }
            this.f21635s.add(iExpandableGroup.getGroupId());
        }
    }

    /* renamed from: P2 */
    public void mo45958P2(C11654c cVar) {
        if (cVar != null) {
            this.f16844d = cVar;
            mo45969q2().mo45989s(cVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: X2 */
    public void mo53071X2() {
        this.f21635s.clear();
    }

    /* renamed from: Z2 */
    public boolean mo53072Z2(String str) {
        return this.f21635s.contains(str);
    }
}
