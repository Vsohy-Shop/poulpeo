package p063d6;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p099g6.C7781c;
import p099g6.C7790l;

/* renamed from: d6.f */
public final class C7272f implements C7268b {

    /* renamed from: a */
    private final C7277k f9999a;

    /* renamed from: b */
    private final Handler f10000b = new Handler(Looper.getMainLooper());

    C7272f(C7277k kVar) {
        this.f9999a = kVar;
    }

    @NonNull
    /* renamed from: a */
    public final C7781c<Void> mo40835a(@NonNull Activity activity, @NonNull C7267a aVar) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", aVar.mo40832a());
        C7790l lVar = new C7790l();
        intent.putExtra("result_receiver", new C7271e(this.f10000b, lVar));
        activity.startActivity(intent);
        return lVar.mo41434a();
    }

    @NonNull
    /* renamed from: b */
    public final C7781c<C7267a> mo40836b() {
        return this.f9999a.mo40841a();
    }
}
