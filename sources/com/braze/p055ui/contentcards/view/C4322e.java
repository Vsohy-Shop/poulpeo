package com.braze.p055ui.contentcards.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;

/* renamed from: com.braze.ui.contentcards.view.e */
/* compiled from: ContentCardViewHolder.kt */
public class C4322e extends RecyclerView.ViewHolder {

    /* renamed from: b */
    private final View f3600b;

    /* renamed from: c */
    private final ImageView f3601c;

    /* renamed from: d */
    private final TextView f3602d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4322e(View view, boolean z) {
        super(view);
        C12775o.m28639i(view, "view");
        View findViewById = view.findViewById(C4193R.C4196id.com_braze_content_cards_unread_bar);
        this.f3600b = findViewById;
        this.f3601c = (ImageView) view.findViewById(C4193R.C4196id.com_braze_content_cards_pinned_icon);
        this.f3602d = (TextView) view.findViewById(C4193R.C4196id.com_braze_content_cards_action_hint);
        if (z) {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            if (findViewById != null) {
                findViewById.setBackground(view.getContext().getResources().getDrawable(C4193R.C4195drawable.com_braze_content_cards_unread_bar_background));
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: J0 */
    public final void mo31071J0(boolean z) {
        int i;
        ImageView imageView = this.f3601c;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: M0 */
    public final void mo31072M0(boolean z) {
        int i;
        View view = this.f3600b;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: b0 */
    public final void mo31073b0(String str) {
        C12775o.m28639i(str, "text");
        TextView textView = this.f3602d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: t0 */
    public final void mo31074t0(boolean z) {
        int i;
        TextView textView = this.f3602d;
        if (textView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }
}
