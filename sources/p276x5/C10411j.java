package p276x5;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: x5.j */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10411j implements C10394a<Void, Task<List<Task<?>>>> {

    /* renamed from: a */
    final /* synthetic */ Collection f15698a;

    C10411j(Collection collection) {
        this.f15698a = collection;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo39780a(@NonNull Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f15698a);
        return C10410i.m21831e(arrayList);
    }
}
