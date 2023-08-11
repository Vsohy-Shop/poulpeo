package p070e1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.C4368f;
import p058d1.C7214a;

/* renamed from: e1.d */
/* compiled from: DataFetcher */
public interface C7422d<T> {

    /* renamed from: e1.d$a */
    /* compiled from: DataFetcher */
    public interface C7423a<T> {
        /* renamed from: c */
        void mo31269c(@NonNull Exception exc);

        /* renamed from: f */
        void mo31271f(@Nullable T t);
    }

    @NonNull
    /* renamed from: a */
    Class<T> mo41069a();

    /* renamed from: b */
    void mo41074b();

    void cancel();

    @NonNull
    /* renamed from: d */
    C7214a mo41077d();

    /* renamed from: e */
    void mo41078e(@NonNull C4368f fVar, @NonNull C7423a<? super T> aVar);
}
