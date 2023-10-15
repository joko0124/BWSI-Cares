package com.bwsi.cares;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class assegmentedtab extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.bwsi.cares.assegmentedtab");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.bwsi.cares.assegmentedtab.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties _g_itemtextproperties = null;
public com.bwsi.cares.assegmentedtab._assegmentedtab_seperatorproperties _g_seperatorproperties = null;
public float _g_cornerradiusbackground = 0f;
public float _g_cornerradiusselectionpanel = 0f;
public float _g_paddingselectionpanel = 0f;
public boolean _g_showseperators = false;
public float _g_imageheight = 0f;
public int _g_index = 0;
public boolean _mautodecreasetextsize = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_seperators_background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selector = null;
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
public static class _assegmentedtab_itemtextproperties{
public boolean IsInitialized;
public int TextColor;
public int SelectedTextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public String TextAlignment_Vertical;
public String TextAlignment_Horizontal;
public int BackgroundColor;
public void Initialize() {
IsInitialized = true;
TextColor = 0;
SelectedTextColor = 0;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextAlignment_Vertical = "";
TextAlignment_Horizontal = "";
BackgroundColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _assegmentedtab_seperatorproperties{
public boolean IsInitialized;
public int Color;
public float Width;
public int HeightPercentage;
public float CornerRadius;
public void Initialize() {
IsInitialized = true;
Color = 0;
Width = 0f;
HeightPercentage = 0;
CornerRadius = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _assegmentedtab_tab{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper Icon;
public Object Value;
public com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties ItemTextProperties;
public void Initialize() {
IsInitialized = true;
Text = "";
Icon = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
Value = new Object();
ItemTextProperties = new com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addtab(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Public Sub AddTab(Text As String,icon As B4XBitmap";
 //BA.debugLineNum = 217;BA.debugLine="AddTabIntern(Text,icon,\"\")";
_addtabintern(_text,_icon,(Object)(""));
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _addtab2(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon,Object _value) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Public Sub AddTab2(Text As String,icon As B4XBitma";
 //BA.debugLineNum = 213;BA.debugLine="AddTabIntern(Text,icon,Value)";
_addtabintern(_text,_icon,_value);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _addtabintern(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon,Object _value) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab_background = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv_icon = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon = null;
com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties _itemtextproperties = null;
com.bwsi.cares.assegmentedtab._assegmentedtab_tab _xtab = null;
 //BA.debugLineNum = 220;BA.debugLine="Private Sub AddTabIntern(Text As String,icon As B4";
 //BA.debugLineNum = 221;BA.debugLine="Dim xpnl_tab_background As B4XView = xui.CreatePa";
_xpnl_tab_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab_background = _xui.CreatePanel(ba,"xpnl_tab_background");
 //BA.debugLineNum = 222;BA.debugLine="Dim lbl_text As Label";
_lbl_text = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 223;BA.debugLine="lbl_text.Initialize(\"\")";
_lbl_text.Initialize(ba,"");
 //BA.debugLineNum = 225;BA.debugLine="lbl_text.SingleLine = True";
_lbl_text.setSingleLine(__c.True);
 //BA.debugLineNum = 227;BA.debugLine="Dim xlbl_text As B4XView = lbl_text";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_text.getObject()));
 //BA.debugLineNum = 228;BA.debugLine="xpnl_tab_background.AddView(xlbl_text,0,0,0,0)";
_xpnl_tab_background.AddView((android.view.View)(_xlbl_text.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 230;BA.debugLine="Dim iv_icon As ImageView";
_iv_icon = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 231;BA.debugLine="iv_icon.Initialize(\"\")";
_iv_icon.Initialize(ba,"");
 //BA.debugLineNum = 232;BA.debugLine="Dim xiv_icon As B4XView = iv_icon";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv_icon.getObject()));
 //BA.debugLineNum = 234;BA.debugLine="xpnl_tab_background.AddView(xiv_icon,0,0,IIf(g_Im";
_xpnl_tab_background.AddView((android.view.View)(_xiv_icon.getObject()),(int) (0),(int) (0),(int)(BA.ObjectToNumber(((_g_imageheight==0) ? ((Object)(_mbase.getHeight())) : ((Object)(_g_imageheight))))),(int)(BA.ObjectToNumber(((_g_imageheight==0) ? ((Object)(_mbase.getHeight())) : ((Object)(_g_imageheight))))));
 //BA.debugLineNum = 236;BA.debugLine="Dim ItemTextProperties As ASSegmentedTab_ItemText";
_itemtextproperties = _createassegmentedtab_itemtextproperties(_g_itemtextproperties.TextColor /*int*/ ,_g_itemtextproperties.SelectedTextColor /*int*/ ,_g_itemtextproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_g_itemtextproperties.TextAlignment_Vertical /*String*/ ,_g_itemtextproperties.TextAlignment_Horizontal /*String*/ ,_g_itemtextproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 237;BA.debugLine="Dim xTab As ASSegmentedTab_Tab = CreateASSegmente";
_xtab = _createassegmentedtab_tab(_text,_icon,_value,_itemtextproperties);
 //BA.debugLineNum = 239;BA.debugLine="If icon.IsInitialized = True And icon <> Null The";
if (_icon.IsInitialized()==__c.True && _icon!= null) { 
 //BA.debugLineNum = 241;BA.debugLine="SetIconsWithColor(xiv_icon,xTab,xpnl_background.";
_seticonswithcolor(_xiv_icon,_xtab,_xpnl_background.getNumberOfViews()==0);
 //BA.debugLineNum = 243;BA.debugLine="xiv_icon.Visible = True";
_xiv_icon.setVisible(__c.True);
 //BA.debugLineNum = 244;BA.debugLine="xlbl_text.Visible = False";
_xlbl_text.setVisible(__c.False);
 }else {
 //BA.debugLineNum = 246;BA.debugLine="xiv_icon.Visible = False";
_xiv_icon.setVisible(__c.False);
 //BA.debugLineNum = 247;BA.debugLine="xlbl_text.Visible = True";
_xlbl_text.setVisible(__c.True);
 };
 //BA.debugLineNum = 250;BA.debugLine="xpnl_tab_background.Color = xui.Color_Transparent";
_xpnl_tab_background.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 252;BA.debugLine="xlbl_text.Text = Text";
_xlbl_text.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 254;BA.debugLine="If xpnl_background.NumberOfViews = 0 Then";
if (_xpnl_background.getNumberOfViews()==0) { 
 //BA.debugLineNum = 255;BA.debugLine="xlbl_text.TextColor = g_ItemTextProperties.Selec";
_xlbl_text.setTextColor(_g_itemtextproperties.SelectedTextColor /*int*/ );
 }else {
 //BA.debugLineNum = 257;BA.debugLine="xlbl_text.TextColor = g_ItemTextProperties.TextC";
_xlbl_text.setTextColor(_g_itemtextproperties.TextColor /*int*/ );
 };
 //BA.debugLineNum = 259;BA.debugLine="xlbl_text.SetColorAndBorder(g_ItemTextProperties.";
_xlbl_text.SetColorAndBorder(_g_itemtextproperties.BackgroundColor /*int*/ ,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 260;BA.debugLine="xlbl_text.Font = g_ItemTextProperties.TextFont";
_xlbl_text.setFont(_g_itemtextproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 261;BA.debugLine="xlbl_text.SetTextAlignment(g_ItemTextProperties.T";
_xlbl_text.SetTextAlignment(_g_itemtextproperties.TextAlignment_Vertical /*String*/ ,_g_itemtextproperties.TextAlignment_Horizontal /*String*/ );
 //BA.debugLineNum = 263;BA.debugLine="xpnl_tab_background.Tag = xTab";
_xpnl_tab_background.setTag((Object)(_xtab));
 //BA.debugLineNum = 265;BA.debugLine="xpnl_background.AddView(xpnl_tab_background,0,0,0";
_xpnl_background.AddView((android.view.View)(_xpnl_tab_background.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 266;BA.debugLine="If g_ShowSeperators = True Then CreateSeperator";
if (_g_showseperators==__c.True) { 
_createseperator();};
 //BA.debugLineNum = 268;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
float _tab_width = 0f;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab_background = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon = null;
 //BA.debugLineNum = 156;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 158;BA.debugLine="xpnl_background.SetLayoutAnimated(0,0,0,Width,Hei";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 159;BA.debugLine="xpnl_seperators_background.SetLayoutAnimated(0,0,";
_xpnl_seperators_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 161;BA.debugLine="If xpnl_background.NumberOfViews > 0 Then";
if (_xpnl_background.getNumberOfViews()>0) { 
 //BA.debugLineNum = 162;BA.debugLine="Dim tab_width As Float = Width/xpnl_background.N";
_tab_width = (float) (_width/(double)_xpnl_background.getNumberOfViews());
 //BA.debugLineNum = 163;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step5 = 1;
final int limit5 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 164;BA.debugLine="Dim xpnl_tab_background As B4XView = xpnl_backg";
_xpnl_tab_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab_background = _xpnl_background.GetView(_i);
 //BA.debugLineNum = 165;BA.debugLine="Dim xlbl_text As B4XView = xpnl_tab_background.";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_tab_background.GetView((int) (0));
 //BA.debugLineNum = 166;BA.debugLine="Dim xiv_icon As B4XView = xpnl_tab_background.G";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = _xpnl_tab_background.GetView((int) (1));
 //BA.debugLineNum = 167;BA.debugLine="xpnl_tab_background.SetLayoutAnimated(0,tab_wid";
_xpnl_tab_background.SetLayoutAnimated((int) (0),(int) (_tab_width*_i),(int) (0),(int) (_tab_width),(int) (_height));
 //BA.debugLineNum = 168;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,0,tab_width,Hei";
_xlbl_text.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_tab_width),(int) (_height));
 //BA.debugLineNum = 169;BA.debugLine="xiv_icon.SetLayoutAnimated(0,tab_width/2 - IIf(";
_xiv_icon.SetLayoutAnimated((int) (0),(int) (_tab_width/(double)2-(double)(BA.ObjectToNumber(((_g_imageheight==0) ? ((Object)(_height)) : ((Object)(_g_imageheight)))))/(double)2),(int) (_height/(double)2-(double)(BA.ObjectToNumber(((_g_imageheight==0) ? ((Object)(_height)) : ((Object)(_g_imageheight)))))/(double)2),(int)(BA.ObjectToNumber(((_g_imageheight==0) ? ((Object)(_height)) : ((Object)(_g_imageheight))))),(int)(BA.ObjectToNumber(((_g_imageheight==0) ? ((Object)(_height)) : ((Object)(_g_imageheight))))));
 //BA.debugLineNum = 170;BA.debugLine="If mAutoDecreaseTextSize = True Then CheckTextS";
if (_mautodecreasetextsize==__c.True) { 
_checktextsize(_xlbl_text);};
 }
};
 //BA.debugLineNum = 172;BA.debugLine="xpnl_selector.SetLayoutAnimated(0,tab_width * g_";
_xpnl_selector.SetLayoutAnimated((int) (0),(int) (_tab_width*_g_index+_g_paddingselectionpanel),(int) (_g_paddingselectionpanel),(int) (_tab_width-(_g_paddingselectionpanel*2)),(int) (_height-(_g_paddingselectionpanel*2)));
 };
 //BA.debugLineNum = 175;BA.debugLine="SetCircleClip(mBase,g_CornerRadiusBackground)";
_setcircleclip(_mbase,(int) (_g_cornerradiusbackground));
 //BA.debugLineNum = 176;BA.debugLine="SetCircleClip(xpnl_selector,g_CornerRadiusSelecti";
_setcircleclip(_xpnl_selector,(int) (_g_cornerradiusselectionpanel));
 //BA.debugLineNum = 177;BA.debugLine="UpdateSeperators";
_updateseperators();
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _checktextsize(anywheresoftware.b4a.objects.B4XViewWrapper _xview) throws Exception{
float _starttextsize = 0f;
boolean _found = false;
int _i = 0;
 //BA.debugLineNum = 181;BA.debugLine="Private Sub CheckTextSize(xview As B4XView)";
 //BA.debugLineNum = 182;BA.debugLine="If (MeasureTextWidth(xview.Text,g_ItemTextPropert";
if ((_measuretextwidth(_xview.getText(),_g_itemtextproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )+(double)(BA.ObjectToNumber(((_xui.getIsB4J()==__c.True) ? ((Object)(4)) : ((Object)(8))))))<=_xview.getWidth()) { 
if (true) return "";};
 //BA.debugLineNum = 183;BA.debugLine="Dim StartTextSize As Float = xview.TextSize";
_starttextsize = _xview.getTextSize();
 //BA.debugLineNum = 184;BA.debugLine="Dim Found As Boolean = False";
_found = __c.False;
 //BA.debugLineNum = 185;BA.debugLine="For i = StartTextSize To 0 Step -1";
{
final int step4 = -1;
final int limit4 = (int) (0);
_i = (int) (_starttextsize) ;
for (;_i >= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 186;BA.debugLine="If (MeasureTextWidth(xview.Text,xui.CreateFont(g";
if ((_measuretextwidth(_xview.getText(),_xui.CreateFont((android.graphics.Typeface)(_g_itemtextproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .ToNativeFont().getObject()),(float) (_i)))+(double)(BA.ObjectToNumber(((_xui.getIsB4J()==__c.True) ? ((Object)(4)) : ((Object)(8))))))<=_xview.getWidth()) { 
 //BA.debugLineNum = 187;BA.debugLine="xview.Font = xui.CreateFont(g_ItemTextPropertie";
_xview.setFont(_xui.CreateFont((android.graphics.Typeface)(_g_itemtextproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .ToNativeFont().getObject()),(float) (_i)));
 //BA.debugLineNum = 188;BA.debugLine="Found = True";
_found = __c.True;
 //BA.debugLineNum = 189;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 192;BA.debugLine="If Found = False Then xview.Font = xui.CreateFont";
if (_found==__c.False) { 
_xview.setFont(_xui.CreateFont((android.graphics.Typeface)(_g_itemtextproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .ToNativeFont().getObject()),(float) (1)));};
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 81;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 82;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 83;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 84;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 85;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 87;BA.debugLine="Type ASSegmentedTab_ItemTextProperties(TextColor";
;
 //BA.debugLineNum = 88;BA.debugLine="Type ASSegmentedTab_SeperatorProperties(Color As";
;
 //BA.debugLineNum = 89;BA.debugLine="Type ASSegmentedTab_Tab(Text As String,Icon As B4";
;
 //BA.debugLineNum = 91;BA.debugLine="Private g_ItemTextProperties As ASSegmentedTab_It";
_g_itemtextproperties = new com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties();
 //BA.debugLineNum = 92;BA.debugLine="Private g_SeperatorProperties As ASSegmentedTab_S";
_g_seperatorproperties = new com.bwsi.cares.assegmentedtab._assegmentedtab_seperatorproperties();
 //BA.debugLineNum = 94;BA.debugLine="Private g_CornerRadiusBackground As Float";
_g_cornerradiusbackground = 0f;
 //BA.debugLineNum = 95;BA.debugLine="Private g_CornerRadiusSelectionPanel As Float";
_g_cornerradiusselectionpanel = 0f;
 //BA.debugLineNum = 96;BA.debugLine="Private g_PaddingSelectionPanel As Float";
_g_paddingselectionpanel = 0f;
 //BA.debugLineNum = 97;BA.debugLine="Private g_ShowSeperators As Boolean";
_g_showseperators = false;
 //BA.debugLineNum = 98;BA.debugLine="Private g_ImageHeight As Float = 0";
_g_imageheight = (float) (0);
 //BA.debugLineNum = 100;BA.debugLine="Private g_index As Int = 0";
_g_index = (int) (0);
 //BA.debugLineNum = 101;BA.debugLine="Public mAutoDecreaseTextSize As Boolean = False";
_mautodecreasetextsize = __c.False;
 //BA.debugLineNum = 104;BA.debugLine="Private xpnl_background As B4XView";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 105;BA.debugLine="Private xpnl_seperators_background As B4XView";
_xpnl_seperators_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 106;BA.debugLine="Private xpnl_selector As B4XView";
_xpnl_selector = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties  _createassegmentedtab_itemtextproperties(int _textcolor,int _selectedtextcolor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _textfont,String _textalignment_vertical,String _textalignment_horizontal,int _backgroundcolor) throws Exception{
com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties _t1 = null;
 //BA.debugLineNum = 646;BA.debugLine="Public Sub CreateASSegmentedTab_ItemTextProperties";
 //BA.debugLineNum = 647;BA.debugLine="Dim t1 As ASSegmentedTab_ItemTextProperties";
_t1 = new com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties();
 //BA.debugLineNum = 648;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 649;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 650;BA.debugLine="t1.SelectedTextColor = SelectedTextColor";
_t1.SelectedTextColor /*int*/  = _selectedtextcolor;
 //BA.debugLineNum = 651;BA.debugLine="t1.TextFont = TextFont";
_t1.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _textfont;
 //BA.debugLineNum = 652;BA.debugLine="t1.TextAlignment_Vertical = TextAlignment_Vertica";
_t1.TextAlignment_Vertical /*String*/  = _textalignment_vertical;
 //BA.debugLineNum = 653;BA.debugLine="t1.TextAlignment_Horizontal = TextAlignment_Horiz";
_t1.TextAlignment_Horizontal /*String*/  = _textalignment_horizontal;
 //BA.debugLineNum = 654;BA.debugLine="t1.BackgroundColor = BackgroundColor";
_t1.BackgroundColor /*int*/  = _backgroundcolor;
 //BA.debugLineNum = 655;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return null;
}
public com.bwsi.cares.assegmentedtab._assegmentedtab_seperatorproperties  _createassegmentedtab_seperatorproperties(int _color,float _width,int _heightpercentage,float _cornerradius) throws Exception{
com.bwsi.cares.assegmentedtab._assegmentedtab_seperatorproperties _t1 = null;
 //BA.debugLineNum = 626;BA.debugLine="Public Sub CreateASSegmentedTab_SeperatorPropertie";
 //BA.debugLineNum = 627;BA.debugLine="Dim t1 As ASSegmentedTab_SeperatorProperties";
_t1 = new com.bwsi.cares.assegmentedtab._assegmentedtab_seperatorproperties();
 //BA.debugLineNum = 628;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 629;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
 //BA.debugLineNum = 630;BA.debugLine="t1.Width = Width";
_t1.Width /*float*/  = _width;
 //BA.debugLineNum = 631;BA.debugLine="t1.HeightPercentage = HeightPercentage";
_t1.HeightPercentage /*int*/  = _heightpercentage;
 //BA.debugLineNum = 632;BA.debugLine="t1.CornerRadius = CornerRadius";
_t1.CornerRadius /*float*/  = _cornerradius;
 //BA.debugLineNum = 633;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return null;
}
public com.bwsi.cares.assegmentedtab._assegmentedtab_tab  _createassegmentedtab_tab(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon,Object _value,com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties _itemtextproperties) throws Exception{
com.bwsi.cares.assegmentedtab._assegmentedtab_tab _t1 = null;
 //BA.debugLineNum = 636;BA.debugLine="Public Sub CreateASSegmentedTab_Tab (Text As Strin";
 //BA.debugLineNum = 637;BA.debugLine="Dim t1 As ASSegmentedTab_Tab";
_t1 = new com.bwsi.cares.assegmentedtab._assegmentedtab_tab();
 //BA.debugLineNum = 638;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 639;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
 //BA.debugLineNum = 640;BA.debugLine="t1.Icon = Icon";
_t1.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _icon;
 //BA.debugLineNum = 641;BA.debugLine="t1.Value = Value";
_t1.Value /*Object*/  = _value;
 //BA.debugLineNum = 642;BA.debugLine="t1.ItemTextProperties = ItemTextProperties";
_t1.ItemTextProperties /*com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties*/  = _itemtextproperties;
 //BA.debugLineNum = 643;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 644;BA.debugLine="End Sub";
return null;
}
public String  _createseperator() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_seperator = null;
 //BA.debugLineNum = 195;BA.debugLine="Private Sub CreateSeperator";
 //BA.debugLineNum = 196;BA.debugLine="Dim xpnl_seperator As B4XView = xui.CreatePanel(\"";
_xpnl_seperator = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_seperator = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 197;BA.debugLine="xpnl_seperator.Visible = False";
_xpnl_seperator.setVisible(__c.False);
 //BA.debugLineNum = 198;BA.debugLine="xpnl_seperators_background.AddView(xpnl_seperator";
_xpnl_seperators_background.AddView((android.view.View)(_xpnl_seperator.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 116;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 117;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 118;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 120;BA.debugLine="xpnl_background = xui.CreatePanel(\"\")";
_xpnl_background = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 121;BA.debugLine="xpnl_seperators_background = xui.CreatePanel(\"\")";
_xpnl_seperators_background = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 122;BA.debugLine="xpnl_selector = xui.CreatePanel(\"\")";
_xpnl_selector = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 124;BA.debugLine="ini_props(Props)";
_ini_props(_props);
 //BA.debugLineNum = 126;BA.debugLine="mBase.AddView(xpnl_selector,0,0,0,0)";
_mbase.AddView((android.view.View)(_xpnl_selector.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 127;BA.debugLine="mBase.AddView(xpnl_background,0,0,0,0)";
_mbase.AddView((android.view.View)(_xpnl_background.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 128;BA.debugLine="mBase.AddView(xpnl_seperators_background,0,0,0,0)";
_mbase.AddView((android.view.View)(_xpnl_seperators_background.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 139;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _fonttobitmap(String _text,boolean _ismaterialicons,float _fontsize,int _color) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
 //BA.debugLineNum = 475;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
 //BA.debugLineNum = 476;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 477;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 478;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
 //BA.debugLineNum = 479;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 480;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize(_p);
 //BA.debugLineNum = 481;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 482;BA.debugLine="If IsMaterialIcons Then fnt = xui.CreateMaterialI";
if (_ismaterialicons) { 
_fnt = _xui.CreateMaterialIcons(_fontsize);}
else {
_fnt = _xui.CreateFontAwesome(_fontsize);};
 //BA.debugLineNum = 483;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
 //BA.debugLineNum = 484;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 485;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
_cvs1.DrawText(ba,_text,_cvs1.getTargetRect().getCenterX(),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 486;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
 //BA.debugLineNum = 487;BA.debugLine="cvs1.Release";
_cvs1.Release();
 //BA.debugLineNum = 488;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public int[]  _getargb(int _color) throws Exception{
int[] _res = null;
 //BA.debugLineNum = 597;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()'ignore";
 //BA.debugLineNum = 598;BA.debugLine="Private res(4) As Int";
_res = new int[(int) (4)];
;
 //BA.debugLineNum = 599;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
 //BA.debugLineNum = 600;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
 //BA.debugLineNum = 601;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
 //BA.debugLineNum = 602;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
 //BA.debugLineNum = 603;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 604;BA.debugLine="End Sub";
return null;
}
public boolean  _getautodecreasetextsize() throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Public Sub getAutoDecreaseTextSize As Boolean";
 //BA.debugLineNum = 354;BA.debugLine="Return mAutoDecreaseTextSize";
if (true) return _mautodecreasetextsize;
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbackgroundpanel() throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Public Sub getBackgroundPanel As B4XView";
 //BA.debugLineNum = 456;BA.debugLine="Return xpnl_background";
if (true) return _xpnl_background;
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 451;BA.debugLine="Public Sub getBase As B4XView";
 //BA.debugLineNum = 452;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public int  _getindex() throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Public Sub getIndex As Int";
 //BA.debugLineNum = 329;BA.debugLine="Return g_index";
if (true) return _g_index;
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return 0;
}
public com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties  _getitemtextproperties() throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Public Sub getItemTextProperties As ASSegmentedTab";
 //BA.debugLineNum = 326;BA.debugLine="Return g_ItemTextProperties";
if (true) return _g_itemtextproperties;
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getselectionpanel() throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Public Sub getSelectionPanel As B4XView";
 //BA.debugLineNum = 460;BA.debugLine="Return xpnl_selector";
if (true) return _xpnl_selector;
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public com.bwsi.cares.assegmentedtab._assegmentedtab_seperatorproperties  _getseperatorproperties() throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Public Sub getSeperatorProperties As ASSegmentedTa";
 //BA.debugLineNum = 318;BA.debugLine="Return g_SeperatorProperties";
if (true) return _g_seperatorproperties;
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public float  _getseperatorsheight() throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Public Sub getSeperatorsHeight As Float";
 //BA.debugLineNum = 321;BA.debugLine="Return mBase.Height*g_SeperatorProperties.HeightP";
if (true) return (float) (_mbase.getHeight()*_g_seperatorproperties.HeightPercentage /*int*/ /(double)100);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return 0f;
}
public int  _getsize() throws Exception{
 //BA.debugLineNum = 463;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 464;BA.debugLine="Return xpnl_background.NumberOfViews";
if (true) return _xpnl_background.getNumberOfViews();
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return 0;
}
public com.bwsi.cares.assegmentedtab._assegmentedtab_tab  _gettab(int _index) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Public Sub GetTab(Index As Int) As ASSegmentedTab_";
 //BA.debugLineNum = 273;BA.debugLine="Return xpnl_background.GetView(Index).Tag";
if (true) return (com.bwsi.cares.assegmentedtab._assegmentedtab_tab)(_xpnl_background.GetView(_index).getTag());
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public Object  _getvalue(int _index) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
 //BA.debugLineNum = 277;BA.debugLine="Return xpnl_background.GetView(Index).Tag.As(ASSe";
if (true) return ((com.bwsi.cares.assegmentedtab._assegmentedtab_tab)(_xpnl_background.GetView(_index).getTag())).Value /*Object*/ ;
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public String  _ini_props(anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Private Sub ini_props(Props As Map)";
 //BA.debugLineNum = 144;BA.debugLine="g_ItemTextProperties = CreateASSegmentedTab_ItemT";
_g_itemtextproperties = _createassegmentedtab_itemtextproperties(_xui.PaintOrColorToColor(_props.GetDefault((Object)("TextColor"),(Object)(((int)0xffffffff)))),_xui.PaintOrColorToColor(_props.GetDefault((Object)("SelectionTextColor"),(Object)(((int)0xffffffff)))),_xui.CreateDefaultFont((float) (15)),"CENTER","CENTER",_xui.Color_Transparent);
 //BA.debugLineNum = 145;BA.debugLine="g_SeperatorProperties = CreateASSegmentedTab_Sepe";
_g_seperatorproperties = _createassegmentedtab_seperatorproperties(_xui.PaintOrColorToColor(_props.GetDefault((Object)("SeperatorColor"),(Object)(((int)0x98ffffff)))),(float) (__c.DipToCurrent((int) (2))),(int) (50),(float) (0));
 //BA.debugLineNum = 147;BA.debugLine="g_CornerRadiusBackground = DipToCurrent(Props.Get";
_g_cornerradiusbackground = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornerRadiusBackground"),(Object)(0))))));
 //BA.debugLineNum = 148;BA.debugLine="g_CornerRadiusSelectionPanel = DipToCurrent(Props";
_g_cornerradiusselectionpanel = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornerRadiusSelectionPanel"),(Object)(0))))));
 //BA.debugLineNum = 149;BA.debugLine="g_PaddingSelectionPanel = DipToCurrent(Props.GetD";
_g_paddingselectionpanel = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("PaddingSelectionPanel"),(Object)(0))))));
 //BA.debugLineNum = 150;BA.debugLine="g_ShowSeperators = Props.GetDefault(\"ShowSeperato";
_g_showseperators = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowSeperators"),(Object)(__c.False)));
 //BA.debugLineNum = 152;BA.debugLine="mBase.Color = xui.PaintOrColorToColor(Props.GetDe";
_mbase.setColor(_xui.PaintOrColorToColor(_props.GetDefault((Object)("BackgroundColor"),(Object)(((int)0xff000000)))));
 //BA.debugLineNum = 153;BA.debugLine="xpnl_selector.Color = xui.PaintOrColorToColor(Pro";
_xpnl_selector.setColor(_xui.PaintOrColorToColor(_props.GetDefault((Object)("SelectionColor"),(Object)(((int)0xff2d8879)))));
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 109;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 110;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 111;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public int  _measuretextwidth(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
 //BA.debugLineNum = 606;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
 //BA.debugLineNum = 608;BA.debugLine="Private bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 609;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 610;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 611;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 612;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNa";
if (true) return (int) (_cvs.MeasureStringWidth(_text,(android.graphics.Typeface)(_font1.ToNativeFont().getObject()),_font1.getSize()));
 //BA.debugLineNum = 624;BA.debugLine="End Sub";
return 0;
}
public String  _refreshtabs() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab_background = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon = null;
com.bwsi.cares.assegmentedtab._assegmentedtab_tab _xtab = null;
 //BA.debugLineNum = 280;BA.debugLine="Public Sub RefreshTabs";
 //BA.debugLineNum = 281;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step1 = 1;
final int limit1 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 282;BA.debugLine="Dim xpnl_tab_background As B4XView = xpnl_backgr";
_xpnl_tab_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab_background = _xpnl_background.GetView(_i);
 //BA.debugLineNum = 283;BA.debugLine="Dim xlbl_text As B4XView = xpnl_tab_background.G";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_tab_background.GetView((int) (0));
 //BA.debugLineNum = 284;BA.debugLine="Dim xiv_icon As B4XView = xpnl_tab_background.Ge";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = _xpnl_tab_background.GetView((int) (1));
 //BA.debugLineNum = 286;BA.debugLine="Dim xTab As ASSegmentedTab_Tab = xpnl_tab_backgr";
_xtab = (com.bwsi.cares.assegmentedtab._assegmentedtab_tab)(_xpnl_tab_background.getTag());
 //BA.debugLineNum = 288;BA.debugLine="xlbl_text.Text = xTab.Text";
_xlbl_text.setText(BA.ObjectToCharSequence(_xtab.Text /*String*/ ));
 //BA.debugLineNum = 289;BA.debugLine="If i = g_index Then";
if (_i==_g_index) { 
 //BA.debugLineNum = 290;BA.debugLine="xlbl_text.TextColor = xTab.ItemTextProperties.S";
_xlbl_text.setTextColor(_xtab.ItemTextProperties /*com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties*/ .SelectedTextColor /*int*/ );
 }else {
 //BA.debugLineNum = 292;BA.debugLine="xlbl_text.TextColor = xTab.ItemTextProperties.T";
_xlbl_text.setTextColor(_xtab.ItemTextProperties /*com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties*/ .TextColor /*int*/ );
 };
 //BA.debugLineNum = 295;BA.debugLine="xlbl_text.SetColorAndBorder(xTab.ItemTextPropert";
_xlbl_text.SetColorAndBorder(_xtab.ItemTextProperties /*com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties*/ .BackgroundColor /*int*/ ,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 296;BA.debugLine="xlbl_text.Font = xTab.ItemTextProperties.TextFon";
_xlbl_text.setFont(_xtab.ItemTextProperties /*com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties*/ .TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 297;BA.debugLine="xlbl_text.SetTextAlignment(xTab.ItemTextProperti";
_xlbl_text.SetTextAlignment(_xtab.ItemTextProperties /*com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties*/ .TextAlignment_Vertical /*String*/ ,_xtab.ItemTextProperties /*com.bwsi.cares.assegmentedtab._assegmentedtab_itemtextproperties*/ .TextAlignment_Horizontal /*String*/ );
 //BA.debugLineNum = 299;BA.debugLine="If xTab.Icon.IsInitialized = True And xTab.Icon";
if (_xtab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True && _xtab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ != null) { 
 //BA.debugLineNum = 301;BA.debugLine="SetIconsWithColor(xiv_icon,xTab,i = g_index)";
_seticonswithcolor(_xiv_icon,_xtab,_i==_g_index);
 //BA.debugLineNum = 303;BA.debugLine="xiv_icon.Visible = True";
_xiv_icon.setVisible(__c.True);
 //BA.debugLineNum = 304;BA.debugLine="xlbl_text.Visible = False";
_xlbl_text.setVisible(__c.False);
 }else {
 //BA.debugLineNum = 306;BA.debugLine="xiv_icon.Visible = False";
_xiv_icon.setVisible(__c.False);
 //BA.debugLineNum = 307;BA.debugLine="xlbl_text.Visible = True";
_xlbl_text.setVisible(__c.True);
 };
 }
};
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return "";
}
public String  _selectedindex(int _index,int _duration) throws Exception{
 //BA.debugLineNum = 445;BA.debugLine="Public Sub SelectedIndex(index As Int,Duration As";
 //BA.debugLineNum = 446;BA.debugLine="g_index = index";
_g_index = _index;
 //BA.debugLineNum = 447;BA.debugLine="xpnl_selector.SetLayoutAnimated(Duration,mBase.Wi";
_xpnl_selector.SetLayoutAnimated(_duration,(int) (_mbase.getWidth()/(double)_xpnl_background.getNumberOfViews()*_index+_g_paddingselectionpanel),(int) (_g_paddingselectionpanel),_xpnl_selector.getWidth(),_xpnl_selector.getHeight());
 //BA.debugLineNum = 448;BA.debugLine="TabClick(xpnl_background.GetView(index),True)";
_tabclick(_xpnl_background.GetView(_index),__c.True);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return "";
}
public String  _setautodecreasetextsize(boolean _decreasetextsize) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Public Sub setAutoDecreaseTextSize(DecreaseTextSiz";
 //BA.debugLineNum = 358;BA.debugLine="mAutoDecreaseTextSize = DecreaseTextSize";
_mautodecreasetextsize = _decreasetextsize;
 //BA.debugLineNum = 359;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public String  _setcircleclip(anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _radius) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 491;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
 //BA.debugLineNum = 505;BA.debugLine="Dim jo As JavaObject = pnl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
 //BA.debugLineNum = 506;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(True))";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 507;BA.debugLine="pnl.SetColorAndBorder(pnl.Color,0,0,radius)";
_pnl.SetColorAndBorder(_pnl.getColor(),(int) (0),(int) (0),_radius);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return "";
}
public String  _setcornerradiusbackground(float _corner_radius) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Public Sub setCornerRadiusBackground(corner_radius";
 //BA.debugLineNum = 338;BA.debugLine="g_CornerRadiusBackground = corner_radius";
_g_cornerradiusbackground = _corner_radius;
 //BA.debugLineNum = 339;BA.debugLine="SetCircleClip(mBase,corner_radius)";
_setcircleclip(_mbase,(int) (_corner_radius));
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return "";
}
public String  _setcornerradiusselectionpanel(float _corner_radius) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Public Sub setCornerRadiusSelectionPanel(corner_ra";
 //BA.debugLineNum = 343;BA.debugLine="g_CornerRadiusSelectionPanel = corner_radius";
_g_cornerradiusselectionpanel = _corner_radius;
 //BA.debugLineNum = 344;BA.debugLine="SetCircleClip(xpnl_selector,corner_radius)";
_setcircleclip(_xpnl_selector,(int) (_corner_radius));
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return "";
}
public String  _seticonswithcolor(anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon,com.bwsi.cares.assegmentedtab._assegmentedtab_tab _xtab,boolean _isselected) throws Exception{
float _scale = 0f;
 //BA.debugLineNum = 383;BA.debugLine="Private Sub SetIconsWithColor(xiv_icon As B4XView,";
 //BA.debugLineNum = 385;BA.debugLine="If xiv_icon.Visible Then";
if (_xiv_icon.getVisible()) { 
 //BA.debugLineNum = 387;BA.debugLine="Dim scale As Float = 1";
_scale = (float) (1);
 //BA.debugLineNum = 392;BA.debugLine="If isSelected Then";
if (_isselected) { 
 //BA.debugLineNum = 397;BA.debugLine="xiv_icon.SetBitmap(xTab.Icon.Resize(xiv_icon.Wi";
_xiv_icon.SetBitmap((android.graphics.Bitmap)(_xtab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_icon.getWidth()*_scale),(int) (_xiv_icon.getHeight()*_scale),__c.True).getObject()));
 //BA.debugLineNum = 398;BA.debugLine="TintBmp(xiv_icon,g_ItemTextProperties.SelectedT";
_tintbmp((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_xiv_icon.getObject())),_g_itemtextproperties.SelectedTextColor /*int*/ );
 }else {
 //BA.debugLineNum = 406;BA.debugLine="xiv_icon.SetBitmap(xTab.Icon.Resize(xiv_icon.Wi";
_xiv_icon.SetBitmap((android.graphics.Bitmap)(_xtab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_icon.getWidth()*_scale),(int) (_xiv_icon.getHeight()*_scale),__c.True).getObject()));
 //BA.debugLineNum = 407;BA.debugLine="TintBmp(xiv_icon,g_ItemTextProperties.TextColor";
_tintbmp((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_xiv_icon.getObject())),_g_itemtextproperties.TextColor /*int*/ );
 };
 };
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return "";
}
public String  _setimageheight(float _height) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Public Sub setImageHeight(height As Float)";
 //BA.debugLineNum = 314;BA.debugLine="g_ImageHeight = height";
_g_imageheight = _height;
 //BA.debugLineNum = 315;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return "";
}
public String  _setindex(int _index) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Public Sub setIndex(Index As Int)";
 //BA.debugLineNum = 333;BA.debugLine="g_index = Index";
_g_index = _index;
 //BA.debugLineNum = 334;BA.debugLine="SelectedIndex(Index,0)";
_selectedindex(_index,(int) (0));
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return "";
}
public String  _setpaddingselectionpanel(float _padding) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Public Sub setPaddingSelectionPanel(padding As Flo";
 //BA.debugLineNum = 348;BA.debugLine="g_PaddingSelectionPanel = padding";
_g_paddingselectionpanel = _padding;
 //BA.debugLineNum = 349;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return "";
}
public String  _setshowseperators(boolean _visible) throws Exception{
int _i = 0;
 //BA.debugLineNum = 362;BA.debugLine="Public Sub setShowSeperators(visible As Boolean)";
 //BA.debugLineNum = 363;BA.debugLine="g_ShowSeperators = visible";
_g_showseperators = _visible;
 //BA.debugLineNum = 364;BA.debugLine="If visible = False Then";
if (_visible==__c.False) { 
 //BA.debugLineNum = 365;BA.debugLine="xpnl_seperators_background.RemoveAllViews";
_xpnl_seperators_background.RemoveAllViews();
 }else {
 //BA.debugLineNum = 367;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step5 = 1;
final int limit5 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 368;BA.debugLine="CreateSeperator";
_createseperator();
 }
};
 //BA.debugLineNum = 370;BA.debugLine="UpdateSeperators";
_updateseperators();
 };
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return "";
}
public String  _tabchanged(int _index) throws Exception{
 //BA.debugLineNum = 467;BA.debugLine="Private Sub TabChanged(Index As Int)";
 //BA.debugLineNum = 468;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TabChan";
if (_xui.SubExists(ba,_mcallback,_meventname+"_TabChanged",(int) (1))) { 
 //BA.debugLineNum = 469;BA.debugLine="CallSub2(mCallBack,mEventName & \"_TabChanged\",In";
__c.CallSubNew2(ba,_mcallback,_meventname+"_TabChanged",(Object)(_index));
 };
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return "";
}
public String  _tabclick(anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab_background,boolean _isintern) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_icon = null;
com.bwsi.cares.assegmentedtab._assegmentedtab_tab _xtab = null;
 //BA.debugLineNum = 416;BA.debugLine="Private Sub TabClick(xpnl_tab_background As B4XVie";
 //BA.debugLineNum = 417;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step1 = 1;
final int limit1 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 418;BA.debugLine="Dim xiv_icon As B4XView = xpnl_background.GetVie";
_xiv_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_icon = _xpnl_background.GetView(_i).GetView((int) (1));
 //BA.debugLineNum = 419;BA.debugLine="Dim xTab As ASSegmentedTab_Tab = xpnl_background";
_xtab = (com.bwsi.cares.assegmentedtab._assegmentedtab_tab)(_xpnl_background.GetView(_i).getTag());
 //BA.debugLineNum = 421;BA.debugLine="If xpnl_background.GetView(i) = xpnl_tab_backgro";
if ((_xpnl_background.GetView(_i)).equals(_xpnl_tab_background)) { 
 //BA.debugLineNum = 422;BA.debugLine="If (xpnl_tab_background.Left <> xpnl_selector.L";
if ((_xpnl_tab_background.getLeft()!=_xpnl_selector.getLeft()) || _isintern) { 
 //BA.debugLineNum = 423;BA.debugLine="g_index = i";
_g_index = _i;
 //BA.debugLineNum = 424;BA.debugLine="xpnl_background.GetView(i).GetView(0).TextColo";
_xpnl_background.GetView(_i).GetView((int) (0)).setTextColor(_g_itemtextproperties.SelectedTextColor /*int*/ );
 //BA.debugLineNum = 426;BA.debugLine="SetIconsWithColor(xiv_icon,xTab,True)";
_seticonswithcolor(_xiv_icon,_xtab,__c.True);
 //BA.debugLineNum = 428;BA.debugLine="TabChanged(i)";
_tabchanged(_i);
 };
 }else {
 //BA.debugLineNum = 431;BA.debugLine="xpnl_background.GetView(i).GetView(0).TextColor";
_xpnl_background.GetView(_i).GetView((int) (0)).setTextColor(_g_itemtextproperties.TextColor /*int*/ );
 //BA.debugLineNum = 432;BA.debugLine="SetIconsWithColor(xiv_icon,xTab,False)";
_seticonswithcolor(_xiv_icon,_xtab,__c.False);
 };
 }
};
 //BA.debugLineNum = 436;BA.debugLine="xpnl_selector.SetLayoutAnimated(250,xpnl_tab_back";
_xpnl_selector.SetLayoutAnimated((int) (250),(int) (_xpnl_tab_background.getLeft()+_g_paddingselectionpanel),(int) (_g_paddingselectionpanel),(int) (_xpnl_tab_background.getWidth()-(_g_paddingselectionpanel*2)),(int) (_xpnl_tab_background.getHeight()-(_g_paddingselectionpanel*2)));
 //BA.debugLineNum = 437;BA.debugLine="UpdateSeperators";
_updateseperators();
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return "";
}
public String  _tintbmp(anywheresoftware.b4a.objects.ImageViewWrapper _img,int _color) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 519;BA.debugLine="Private Sub TintBmp(img As ImageView, color As Int";
 //BA.debugLineNum = 546;BA.debugLine="Dim jo As JavaObject=img";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_img.getObject()));
 //BA.debugLineNum = 547;BA.debugLine="jo.RunMethod(\"setImageBitmap\",Array(img.Bitmap))";
_jo.RunMethod("setImageBitmap",new Object[]{(Object)(_img.getBitmap())});
 //BA.debugLineNum = 549;BA.debugLine="jo.RunMethod(\"setColorFilter\",Array(Colors.rgb(G";
_jo.RunMethod("setColorFilter",new Object[]{(Object)(__c.Colors.RGB(_getargb(_color)[(int) (1)],_getargb(_color)[(int) (2)],_getargb(_color)[(int) (3)]))});
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return "";
}
public String  _updateseperators() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_seperator = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tmp_tab = null;
 //BA.debugLineNum = 201;BA.debugLine="Public Sub UpdateSeperators";
 //BA.debugLineNum = 202;BA.debugLine="For i = 0 To xpnl_seperators_background.NumberOfV";
{
final int step1 = 1;
final int limit1 = (int) (_xpnl_seperators_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 203;BA.debugLine="Dim xpnl_seperator As B4XView = xpnl_seperators_";
_xpnl_seperator = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_seperator = _xpnl_seperators_background.GetView(_i);
 //BA.debugLineNum = 205;BA.debugLine="Dim xpnl_tmp_tab As B4XView = xpnl_background.Ge";
_xpnl_tmp_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tmp_tab = _xpnl_background.GetView(_i);
 //BA.debugLineNum = 206;BA.debugLine="xpnl_seperator.SetLayoutAnimated(0,xpnl_tmp_tab.";
_xpnl_seperator.SetLayoutAnimated((int) (0),(int) (_xpnl_tmp_tab.getLeft()+_xpnl_tmp_tab.getWidth()-(_g_seperatorproperties.Width /*float*/ /(double)2)),(int) (_xpnl_tmp_tab.getHeight()/(double)2-(_xpnl_tmp_tab.getHeight()*_g_seperatorproperties.HeightPercentage /*int*/ /(double)100)/(double)2),(int) (_g_seperatorproperties.Width /*float*/ ),(int) (_xpnl_tmp_tab.getHeight()*_g_seperatorproperties.HeightPercentage /*int*/ /(double)100));
 //BA.debugLineNum = 207;BA.debugLine="xpnl_seperator.Visible = g_ShowSeperators And i";
_xpnl_seperator.setVisible(_g_showseperators && _i<(_xpnl_background.getNumberOfViews()-1) && _i!=_g_index && _i!=(_g_index-1));
 //BA.debugLineNum = 208;BA.debugLine="xpnl_seperator.SetColorAndBorder(g_SeperatorProp";
_xpnl_seperator.SetColorAndBorder(_g_seperatorproperties.Color /*int*/ ,(int) (0),(int) (0),(int) (_g_seperatorproperties.CornerRadius /*float*/ ));
 }
};
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_tab_background_click() throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Private Sub xpnl_tab_background_Click";
 //BA.debugLineNum = 379;BA.debugLine="TabClick(Sender,False)";
_tabclick((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.False);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
