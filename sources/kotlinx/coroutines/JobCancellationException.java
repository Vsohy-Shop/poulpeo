package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,76:1\n26#2:77\n*S KotlinDebug\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n*L\n44#1:77\n*E\n"})
/* compiled from: Exceptions.kt */
public final class JobCancellationException extends CancellationException {

    /* renamed from: b */
    public final transient C14054y1 f20427b;

    public JobCancellationException(String str, Throwable th, C14054y1 y1Var) {
        super(str);
        this.f20427b = y1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!C12775o.m28634d(jobCancellationException.getMessage(), getMessage()) || !C12775o.m28634d(jobCancellationException.f20427b, this.f20427b) || !C12775o.m28634d(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i;
        String message = getMessage();
        C12775o.m28636f(message);
        int hashCode = ((message.hashCode() * 31) + this.f20427b.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return super.toString() + "; job=" + this.f20427b;
    }
}
