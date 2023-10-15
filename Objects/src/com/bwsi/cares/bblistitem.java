package com.bwsi.cares;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bblistitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.bwsi.cares.bblistitem");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.bwsi.cares.bblistitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.collections.List _runs = null;
public com.bwsi.cares.bctextengine._bcparagraphstyle _style = null;
public com.bwsi.cares.bctextengine _mtextengine = null;
public String _mtext = "";
public com.bwsi.cares.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public com.bwsi.cares.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.collections.List _imageviewscache = null;
public com.bwsi.cares.b4xorderedmap _usedimageviews = null;
public boolean _rtl = false;
public anywheresoftware.b4a.objects.collections.Map _urltolines = null;
public boolean _autounderlineurls = false;
public int _updateoffsety = 0;
public int _updateheight = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _stubscrollview = null;
public int _renderindex = 0;
public int _textindex = 0;
public boolean _waitingfordrawing = false;
public anywheresoftware.b4a.objects.collections.List _externalruns = null;
public b4a.example.dateutils _dateutils = null;
public com.bwsi.cares.main _main = null;
public com.bwsi.cares.faqspage _faqspage = null;
public com.bwsi.cares.globalvariables _globalvariables = null;
public com.bwsi.cares.dataprivacypage _dataprivacypage = null;
public com.bwsi.cares.dbutils _dbutils = null;
public com.bwsi.cares.historypage _historypage = null;
public com.bwsi.cares.newspage _newspage = null;
public com.bwsi.cares.starter _starter = null;
public com.bwsi.cares.httputils2service _httputils2service = null;
public com.bwsi.cares.b4xcollections _b4xcollections = null;
public com.bwsi.cares.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 5;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 6;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 8;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Public Style As BCParagraphStyle";
_style = new com.bwsi.cares.bctextengine._bcparagraphstyle();
 //BA.debugLineNum = 11;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new com.bwsi.cares.bctextengine();
 //BA.debugLineNum = 12;BA.debugLine="Private mText As String";
_mtext = "";
 //BA.debugLineNum = 13;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new com.bwsi.cares.bctextengine._bcparagraph();
 //BA.debugLineNum = 14;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 16;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new com.bwsi.cares.bbcodeparser._bbcodeparsedata();
 //BA.debugLineNum = 17;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private ImageViewsCache As List";
_imageviewscache = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_usedimageviews = new com.bwsi.cares.b4xorderedmap();
 //BA.debugLineNum = 20;BA.debugLine="Public RTL As Boolean";
_rtl = false;
 //BA.debugLineNum = 21;BA.debugLine="Private URLToLines As Map";
_urltolines = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 22;BA.debugLine="Public AutoUnderlineURLs As Boolean";
_autounderlineurls = false;
 //BA.debugLineNum = 23;BA.debugLine="Private UpdateOffsetY, UpdateHeight As Int";
_updateoffsety = 0;
_updateheight = 0;
 //BA.debugLineNum = 24;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_usedimageviews = new com.bwsi.cares.b4xorderedmap();
 //BA.debugLineNum = 25;BA.debugLine="Private StubScrollView As B4XView";
_stubscrollview = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private RenderIndex As Int";
_renderindex = 0;
 //BA.debugLineNum = 27;BA.debugLine="Public TextIndex As Int";
_textindex = 0;
 //BA.debugLineNum = 28;BA.debugLine="Private WaitingForDrawing As Boolean";
_waitingfordrawing = false;
 //BA.debugLineNum = 29;BA.debugLine="Public ExternalRuns As List";
