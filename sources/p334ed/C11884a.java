package p334ed;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.screens.AnimatedActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p340fd.C11943a;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* renamed from: ed.a */
/* compiled from: BaseDialogFragment.kt */
public class C11884a extends DialogFragment {

    /* renamed from: e */
    public static final C11885a f18565e = new C11885a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f18566f = 8;

    /* renamed from: b */
    private AnimatedActivity f18567b;

    /* renamed from: c */
    private final Lazy f18568c = C11901h.m25690b(new C11886b(this));

    /* renamed from: d */
    public Map<Integer, View> f18569d = new LinkedHashMap();

    /* renamed from: ed.a$a */
    /* compiled from: BaseDialogFragment.kt */
    public static final class C11885a {
        private C11885a() {
        }

        public /* synthetic */ C11885a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final C11884a m25658b(FragmentManager fragmentManager, String str) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
            if (findFragmentByTag instanceof C11884a) {
                return (C11884a) findFragmentByTag;
            }
            return null;
        }

        /* renamed from: a */
        public final void mo49089a(AppCompatActivity appCompatActivity, String str) {
            C12775o.m28639i(appCompatActivity, "activity");
            C12775o.m28639i(str, "fragmentTag");
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            C12775o.m28638h(supportFragmentManager, "activity.supportFragmentManager");
            C11884a b = m25658b(supportFragmentManager, str);
            if (b != null) {
                b.dismissAllowingStateLoss();
            }
        }

        /* renamed from: c */
        public final void mo49090c(AppCompatActivity appCompatActivity, String str, C11884a aVar) {
            C12775o.m28639i(appCompatActivity, "activity");
            C12775o.m28639i(str, "fragmentTag");
            C12775o.m28639i(aVar, "dialogFragment");
            if (!appCompatActivity.isFinishing()) {
                FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
                C12775o.m28638h(supportFragmentManager, "activity.supportFragmentManager");
                C11884a b = m25658b(supportFragmentManager, str);
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                C12775o.m28638h(beginTransaction, "fm.beginTransaction()");
                if (b != null) {
                    beginTransaction.remove(b);
                }
                beginTransaction.add((Fragment) aVar, str);
                beginTransaction.commitAllowingStateLoss();
                supportFragmentManager.executePendingTransactions();
            }
        }
    }

    /* renamed from: ed.a$b */
    /* compiled from: BaseDialogFragment.kt */
    static final class C11886b extends C12777p implements C13074a<ContextContainer> {

        /* renamed from: g */
        final /* synthetic */ C11884a f18570g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11886b(C11884a aVar) {
            super(0);
            this.f18570g = aVar;
        }

        /* renamed from: b */
        public final ContextContainer invoke() {
            return new ContextContainer(this.f18570g.mo49088M0());
        }
    }

    /* renamed from: M0 */
    public final AnimatedActivity mo49088M0() {
        AnimatedActivity animatedActivity = this.f18567b;
        if (animatedActivity != null) {
            return animatedActivity;
        }
        C12775o.m28656z("retainedActivity");
        return null;
    }

    public void onAttach(Activity activity) {
        C12775o.m28639i(activity, "activity");
        super.onAttach(activity);
        if (activity instanceof AnimatedActivity) {
            this.f18567b = (AnimatedActivity) activity;
            return;
        }
        throw new IllegalStateException("This fragment must be created in an AppCompatActivity");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C12775o.m28638h(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        new C11943a().mo49176a(onCreateDialog);
        setCancelable(false);
        return onCreateDialog;
    }
}
