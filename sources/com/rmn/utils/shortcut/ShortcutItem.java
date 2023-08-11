package com.rmn.utils.shortcut;

/* compiled from: ShortcutItem.kt */
public enum ShortcutItem {
    SHARE("shortcut_share"),
    EARNINGS("shortcut_earnings"),
    FAVORITES("shortcut_favorites"),
    SEARCH("shortcut_search");
    

    /* renamed from: id */
    private final String f18175id;

    private ShortcutItem(String str) {
        this.f18175id = str;
    }

    public final String getId() {
        return this.f18175id;
    }
}