_externalruns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _cleanexistingimageviews(boolean _invisibleonly,anywheresoftware.b4a.objects.collections.List _existing,int _offset,int _height) throws Exception{
com.bwsi.cares.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
 //BA.debugLineNum = 200;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
 //BA.debugLineNum = 201;BA.debugLine="For Each Line As BCTextLine In Existing";
{
final anywheresoftware.b4a.BA.IterableList group1 = _existing;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (com.bwsi.cares.bctextengine._bctextline)(group1.Get(index1));
 //BA.debugLineNum = 202;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
if (_invisibleonly==__c.False || _lineisvisible(_line,_offset,_height)==__c.False) { 
 //BA.debugLineNum = 203;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_usedimageviews._get /*Object*/ ((Object)(_line))));
 //BA.debugLineNum = 204;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
 //BA.debugLineNum = 205;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 206;BA.debugLine="ImageViewsCache.Add(xiv)";
_imageviewscache.Add((Object)(_xiv.getObject()));
 //BA.debugLineNum = 207;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
if (_invisibleonly==__c.True) { 
_usedimageviews._remove /*String*/ ((Object)(_line));};
 };
 }
};
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public String  _collecturls() throws Exception{
com.bwsi.cares.bctextengine._bctextline _line = null;
com.bwsi.cares.bctextengine._bcunbreakabletext _un = null;
com.bwsi.cares.bctextengine._bcsinglestylesection _st = null;
com.bwsi.cares.bbcodeview._internalbbviewurl _extra = null;
 //BA.debugLineNum = 320;BA.debugLine="Private Sub CollectURLs";
 //BA.debugLineNum = 321;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (com.bwsi.cares.bctextengine._bctextline)(group1.Get(index1));
 //BA.debugLineNum = 322;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (com.bwsi.cares.bctextengine._bcunbreakabletext)(group2.Get(index2));
 //BA.debugLineNum = 323;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
{
final anywheresoftware.b4a.BA.IterableList group3 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (com.bwsi.cares.bctextengine._bcsinglestylesection)(group3.Get(index3));
 //BA.debugLineNum = 324;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
if (_parsedata.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*com.bwsi.cares.bctextengine._bctextrun*/ ))) { 
 //BA.debugLineNum = 325;BA.debugLine="Dim extra As InternalBBViewURL";
_extra = new com.bwsi.cares.bbcodeview._internalbbviewurl();
 //BA.debugLineNum = 326;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
if (_urltolines.ContainsKey((Object)(_st.Run /*com.bwsi.cares.bctextengine._bctextrun*/ ))==__c.False) { 
 //BA.debugLineNum = 327;BA.debugLine="extra = CreateBCURLExtraData";
_extra = _createbcurlextradata();
 //BA.debugLineNum = 328;BA.debugLine="URLToLines.Put(st.Run, extra)";
_urltolines.Put((Object)(_st.Run /*com.bwsi.cares.bctextengine._bctextrun*/ ),(Object)(_extra));
 }else {
 //BA.debugLineNum = 330;BA.debugLine="extra = URLToLines.Get(st.Run)";
_extra = (com.bwsi.cares.bbcodeview._internalbbviewurl)(_urltolines.Get((Object)(_st.Run /*com.bwsi.cares.bctextengine._bctextrun*/ )));
 };
 //BA.debugLineNum = 332;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
if (_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_line))==-1) { 
 //BA.debugLineNum = 333;BA.debugLine="extra.Lines.Add(line)";
_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
 };
 };
 }
};
 }
};
 }
};
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return "";
}
public com.bwsi.cares.bbcodeview._internalbbviewurl  _createbcurlextradata() throws Exception{
com.bwsi.cares.bbcodeview._internalbbviewurl _t1 = null;
 //BA.debugLineNum = 341;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
 //BA.debugLineNum = 342;BA.debugLine="Dim t1 As InternalBBViewURL";
_t1 = new com.bwsi.cares.bbcodeview._internalbbviewurl();
 //BA.debugLineNum = 343;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 344;BA.debugLine="t1.Lines.Initialize";
_t1.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 345;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.ScrollViewWrapper _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 51;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 52;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 53;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 54;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 60;BA.debugLine="Dim sp As ScrollView";
_sp = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 61;BA.debugLine="sp.Initialize2(50dip, \"sv\")";
_sp.Initialize2(ba,__c.DipToCurrent((int) (50)),"sv");
 //BA.debugLineNum = 67;BA.debugLine="StubScrollView = sp";
_stubscrollview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
 //BA.debugLineNum = 68;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
_autounderlineurls = BA.ObjectToBoolean(_props.GetDefault((Object)("AutoUnderline"),(Object)(__c.True)));
 //BA.debugLineNum = 69;BA.debugLine="ImageViewsCache.Initialize";
_imageviewscache.Initialize();
 //BA.debugLineNum = 70;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
_usedimageviews = _b4xcollections._createorderedmap /*com.bwsi.cares.b4xorderedmap*/ (ba);
 //BA.debugLineNum = 71;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 72;BA.debugLine="mText = xlbl.Text";
_mtext = _xlbl.getText();
 //BA.debugLineNum = 73;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
_parsedata.DefaultColor /*int*/  = _xlbl.getTextColor();
 //BA.debugLineNum = 74;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
_parsedata.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
 //BA.debugLineNum = 75;BA.debugLine="ParseData.ViewsPanel = mBase";
_parsedata.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _mbase;
 //BA.debugLineNum = 76;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
if (_xui.SubExists(ba,_mcallback,_meventname+"_linkclicked",(int) (1))) { 
 //BA.debugLineNum = 77;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
_touchpanel = _xui.CreatePanel(ba,"TouchPanel");
 };
 //BA.debugLineNum = 84;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
_parsedata.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public com.bwsi.cares.bctextengine._bctextrun  _findtouchedrun(float _x,float _y) throws Exception{
int _offsetx = 0;
int _offsety = 0;
com.bwsi.cares.bctextengine._bcsinglestylesection _single = null;
 //BA.debugLineNum = 285;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
 //BA.debugLineNum = 286;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
{
final Object[] group1 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (5)))};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = (int)(BA.ObjectToNumber(group1[index1]));
 //BA.debugLineNum = 287;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
{
final Object[] group2 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (3))),(Object)(__c.DipToCurrent((int) (3)))};
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = (int)(BA.ObjectToNumber(group2[index2]));
 //BA.debugLineNum = 288;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
