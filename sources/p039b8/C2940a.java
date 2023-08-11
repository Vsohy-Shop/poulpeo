package p039b8;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* renamed from: b8.a */
/* compiled from: BackButtonHandler */
public class C2940a {

    /* renamed from: a */
    private ViewGroup f1343a;

    /* renamed from: b */
    private View.OnClickListener f1344b;

    public C2940a(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        this.f1343a = viewGroup;
        this.f1344b = onClickListener;
    }

    @Nullable
    /* renamed from: a */
    public Boolean mo28479a(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = this.f1344b;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick(this.f1343a);
        return Boolean.TRUE;
    }
}
