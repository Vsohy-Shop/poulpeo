package androidx.compose.p002ui.input.key;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.ComposerKt;
import androidx.mediarouter.media.MediaRouter;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.input.key.Key */
/* compiled from: Key.android.kt */
public final class Key {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final long f327A = Key_androidKt.Key(29);
    /* access modifiers changed from: private */
    public static final long AllApps = Key_androidKt.Key(284);
    /* access modifiers changed from: private */
    public static final long AltLeft = Key_androidKt.Key(57);
    /* access modifiers changed from: private */
    public static final long AltRight = Key_androidKt.Key(58);
    /* access modifiers changed from: private */
    public static final long Apostrophe = Key_androidKt.Key(75);
    /* access modifiers changed from: private */
    public static final long AppSwitch = Key_androidKt.Key(187);
    /* access modifiers changed from: private */
    public static final long Assist = Key_androidKt.Key(219);
    /* access modifiers changed from: private */

    /* renamed from: At */
    public static final long f328At = Key_androidKt.Key(77);
    /* access modifiers changed from: private */
    public static final long AvReceiverInput = Key_androidKt.Key(182);
    /* access modifiers changed from: private */
    public static final long AvReceiverPower = Key_androidKt.Key(181);
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final long f329B = Key_androidKt.Key(30);
    /* access modifiers changed from: private */
    public static final long Back = Key_androidKt.Key(4);
    /* access modifiers changed from: private */
    public static final long Backslash = Key_androidKt.Key(73);
    /* access modifiers changed from: private */
    public static final long Backspace = Key_androidKt.Key(67);
    /* access modifiers changed from: private */
    public static final long Bookmark = Key_androidKt.Key(174);
    /* access modifiers changed from: private */
    public static final long Break = Key_androidKt.Key(121);
    /* access modifiers changed from: private */
    public static final long BrightnessDown = Key_androidKt.Key(OAuthErrorCodes.ERR_OAUTH_INVALID_SIG);
    /* access modifiers changed from: private */
    public static final long BrightnessUp = Key_androidKt.Key(OAuthErrorCodes.ERR_OAUTH_SIG_METHOD);
    /* access modifiers changed from: private */
    public static final long Browser = Key_androidKt.Key(64);
    /* access modifiers changed from: private */
    public static final long Button1 = Key_androidKt.Key(188);
    /* access modifiers changed from: private */
    public static final long Button10 = Key_androidKt.Key(197);
    /* access modifiers changed from: private */
    public static final long Button11 = Key_androidKt.Key(198);
    /* access modifiers changed from: private */
    public static final long Button12 = Key_androidKt.Key(199);
    /* access modifiers changed from: private */
    public static final long Button13 = Key_androidKt.Key(200);
    /* access modifiers changed from: private */
    public static final long Button14 = Key_androidKt.Key(ComposerKt.providerKey);
    /* access modifiers changed from: private */
    public static final long Button15 = Key_androidKt.Key(ComposerKt.compositionLocalMapKey);
    /* access modifiers changed from: private */
    public static final long Button16 = Key_androidKt.Key(ComposerKt.providerValuesKey);
    /* access modifiers changed from: private */
    public static final long Button2 = Key_androidKt.Key(189);
    /* access modifiers changed from: private */
    public static final long Button3 = Key_androidKt.Key(190);
    /* access modifiers changed from: private */
    public static final long Button4 = Key_androidKt.Key(191);
    /* access modifiers changed from: private */
    public static final long Button5 = Key_androidKt.Key(192);
    /* access modifiers changed from: private */
    public static final long Button6 = Key_androidKt.Key(193);
    /* access modifiers changed from: private */
    public static final long Button7 = Key_androidKt.Key(194);
    /* access modifiers changed from: private */
    public static final long Button8 = Key_androidKt.Key(195);
    /* access modifiers changed from: private */
    public static final long Button9 = Key_androidKt.Key(196);
    /* access modifiers changed from: private */
    public static final long ButtonA = Key_androidKt.Key(96);
    /* access modifiers changed from: private */
    public static final long ButtonB = Key_androidKt.Key(97);
    /* access modifiers changed from: private */
    public static final long ButtonC = Key_androidKt.Key(98);
    /* access modifiers changed from: private */
    public static final long ButtonL1 = Key_androidKt.Key(102);
    /* access modifiers changed from: private */
    public static final long ButtonL2 = Key_androidKt.Key(104);
    /* access modifiers changed from: private */
    public static final long ButtonMode = Key_androidKt.Key(110);
    /* access modifiers changed from: private */
    public static final long ButtonR1 = Key_androidKt.Key(103);
    /* access modifiers changed from: private */
    public static final long ButtonR2 = Key_androidKt.Key(105);
    /* access modifiers changed from: private */
    public static final long ButtonSelect = Key_androidKt.Key(109);
    /* access modifiers changed from: private */
    public static final long ButtonStart = Key_androidKt.Key(108);
    /* access modifiers changed from: private */
    public static final long ButtonThumbLeft = Key_androidKt.Key(106);
    /* access modifiers changed from: private */
    public static final long ButtonThumbRight = Key_androidKt.Key(107);
    /* access modifiers changed from: private */
    public static final long ButtonX = Key_androidKt.Key(99);
    /* access modifiers changed from: private */
    public static final long ButtonY = Key_androidKt.Key(100);
    /* access modifiers changed from: private */
    public static final long ButtonZ = Key_androidKt.Key(101);
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final long f330C = Key_androidKt.Key(31);
    /* access modifiers changed from: private */
    public static final long Calculator = Key_androidKt.Key(210);
    /* access modifiers changed from: private */
    public static final long Calendar = Key_androidKt.Key(208);
    /* access modifiers changed from: private */
    public static final long Call = Key_androidKt.Key(5);
    /* access modifiers changed from: private */
    public static final long Camera = Key_androidKt.Key(27);
    /* access modifiers changed from: private */
    public static final long CapsLock = Key_androidKt.Key(115);
    /* access modifiers changed from: private */
    public static final long Captions = Key_androidKt.Key(175);
    /* access modifiers changed from: private */
    public static final long ChannelDown = Key_androidKt.Key(167);
    /* access modifiers changed from: private */
    public static final long ChannelUp = Key_androidKt.Key(166);
    /* access modifiers changed from: private */
    public static final long Clear = Key_androidKt.Key(28);
    /* access modifiers changed from: private */
    public static final long Comma = Key_androidKt.Key(55);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Contacts = Key_androidKt.Key(ComposerKt.reuseKey);
    /* access modifiers changed from: private */
    public static final long Copy = Key_androidKt.Key(278);
    /* access modifiers changed from: private */
    public static final long CtrlLeft = Key_androidKt.Key(113);
    /* access modifiers changed from: private */
    public static final long CtrlRight = Key_androidKt.Key(114);
    /* access modifiers changed from: private */
    public static final long Cut = Key_androidKt.Key(277);
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static final long f331D = Key_androidKt.Key(32);
    /* access modifiers changed from: private */
    public static final long Delete = Key_androidKt.Key(112);
    /* access modifiers changed from: private */
    public static final long DirectionCenter = Key_androidKt.Key(23);
    /* access modifiers changed from: private */
    public static final long DirectionDown = Key_androidKt.Key(20);
    /* access modifiers changed from: private */
    public static final long DirectionDownLeft = Key_androidKt.Key(269);
    /* access modifiers changed from: private */
    public static final long DirectionDownRight = Key_androidKt.Key(271);
    /* access modifiers changed from: private */
    public static final long DirectionLeft = Key_androidKt.Key(21);
    /* access modifiers changed from: private */
    public static final long DirectionRight = Key_androidKt.Key(22);
    /* access modifiers changed from: private */
    public static final long DirectionUp = Key_androidKt.Key(19);
    /* access modifiers changed from: private */
    public static final long DirectionUpLeft = Key_androidKt.Key(268);
    /* access modifiers changed from: private */
    public static final long DirectionUpRight = Key_androidKt.Key(270);
    /* access modifiers changed from: private */
    public static final long Dvr = Key_androidKt.Key(173);
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static final long f332E = Key_androidKt.Key(33);
    /* access modifiers changed from: private */
    public static final long Eight = Key_androidKt.Key(15);
    /* access modifiers changed from: private */
    public static final long Eisu = Key_androidKt.Key(212);
    /* access modifiers changed from: private */
    public static final long EndCall = Key_androidKt.Key(6);
    /* access modifiers changed from: private */
    public static final long Enter = Key_androidKt.Key(66);
    /* access modifiers changed from: private */
    public static final long Envelope = Key_androidKt.Key(65);
    /* access modifiers changed from: private */
    public static final long Equals = Key_androidKt.Key(70);
    /* access modifiers changed from: private */
    public static final long Escape = Key_androidKt.Key(111);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static final long f333F = Key_androidKt.Key(34);
    /* access modifiers changed from: private */

    /* renamed from: F1 */
    public static final long f334F1 = Key_androidKt.Key(131);
    /* access modifiers changed from: private */
    public static final long F10 = Key_androidKt.Key(140);
    /* access modifiers changed from: private */
    public static final long F11 = Key_androidKt.Key(141);
    /* access modifiers changed from: private */
    public static final long F12 = Key_androidKt.Key(142);
    /* access modifiers changed from: private */

    /* renamed from: F2 */
    public static final long f335F2 = Key_androidKt.Key(132);
    /* access modifiers changed from: private */

    /* renamed from: F3 */
    public static final long f336F3 = Key_androidKt.Key(133);
    /* access modifiers changed from: private */

    /* renamed from: F4 */
    public static final long f337F4 = Key_androidKt.Key(134);
    /* access modifiers changed from: private */

    /* renamed from: F5 */
    public static final long f338F5 = Key_androidKt.Key(135);
    /* access modifiers changed from: private */

    /* renamed from: F6 */
    public static final long f339F6 = Key_androidKt.Key(136);
    /* access modifiers changed from: private */

    /* renamed from: F7 */
    public static final long f340F7 = Key_androidKt.Key(137);
    /* access modifiers changed from: private */

    /* renamed from: F8 */
    public static final long f341F8 = Key_androidKt.Key(138);
    /* access modifiers changed from: private */

    /* renamed from: F9 */
    public static final long f342F9 = Key_androidKt.Key(139);
    /* access modifiers changed from: private */
    public static final long Five = Key_androidKt.Key(12);
    /* access modifiers changed from: private */
    public static final long Focus = Key_androidKt.Key(80);
    /* access modifiers changed from: private */
    public static final long Forward = Key_androidKt.Key(125);
    /* access modifiers changed from: private */
    public static final long Four = Key_androidKt.Key(11);
    /* access modifiers changed from: private */
    public static final long Function = Key_androidKt.Key(119);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static final long f343G = Key_androidKt.Key(35);
    /* access modifiers changed from: private */
    public static final long Grave = Key_androidKt.Key(68);
    /* access modifiers changed from: private */
    public static final long Guide = Key_androidKt.Key(172);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static final long f344H = Key_androidKt.Key(36);
    /* access modifiers changed from: private */
    public static final long HeadsetHook = Key_androidKt.Key(79);
    /* access modifiers changed from: private */
    public static final long Help = Key_androidKt.Key(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_CHANGED);
    /* access modifiers changed from: private */
    public static final long Henkan = Key_androidKt.Key(ModuleDescriptor.MODULE_VERSION);
    /* access modifiers changed from: private */
    public static final long Home = Key_androidKt.Key(3);
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final long f345I = Key_androidKt.Key(37);
    /* access modifiers changed from: private */
    public static final long Info = Key_androidKt.Key(165);
    /* access modifiers changed from: private */
    public static final long Insert = Key_androidKt.Key(124);
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static final long f346J = Key_androidKt.Key(38);
    /* access modifiers changed from: private */

