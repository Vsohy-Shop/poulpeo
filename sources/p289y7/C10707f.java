package p289y7;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import p101g8.C7796a;
import p101g8.C7814h;
import p101g8.C7817i;
import p256v7.C10044f;
import p256v7.C10045g;
import p278x7.C10582l;

/* renamed from: y7.f */
/* compiled from: ImageBindingWrapper */
public class C10707f extends C10703c {

    /* renamed from: d */
    private FiamFrameLayout f16305d;

    /* renamed from: e */
    private ViewGroup f16306e;

    /* renamed from: f */
    private ImageView f16307f;

    /* renamed from: g */
    private Button f16308g;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C10707f(C10582l lVar, LayoutInflater layoutInflater, C7817i iVar) {
        super(lVar, layoutInflater, iVar);
    }

    @NonNull
    /* renamed from: c */
    public View mo45625c() {
        return this.f16306e;
    }

    @NonNull
    /* renamed from: e */
    public ImageView mo45627e() {
        return this.f16307f;
    }

    @NonNull
    /* renamed from: f */
    public ViewGroup mo45628f() {
        return this.f16305d;
    }

    @Nullable
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo45629g(Map<C7796a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        int i;
        View inflate = this.f16289c.inflate(C10045g.image, (ViewGroup) null);
        this.f16305d = (FiamFrameLayout) inflate.findViewById(C10044f.image_root);
        this.f16306e = (ViewGroup) inflate.findViewById(C10044f.image_content_root);
        this.f16307f = (ImageView) inflate.findViewById(C10044f.image_view);
        this.f16308g = (Button) inflate.findViewById(C10044f.collapse_button);
        this.f16307f.setMaxHeight(this.f16288b.mo45516r());
        this.f16307f.setMaxWidth(this.f16288b.mo45517s());
        if (this.f16287a.mo41515c().equals(MessageType.IMAGE_ONLY)) {
            C7814h hVar = (C7814h) this.f16287a;
            ImageView imageView = this.f16307f;
            if (hVar.mo41463b() == null || TextUtils.isEmpty(hVar.mo41463b().mo41503b())) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
            this.f16307f.setOnClickListener(map.get(hVar.mo41508e()));
        }
        this.f16305d.setDismissListener(onClickListener);
        this.f16308g.setOnClickListener(onClickListener);
        return null;
    }
}
