package p073e4;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: e4.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class C7475c implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C7475c f10359b = new C7475c();

    private /* synthetic */ C7475c() {
    }

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).mo32372A().compareTo(((Scope) obj2).mo32372A());
    }
}
