package com.rmn.utils.share;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.tasks.Task;
import com.rmn.iosadapters.android.content.ContextContainer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p112h7.C8024a;
import p112h7.C8027d;
import p133j7.C8424a;
import p184o8.C9013a;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
/* compiled from: URLShortenerFirebaseDynamicLink.kt */
public final class URLShortenerFirebaseDynamicLink implements IURLShortener {
    public static final int $stable = 0;

    /* renamed from: com.rmn.utils.share.URLShortenerFirebaseDynamicLink$a */
    /* compiled from: URLShortenerFirebaseDynamicLink.kt */
    static final class C11671a extends C12777p implements Function1<C8024a, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f18173g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11671a(String str) {
            super(1);
            this.f18173g = str;
        }

        /* renamed from: a */
        public final void mo47969a(C8024a aVar) {
            C12775o.m28639i(aVar, "$this$shortLinkAsync");
            aVar.mo41854b(Uri.parse(this.f18173g));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47969a((C8024a) obj);
            return C11921v.f18618a;
        }
    }

    /* access modifiers changed from: private */
    public static final void shortenUrl$lambda$0(Function1 function1, Task task) {
        String str;
        Uri v;
        C12775o.m28639i(function1, "$completion");
        C12775o.m28639i(task, "it");
        C8027d dVar = (C8027d) task.mo35461l();
        if (dVar == null || (v = dVar.mo41858v()) == null) {
            str = null;
        } else {
            str = v.toString();
        }
        function1.invoke(str);
    }

    public void shortenUrl(ContextContainer contextContainer, String str, Function1<? super String, C11921v> function1) {
        C12775o.m28639i(contextContainer, "contextContainer");
        C12775o.m28639i(str, "longUrl");
        C12775o.m28639i(function1, "completion");
        C8424a.m16848b(C8424a.m16847a(C9013a.f13126a), new C11671a(str)).mo35452c(new C11672a(function1));
    }
}