_single = _mtextengine._findsinglestylesection /*com.bwsi.cares.bctextengine._bcsinglestylesection*/ (_paragraph,(int) (_x+_offsetx),(int) (_y+_offsety));
 //BA.debugLineNum = 289;BA.debugLine="If single <> Null Then";
if (_single!= null) { 
 //BA.debugLineNum = 290;BA.debugLine="Return single.Run";
if (true) return _single.Run /*com.bwsi.cares.bctextengine._bctextrun*/ ;
 };
 }
};
 }
};
 //BA.debugLineNum = 294;BA.debugLine="Return Null";
if (true) return (com.bwsi.cares.bctextengine._bctextrun)(__c.Null);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getimageview() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 181;BA.debugLine="Private Sub GetImageView As B4XView";
 //BA.debugLineNum = 182;BA.debugLine="Dim xiv As B4XView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 183;BA.debugLine="If ImageViewsCache.Size = 0 Then";
if (_imageviewscache.getSize()==0) { 
 //BA.debugLineNum = 184;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 185;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 186;BA.debugLine="xiv = iv";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 }else {
 //BA.debugLineNum = 188;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size -";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imageviewscache.Get((int) (_imageviewscache.getSize()-1))));
 //BA.debugLineNum = 189;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size -";
_imageviewscache.RemoveAt((int) (_imageviewscache.getSize()-1));
 };
 //BA.debugLineNum = 191;BA.debugLine="mBase.AddView(xiv, 0, 0, 0, 0)";