    /* renamed from: K */
    public static final long f347K = Key_androidKt.Key(39);
    /* access modifiers changed from: private */
    public static final long Kana = Key_androidKt.Key(218);
    /* access modifiers changed from: private */
    public static final long KatakanaHiragana = Key_androidKt.Key(215);
    /* access modifiers changed from: private */

    /* renamed from: L */
    public static final long f348L = Key_androidKt.Key(40);
    /* access modifiers changed from: private */
    public static final long LanguageSwitch = Key_androidKt.Key(ComposerKt.providerMapsKey);
    /* access modifiers changed from: private */
    public static final long LastChannel = Key_androidKt.Key(229);
    /* access modifiers changed from: private */
    public static final long LeftBracket = Key_androidKt.Key(71);
    /* access modifiers changed from: private */

    /* renamed from: M */
    public static final long f349M = Key_androidKt.Key(41);
    /* access modifiers changed from: private */
    public static final long MannerMode = Key_androidKt.Key(205);
    /* access modifiers changed from: private */
    public static final long MediaAudioTrack = Key_androidKt.Key(OAuthErrorCodes.ERR_OAUTH_TIMESTAMP);
    /* access modifiers changed from: private */
    public static final long MediaClose = Key_androidKt.Key(128);
    /* access modifiers changed from: private */
    public static final long MediaEject = Key_androidKt.Key(129);
    /* access modifiers changed from: private */
    public static final long MediaFastForward = Key_androidKt.Key(90);
    /* access modifiers changed from: private */
    public static final long MediaNext = Key_androidKt.Key(87);
    /* access modifiers changed from: private */
    public static final long MediaPause = Key_androidKt.Key(127);
    /* access modifiers changed from: private */
    public static final long MediaPlay = Key_androidKt.Key(126);
    /* access modifiers changed from: private */
    public static final long MediaPlayPause = Key_androidKt.Key(85);
    /* access modifiers changed from: private */
    public static final long MediaPrevious = Key_androidKt.Key(88);
    /* access modifiers changed from: private */
    public static final long MediaRecord = Key_androidKt.Key(130);
    /* access modifiers changed from: private */
    public static final long MediaRewind = Key_androidKt.Key(89);
    /* access modifiers changed from: private */
    public static final long MediaSkipBackward = Key_androidKt.Key(273);
    /* access modifiers changed from: private */
    public static final long MediaSkipForward = Key_androidKt.Key(272);
    /* access modifiers changed from: private */
    public static final long MediaStepBackward = Key_androidKt.Key(275);
    /* access modifiers changed from: private */
    public static final long MediaStepForward = Key_androidKt.Key(274);
    /* access modifiers changed from: private */
    public static final long MediaStop = Key_androidKt.Key(86);
    /* access modifiers changed from: private */
    public static final long MediaTopMenu = Key_androidKt.Key(OAuthErrorCodes.ERR_OAUTH_MISSING_TIMESTAMP);
    /* access modifiers changed from: private */
    public static final long Menu = Key_androidKt.Key(82);
    /* access modifiers changed from: private */
    public static final long MetaLeft = Key_androidKt.Key(117);
    /* access modifiers changed from: private */
    public static final long MetaRight = Key_androidKt.Key(118);
    /* access modifiers changed from: private */
    public static final long MicrophoneMute = Key_androidKt.Key(91);
    /* access modifiers changed from: private */
    public static final long Minus = Key_androidKt.Key(69);
    /* access modifiers changed from: private */
    public static final long MoveEnd = Key_androidKt.Key(123);
    /* access modifiers changed from: private */
    public static final long MoveHome = Key_androidKt.Key(122);
    /* access modifiers changed from: private */
    public static final long Muhenkan = Key_androidKt.Key(213);
    /* access modifiers changed from: private */
    public static final long Multiply = Key_androidKt.Key(17);
    /* access modifiers changed from: private */
    public static final long Music = Key_androidKt.Key(209);
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static final long f350N = Key_androidKt.Key(42);
    /* access modifiers changed from: private */
    public static final long NavigateIn = Key_androidKt.Key(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_SELECTED);
    /* access modifiers changed from: private */
    public static final long NavigateNext = Key_androidKt.Key(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED);
    /* access modifiers changed from: private */
    public static final long NavigateOut = Key_androidKt.Key(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_UNSELECTED);
    /* access modifiers changed from: private */
    public static final long NavigatePrevious = Key_androidKt.Key(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED);
    /* access modifiers changed from: private */
    public static final long Nine = Key_androidKt.Key(16);
    /* access modifiers changed from: private */
    public static final long Notification = Key_androidKt.Key(83);
    /* access modifiers changed from: private */
    public static final long NumLock = Key_androidKt.Key(143);
    /* access modifiers changed from: private */
    public static final long NumPad0 = Key_androidKt.Key(144);
    /* access modifiers changed from: private */
    public static final long NumPad1 = Key_androidKt.Key(145);
    /* access modifiers changed from: private */
    public static final long NumPad2 = Key_androidKt.Key(146);
    /* access modifiers changed from: private */
    public static final long NumPad3 = Key_androidKt.Key(147);
    /* access modifiers changed from: private */
    public static final long NumPad4 = Key_androidKt.Key(148);
    /* access modifiers changed from: private */
    public static final long NumPad5 = Key_androidKt.Key(149);
    /* access modifiers changed from: private */
    public static final long NumPad6 = Key_androidKt.Key(150);
    /* access modifiers changed from: private */
    public static final long NumPad7 = Key_androidKt.Key(151);
    /* access modifiers changed from: private */
    public static final long NumPad8 = Key_androidKt.Key(152);
    /* access modifiers changed from: private */
    public static final long NumPad9 = Key_androidKt.Key(153);
    /* access modifiers changed from: private */
    public static final long NumPadAdd = Key_androidKt.Key(157);
    /* access modifiers changed from: private */
    public static final long NumPadComma = Key_androidKt.Key(159);
    /* access modifiers changed from: private */
    public static final long NumPadDivide = Key_androidKt.Key(154);
    /* access modifiers changed from: private */
    public static final long NumPadDot = Key_androidKt.Key(158);
    /* access modifiers changed from: private */
    public static final long NumPadEnter = Key_androidKt.Key(160);
    /* access modifiers changed from: private */
    public static final long NumPadEquals = Key_androidKt.Key(161);
    /* access modifiers changed from: private */
    public static final long NumPadLeftParenthesis = Key_androidKt.Key(162);
    /* access modifiers changed from: private */
    public static final long NumPadMultiply = Key_androidKt.Key(155);
    /* access modifiers changed from: private */
    public static final long NumPadRightParenthesis = Key_androidKt.Key(163);
    /* access modifiers changed from: private */
    public static final long NumPadSubtract = Key_androidKt.Key(156);
    /* access modifiers changed from: private */
    public static final long Number = Key_androidKt.Key(78);
    /* access modifiers changed from: private */

    /* renamed from: O */
    public static final long f351O = Key_androidKt.Key(43);
    /* access modifiers changed from: private */
    public static final long One = Key_androidKt.Key(8);
    /* access modifiers changed from: private */

    /* renamed from: P */
    public static final long f352P = Key_androidKt.Key(44);
    /* access modifiers changed from: private */
    public static final long PageDown = Key_androidKt.Key(93);
    /* access modifiers changed from: private */
    public static final long PageUp = Key_androidKt.Key(92);
    /* access modifiers changed from: private */
    public static final long Pairing = Key_androidKt.Key(OAuthErrorCodes.ERR_OAUTH_MISSING_CONSUMER);
    /* access modifiers changed from: private */
    public static final long Paste = Key_androidKt.Key(279);
    /* access modifiers changed from: private */
    public static final long Period = Key_androidKt.Key(56);
    /* access modifiers changed from: private */
    public static final long PictureSymbols = Key_androidKt.Key(94);
    /* access modifiers changed from: private */
    public static final long Plus = Key_androidKt.Key(81);
    /* access modifiers changed from: private */
    public static final long Pound = Key_androidKt.Key(18);
    /* access modifiers changed from: private */
    public static final long Power = Key_androidKt.Key(26);
    /* access modifiers changed from: private */
    public static final long PrintScreen = Key_androidKt.Key(120);
    /* access modifiers changed from: private */
    public static final long ProfileSwitch = Key_androidKt.Key(288);
    /* access modifiers changed from: private */
    public static final long ProgramBlue = Key_androidKt.Key(186);
    /* access modifiers changed from: private */
    public static final long ProgramGreen = Key_androidKt.Key(184);
    /* access modifiers changed from: private */
    public static final long ProgramRed = Key_androidKt.Key(183);
    /* access modifiers changed from: private */
    public static final long ProgramYellow = Key_androidKt.Key(185);
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public static final long f353Q = Key_androidKt.Key(45);
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static final long f354R = Key_androidKt.Key(46);
    /* access modifiers changed from: private */
    public static final long Refresh = Key_androidKt.Key(285);
    /* access modifiers changed from: private */
    public static final long RightBracket = Key_androidKt.Key(72);
    /* access modifiers changed from: private */

    /* renamed from: Ro */
    public static final long f355Ro = Key_androidKt.Key(217);
    /* access modifiers changed from: private */

    /* renamed from: S */
    public static final long f356S = Key_androidKt.Key(47);
    /* access modifiers changed from: private */
    public static final long ScrollLock = Key_androidKt.Key(116);
    /* access modifiers changed from: private */
    public static final long Search = Key_androidKt.Key(84);
    /* access modifiers changed from: private */
    public static final long Semicolon = Key_androidKt.Key(74);
    /* access modifiers changed from: private */
    public static final long SetTopBoxInput = Key_androidKt.Key(180);
    /* access modifiers changed from: private */
    public static final long SetTopBoxPower = Key_androidKt.Key(179);
    /* access modifiers changed from: private */
    public static final long Settings = Key_androidKt.Key(176);
    /* access modifiers changed from: private */
    public static final long Seven = Key_androidKt.Key(14);
    /* access modifiers changed from: private */
    public static final long ShiftLeft = Key_androidKt.Key(59);
    /* access modifiers changed from: private */
    public static final long ShiftRight = Key_androidKt.Key(60);
    /* access modifiers changed from: private */
    public static final long Six = Key_androidKt.Key(13);
    /* access modifiers changed from: private */
    public static final long Slash = Key_androidKt.Key(76);
    /* access modifiers changed from: private */
    public static final long Sleep = Key_androidKt.Key(OAuthErrorCodes.ERR_OAUTH_VERSION);
    /* access modifiers changed from: private */
    public static final long SoftLeft = Key_androidKt.Key(1);
    /* access modifiers changed from: private */
    public static final long SoftRight = Key_androidKt.Key(2);
    /* access modifiers changed from: private */
    public static final long SoftSleep = Key_androidKt.Key(276);
    /* access modifiers changed from: private */
    public static final long Spacebar = Key_androidKt.Key(62);
    /* access modifiers changed from: private */
    public static final long Stem1 = Key_androidKt.Key(265);
    /* access modifiers changed from: private */
    public static final long Stem2 = Key_androidKt.Key(266);
    /* access modifiers changed from: private */
    public static final long Stem3 = Key_androidKt.Key(267);
    /* access modifiers changed from: private */
    public static final long StemPrimary = Key_androidKt.Key(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_ANOTHER_SELECTED);
    /* access modifiers changed from: private */
    public static final long SwitchCharset = Key_androidKt.Key(95);
    /* access modifiers changed from: private */
    public static final long Symbol = Key_androidKt.Key(63);
    /* access modifiers changed from: private */
    public static final long SystemNavigationDown = Key_androidKt.Key(281);
    /* access modifiers changed from: private */
    public static final long SystemNavigationLeft = Key_androidKt.Key(282);
    /* access modifiers changed from: private */
    public static final long SystemNavigationRight = Key_androidKt.Key(283);
    /* access modifiers changed from: private */
    public static final long SystemNavigationUp = Key_androidKt.Key(280);
    /* access modifiers changed from: private */

