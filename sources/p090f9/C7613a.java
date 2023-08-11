package p090f9;

import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.common.pinned_object.LocalPinnedObjectsComparator;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.model.ModelRef;

/* renamed from: f9.a */
/* compiled from: CashbackPinnedObjectsComparator */
public class C7613a extends LocalPinnedObjectsComparator {
    public int compare(ModelRef<PinnedObject> modelRef, ModelRef<PinnedObject> modelRef2) {
        AbstractModel pinnedModel = modelRef.get().getPinnedModel();
        AbstractModel pinnedModel2 = modelRef2.get().getPinnedModel();
        if ((pinnedModel instanceof BaseMerchant) && (pinnedModel2 instanceof BaseMerchant)) {
            BaseMerchant baseMerchant = (BaseMerchant) pinnedModel;
            if (baseMerchant.hasCashback() != ((BaseMerchant) pinnedModel2).hasCashback()) {
                return baseMerchant.hasCashback() ? -1 : 1;
            }
        }
        return super.compare(modelRef, modelRef2);
    }
}
