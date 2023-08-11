package p013n9;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.poulpeo.R;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionMerchant;
import com.rmn.utils.AndroidUtil;
import com.rmn.utils.AsyncImageLoader;
import com.squareup.picasso.Callback;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p008i9.C2019d;
import p360id.C12139g;
import p394nb.C12976a;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: n9.c */
/* compiled from: HomeSectionMerchantViewHolder.kt */
public class C2068c extends C14080a {

    /* renamed from: o */
    protected static final C2069a f688o = new C2069a((DefaultConstructorMarker) null);

    /* renamed from: p */
    public static final int f689p = 8;

    /* renamed from: g */
    private final Map<Object, Integer> f690g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ImageView f691h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final TextView f692i;

    /* renamed from: j */
    private final TextView f693j;

    /* renamed from: k */
    private final HorizontalScrollView f694k;

    /* renamed from: l */
    private final LinearLayout f695l;

    /* renamed from: m */
    private final C12976a f696m;

    /* renamed from: n */
    private HomeSectionMerchant f697n;

    /* renamed from: n9.c$a */
    /* compiled from: HomeSectionMerchantViewHolder.kt */
    protected static final class C2069a {
        private C2069a() {
        }

        public /* synthetic */ C2069a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2068c(View view, C13867a.C13868a aVar, C2019d dVar, Map<Object, Integer> map, boolean z) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        this.f690g = map;
        View findViewById = view.findViewById(R.id.imageViewIllustration);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.imageViewIllustration)");
        this.f691h = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.titleTextView);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.titleTextView)");
        this.f692i = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.showAllTextView);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.showAllTextView)");
        this.f693j = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.sliderContainerScrollView);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.…liderContainerScrollView)");
        this.f694k = (HorizontalScrollView) findViewById4;
        View findViewById5 = view.findViewById(R.id.sliderContainerLayout);
        C12775o.m28638h(findViewById5, "itemView.findViewById(R.id.sliderContainerLayout)");
        LinearLayout linearLayout = (LinearLayout) findViewById5;
        this.f695l = linearLayout;
        this.f696m = new C12976a(linearLayout, aVar);
        View findViewById6 = view.findViewById(R.id.viewBottomSeparator);
        C12775o.m28638h(findViewById6, "itemView.findViewById<Vi…R.id.viewBottomSeparator)");
        C12139g.m26475d(findViewById6, z, 0, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m1399A2(C2068c cVar, Object obj, View view) {
        C12775o.m28639i(cVar, "this$0");
        cVar.m1407v2(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final int m1406t2(Bitmap bitmap) {
        int height = bitmap.getHeight();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (int i = 0; i < height; i++) {
            int width = bitmap.getWidth();
            for (int i2 = 0; i2 < width; i2++) {
                int pixel = bitmap.getPixel(i2, i);
                j += (long) Color.red(pixel);
                j2 += (long) Color.green(pixel);
                j3 += (long) Color.blue(pixel);
            }
        }
        float width2 = (float) (bitmap.getWidth() * bitmap.getHeight());
        return Color.rgb((int) (((float) j) / width2), (int) (((float) j2) / width2), (int) (((float) j3) / width2));
    }

    /* renamed from: v2 */
    private final void m1407v2(Object obj) {
        C13867a.C13868a M0;
        if (this.f697n != null) {
            C13867a.C13868a M02 = mo53841M0();
            if (M02 != null) {
                HomeSectionMerchant homeSectionMerchant = this.f697n;
                C12775o.m28636f(homeSectionMerchant);
                M02.mo46342E(homeSectionMerchant);
            }
        } else if (obj != null && (M0 = mo53841M0()) != null) {
            M0.mo46342E(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public final void m1408x2(TextView textView, int i) {
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        C12775o.m28638h(compoundDrawablesRelative, "showAllTextView.compoundDrawablesRelative");
        for (Drawable drawable : compoundDrawablesRelative) {
            if (drawable != null) {
                drawable.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(i, BlendModeCompat.SRC_ATOP));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m1409z2(C2068c cVar, Object obj, View view) {
        C12775o.m28639i(cVar, "this$0");
        cVar.m1407v2(obj);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        HomeSectionMerchant homeSectionMerchant;
        if (obj instanceof HomeSectionMerchant) {
            homeSectionMerchant = (HomeSectionMerchant) obj;
        } else {
            homeSectionMerchant = null;
        }
        if (homeSectionMerchant != null) {
            this.f697n = homeSectionMerchant;
            C12976a aVar2 = this.f696m;
            String tag = homeSectionMerchant.getTag();
            C12775o.m28638h(tag, "section.tag");
            aVar2.mo50882b(tag);
            this.f691h.setImageDrawable((Drawable) null);
            C12139g.m26475d(this.f691h, false, 0, 2, (Object) null);
            C12139g.m26475d(this.f692i, true, 0, 2, (Object) null);
            this.f693j.setTextColor(ContextCompat.getColor(mo53843t0(), R.color.text_theme));
            m1408x2(this.f693j, ContextCompat.getColor(mo53843t0(), R.color.text_theme));
            this.f693j.setActivated(false);
            if (homeSectionMerchant.hasIllustration()) {
                AsyncImageLoader.loadImage(this.f691h, (Object) homeSectionMerchant.getTag(), homeSectionMerchant.getIllustration(), (Callback) new C2070b(this));
            }
            String title = homeSectionMerchant.getTitle();
            C12775o.m28638h(title, "section.title");
            List<BaseMerchant> merchants = homeSectionMerchant.getMerchants();
            C12775o.m28638h(merchants, "section.merchants");
            mo23256y2(title, merchants, homeSectionMerchant.getTotalCount(), (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u2 */
    public final TextView mo23254u2() {
        return this.f693j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w2 */
    public void mo23255w2(List<? extends BaseMerchant> list, int i) {
        boolean z;
        C12775o.m28639i(list, "merchants");
        TextView textView = this.f693j;
        if (i <= 8 || i <= list.size()) {
            z = false;
        } else {
            z = true;
        }
        C12139g.m26475d(textView, z, 0, 2, (Object) null);
    }

    /* renamed from: y2 */
    public final void mo23256y2(String str, List<? extends BaseMerchant> list, int i, Object obj) {
        Integer num;
        C12775o.m28639i(str, "title");
        C12775o.m28639i(list, "merchants");
        mo23255w2(list, i);
        this.f693j.setOnClickListener(new C2066a(this, obj));
        this.f691h.setOnClickListener(new C2067b(this, obj));
        this.f692i.setText(str);
        this.f696m.mo50881a(list);
        Map<Object, Integer> map = this.f690g;
        if (map != null) {
            HomeSectionMerchant homeSectionMerchant = this.f697n;
            if (homeSectionMerchant != null) {
                num = map.get(homeSectionMerchant);
            } else {
                num = null;
            }
            if (num != null) {
                Number number = num;
                if (number.intValue() >= 0) {
                    this.f694k.scrollTo(number.intValue(), 0);
                }
            }
        }
    }

    /* renamed from: n9.c$b */
    /* compiled from: HomeSectionMerchantViewHolder.kt */
    public static final class C2070b implements Callback {

        /* renamed from: a */
        final /* synthetic */ C2068c f698a;

        C2070b(C2068c cVar) {
            this.f698a = cVar;
        }

        public void onSuccess() {
            int i;
            Drawable drawable = this.f698a.f691h.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap applyGradient = AndroidUtil.applyGradient(((BitmapDrawable) drawable).getBitmap(), Math.round(this.f698a.mo53843t0().getResources().getDimension(R.dimen.home_event_illustration_gradient_height)), 0);
                this.f698a.f691h.setImageBitmap(applyGradient);
                C2068c cVar = this.f698a;
                C12775o.m28638h(applyGradient, "bitmap");
                i = cVar.m1406t2(applyGradient);
            } else {
                i = ViewCompat.MEASURED_STATE_MASK;
            }
            C12139g.m26475d(this.f698a.f691h, true, 0, 2, (Object) null);
            C12139g.m26475d(this.f698a.f692i, false, 0, 2, (Object) null);
            if (ColorUtils.calculateLuminance(i) < 0.6000000238418579d) {
                this.f698a.mo23254u2().setTextColor(ContextCompat.getColor(this.f698a.mo53843t0(), R.color.text_title_alternative));
                C2068c cVar2 = this.f698a;
                cVar2.m1408x2(cVar2.mo23254u2(), ContextCompat.getColor(this.f698a.mo53843t0(), R.color.text_title_alternative));
            }
            this.f698a.mo23254u2().setActivated(true);
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
        }
    }
}