    /* renamed from: T */
    public static final long f357T = Key_androidKt.Key(48);
    /* access modifiers changed from: private */
    public static final long Tab = Key_androidKt.Key(61);
    /* access modifiers changed from: private */
    public static final long Three = Key_androidKt.Key(10);
    /* access modifiers changed from: private */
    public static final long ThumbsDown = Key_androidKt.Key(287);
    /* access modifiers changed from: private */
    public static final long ThumbsUp = Key_androidKt.Key(286);
    /* access modifiers changed from: private */
    public static final long Toggle2D3D = Key_androidKt.Key(ComposerKt.referenceKey);
    /* access modifiers changed from: private */

    /* renamed from: Tv */
    public static final long f358Tv = Key_androidKt.Key(170);
    /* access modifiers changed from: private */
    public static final long TvAntennaCable = Key_androidKt.Key(242);
    /* access modifiers changed from: private */
    public static final long TvAudioDescription = Key_androidKt.Key(252);
    /* access modifiers changed from: private */
    public static final long TvAudioDescriptionMixingVolumeDown = Key_androidKt.Key(254);
    /* access modifiers changed from: private */
    public static final long TvAudioDescriptionMixingVolumeUp = Key_androidKt.Key(253);
    /* access modifiers changed from: private */
    public static final long TvContentsMenu = Key_androidKt.Key(256);
    /* access modifiers changed from: private */
    public static final long TvDataService = Key_androidKt.Key(230);
    /* access modifiers changed from: private */
    public static final long TvInput = Key_androidKt.Key(178);
    /* access modifiers changed from: private */
    public static final long TvInputComponent1 = Key_androidKt.Key(249);
    /* access modifiers changed from: private */
    public static final long TvInputComponent2 = Key_androidKt.Key(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    /* access modifiers changed from: private */
    public static final long TvInputComposite1 = Key_androidKt.Key(247);
    /* access modifiers changed from: private */
    public static final long TvInputComposite2 = Key_androidKt.Key(248);
    /* access modifiers changed from: private */
    public static final long TvInputHdmi1 = Key_androidKt.Key(243);
    /* access modifiers changed from: private */
    public static final long TvInputHdmi2 = Key_androidKt.Key(244);
    /* access modifiers changed from: private */
    public static final long TvInputHdmi3 = Key_androidKt.Key(245);
    /* access modifiers changed from: private */
    public static final long TvInputHdmi4 = Key_androidKt.Key(246);
    /* access modifiers changed from: private */
    public static final long TvInputVga1 = Key_androidKt.Key(251);
    /* access modifiers changed from: private */
    public static final long TvMediaContextMenu = Key_androidKt.Key(257);
    /* access modifiers changed from: private */
    public static final long TvNetwork = Key_androidKt.Key(241);
    /* access modifiers changed from: private */
    public static final long TvNumberEntry = Key_androidKt.Key(234);
    /* access modifiers changed from: private */
    public static final long TvPower = Key_androidKt.Key(177);
    /* access modifiers changed from: private */
    public static final long TvRadioService = Key_androidKt.Key(232);
    /* access modifiers changed from: private */
    public static final long TvSatellite = Key_androidKt.Key(237);
    /* access modifiers changed from: private */
    public static final long TvSatelliteBs = Key_androidKt.Key(238);
    /* access modifiers changed from: private */
    public static final long TvSatelliteCs = Key_androidKt.Key(239);
    /* access modifiers changed from: private */
    public static final long TvSatelliteService = Key_androidKt.Key(OAuthErrorCodes.ERR_OAUTH_HEADERS);
    /* access modifiers changed from: private */
    public static final long TvTeletext = Key_androidKt.Key(233);
    /* access modifiers changed from: private */
    public static final long TvTerrestrialAnalog = Key_androidKt.Key(235);
    /* access modifiers changed from: private */
    public static final long TvTerrestrialDigital = Key_androidKt.Key(236);
    /* access modifiers changed from: private */
    public static final long TvTimerProgramming = Key_androidKt.Key(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_REMOVED);
    /* access modifiers changed from: private */
    public static final long TvZoomMode = Key_androidKt.Key(255);
    /* access modifiers changed from: private */
    public static final long Two = Key_androidKt.Key(9);
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static final long f359U = Key_androidKt.Key(49);
    /* access modifiers changed from: private */
    public static final long Unknown = Key_androidKt.Key(0);
    /* access modifiers changed from: private */

    /* renamed from: V */
    public static final long f360V = Key_androidKt.Key(50);
    /* access modifiers changed from: private */
    public static final long VoiceAssist = Key_androidKt.Key(231);
    /* access modifiers changed from: private */
    public static final long VolumeDown = Key_androidKt.Key(25);
    /* access modifiers changed from: private */
    public static final long VolumeMute = Key_androidKt.Key(164);
    /* access modifiers changed from: private */
    public static final long VolumeUp = Key_androidKt.Key(24);
    /* access modifiers changed from: private */

    /* renamed from: W */
    public static final long f361W = Key_androidKt.Key(51);
    /* access modifiers changed from: private */
    public static final long WakeUp = Key_androidKt.Key(OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER);
    /* access modifiers changed from: private */
    public static final long Window = Key_androidKt.Key(171);
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final long f362X = Key_androidKt.Key(52);
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static final long f363Y = Key_androidKt.Key(53);
    /* access modifiers changed from: private */
    public static final long Yen = Key_androidKt.Key(216);
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static final long f364Z = Key_androidKt.Key(54);
    /* access modifiers changed from: private */
    public static final long ZenkakuHankaru = Key_androidKt.Key(211);
    /* access modifiers changed from: private */
    public static final long Zero = Key_androidKt.Key(7);
    /* access modifiers changed from: private */
    public static final long ZoomIn = Key_androidKt.Key(168);
    /* access modifiers changed from: private */
    public static final long ZoomOut = Key_androidKt.Key(169);
    private final long keyCode;

    private /* synthetic */ Key(long j) {
        this.keyCode = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Key m36428boximpl(long j) {
        return new Key(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36430equalsimpl(long j, Object obj) {
        if ((obj instanceof Key) && j == ((Key) obj).m36434unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36431equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36432hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36433toStringimpl(long j) {
        return "Key code: " + j;
    }

    public boolean equals(Object obj) {
        return m36430equalsimpl(this.keyCode, obj);
    }

    public final long getKeyCode() {
        return this.keyCode;
    }

    public int hashCode() {
        return m36432hashCodeimpl(this.keyCode);
    }

    public String toString() {
        return m36433toStringimpl(this.keyCode);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m36434unboximpl() {
        return this.keyCode;
    }

    /* renamed from: androidx.compose.ui.input.key.Key$Companion */
    /* compiled from: Key.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getA-EK5gGoQ  reason: not valid java name */
        public final long m36722getAEK5gGoQ() {
            return Key.f327A;
        }

        /* renamed from: getAllApps-EK5gGoQ  reason: not valid java name */
        public final long m36723getAllAppsEK5gGoQ() {
            return Key.AllApps;
        }

        /* renamed from: getAltLeft-EK5gGoQ  reason: not valid java name */
        public final long m36724getAltLeftEK5gGoQ() {
            return Key.AltLeft;
        }

        /* renamed from: getAltRight-EK5gGoQ  reason: not valid java name */
        public final long m36725getAltRightEK5gGoQ() {
            return Key.AltRight;
        }

        /* renamed from: getApostrophe-EK5gGoQ  reason: not valid java name */
        public final long m36726getApostropheEK5gGoQ() {
            return Key.Apostrophe;
        }

        /* renamed from: getAppSwitch-EK5gGoQ  reason: not valid java name */
        public final long m36727getAppSwitchEK5gGoQ() {
            return Key.AppSwitch;
        }

        /* renamed from: getAssist-EK5gGoQ  reason: not valid java name */
        public final long m36728getAssistEK5gGoQ() {
            return Key.Assist;
        }

        /* renamed from: getAt-EK5gGoQ  reason: not valid java name */
        public final long m36729getAtEK5gGoQ() {
            return Key.f328At;
        }

        /* renamed from: getAvReceiverInput-EK5gGoQ  reason: not valid java name */
        public final long m36730getAvReceiverInputEK5gGoQ() {
            return Key.AvReceiverInput;
        }

        /* renamed from: getAvReceiverPower-EK5gGoQ  reason: not valid java name */
        public final long m36731getAvReceiverPowerEK5gGoQ() {
            return Key.AvReceiverPower;
        }

        /* renamed from: getB-EK5gGoQ  reason: not valid java name */
        public final long m36732getBEK5gGoQ() {
            return Key.f329B;
        }

        /* renamed from: getBack-EK5gGoQ  reason: not valid java name */
        public final long m36733getBackEK5gGoQ() {
            return Key.Back;
        }

        /* renamed from: getBackslash-EK5gGoQ  reason: not valid java name */
        public final long m36734getBackslashEK5gGoQ() {
            return Key.Backslash;
        }

        /* renamed from: getBackspace-EK5gGoQ  reason: not valid java name */
        public final long m36735getBackspaceEK5gGoQ() {
            return Key.Backspace;
        }

        /* renamed from: getBookmark-EK5gGoQ  reason: not valid java name */
        public final long m36736getBookmarkEK5gGoQ() {
            return Key.Bookmark;
        }

        /* renamed from: getBreak-EK5gGoQ  reason: not valid java name */
        public final long m36737getBreakEK5gGoQ() {
            return Key.Break;
        }

        /* renamed from: getBrightnessDown-EK5gGoQ  reason: not valid java name */
        public final long m36738getBrightnessDownEK5gGoQ() {
            return Key.BrightnessDown;
        }

        /* renamed from: getBrightnessUp-EK5gGoQ  reason: not valid java name */
        public final long m36739getBrightnessUpEK5gGoQ() {
            return Key.BrightnessUp;
        }

        /* renamed from: getBrowser-EK5gGoQ  reason: not valid java name */
        public final long m36740getBrowserEK5gGoQ() {
            return Key.Browser;
        }

        /* renamed from: getButton1-EK5gGoQ  reason: not valid java name */
        public final long m36741getButton1EK5gGoQ() {
            return Key.Button1;
        }

        /* renamed from: getButton10-EK5gGoQ  reason: not valid java name */
        public final long m36742getButton10EK5gGoQ() {
            return Key.Button10;
        }

        /* renamed from: getButton11-EK5gGoQ  reason: not valid java name */
        public final long m36743getButton11EK5gGoQ() {
            return Key.Button11;
        }

        /* renamed from: getButton12-EK5gGoQ  reason: not valid java name */
        public final long m36744getButton12EK5gGoQ() {
            return Key.Button12;
        }

        /* renamed from: getButton13-EK5gGoQ  reason: not valid java name */
        public final long m36745getButton13EK5gGoQ() {
            return Key.Button13;
        }

        /* renamed from: getButton14-EK5gGoQ  reason: not valid java name */
        public final long m36746getButton14EK5gGoQ() {
            return Key.Button14;
        }

        /* renamed from: getButton15-EK5gGoQ  reason: not valid java name */
        public final long m36747getButton15EK5gGoQ() {
            return Key.Button15;
        }

        /* renamed from: getButton16-EK5gGoQ  reason: not valid java name */
        public final long m36748getButton16EK5gGoQ() {
            return Key.Button16;
        }

        /* renamed from: getButton2-EK5gGoQ  reason: not valid java name */
        public final long m36749getButton2EK5gGoQ() {
            return Key.Button2;
        }

        /* renamed from: getButton3-EK5gGoQ  reason: not valid java name */
        public final long m36750getButton3EK5gGoQ() {
            return Key.Button3;
        }

        /* renamed from: getButton4-EK5gGoQ  reason: not valid java name */
        public final long m36751getButton4EK5gGoQ() {
            return Key.Button4;
        }

        /* renamed from: getButton5-EK5gGoQ  reason: not valid java name */
        public final long m36752getButton5EK5gGoQ() {
            return Key.Button5;
        }

        /* renamed from: getButton6-EK5gGoQ  reason: not valid java name */
        public final long m36753getButton6EK5gGoQ() {
            return Key.Button6;
        }

        /* renamed from: getButton7-EK5gGoQ  reason: not valid java name */
        public final long m36754getButton7EK5gGoQ() {
            return Key.Button7;
        }

        /* renamed from: getButton8-EK5gGoQ  reason: not valid java name */
        public final long m36755getButton8EK5gGoQ() {
            return Key.Button8;
        }

        /* renamed from: getButton9-EK5gGoQ  reason: not valid java name */
        public final long m36756getButton9EK5gGoQ() {
            return Key.Button9;
        }

        /* renamed from: getButtonA-EK5gGoQ  reason: not valid java name */
        public final long m36757getButtonAEK5gGoQ() {
            return Key.ButtonA;
        }

        /* renamed from: getButtonB-EK5gGoQ  reason: not valid java name */
        public final long m36758getButtonBEK5gGoQ() {
            return Key.ButtonB;
        }

        /* renamed from: getButtonC-EK5gGoQ  reason: not valid java name */
        public final long m36759getButtonCEK5gGoQ() {
            return Key.ButtonC;
        }

        /* renamed from: getButtonL1-EK5gGoQ  reason: not valid java name */
        public final long m36760getButtonL1EK5gGoQ() {
            return Key.ButtonL1;
        }

        /* renamed from: getButtonL2-EK5gGoQ  reason: not valid java name */
        public final long m36761getButtonL2EK5gGoQ() {
            return Key.ButtonL2;
        }

        /* renamed from: getButtonMode-EK5gGoQ  reason: not valid java name */
        public final long m36762getButtonModeEK5gGoQ() {
            return Key.ButtonMode;
        }

        /* renamed from: getButtonR1-EK5gGoQ  reason: not valid java name */
        public final long m36763getButtonR1EK5gGoQ() {
            return Key.ButtonR1;
        }

        /* renamed from: getButtonR2-EK5gGoQ  reason: not valid java name */
        public final long m36764getButtonR2EK5gGoQ() {
            return Key.ButtonR2;
        }

        /* renamed from: getButtonSelect-EK5gGoQ  reason: not valid java name */
        public final long m36765getButtonSelectEK5gGoQ() {
            return Key.ButtonSelect;
        }

        /* renamed from: getButtonStart-EK5gGoQ  reason: not valid java name */
        public final long m36766getButtonStartEK5gGoQ() {
            return Key.ButtonStart;
        }

        /* renamed from: getButtonThumbLeft-EK5gGoQ  reason: not valid java name */
        public final long m36767getButtonThumbLeftEK5gGoQ() {
            return Key.ButtonThumbLeft;
        }

        /* renamed from: getButtonThumbRight-EK5gGoQ  reason: not valid java name */
        public final long m36768getButtonThumbRightEK5gGoQ() {
            return Key.ButtonThumbRight;
        }

        /* renamed from: getButtonX-EK5gGoQ  reason: not valid java name */
        public final long m36769getButtonXEK5gGoQ() {
            return Key.ButtonX;
        }

        /* renamed from: getButtonY-EK5gGoQ  reason: not valid java name */
        public final long m36770getButtonYEK5gGoQ() {
            return Key.ButtonY;
        }

        /* renamed from: getButtonZ-EK5gGoQ  reason: not valid java name */
        public final long m36771getButtonZEK5gGoQ() {
            return Key.ButtonZ;
        }

        /* renamed from: getC-EK5gGoQ  reason: not valid java name */
        public final long m36772getCEK5gGoQ() {
            return Key.f330C;
        }

        /* renamed from: getCalculator-EK5gGoQ  reason: not valid java name */
        public final long m36773getCalculatorEK5gGoQ() {
            return Key.Calculator;
        }

        /* renamed from: getCalendar-EK5gGoQ  reason: not valid java name */
        public final long m36774getCalendarEK5gGoQ() {
            return Key.Calendar;
        }

        /* renamed from: getCall-EK5gGoQ  reason: not valid java name */
        public final long m36775getCallEK5gGoQ() {
            return Key.Call;
        }

        /* renamed from: getCamera-EK5gGoQ  reason: not valid java name */
        public final long m36776getCameraEK5gGoQ() {
            return Key.Camera;
        }

        /* renamed from: getCapsLock-EK5gGoQ  reason: not valid java name */
        public final long m36777getCapsLockEK5gGoQ() {
            return Key.CapsLock;
        }

        /* renamed from: getCaptions-EK5gGoQ  reason: not valid java name */
        public final long m36778getCaptionsEK5gGoQ() {
            return Key.Captions;
        }

        /* renamed from: getChannelDown-EK5gGoQ  reason: not valid java name */
        public final long m36779getChannelDownEK5gGoQ() {
            return Key.ChannelDown;
        }

        /* renamed from: getChannelUp-EK5gGoQ  reason: not valid java name */
        public final long m36780getChannelUpEK5gGoQ() {
            return Key.ChannelUp;
        }

        /* renamed from: getClear-EK5gGoQ  reason: not valid java name */
        public final long m36781getClearEK5gGoQ() {
            return Key.Clear;
        }

        /* renamed from: getComma-EK5gGoQ  reason: not valid java name */
        public final long m36782getCommaEK5gGoQ() {
            return Key.Comma;
        }

        /* renamed from: getContacts-EK5gGoQ  reason: not valid java name */
        public final long m36783getContactsEK5gGoQ() {
            return Key.Contacts;
        }

        /* renamed from: getCopy-EK5gGoQ  reason: not valid java name */
        public final long m36784getCopyEK5gGoQ() {
            return Key.Copy;
        }

        /* renamed from: getCtrlLeft-EK5gGoQ  reason: not valid java name */
        public final long m36785getCtrlLeftEK5gGoQ() {
            return Key.CtrlLeft;
        }

        /* renamed from: getCtrlRight-EK5gGoQ  reason: not valid java name */
        public final long m36786getCtrlRightEK5gGoQ() {
            return Key.CtrlRight;
        }

        /* renamed from: getCut-EK5gGoQ  reason: not valid java name */
        public final long m36787getCutEK5gGoQ() {
            return Key.Cut;
        }

        /* renamed from: getD-EK5gGoQ  reason: not valid java name */
        public final long m36788getDEK5gGoQ() {
            return Key.f331D;
        }

        /* renamed from: getDelete-EK5gGoQ  reason: not valid java name */
        public final long m36789getDeleteEK5gGoQ() {
            return Key.Delete;
        }

        /* renamed from: getDirectionCenter-EK5gGoQ  reason: not valid java name */
        public final long m36790getDirectionCenterEK5gGoQ() {
            return Key.DirectionCenter;
        }

        /* renamed from: getDirectionDown-EK5gGoQ  reason: not valid java name */
        public final long m36791getDirectionDownEK5gGoQ() {
            return Key.DirectionDown;
        }

        /* renamed from: getDirectionDownLeft-EK5gGoQ  reason: not valid java name */
        public final long m36792getDirectionDownLeftEK5gGoQ() {
            return Key.DirectionDownLeft;
        }

        /* renamed from: getDirectionDownRight-EK5gGoQ  reason: not valid java name */
        public final long m36793getDirectionDownRightEK5gGoQ() {
            return Key.DirectionDownRight;
        }

        /* renamed from: getDirectionLeft-EK5gGoQ  reason: not valid java name */
        public final long m36794getDirectionLeftEK5gGoQ() {
            return Key.DirectionLeft;
        }

        /* renamed from: getDirectionRight-EK5gGoQ  reason: not valid java name */
        public final long m36795getDirectionRightEK5gGoQ() {
            return Key.DirectionRight;
        }

        /* renamed from: getDirectionUp-EK5gGoQ  reason: not valid java name */
        public final long m36796getDirectionUpEK5gGoQ() {
            return Key.DirectionUp;
        }

        /* renamed from: getDirectionUpLeft-EK5gGoQ  reason: not valid java name */
        public final long m36797getDirectionUpLeftEK5gGoQ() {
            return Key.DirectionUpLeft;
        }

        /* renamed from: getDirectionUpRight-EK5gGoQ  reason: not valid java name */
        public final long m36798getDirectionUpRightEK5gGoQ() {
            return Key.DirectionUpRight;
        }

        /* renamed from: getDvr-EK5gGoQ  reason: not valid java name */
        public final long m36799getDvrEK5gGoQ() {
            return Key.Dvr;
        }

        /* renamed from: getE-EK5gGoQ  reason: not valid java name */
        public final long m36800getEEK5gGoQ() {
            return Key.f332E;
        }

        /* renamed from: getEight-EK5gGoQ  reason: not valid java name */
        public final long m36801getEightEK5gGoQ() {
            return Key.Eight;
        }

        /* renamed from: getEisu-EK5gGoQ  reason: not valid java name */
        public final long m36802getEisuEK5gGoQ() {
            return Key.Eisu;
        }

        /* renamed from: getEndCall-EK5gGoQ  reason: not valid java name */
        public final long m36803getEndCallEK5gGoQ() {
            return Key.EndCall;
        }

        /* renamed from: getEnter-EK5gGoQ  reason: not valid java name */
        public final long m36804getEnterEK5gGoQ() {
            return Key.Enter;
        }

        /* renamed from: getEnvelope-EK5gGoQ  reason: not valid java name */
        public final long m36805getEnvelopeEK5gGoQ() {
            return Key.Envelope;
        }

        /* renamed from: getEquals-EK5gGoQ  reason: not valid java name */
        public final long m36806getEqualsEK5gGoQ() {
            return Key.Equals;
        }

        /* renamed from: getEscape-EK5gGoQ  reason: not valid java name */
        public final long m36807getEscapeEK5gGoQ() {
            return Key.Escape;
        }

        /* renamed from: getF-EK5gGoQ  reason: not valid java name */
        public final long m36808getFEK5gGoQ() {
            return Key.f333F;
        }

        /* renamed from: getF1-EK5gGoQ  reason: not valid java name */
        public final long m36809getF1EK5gGoQ() {
            return Key.f334F1;
        }

        /* renamed from: getF10-EK5gGoQ  reason: not valid java name */
        public final long m36810getF10EK5gGoQ() {
            return Key.F10;
        }

        /* renamed from: getF11-EK5gGoQ  reason: not valid java name */
        public final long m36811getF11EK5gGoQ() {
            return Key.F11;
        }

        /* renamed from: getF12-EK5gGoQ  reason: not valid java name */
        public final long m36812getF12EK5gGoQ() {
            return Key.F12;
        }

        /* renamed from: getF2-EK5gGoQ  reason: not valid java name */
        public final long m36813getF2EK5gGoQ() {
            return Key.f335F2;
        }

        /* renamed from: getF3-EK5gGoQ  reason: not valid java name */
        public final long m36814getF3EK5gGoQ() {
            return Key.f336F3;
        }

        /* renamed from: getF4-EK5gGoQ  reason: not valid java name */
        public final long m36815getF4EK5gGoQ() {
            return Key.f337F4;
        }

        /* renamed from: getF5-EK5gGoQ  reason: not valid java name */
        public final long m36816getF5EK5gGoQ() {
            return Key.f338F5;
        }

        /* renamed from: getF6-EK5gGoQ  reason: not valid java name */
        public final long m36817getF6EK5gGoQ() {
            return Key.f339F6;
        }

        /* renamed from: getF7-EK5gGoQ  reason: not valid java name */
        public final long m36818getF7EK5gGoQ() {
            return Key.f340F7;
        }

        /* renamed from: getF8-EK5gGoQ  reason: not valid java name */
        public final long m36819getF8EK5gGoQ() {
            return Key.f341F8;
        }

        /* renamed from: getF9-EK5gGoQ  reason: not valid java name */
        public final long m36820getF9EK5gGoQ() {
            return Key.f342F9;
        }

        /* renamed from: getFive-EK5gGoQ  reason: not valid java name */
        public final long m36821getFiveEK5gGoQ() {
            return Key.Five;
        }

        /* renamed from: getFocus-EK5gGoQ  reason: not valid java name */
        public final long m36822getFocusEK5gGoQ() {
            return Key.Focus;
        }

        /* renamed from: getForward-EK5gGoQ  reason: not valid java name */
        public final long m36823getForwardEK5gGoQ() {
            return Key.Forward;
        }

        /* renamed from: getFour-EK5gGoQ  reason: not valid java name */
        public final long m36824getFourEK5gGoQ() {
            return Key.Four;
        }

        /* renamed from: getFunction-EK5gGoQ  reason: not valid java name */
        public final long m36825getFunctionEK5gGoQ() {
            return Key.Function;
        }

        /* renamed from: getG-EK5gGoQ  reason: not valid java name */
        public final long m36826getGEK5gGoQ() {
            return Key.f343G;
        }

        /* renamed from: getGrave-EK5gGoQ  reason: not valid java name */
        public final long m36827getGraveEK5gGoQ() {
            return Key.Grave;
        }

        /* renamed from: getGuide-EK5gGoQ  reason: not valid java name */
        public final long m36828getGuideEK5gGoQ() {
            return Key.Guide;
        }

        /* renamed from: getH-EK5gGoQ  reason: not valid java name */
        public final long m36829getHEK5gGoQ() {
            return Key.f344H;
        }

        /* renamed from: getHeadsetHook-EK5gGoQ  reason: not valid java name */
        public final long m36830getHeadsetHookEK5gGoQ() {
            return Key.HeadsetHook;
        }

        /* renamed from: getHelp-EK5gGoQ  reason: not valid java name */
        public final long m36831getHelpEK5gGoQ() {
            return Key.Help;
        }

        /* renamed from: getHenkan-EK5gGoQ  reason: not valid java name */
        public final long m36832getHenkanEK5gGoQ() {
            return Key.Henkan;
        }

        /* renamed from: getHome-EK5gGoQ  reason: not valid java name */
        public final long m36833getHomeEK5gGoQ() {
            return Key.Home;
        }

        /* renamed from: getI-EK5gGoQ  reason: not valid java name */
        public final long m36834getIEK5gGoQ() {
            return Key.f345I;
        }

        /* renamed from: getInfo-EK5gGoQ  reason: not valid java name */
        public final long m36835getInfoEK5gGoQ() {
            return Key.Info;
        }

        /* renamed from: getInsert-EK5gGoQ  reason: not valid java name */
        public final long m36836getInsertEK5gGoQ() {
            return Key.Insert;
        }

        /* renamed from: getJ-EK5gGoQ  reason: not valid java name */
        public final long m36837getJEK5gGoQ() {
            return Key.f346J;
        }

        /* renamed from: getK-EK5gGoQ  reason: not valid java name */
        public final long m36838getKEK5gGoQ() {
            return Key.f347K;
        }

        /* renamed from: getKana-EK5gGoQ  reason: not valid java name */
        public final long m36839getKanaEK5gGoQ() {
            return Key.Kana;
        }

        /* renamed from: getKatakanaHiragana-EK5gGoQ  reason: not valid java name */
        public final long m36840getKatakanaHiraganaEK5gGoQ() {
            return Key.KatakanaHiragana;
        }

        /* renamed from: getL-EK5gGoQ  reason: not valid java name */
        public final long m36841getLEK5gGoQ() {
            return Key.f348L;
        }

        /* renamed from: getLanguageSwitch-EK5gGoQ  reason: not valid java name */
        public final long m36842getLanguageSwitchEK5gGoQ() {
            return Key.LanguageSwitch;
        }

        /* renamed from: getLastChannel-EK5gGoQ  reason: not valid java name */
        public final long m36843getLastChannelEK5gGoQ() {
            return Key.LastChannel;
        }

        /* renamed from: getLeftBracket-EK5gGoQ  reason: not valid java name */
        public final long m36844getLeftBracketEK5gGoQ() {
            return Key.LeftBracket;
        }

        /* renamed from: getM-EK5gGoQ  reason: not valid java name */
        public final long m36845getMEK5gGoQ() {
            return Key.f349M;
        }

        /* renamed from: getMannerMode-EK5gGoQ  reason: not valid java name */
        public final long m36846getMannerModeEK5gGoQ() {
            return Key.MannerMode;
        }

        /* renamed from: getMediaAudioTrack-EK5gGoQ  reason: not valid java name */
        public final long m36847getMediaAudioTrackEK5gGoQ() {
            return Key.MediaAudioTrack;
        }

        /* renamed from: getMediaClose-EK5gGoQ  reason: not valid java name */
        public final long m36848getMediaCloseEK5gGoQ() {
            return Key.MediaClose;
        }

        /* renamed from: getMediaEject-EK5gGoQ  reason: not valid java name */
        public final long m36849getMediaEjectEK5gGoQ() {
            return Key.MediaEject;
        }

        /* renamed from: getMediaFastForward-EK5gGoQ  reason: not valid java name */
        public final long m36850getMediaFastForwardEK5gGoQ() {
            return Key.MediaFastForward;
        }

        /* renamed from: getMediaNext-EK5gGoQ  reason: not valid java name */
        public final long m36851getMediaNextEK5gGoQ() {
            return Key.MediaNext;
        }

        /* renamed from: getMediaPause-EK5gGoQ  reason: not valid java name */
        public final long m36852getMediaPauseEK5gGoQ() {
            return Key.MediaPause;
        }

        /* renamed from: getMediaPlay-EK5gGoQ  reason: not valid java name */
        public final long m36853getMediaPlayEK5gGoQ() {
            return Key.MediaPlay;
        }

        /* renamed from: getMediaPlayPause-EK5gGoQ  reason: not valid java name */
        public final long m36854getMediaPlayPauseEK5gGoQ() {
            return Key.MediaPlayPause;
        }

        /* renamed from: getMediaPrevious-EK5gGoQ  reason: not valid java name */
        public final long m36855getMediaPreviousEK5gGoQ() {
            return Key.MediaPrevious;
        }

        /* renamed from: getMediaRecord-EK5gGoQ  reason: not valid java name */
        public final long m36856getMediaRecordEK5gGoQ() {
            return Key.MediaRecord;
        }

        /* renamed from: getMediaRewind-EK5gGoQ  reason: not valid java name */
        public final long m36857getMediaRewindEK5gGoQ() {
            return Key.MediaRewind;
        }

        /* renamed from: getMediaSkipBackward-EK5gGoQ  reason: not valid java name */
        public final long m36858getMediaSkipBackwardEK5gGoQ() {
            return Key.MediaSkipBackward;
        }

        /* renamed from: getMediaSkipForward-EK5gGoQ  reason: not valid java name */
        public final long m36859getMediaSkipForwardEK5gGoQ() {
            return Key.MediaSkipForward;
        }

        /* renamed from: getMediaStepBackward-EK5gGoQ  reason: not valid java name */
        public final long m36860getMediaStepBackwardEK5gGoQ() {
            return Key.MediaStepBackward;
        }

        /* renamed from: getMediaStepForward-EK5gGoQ  reason: not valid java name */
        public final long m36861getMediaStepForwardEK5gGoQ() {
            return Key.MediaStepForward;
        }

        /* renamed from: getMediaStop-EK5gGoQ  reason: not valid java name */
        public final long m36862getMediaStopEK5gGoQ() {
            return Key.MediaStop;
        }

        /* renamed from: getMediaTopMenu-EK5gGoQ  reason: not valid java name */
        public final long m36863getMediaTopMenuEK5gGoQ() {
            return Key.MediaTopMenu;
        }

        /* renamed from: getMenu-EK5gGoQ  reason: not valid java name */
        public final long m36864getMenuEK5gGoQ() {
            return Key.Menu;
        }

        /* renamed from: getMetaLeft-EK5gGoQ  reason: not valid java name */
        public final long m36865getMetaLeftEK5gGoQ() {
            return Key.MetaLeft;
        }

        /* renamed from: getMetaRight-EK5gGoQ  reason: not valid java name */
        public final long m36866getMetaRightEK5gGoQ() {
            return Key.MetaRight;
        }

        /* renamed from: getMicrophoneMute-EK5gGoQ  reason: not valid java name */
        public final long m36867getMicrophoneMuteEK5gGoQ() {
            return Key.MicrophoneMute;
        }

        /* renamed from: getMinus-EK5gGoQ  reason: not valid java name */
        public final long m36868getMinusEK5gGoQ() {
            return Key.Minus;
        }

        /* renamed from: getMoveEnd-EK5gGoQ  reason: not valid java name */
        public final long m36869getMoveEndEK5gGoQ() {
            return Key.MoveEnd;
        }

        /* renamed from: getMoveHome-EK5gGoQ  reason: not valid java name */
        public final long m36870getMoveHomeEK5gGoQ() {
            return Key.MoveHome;
        }

        /* renamed from: getMuhenkan-EK5gGoQ  reason: not valid java name */
        public final long m36871getMuhenkanEK5gGoQ() {
            return Key.Muhenkan;
        }

        /* renamed from: getMultiply-EK5gGoQ  reason: not valid java name */
        public final long m36872getMultiplyEK5gGoQ() {
            return Key.Multiply;
        }

        /* renamed from: getMusic-EK5gGoQ  reason: not valid java name */
        public final long m36873getMusicEK5gGoQ() {
            return Key.Music;
        }

        /* renamed from: getN-EK5gGoQ  reason: not valid java name */
        public final long m36874getNEK5gGoQ() {
            return Key.f350N;
        }

        /* renamed from: getNavigateIn-EK5gGoQ  reason: not valid java name */
        public final long m36875getNavigateInEK5gGoQ() {
            return Key.NavigateIn;
        }

        /* renamed from: getNavigateNext-EK5gGoQ  reason: not valid java name */
        public final long m36876getNavigateNextEK5gGoQ() {
            return Key.NavigateNext;
        }

        /* renamed from: getNavigateOut-EK5gGoQ  reason: not valid java name */
        public final long m36877getNavigateOutEK5gGoQ() {
            return Key.NavigateOut;
        }

        /* renamed from: getNavigatePrevious-EK5gGoQ  reason: not valid java name */
        public final long m36878getNavigatePreviousEK5gGoQ() {
            return Key.NavigatePrevious;
        }

        /* renamed from: getNine-EK5gGoQ  reason: not valid java name */
        public final long m36879getNineEK5gGoQ() {
            return Key.Nine;
        }

        /* renamed from: getNotification-EK5gGoQ  reason: not valid java name */
        public final long m36880getNotificationEK5gGoQ() {
            return Key.Notification;
        }

        /* renamed from: getNumLock-EK5gGoQ  reason: not valid java name */
        public final long m36881getNumLockEK5gGoQ() {
            return Key.NumLock;
        }

        /* renamed from: getNumPad0-EK5gGoQ  reason: not valid java name */
        public final long m36882getNumPad0EK5gGoQ() {
            return Key.NumPad0;
        }

        /* renamed from: getNumPad1-EK5gGoQ  reason: not valid java name */
        public final long m36883getNumPad1EK5gGoQ() {
            return Key.NumPad1;
        }

        /* renamed from: getNumPad2-EK5gGoQ  reason: not valid java name */
        public final long m36884getNumPad2EK5gGoQ() {
            return Key.NumPad2;
        }

        /* renamed from: getNumPad3-EK5gGoQ  reason: not valid java name */
        public final long m36885getNumPad3EK5gGoQ() {
            return Key.NumPad3;
        }

        /* renamed from: getNumPad4-EK5gGoQ  reason: not valid java name */
        public final long m36886getNumPad4EK5gGoQ() {
            return Key.NumPad4;
        }

        /* renamed from: getNumPad5-EK5gGoQ  reason: not valid java name */
        public final long m36887getNumPad5EK5gGoQ() {
            return Key.NumPad5;
        }

        /* renamed from: getNumPad6-EK5gGoQ  reason: not valid java name */
        public final long m36888getNumPad6EK5gGoQ() {
            return Key.NumPad6;
        }

        /* renamed from: getNumPad7-EK5gGoQ  reason: not valid java name */
        public final long m36889getNumPad7EK5gGoQ() {
            return Key.NumPad7;
        }

        /* renamed from: getNumPad8-EK5gGoQ  reason: not valid java name */
        public final long m36890getNumPad8EK5gGoQ() {
            return Key.NumPad8;
        }

        /* renamed from: getNumPad9-EK5gGoQ  reason: not valid java name */
        public final long m36891getNumPad9EK5gGoQ() {
            return Key.NumPad9;
        }

        /* renamed from: getNumPadAdd-EK5gGoQ  reason: not valid java name */
        public final long m36892getNumPadAddEK5gGoQ() {
            return Key.NumPadAdd;
        }

        /* renamed from: getNumPadComma-EK5gGoQ  reason: not valid java name */
        public final long m36893getNumPadCommaEK5gGoQ() {
            return Key.NumPadComma;
        }

        /* renamed from: getNumPadDivide-EK5gGoQ  reason: not valid java name */
        public final long m36894getNumPadDivideEK5gGoQ() {
            return Key.NumPadDivide;
        }

        /* renamed from: getNumPadDot-EK5gGoQ  reason: not valid java name */
        public final long m36895getNumPadDotEK5gGoQ() {
            return Key.NumPadDot;
        }

        /* renamed from: getNumPadEnter-EK5gGoQ  reason: not valid java name */
        public final long m36896getNumPadEnterEK5gGoQ() {
            return Key.NumPadEnter;
        }

        /* renamed from: getNumPadEquals-EK5gGoQ  reason: not valid java name */
        public final long m36897getNumPadEqualsEK5gGoQ() {
            return Key.NumPadEquals;
        }

        /* renamed from: getNumPadLeftParenthesis-EK5gGoQ  reason: not valid java name */
        public final long m36898getNumPadLeftParenthesisEK5gGoQ() {
            return Key.NumPadLeftParenthesis;
        }

        /* renamed from: getNumPadMultiply-EK5gGoQ  reason: not valid java name */
        public final long m36899getNumPadMultiplyEK5gGoQ() {
            return Key.NumPadMultiply;
        }

        /* renamed from: getNumPadRightParenthesis-EK5gGoQ  reason: not valid java name */
        public final long m36900getNumPadRightParenthesisEK5gGoQ() {
            return Key.NumPadRightParenthesis;
        }

        /* renamed from: getNumPadSubtract-EK5gGoQ  reason: not valid java name */
        public final long m36901getNumPadSubtractEK5gGoQ() {
            return Key.NumPadSubtract;
        }

        /* renamed from: getNumber-EK5gGoQ  reason: not valid java name */
        public final long m36902getNumberEK5gGoQ() {
            return Key.Number;
        }

        /* renamed from: getO-EK5gGoQ  reason: not valid java name */
        public final long m36903getOEK5gGoQ() {
            return Key.f351O;
        }

        /* renamed from: getOne-EK5gGoQ  reason: not valid java name */
        public final long m36904getOneEK5gGoQ() {
            return Key.One;
        }

        /* renamed from: getP-EK5gGoQ  reason: not valid java name */
        public final long m36905getPEK5gGoQ() {
            return Key.f352P;
        }

        /* renamed from: getPageDown-EK5gGoQ  reason: not valid java name */
        public final long m36906getPageDownEK5gGoQ() {
            return Key.PageDown;
        }

        /* renamed from: getPageUp-EK5gGoQ  reason: not valid java name */
        public final long m36907getPageUpEK5gGoQ() {
            return Key.PageUp;
        }

        /* renamed from: getPairing-EK5gGoQ  reason: not valid java name */
        public final long m36908getPairingEK5gGoQ() {
            return Key.Pairing;
        }

        /* renamed from: getPaste-EK5gGoQ  reason: not valid java name */
        public final long m36909getPasteEK5gGoQ() {
            return Key.Paste;
        }

        /* renamed from: getPeriod-EK5gGoQ  reason: not valid java name */
        public final long m36910getPeriodEK5gGoQ() {
            return Key.Period;
        }

        /* renamed from: getPictureSymbols-EK5gGoQ  reason: not valid java name */
        public final long m36911getPictureSymbolsEK5gGoQ() {
            return Key.PictureSymbols;
        }

        /* renamed from: getPlus-EK5gGoQ  reason: not valid java name */
        public final long m36912getPlusEK5gGoQ() {
            return Key.Plus;
        }

        /* renamed from: getPound-EK5gGoQ  reason: not valid java name */
        public final long m36913getPoundEK5gGoQ() {
            return Key.Pound;
        }

        /* renamed from: getPower-EK5gGoQ  reason: not valid java name */
        public final long m36914getPowerEK5gGoQ() {
            return Key.Power;
        }

        /* renamed from: getPrintScreen-EK5gGoQ  reason: not valid java name */
        public final long m36915getPrintScreenEK5gGoQ() {
            return Key.PrintScreen;
        }

        /* renamed from: getProfileSwitch-EK5gGoQ  reason: not valid java name */
        public final long m36916getProfileSwitchEK5gGoQ() {
            return Key.ProfileSwitch;
        }

        /* renamed from: getProgramBlue-EK5gGoQ  reason: not valid java name */
        public final long m36917getProgramBlueEK5gGoQ() {
            return Key.ProgramBlue;
        }

        /* renamed from: getProgramGreen-EK5gGoQ  reason: not valid java name */
        public final long m36918getProgramGreenEK5gGoQ() {
            return Key.ProgramGreen;
        }

        /* renamed from: getProgramRed-EK5gGoQ  reason: not valid java name */
        public final long m36919getProgramRedEK5gGoQ() {
            return Key.ProgramRed;
        }

        /* renamed from: getProgramYellow-EK5gGoQ  reason: not valid java name */
        public final long m36920getProgramYellowEK5gGoQ() {
            return Key.ProgramYellow;
        }

        /* renamed from: getQ-EK5gGoQ  reason: not valid java name */
        public final long m36921getQEK5gGoQ() {
            return Key.f353Q;
        }

        /* renamed from: getR-EK5gGoQ  reason: not valid java name */
        public final long m36922getREK5gGoQ() {
            return Key.f354R;
        }

        /* renamed from: getRefresh-EK5gGoQ  reason: not valid java name */
        public final long m36923getRefreshEK5gGoQ() {
            return Key.Refresh;
        }

        /* renamed from: getRightBracket-EK5gGoQ  reason: not valid java name */
        public final long m36924getRightBracketEK5gGoQ() {
            return Key.RightBracket;
        }

        /* renamed from: getRo-EK5gGoQ  reason: not valid java name */
        public final long m36925getRoEK5gGoQ() {
            return Key.f355Ro;
        }

        /* renamed from: getS-EK5gGoQ  reason: not valid java name */
        public final long m36926getSEK5gGoQ() {
            return Key.f356S;
        }

        /* renamed from: getScrollLock-EK5gGoQ  reason: not valid java name */
        public final long m36927getScrollLockEK5gGoQ() {
            return Key.ScrollLock;
        }

        /* renamed from: getSearch-EK5gGoQ  reason: not valid java name */
        public final long m36928getSearchEK5gGoQ() {
            return Key.Search;
        }

        /* renamed from: getSemicolon-EK5gGoQ  reason: not valid java name */
        public final long m36929getSemicolonEK5gGoQ() {
            return Key.Semicolon;
        }

        /* renamed from: getSetTopBoxInput-EK5gGoQ  reason: not valid java name */
        public final long m36930getSetTopBoxInputEK5gGoQ() {
            return Key.SetTopBoxInput;
        }

        /* renamed from: getSetTopBoxPower-EK5gGoQ  reason: not valid java name */
        public final long m36931getSetTopBoxPowerEK5gGoQ() {
            return Key.SetTopBoxPower;
        }

        /* renamed from: getSettings-EK5gGoQ  reason: not valid java name */
        public final long m36932getSettingsEK5gGoQ() {
            return Key.Settings;
        }

        /* renamed from: getSeven-EK5gGoQ  reason: not valid java name */
        public final long m36933getSevenEK5gGoQ() {
            return Key.Seven;
        }

        /* renamed from: getShiftLeft-EK5gGoQ  reason: not valid java name */
        public final long m36934getShiftLeftEK5gGoQ() {
            return Key.ShiftLeft;
        }

        /* renamed from: getShiftRight-EK5gGoQ  reason: not valid java name */
        public final long m36935getShiftRightEK5gGoQ() {
            return Key.ShiftRight;
        }

        /* renamed from: getSix-EK5gGoQ  reason: not valid java name */
        public final long m36936getSixEK5gGoQ() {
            return Key.Six;
        }

        /* renamed from: getSlash-EK5gGoQ  reason: not valid java name */
        public final long m36937getSlashEK5gGoQ() {
            return Key.Slash;
        }

        /* renamed from: getSleep-EK5gGoQ  reason: not valid java name */
        public final long m36938getSleepEK5gGoQ() {
            return Key.Sleep;
        }

        /* renamed from: getSoftLeft-EK5gGoQ  reason: not valid java name */
        public final long m36939getSoftLeftEK5gGoQ() {
            return Key.SoftLeft;
        }

        /* renamed from: getSoftRight-EK5gGoQ  reason: not valid java name */
        public final long m36940getSoftRightEK5gGoQ() {
            return Key.SoftRight;
        }

        /* renamed from: getSoftSleep-EK5gGoQ  reason: not valid java name */
        public final long m36941getSoftSleepEK5gGoQ() {
            return Key.SoftSleep;
        }

        /* renamed from: getSpacebar-EK5gGoQ  reason: not valid java name */
        public final long m36942getSpacebarEK5gGoQ() {
            return Key.Spacebar;
        }

        /* renamed from: getStem1-EK5gGoQ  reason: not valid java name */
        public final long m36943getStem1EK5gGoQ() {
            return Key.Stem1;
        }

        /* renamed from: getStem2-EK5gGoQ  reason: not valid java name */
        public final long m36944getStem2EK5gGoQ() {
            return Key.Stem2;
        }

        /* renamed from: getStem3-EK5gGoQ  reason: not valid java name */
        public final long m36945getStem3EK5gGoQ() {
            return Key.Stem3;
        }

        /* renamed from: getStemPrimary-EK5gGoQ  reason: not valid java name */
        public final long m36946getStemPrimaryEK5gGoQ() {
            return Key.StemPrimary;
        }

        /* renamed from: getSwitchCharset-EK5gGoQ  reason: not valid java name */
        public final long m36947getSwitchCharsetEK5gGoQ() {
            return Key.SwitchCharset;
        }

        /* renamed from: getSymbol-EK5gGoQ  reason: not valid java name */
        public final long m36948getSymbolEK5gGoQ() {
            return Key.Symbol;
        }

        /* renamed from: getSystemNavigationDown-EK5gGoQ  reason: not valid java name */
        public final long m36949getSystemNavigationDownEK5gGoQ() {
            return Key.SystemNavigationDown;
        }

        /* renamed from: getSystemNavigationLeft-EK5gGoQ  reason: not valid java name */
        public final long m36950getSystemNavigationLeftEK5gGoQ() {
            return Key.SystemNavigationLeft;
        }

        /* renamed from: getSystemNavigationRight-EK5gGoQ  reason: not valid java name */
        public final long m36951getSystemNavigationRightEK5gGoQ() {
            return Key.SystemNavigationRight;
        }

        /* renamed from: getSystemNavigationUp-EK5gGoQ  reason: not valid java name */
        public final long m36952getSystemNavigationUpEK5gGoQ() {
            return Key.SystemNavigationUp;
        }

        /* renamed from: getT-EK5gGoQ  reason: not valid java name */
        public final long m36953getTEK5gGoQ() {
            return Key.f357T;
        }

        /* renamed from: getTab-EK5gGoQ  reason: not valid java name */
        public final long m36954getTabEK5gGoQ() {
            return Key.Tab;
        }

        /* renamed from: getThree-EK5gGoQ  reason: not valid java name */
        public final long m36955getThreeEK5gGoQ() {
            return Key.Three;
        }

        /* renamed from: getThumbsDown-EK5gGoQ  reason: not valid java name */
        public final long m36956getThumbsDownEK5gGoQ() {
            return Key.ThumbsDown;
        }

        /* renamed from: getThumbsUp-EK5gGoQ  reason: not valid java name */
        public final long m36957getThumbsUpEK5gGoQ() {
            return Key.ThumbsUp;
        }

        /* renamed from: getToggle2D3D-EK5gGoQ  reason: not valid java name */
        public final long m36958getToggle2D3DEK5gGoQ() {
            return Key.Toggle2D3D;
        }

        /* renamed from: getTv-EK5gGoQ  reason: not valid java name */
        public final long m36959getTvEK5gGoQ() {
            return Key.f358Tv;
        }

        /* renamed from: getTvAntennaCable-EK5gGoQ  reason: not valid java name */
        public final long m36960getTvAntennaCableEK5gGoQ() {
            return Key.TvAntennaCable;
        }

        /* renamed from: getTvAudioDescription-EK5gGoQ  reason: not valid java name */
        public final long m36961getTvAudioDescriptionEK5gGoQ() {
            return Key.TvAudioDescription;
        }

        /* renamed from: getTvAudioDescriptionMixingVolumeDown-EK5gGoQ  reason: not valid java name */
        public final long m36962getTvAudioDescriptionMixingVolumeDownEK5gGoQ() {
            return Key.TvAudioDescriptionMixingVolumeDown;
        }

        /* renamed from: getTvAudioDescriptionMixingVolumeUp-EK5gGoQ  reason: not valid java name */
        public final long m36963getTvAudioDescriptionMixingVolumeUpEK5gGoQ() {
            return Key.TvAudioDescriptionMixingVolumeUp;
        }

        /* renamed from: getTvContentsMenu-EK5gGoQ  reason: not valid java name */
        public final long m36964getTvContentsMenuEK5gGoQ() {
            return Key.TvContentsMenu;
        }

        /* renamed from: getTvDataService-EK5gGoQ  reason: not valid java name */
        public final long m36965getTvDataServiceEK5gGoQ() {
            return Key.TvDataService;
        }

        /* renamed from: getTvInput-EK5gGoQ  reason: not valid java name */
        public final long m36966getTvInputEK5gGoQ() {
            return Key.TvInput;
        }

        /* renamed from: getTvInputComponent1-EK5gGoQ  reason: not valid java name */
        public final long m36967getTvInputComponent1EK5gGoQ() {
            return Key.TvInputComponent1;
        }

        /* renamed from: getTvInputComponent2-EK5gGoQ  reason: not valid java name */
        public final long m36968getTvInputComponent2EK5gGoQ() {
            return Key.TvInputComponent2;
        }

        /* renamed from: getTvInputComposite1-EK5gGoQ  reason: not valid java name */
        public final long m36969getTvInputComposite1EK5gGoQ() {
            return Key.TvInputComposite1;
        }

        /* renamed from: getTvInputComposite2-EK5gGoQ  reason: not valid java name */
        public final long m36970getTvInputComposite2EK5gGoQ() {
            return Key.TvInputComposite2;
        }

        /* renamed from: getTvInputHdmi1-EK5gGoQ  reason: not valid java name */
        public final long m36971getTvInputHdmi1EK5gGoQ() {
            return Key.TvInputHdmi1;
        }

        /* renamed from: getTvInputHdmi2-EK5gGoQ  reason: not valid java name */
        public final long m36972getTvInputHdmi2EK5gGoQ() {
            return Key.TvInputHdmi2;
        }

        /* renamed from: getTvInputHdmi3-EK5gGoQ  reason: not valid java name */
        public final long m36973getTvInputHdmi3EK5gGoQ() {
            return Key.TvInputHdmi3;
        }

        /* renamed from: getTvInputHdmi4-EK5gGoQ  reason: not valid java name */
        public final long m36974getTvInputHdmi4EK5gGoQ() {
            return Key.TvInputHdmi4;
        }

        /* renamed from: getTvInputVga1-EK5gGoQ  reason: not valid java name */
        public final long m36975getTvInputVga1EK5gGoQ() {
            return Key.TvInputVga1;
        }

        /* renamed from: getTvMediaContextMenu-EK5gGoQ  reason: not valid java name */
        public final long m36976getTvMediaContextMenuEK5gGoQ() {
            return Key.TvMediaContextMenu;
        }

        /* renamed from: getTvNetwork-EK5gGoQ  reason: not valid java name */
        public final long m36977getTvNetworkEK5gGoQ() {
            return Key.TvNetwork;
        }

        /* renamed from: getTvNumberEntry-EK5gGoQ  reason: not valid java name */
        public final long m36978getTvNumberEntryEK5gGoQ() {
            return Key.TvNumberEntry;
        }

        /* renamed from: getTvPower-EK5gGoQ  reason: not valid java name */
        public final long m36979getTvPowerEK5gGoQ() {
            return Key.TvPower;
        }

        /* renamed from: getTvRadioService-EK5gGoQ  reason: not valid java name */
        public final long m36980getTvRadioServiceEK5gGoQ() {
            return Key.TvRadioService;
        }

        /* renamed from: getTvSatellite-EK5gGoQ  reason: not valid java name */
        public final long m36981getTvSatelliteEK5gGoQ() {
            return Key.TvSatellite;
        }

        /* renamed from: getTvSatelliteBs-EK5gGoQ  reason: not valid java name */
        public final long m36982getTvSatelliteBsEK5gGoQ() {
            return Key.TvSatelliteBs;
        }

        /* renamed from: getTvSatelliteCs-EK5gGoQ  reason: not valid java name */
        public final long m36983getTvSatelliteCsEK5gGoQ() {
            return Key.TvSatelliteCs;
        }

        /* renamed from: getTvSatelliteService-EK5gGoQ  reason: not valid java name */
        public final long m36984getTvSatelliteServiceEK5gGoQ() {
            return Key.TvSatelliteService;
        }

        /* renamed from: getTvTeletext-EK5gGoQ  reason: not valid java name */
        public final long m36985getTvTeletextEK5gGoQ() {
            return Key.TvTeletext;
        }

        /* renamed from: getTvTerrestrialAnalog-EK5gGoQ  reason: not valid java name */
        public final long m36986getTvTerrestrialAnalogEK5gGoQ() {
            return Key.TvTerrestrialAnalog;
        }

        /* renamed from: getTvTerrestrialDigital-EK5gGoQ  reason: not valid java name */
        public final long m36987getTvTerrestrialDigitalEK5gGoQ() {
            return Key.TvTerrestrialDigital;
        }

        /* renamed from: getTvTimerProgramming-EK5gGoQ  reason: not valid java name */
        public final long m36988getTvTimerProgrammingEK5gGoQ() {
            return Key.TvTimerProgramming;
        }

        /* renamed from: getTvZoomMode-EK5gGoQ  reason: not valid java name */
        public final long m36989getTvZoomModeEK5gGoQ() {
            return Key.TvZoomMode;
        }

        /* renamed from: getTwo-EK5gGoQ  reason: not valid java name */
        public final long m36990getTwoEK5gGoQ() {
            return Key.Two;
        }

        /* renamed from: getU-EK5gGoQ  reason: not valid java name */
        public final long m36991getUEK5gGoQ() {
            return Key.f359U;
        }

        /* renamed from: getUnknown-EK5gGoQ  reason: not valid java name */
        public final long m36992getUnknownEK5gGoQ() {
            return Key.Unknown;
        }

        /* renamed from: getV-EK5gGoQ  reason: not valid java name */
        public final long m36993getVEK5gGoQ() {
            return Key.f360V;
        }

        /* renamed from: getVoiceAssist-EK5gGoQ  reason: not valid java name */
        public final long m36994getVoiceAssistEK5gGoQ() {
            return Key.VoiceAssist;
        }

        /* renamed from: getVolumeDown-EK5gGoQ  reason: not valid java name */
        public final long m36995getVolumeDownEK5gGoQ() {
            return Key.VolumeDown;
        }

        /* renamed from: getVolumeMute-EK5gGoQ  reason: not valid java name */
        public final long m36996getVolumeMuteEK5gGoQ() {
            return Key.VolumeMute;
        }

        /* renamed from: getVolumeUp-EK5gGoQ  reason: not valid java name */
        public final long m36997getVolumeUpEK5gGoQ() {
            return Key.VolumeUp;
        }

        /* renamed from: getW-EK5gGoQ  reason: not valid java name */
        public final long m36998getWEK5gGoQ() {
            return Key.f361W;
        }

        /* renamed from: getWakeUp-EK5gGoQ  reason: not valid java name */
        public final long m36999getWakeUpEK5gGoQ() {
            return Key.WakeUp;
        }

        /* renamed from: getWindow-EK5gGoQ  reason: not valid java name */
        public final long m37000getWindowEK5gGoQ() {
            return Key.Window;
        }

        /* renamed from: getX-EK5gGoQ  reason: not valid java name */
        public final long m37001getXEK5gGoQ() {
            return Key.f362X;
        }

        /* renamed from: getY-EK5gGoQ  reason: not valid java name */
        public final long m37002getYEK5gGoQ() {
            return Key.f363Y;
        }

        /* renamed from: getYen-EK5gGoQ  reason: not valid java name */
        public final long m37003getYenEK5gGoQ() {
            return Key.Yen;
        }

        /* renamed from: getZ-EK5gGoQ  reason: not valid java name */
        public final long m37004getZEK5gGoQ() {
            return Key.f364Z;
        }

        /* renamed from: getZenkakuHankaru-EK5gGoQ  reason: not valid java name */
        public final long m37005getZenkakuHankaruEK5gGoQ() {
            return Key.ZenkakuHankaru;
        }

        /* renamed from: getZero-EK5gGoQ  reason: not valid java name */
        public final long m37006getZeroEK5gGoQ() {
            return Key.Zero;
        }

        /* renamed from: getZoomIn-EK5gGoQ  reason: not valid java name */
        public final long m37007getZoomInEK5gGoQ() {
            return Key.ZoomIn;
        }

        /* renamed from: getZoomOut-EK5gGoQ  reason: not valid java name */
        public final long m37008getZoomOutEK5gGoQ() {
            return Key.ZoomOut;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getA-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36435getAEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAllApps-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36436getAllAppsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAltLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36437getAltLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAltRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36438getAltRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getApostrophe-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36439getApostropheEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAppSwitch-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36440getAppSwitchEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAssist-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36441getAssistEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAt-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36442getAtEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAvReceiverInput-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36443getAvReceiverInputEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAvReceiverPower-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36444getAvReceiverPowerEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getB-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36445getBEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBack-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36446getBackEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBackslash-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36447getBackslashEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBackspace-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36448getBackspaceEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBookmark-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36449getBookmarkEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBreak-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36450getBreakEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBrightnessDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36451getBrightnessDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBrightnessUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36452getBrightnessUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBrowser-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36453getBrowserEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36454getButton1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton10-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36455getButton10EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton11-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36456getButton11EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton12-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36457getButton12EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton13-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36458getButton13EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton14-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36459getButton14EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton15-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36460getButton15EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton16-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36461getButton16EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36462getButton2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36463getButton3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton4-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36464getButton4EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton5-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36465getButton5EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton6-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36466getButton6EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton7-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36467getButton7EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton8-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36468getButton8EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton9-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36469getButton9EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonA-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36470getButtonAEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonB-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36471getButtonBEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonC-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36472getButtonCEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonL1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36473getButtonL1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonL2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36474getButtonL2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonMode-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36475getButtonModeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonR1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36476getButtonR1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonR2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36477getButtonR2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonSelect-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36478getButtonSelectEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonStart-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36479getButtonStartEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonThumbLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36480getButtonThumbLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonThumbRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36481getButtonThumbRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonX-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36482getButtonXEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonY-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36483getButtonYEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonZ-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36484getButtonZEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getC-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36485getCEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCalculator-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36486getCalculatorEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCalendar-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36487getCalendarEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCall-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36488getCallEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCamera-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36489getCameraEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCapsLock-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36490getCapsLockEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCaptions-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36491getCaptionsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getChannelDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36492getChannelDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getChannelUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36493getChannelUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getClear-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36494getClearEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getComma-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36495getCommaEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getContacts-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36496getContactsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCopy-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36497getCopyEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCtrlLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36498getCtrlLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCtrlRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36499getCtrlRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCut-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36500getCutEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getD-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36501getDEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDelete-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36502getDeleteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionCenter-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36503getDirectionCenterEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36504getDirectionDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionDownLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36505getDirectionDownLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionDownRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36506getDirectionDownRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36507getDirectionLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36508getDirectionRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36509getDirectionUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionUpLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36510getDirectionUpLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionUpRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36511getDirectionUpRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDvr-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36512getDvrEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getE-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36513getEEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36514getEightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEisu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36515getEisuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEndCall-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36516getEndCallEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36517getEnterEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnvelope-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36518getEnvelopeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEquals-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36519getEqualsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEscape-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36520getEscapeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36521getFEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36522getF1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF10-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36523getF10EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF11-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36524getF11EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF12-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36525getF12EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36526getF2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36527getF3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF4-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36528getF4EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF5-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36529getF5EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF6-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36530getF6EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF7-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36531getF7EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF8-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36532getF8EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF9-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36533getF9EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getFive-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36534getFiveEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getFocus-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36535getFocusEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getForward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36536getForwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getFour-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36537getFourEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getFunction-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36538getFunctionEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getG-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36539getGEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getGrave-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36540getGraveEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getGuide-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36541getGuideEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getH-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36542getHEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getHeadsetHook-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36543getHeadsetHookEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getHelp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36544getHelpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getHenkan-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36545getHenkanEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getHome-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36546getHomeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getI-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36547getIEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getInfo-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36548getInfoEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getInsert-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36549getInsertEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getJ-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36550getJEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getK-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36551getKEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getKana-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36552getKanaEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getKatakanaHiragana-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36553getKatakanaHiraganaEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getL-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36554getLEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getLanguageSwitch-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36555getLanguageSwitchEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getLastChannel-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36556getLastChannelEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getLeftBracket-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36557getLeftBracketEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getM-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36558getMEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMannerMode-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36559getMannerModeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaAudioTrack-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36560getMediaAudioTrackEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaClose-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36561getMediaCloseEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaEject-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36562getMediaEjectEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaFastForward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36563getMediaFastForwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaNext-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36564getMediaNextEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaPause-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36565getMediaPauseEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaPlay-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36566getMediaPlayEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaPlayPause-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36567getMediaPlayPauseEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaPrevious-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36568getMediaPreviousEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaRecord-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36569getMediaRecordEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaRewind-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36570getMediaRewindEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaSkipBackward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36571getMediaSkipBackwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaSkipForward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36572getMediaSkipForwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaStepBackward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36573getMediaStepBackwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaStepForward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36574getMediaStepForwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaStop-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36575getMediaStopEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaTopMenu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36576getMediaTopMenuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMenu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36577getMenuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMetaLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36578getMetaLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMetaRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36579getMetaRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMicrophoneMute-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36580getMicrophoneMuteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMinus-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36581getMinusEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMoveEnd-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36582getMoveEndEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMoveHome-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36583getMoveHomeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMuhenkan-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36584getMuhenkanEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMultiply-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36585getMultiplyEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMusic-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36586getMusicEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getN-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36587getNEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNavigateIn-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36588getNavigateInEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNavigateNext-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36589getNavigateNextEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNavigateOut-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36590getNavigateOutEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNavigatePrevious-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36591getNavigatePreviousEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNine-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36592getNineEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNotification-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36593getNotificationEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumLock-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36594getNumLockEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad0-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36595getNumPad0EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36596getNumPad1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36597getNumPad2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36598getNumPad3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad4-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36599getNumPad4EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad5-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36600getNumPad5EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad6-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36601getNumPad6EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad7-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36602getNumPad7EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad8-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36603getNumPad8EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad9-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36604getNumPad9EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadAdd-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36605getNumPadAddEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadComma-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36606getNumPadCommaEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadDivide-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36607getNumPadDivideEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadDot-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36608getNumPadDotEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadEnter-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36609getNumPadEnterEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadEquals-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36610getNumPadEqualsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadLeftParenthesis-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36611getNumPadLeftParenthesisEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadMultiply-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36612getNumPadMultiplyEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadRightParenthesis-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36613getNumPadRightParenthesisEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadSubtract-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36614getNumPadSubtractEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumber-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36615getNumberEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getO-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36616getOEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getOne-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36617getOneEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getP-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36618getPEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPageDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36619getPageDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPageUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36620getPageUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPairing-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36621getPairingEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPaste-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36622getPasteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPeriod-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36623getPeriodEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPictureSymbols-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36624getPictureSymbolsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPlus-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36625getPlusEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPound-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36626getPoundEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPower-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36627getPowerEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPrintScreen-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36628getPrintScreenEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProfileSwitch-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36629getProfileSwitchEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProgramBlue-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36630getProgramBlueEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProgramGreen-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36631getProgramGreenEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProgramRed-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36632getProgramRedEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProgramYellow-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36633getProgramYellowEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getQ-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36634getQEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getR-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36635getREK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRefresh-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36636getRefreshEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRightBracket-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36637getRightBracketEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRo-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36638getRoEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getS-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36639getSEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getScrollLock-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36640getScrollLockEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSearch-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36641getSearchEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSemicolon-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36642getSemicolonEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSetTopBoxInput-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36643getSetTopBoxInputEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSetTopBoxPower-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36644getSetTopBoxPowerEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSettings-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36645getSettingsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSeven-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36646getSevenEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getShiftLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36647getShiftLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getShiftRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36648getShiftRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSix-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36649getSixEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSlash-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36650getSlashEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSleep-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36651getSleepEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSoftLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36652getSoftLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSoftRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36653getSoftRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSoftSleep-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36654getSoftSleepEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSpacebar-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36655getSpacebarEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getStem1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36656getStem1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getStem2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36657getStem2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getStem3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36658getStem3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getStemPrimary-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36659getStemPrimaryEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSwitchCharset-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36660getSwitchCharsetEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSymbol-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36661getSymbolEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSystemNavigationDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36662getSystemNavigationDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSystemNavigationLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36663getSystemNavigationLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSystemNavigationRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36664getSystemNavigationRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSystemNavigationUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36665getSystemNavigationUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getT-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36666getTEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTab-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36667getTabEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getThree-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36668getThreeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getThumbsDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36669getThumbsDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getThumbsUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36670getThumbsUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getToggle2D3D-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36671getToggle2D3DEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTv-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36672getTvEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvAntennaCable-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36673getTvAntennaCableEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvAudioDescription-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36674getTvAudioDescriptionEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvAudioDescriptionMixingVolumeDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36675getTvAudioDescriptionMixingVolumeDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvAudioDescriptionMixingVolumeUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36676getTvAudioDescriptionMixingVolumeUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvContentsMenu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36677getTvContentsMenuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvDataService-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36678getTvDataServiceEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInput-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36679getTvInputEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputComponent1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36680getTvInputComponent1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputComponent2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36681getTvInputComponent2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputComposite1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36682getTvInputComposite1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputComposite2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36683getTvInputComposite2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputHdmi1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36684getTvInputHdmi1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputHdmi2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36685getTvInputHdmi2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputHdmi3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36686getTvInputHdmi3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputHdmi4-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36687getTvInputHdmi4EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputVga1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36688getTvInputVga1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvMediaContextMenu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36689getTvMediaContextMenuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvNetwork-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36690getTvNetworkEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvNumberEntry-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36691getTvNumberEntryEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvPower-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36692getTvPowerEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvRadioService-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36693getTvRadioServiceEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvSatellite-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36694getTvSatelliteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvSatelliteBs-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36695getTvSatelliteBsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvSatelliteCs-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36696getTvSatelliteCsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvSatelliteService-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36697getTvSatelliteServiceEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvTeletext-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36698getTvTeletextEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvTerrestrialAnalog-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36699getTvTerrestrialAnalogEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvTerrestrialDigital-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36700getTvTerrestrialDigitalEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvTimerProgramming-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36701getTvTimerProgrammingEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvZoomMode-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36702getTvZoomModeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTwo-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36703getTwoEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getU-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36704getUEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getUnknown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36705getUnknownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getV-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36706getVEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getVoiceAssist-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36707getVoiceAssistEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getVolumeDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36708getVolumeDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getVolumeMute-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36709getVolumeMuteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getVolumeUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36710getVolumeUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getW-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36711getWEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getWakeUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36712getWakeUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getWindow-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36713getWindowEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getX-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36714getXEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getY-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36715getYEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getYen-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36716getYenEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZ-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36717getZEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZenkakuHankaru-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36718getZenkakuHankaruEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZero-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36719getZeroEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZoomIn-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36720getZoomInEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZoomOut-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m36721getZoomOutEK5gGoQ$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m36429constructorimpl(long j) {
        return j;
    }
}
