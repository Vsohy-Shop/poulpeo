package p258v9;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.model.IModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: v9.c */
/* compiled from: PageReload */
public class C10058c {

    /* renamed from: a */
    private final String f15206a;

    /* renamed from: b */
    public Set<String> f15207b = new HashSet();
    @NonNull

    /* renamed from: c */
    private final Map<Integer, List<IModel>> f15208c = new HashMap();

    public C10058c(String str) {
        this.f15206a = str;
    }

    /* renamed from: a */
    public void mo44639a(int i, List<IModel> list) {
        this.f15208c.put(Integer.valueOf(i), list);
    }

    @NonNull
    /* renamed from: b */
    public List<IModel> mo44640b(int i) {
        List<IModel> list = this.f15208c.get(Integer.valueOf(i));
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    @NonNull
    /* renamed from: c */
    public String mo44641c() {
        return this.f15206a;
    }

    /* renamed from: d */
    public void mo44642d() {
        this.f15207b.clear();
        this.f15208c.clear();
    }
}
