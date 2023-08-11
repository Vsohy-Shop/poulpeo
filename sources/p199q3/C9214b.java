package p199q3;

/* renamed from: q3.b */
/* compiled from: Retries */
public final class C9214b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m18918a(int i, TInput tinput, C9213a<TInput, TResult, TException> aVar, C9215c<TInput, TResult> cVar) {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo31825a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.mo31825a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
