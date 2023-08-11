package p125j;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okio.C13121c;
import okio.C13148l;
import okio.C13175w0;
import p336ef.C11921v;

/* renamed from: j.c */
/* compiled from: FaultHidingSink.kt */
public final class C8228c extends C13148l {

    /* renamed from: b */
    private final Function1<IOException, C11921v> f11587b;

    /* renamed from: c */
    private boolean f11588c;

    public C8228c(C13175w0 w0Var, Function1<? super IOException, C11921v> function1) {
        super(w0Var);
        this.f11587b = function1;
    }

    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f11588c = true;
            this.f11587b.invoke(e);
        }
    }

    public void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f11588c = true;
            this.f11587b.invoke(e);
        }
    }

    public void write(C13121c cVar, long j) {
        if (this.f11588c) {
            cVar.skip(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e) {
            this.f11588c = true;
            this.f11587b.invoke(e);
        }
    }
}
