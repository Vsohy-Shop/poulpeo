package okhttp3.internal.cache;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import okio.C13121c;
import okio.C13148l;
import okio.C13175w0;
import p336ef.C11921v;

/* compiled from: FaultHidingSink.kt */
public class FaultHidingSink extends C13148l {
    private boolean hasErrors;
    private final Function1<IOException, C11921v> onException;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(C13175w0 w0Var, Function1<? super IOException, C11921v> function1) {
        super(w0Var);
        C12775o.m28639i(w0Var, "delegate");
        C12775o.m28639i(function1, "onException");
        this.onException = function1;
    }

    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }

    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }

    public final Function1<IOException, C11921v> getOnException() {
        return this.onException;
    }

    public void write(C13121c cVar, long j) {
        C12775o.m28639i(cVar, APIParams.SOURCE);
        if (this.hasErrors) {
            cVar.skip(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
