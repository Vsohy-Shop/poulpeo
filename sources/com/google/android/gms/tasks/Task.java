package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import p276x5.C10394a;
import p276x5.C10396b;
import p276x5.C10398c;
import p276x5.C10400d;
import p276x5.C10402e;
import p276x5.C10404f;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public abstract class Task<TResult> {
    @NonNull
    /* renamed from: a */
    public Task<TResult> mo35450a(@NonNull Executor executor, @NonNull C10396b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    /* renamed from: b */
    public Task<TResult> mo35451b(@NonNull Executor executor, @NonNull C10398c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: c */
    public Task<TResult> mo35452c(@NonNull C10398c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: d */
    public abstract Task<TResult> mo35453d(@NonNull Executor executor, @NonNull C10400d dVar);

    @NonNull
    /* renamed from: e */
    public abstract Task<TResult> mo35454e(@NonNull C10400d dVar);

    @NonNull
    /* renamed from: f */
    public abstract Task<TResult> mo35455f(@NonNull Executor executor, @NonNull C10402e<? super TResult> eVar);

    @NonNull
    /* renamed from: g */
    public abstract Task<TResult> mo35456g(@NonNull C10402e<? super TResult> eVar);

    @NonNull
    /* renamed from: h */
    public <TContinuationResult> Task<TContinuationResult> mo35457h(@NonNull Executor executor, @NonNull C10394a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: i */
    public <TContinuationResult> Task<TContinuationResult> mo35458i(@NonNull C10394a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: j */
    public <TContinuationResult> Task<TContinuationResult> mo35459j(@NonNull Executor executor, @NonNull C10394a<TResult, Task<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* renamed from: k */
    public abstract Exception mo35460k();

    /* renamed from: l */
    public abstract TResult mo35461l();

    /* renamed from: m */
    public abstract <X extends Throwable> TResult mo35462m(@NonNull Class<X> cls);

    /* renamed from: n */
    public abstract boolean mo35463n();

    /* renamed from: o */
    public abstract boolean mo35464o();

    /* renamed from: p */
    public abstract boolean mo35465p();

    @NonNull
    /* renamed from: q */
    public <TContinuationResult> Task<TContinuationResult> mo35466q(@NonNull Executor executor, @NonNull C10404f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    /* renamed from: r */
    public <TContinuationResult> Task<TContinuationResult> mo35467r(@NonNull C10404f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
