package p150l4;

import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: l4.o */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C8701o implements C8712u {

    /* renamed from: a */
    final /* synthetic */ C8709s f12455a;

    C8701o(C8709s sVar) {
        this.f12455a = sVar;
    }

    /* renamed from: a */
    public final void mo32238a(long j) {
        this.f12455a.f12497D.mo45098c(null);
    }

    /* renamed from: b */
    public final void mo32239b(long j, int i, @Nullable Object obj) {
        if (i != 0) {
            this.f12455a.f12497D.mo45097b(new IOException("storing session is timeout"));
        }
    }
}