_mbase.AddView((android.view.View)(_xiv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 192;BA.debugLine="xiv.SendToBack";
_xiv.SendToBack();
 //BA.debugLineNum = 193;BA.debugLine="Return xiv";
if (true) return _xiv;
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public String  _gettext() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 112;BA.debugLine="Return mText";
if (true) return _mtext;
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public com.bwsi.cares.bctextengine  _gettextengine() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
 //BA.debugLineNum = 103;BA.debugLine="Return mTextEngine";
if (true) return _mtextengine;
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getviews() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub getViews As Map";
 //BA.debugLineNum = 44;BA.debugLine="Return ParseData.Views";
if (true) return _parsedata.Views /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 33;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 34;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 35;BA.debugLine="ParseData.Initialize";
_parsedata.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="ParseData.Views.Initialize";
_parsedata.Views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 37;BA.debugLine="ParseData.URLs.Initialize";
_parsedata.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 38;BA.debugLine="Padding.Initialize(0, 0, 0, 0)";
_padding.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
 //BA.debugLineNum = 39;BA.debugLine="ParseData.ImageCache.Initialize";
_parsedata.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 40;BA.debugLine="URLToLines.Initialize";
_urltolines.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public boolean  _lineisvisible(com.bwsi.cares.bctextengine._bctextline _line,int _offset,int _height) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
 //BA.debugLineNum = 197;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
if (true) return _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_offset && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_offset+_height;
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return false;
}
public String  _markurl(com.bwsi.cares.bctextengine._bctextrun _run) throws Exception{
com.bwsi.cares.bctextengine._bctextrun _r = null;
com.bwsi.cares.bbcodeview._internalbbviewurl _extra = null;
com.bwsi.cares.bctextengine._bctextline _line = null;
 //BA.debugLineNum = 297;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
 //BA.debugLineNum = 307;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _urltolines.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_r = (com.bwsi.cares.bctextengine._bctextrun)(group1.Get(index1));
 //BA.debugLineNum = 308;BA.debugLine="If r.Underline <> (r = Run) Then";
if (_r.Underline /*boolean*/ !=((_r).equals(_run))) { 
 //BA.debugLineNum = 309;BA.debugLine="r.Underline = r = Run";
_r.Underline /*boolean*/  = (_r).equals(_run);
 //BA.debugLineNum = 310;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
_extra = (com.bwsi.cares.bbcodeview._internalbbviewurl)(_urltolines.Get((Object)(_r)));
 //BA.debugLineNum = 311;BA.debugLine="For Each line As BCTextLine In extra.Lines";
{
final anywheresoftware.b4a.BA.IterableList group5 = _extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_line = (com.bwsi.cares.bctextengine._bctextline)(group5.Get(index5));
 //BA.debugLineNum = 312;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
if (_usedimageviews._containskey /*boolean*/ ((Object)(_line))) { 
 //BA.debugLineNum = 313;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
_mtextengine._drawsingleline /*String*/ (_line,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_usedimageviews._get /*Object*/ ((Object)(_line)))),_paragraph);
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public String  _parentscrolled(int _scrollviewoffset,int _clvitemoffset,int _clvheight,int _offsetinitem) throws Exception{
float _scale = 0f;
int _itemoffset = 0;
int _itemheight = 0;
int _fixeditemoffset = 0;
 //BA.debugLineNum = 119;BA.debugLine="Public Sub ParentScrolled(ScrollViewOffset As Int,";
 //BA.debugLineNum = 120;BA.debugLine="If Paragraph.IsInitialized And mBase.Parent.IsIni";
if (_paragraph.IsInitialized /*boolean*/  && _mbase.getParent().IsInitialized()) { 
 //BA.debugLineNum = 121;BA.debugLine="Dim scale As Float = mTextEngine.mScale";
_scale = _mtextengine._mscale /*float*/ ;
 //BA.debugLineNum = 122;BA.debugLine="Dim ItemOffset As Int = CLVItemOffset + OffsetIn";
_itemoffset = (int) (_clvitemoffset+_offsetinitem);
 //BA.debugLineNum = 123;BA.debugLine="Dim ItemHeight As Int = mBase.Height";
_itemheight = _mbase.getHeight();
 //BA.debugLineNum = 124;BA.debugLine="If ItemOffset > ScrollViewOffset + CLVHeight Or";
if (_itemoffset>_scrollviewoffset+_clvheight || _itemoffset+_itemheight<_scrollviewoffset) { 
 //BA.debugLineNum = 125;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 127;BA.debugLine="Dim FixedItemOffset As Int = Max(0, ScrollViewOf";
_fixeditemoffset = (int) (__c.Max(0,_scrollviewoffset-_itemoffset));
 //BA.debugLineNum = 128;BA.debugLine="ItemHeight = Min(ItemHeight - FixedItemOffset, S";
_itemheight = (int) (__c.Min(_itemheight-_fixeditemoffset,_scrollviewoffset+_clvheight-_itemoffset));
 //BA.debugLineNum = 129;BA.debugLine="UpdateVisibleRegion(FixedItemOffset * scale, Ite";
_updatevisibleregion((int) (_fixeditemoffset*_scale),(int) (_itemheight*_scale));
 };
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _parseanddraw() throws Exception{
anywheresoftware.b4a.objects.collections.List _pe = null;
 //BA.debugLineNum = 213;BA.debugLine="Public Sub ParseAndDraw";
 //BA.debugLineNum = 214;BA.debugLine="TextIndex = TextIndex + 1";
_textindex = (int) (_textindex+1);
 //BA.debugLineNum = 215;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
_parsedata.NeedToReparseWhenResize /*boolean*/  = __c.False;
 //BA.debugLineNum = 216;BA.debugLine="ParseData.Text = mText";
_parsedata.Text /*String*/  = _mtext;
 //BA.debugLineNum = 217;BA.debugLine="ParseData.URLs.Clear";
_parsedata.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
 //BA.debugLineNum = 218;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
_parsedata.Width /*int*/  = (int) ((_mbase.getWidth()-_padding.getLeft()-_padding.getRight()));
 //BA.debugLineNum = 219;BA.debugLine="URLToLines.Clear";
_urltolines.Clear();
 //BA.debugLineNum = 220;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = _mtextengine._tagparser /*com.bwsi.cares.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (_parsedata);
 //BA.debugLineNum = 221;BA.debugLine="mBase.RemoveAllViews";
_mbase.RemoveAllViews();
 //BA.debugLineNum = 222;BA.debugLine="If TouchPanel.IsInitialized Then";
if (_touchpanel.IsInitialized()) { 
 //BA.debugLineNum = 223;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, 0, 0)";
_mbase.AddView((android.view.View)(_touchpanel.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 };
 //BA.debugLineNum = 225;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
if (_externalruns.IsInitialized() && _externalruns.getSize()>0) { 
 //BA.debugLineNum = 226;BA.debugLine="Runs = ExternalRuns";
_runs = _externalruns;
 }else {
 //BA.debugLineNum = 228;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
_runs = _mtextengine._tagparser /*com.bwsi.cares.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (_pe,_parsedata);
 };
 //BA.debugLineNum = 231;BA.debugLine="Redraw";
_redraw();
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public String  _redraw() throws Exception{
com.bwsi.cares.bctextengine._bctextrun _r = null;
 //BA.debugLineNum = 234;BA.debugLine="Public Sub Redraw";
 //BA.debugLineNum = 235;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = _mtextengine._createstyle /*com.bwsi.cares.bctextengine._bcparagraphstyle*/ ();
 //BA.debugLineNum = 236;BA.debugLine="Style.Padding = Padding";
_style.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = _padding;
 //BA.debugLineNum = 237;BA.debugLine="Style.MaxWidth = mBase.Width";
_style.MaxWidth /*int*/  = _mbase.getWidth();
 //BA.debugLineNum = 238;BA.debugLine="Style.ResizeHeightAutomatically = True";
_style.ResizeHeightAutomatically /*boolean*/  = __c.True;
 //BA.debugLineNum = 239;BA.debugLine="Style.RTL = RTL";
_style.RTL /*boolean*/  = _rtl;
 //BA.debugLineNum = 240;BA.debugLine="URLToLines.Clear";
_urltolines.Clear();
 //BA.debugLineNum = 241;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Key";
_cleanexistingimageviews(__c.False,_usedimageviews._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (),(int) (0),(int) (0));
 //BA.debugLineNum = 242;BA.debugLine="UsedImageViews.Clear";
_usedimageviews._clear /*String*/ ();
 //BA.debugLineNum = 243;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Run";
_paragraph = _mtextengine._prepareforlazydrawing /*com.bwsi.cares.bctextengine._bcparagraph*/ (_runs,_style,_stubscrollview);
 //BA.debugLineNum = 244;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
_mbase.SetLayoutAnimated((int) (0),_mbase.getLeft(),_mbase.getTop(),_mbase.getWidth(),(int) (_paragraph.Height /*int*/ /(double)_mtextengine._mscale /*float*/ +__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 245;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
if (_autounderlineurls && _parsedata.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
 //BA.debugLineNum = 246;BA.debugLine="CollectURLs";
_collecturls();
 //BA.debugLineNum = 247;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group13 = _urltolines.Keys();
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_r = (com.bwsi.cares.bctextengine._bctextrun)(group13.Get(index13));
 //BA.debugLineNum = 248;BA.debugLine="r.Underline = False";
_r.Underline /*boolean*/  = __c.False;
 }
};
 };
 //BA.debugLineNum = 251;BA.debugLine="If TouchPanel.IsInitialized Then";
if (_touchpanel.IsInitialized()) { 
 //BA.debugLineNum = 252;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, mBase.Widt";
_touchpanel.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 };
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public String  _settext(String _t) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub setText(t As String)";
 //BA.debugLineNum = 107;BA.debugLine="mText = t";
_mtext = _t;
 //BA.debugLineNum = 108;BA.debugLine="ParseAndDraw";
_parseanddraw();
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(com.bwsi.cares.bctextengine _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
 //BA.debugLineNum = 96;BA.debugLine="mTextEngine = b";
_mtextengine = _b;
 //BA.debugLineNum = 97;BA.debugLine="If mText <> \"\" Then";
if ((_mtext).equals("") == false) { 
 //BA.debugLineNum = 98;BA.debugLine="setText(mText)";
_settext(_mtext);
 };
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _setviews(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub setViews (m As Map)";
 //BA.debugLineNum = 48;BA.debugLine="ParseData.Views = m";
_parsedata.Views /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(int _action,float _x,float _y) throws Exception{
com.bwsi.cares.bctextengine._bctextrun _run = null;
String _url = "";
 //BA.debugLineNum = 256;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
 //BA.debugLineNum = 257;BA.debugLine="Dim run As BCTextRun = Null";
_run = (com.bwsi.cares.bctextengine._bctextrun)(__c.Null);
 //BA.debugLineNum = 258;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
if (_urltolines.getSize()>0 || _action==_touchpanel.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 259;BA.debugLine="run = FindTouchedRun(X, Y)";
_run = _findtouchedrun(_x,_y);
 };
 //BA.debugLineNum = 261;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
if (_run!= null && _parsedata.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_run))) { 
 //BA.debugLineNum = 262;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==_touchpanel.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 263;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
_url = BA.ObjectToString(_parsedata.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_run)));
 //BA.debugLineNum = 264;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_LinkClicked",(Object)(_url));
 //BA.debugLineNum = 265;BA.debugLine="MarkURL(Null)";
_markurl((com.bwsi.cares.bctextengine._bctextrun)(__c.Null));
 }else if((_xui.getIsB4i() && _action==4) || (_xui.getIsB4A() && _action==3)) { 
 //BA.debugLineNum = 267;BA.debugLine="MarkURL(Null)";
_markurl((com.bwsi.cares.bctextengine._bctextrun)(__c.Null));
 }else {
 //BA.debugLineNum = 270;BA.debugLine="MarkURL(run)";
_markurl(_run);
 };
 //BA.debugLineNum = 272;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 274;BA.debugLine="MarkURL(Null)";
_markurl((com.bwsi.cares.bctextengine._bctextrun)(__c.Null));
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public String  _updatelastvisibleregion() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub UpdateLastVisibleRegion";
 //BA.debugLineNum = 116;BA.debugLine="UpdateVisibleRegion(UpdateOffsetY, UpdateHeight)";
_updatevisibleregion(_updateoffsety,_updateheight);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public void  _updatevisibleregion(int _offsety,int _height) throws Exception{
ResumableSub_UpdateVisibleRegion rsub = new ResumableSub_UpdateVisibleRegion(this,_offsety,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_UpdateVisibleRegion extends BA.ResumableSub {
public ResumableSub_UpdateVisibleRegion(com.bwsi.cares.bblistitem parent,int _offsety,int _height) {
this.parent = parent;
this._offsety = _offsety;
this._height = _height;
}
com.bwsi.cares.bblistitem parent;
int _offsety;
int _height;
int _myrenderindex = 0;
int _mytextindex = 0;
boolean _foundfirst = false;
anywheresoftware.b4a.objects.collections.List _existing = null;
com.bwsi.cares.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
b4a.example.bitmapcreator _bc = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 135;BA.debugLine="UpdateOffsetY = OffsetY";
parent._updateoffsety = _offsety;
 //BA.debugLineNum = 136;BA.debugLine="UpdateHeight = Height";
parent._updateheight = _height;
 //BA.debugLineNum = 137;BA.debugLine="RenderIndex = RenderIndex + 1";
parent._renderindex = (int) (parent._renderindex+1);
 //BA.debugLineNum = 138;BA.debugLine="Dim MyRenderIndex As Int = RenderIndex";
_myrenderindex = parent._renderindex;
 //BA.debugLineNum = 139;BA.debugLine="Dim MyTextIndex As Int = TextIndex";
_mytextindex = parent._textindex;
 //BA.debugLineNum = 140;BA.debugLine="Do While WaitingForDrawing And MyRenderIndex = Re";
if (true) break;

case 1:
//do while
this.state = 4;
while (parent._waitingfordrawing && _myrenderindex==parent._renderindex) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 //BA.debugLineNum = 141;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,this,(int) (10));
this.state = 41;
return;
case 41:
//C
this.state = 1;
;
 if (true) break;
;
 //BA.debugLineNum = 143;BA.debugLine="If MyRenderIndex <> RenderIndex Then Return";

case 4:
//if
this.state = 9;
if (_myrenderindex!=parent._renderindex) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 144;BA.debugLine="Dim foundFirst As Boolean";
_foundfirst = false;
 //BA.debugLineNum = 145;BA.debugLine="Dim Existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 146;BA.debugLine="Existing.Initialize";
_existing.Initialize();
 //BA.debugLineNum = 147;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
_existing.AddAll(parent._usedimageviews._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 148;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
parent._cleanexistingimageviews(parent.__c.True,_existing,_offsety,_height);
 //BA.debugLineNum = 149;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
if (true) break;

case 10:
//for
this.state = 40;
group15 = parent._paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 42;
if (true) break;

case 42:
//C
this.state = 40;
if (index15 < groupLen15) {
this.state = 12;
_line = (com.bwsi.cares.bctextengine._bctextline)(group15.Get(index15));}
if (true) break;

case 43:
//C
this.state = 42;
index15++;
if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 150;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
if (true) break;

case 13:
//if
this.state = 39;
if (parent._lineisvisible(_line,_offsety,_height)) { 
this.state = 15;
}else {
this.state = 32;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 151;BA.debugLine="foundFirst = True";
_foundfirst = parent.__c.True;
 //BA.debugLineNum = 152;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
if (true) break;

case 16:
//if
this.state = 19;
if (parent._usedimageviews._containskey /*boolean*/ ((Object)(_line))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 153;BA.debugLine="Continue";
this.state = 43;
if (true) break;;
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 155;BA.debugLine="Dim xiv As B4XView = GetImageView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = parent._getimageview();
 //BA.debugLineNum = 156;BA.debugLine="Dim bc As BitmapCreator = mTextEngine.DrawSingl";
_bc = parent._mtextengine._drawsinglelineasync /*b4a.example.bitmapcreator*/ (_line,_xiv,parent._paragraph,parent);
 //BA.debugLineNum = 157;BA.debugLine="If bc <> Null Then";
if (true) break;

case 20:
//if
this.state = 30;
if (_bc!= null) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 158;BA.debugLine="WaitingForDrawing = True";
parent._waitingfordrawing = parent.__c.True;
 //BA.debugLineNum = 159;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
parent.__c.WaitFor("bc_bitmapready", ba, this, null);
this.state = 44;
return;
case 44:
//C
this.state = 23;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[0];
;
 //BA.debugLineNum = 160;BA.debugLine="WaitingForDrawing = False";
parent._waitingfordrawing = parent.__c.False;
 //BA.debugLineNum = 161;BA.debugLine="mTextEngine.ReleaseAsyncBC(bc)";
parent._mtextengine._releaseasyncbc /*String*/ (_bc);
 //BA.debugLineNum = 162;BA.debugLine="If MyTextIndex <> TextIndex Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_mytextindex!=parent._textindex) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 163;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
 //BA.debugLineNum = 164;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((android.graphics.Bitmap)(parent.__c.Null));
 //BA.debugLineNum = 165;BA.debugLine="ImageViewsCache.Add(xiv)";
parent._imageviewscache.Add((Object)(_xiv.getObject()));
 //BA.debugLineNum = 166;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 168;BA.debugLine="If xui.IsB4J Then";

case 26:
//if
this.state = 29;
if (parent._xui.getIsB4J()) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 169;BA.debugLine="bmp = bc.Bitmap";
_bmp = _bc._getbitmap();
 if (true) break;

case 29:
//C
this.state = 30;
;
 //BA.debugLineNum = 171;BA.debugLine="bmp = bmp.Crop(0, 0, bmp.Width, bmp.Height)";
_bmp = _bmp.Crop((int) (0),(int) (0),(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
 //BA.debugLineNum = 172;BA.debugLine="bc.SetBitmapToImageView(bmp, xiv)";
_bc._setbitmaptoimageview(_bmp,_xiv);
 if (true) break;

case 30:
//C
this.state = 39;
;
 //BA.debugLineNum = 174;BA.debugLine="UsedImageViews.Put(Line, xiv)";
parent._usedimageviews._put /*String*/ ((Object)(_line),(Object)(_xiv.getObject()));
 if (true) break;

case 32:
//C
this.state = 33;
 //BA.debugLineNum = 176;BA.debugLine="If foundFirst Then Exit";
if (true) break;

case 33:
//if
this.state = 38;
if (_foundfirst) { 
this.state = 35;
;}if (true) break;

case 35:
//C
this.state = 38;
this.state = 40;
if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
;
 if (true) break;

case 39:
//C
this.state = 43;
;
 if (true) break;
if (true) break;

case 40:
//C
this.state = -1;
;
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _bc_bitmapready(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SETTEXTENGINE"))
	return _settextengine((com.bwsi.cares.bctextengine) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
