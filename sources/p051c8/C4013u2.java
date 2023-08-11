package p051c8;

import android.app.Application;
import com.google.protobuf.C7056a;
import com.google.protobuf.C7193x0;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import p341fe.C11945b;
import p341fe.C11953j;

/* renamed from: c8.u2 */
/* compiled from: ProtoStorageClient */
public class C4013u2 {

    /* renamed from: a */
    private final Application f3201a;

    /* renamed from: b */
    private final String f3202b;

    public C4013u2(Application application, String str) {
        this.f3201a = application;
        this.f3202b = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ C7056a m4713c(C7193x0 x0Var) {
        FileInputStream openFileInput;
        C7056a aVar;
        synchronized (this) {
            try {
                openFileInput = this.f3201a.openFileInput(this.f3202b);
                aVar = (C7056a) x0Var.mo40165b(openFileInput);
                if (openFileInput != null) {
                    openFileInput.close();
                }
            } catch (InvalidProtocolBufferException | FileNotFoundException e) {
                C3961l2.m4604c("Recoverable exception while reading cache: " + e.getMessage());
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return aVar;
        throw th;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m4714d(C7056a aVar) {
        synchronized (this) {
            FileOutputStream openFileOutput = this.f3201a.openFileOutput(this.f3202b, 0);
            try {
                openFileOutput.write(aVar.mo40151g());
                openFileOutput.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return aVar;
        throw th;
    }

    /* renamed from: e */
    public <T extends C7056a> C11953j<T> mo30035e(C7193x0<T> x0Var) {
        return C11953j.m25867l(new C4005s2(this, x0Var));
    }

    /* renamed from: f */
    public C11945b mo30036f(C7056a aVar) {
        return C11945b.m25807k(new C4009t2(this, aVar));
    }
}
