package com.bwsi.cares;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asbottommenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.bwsi.cares.asbottommenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.bwsi.cares.asbottommenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public int _currentpage = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_page_1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_page_2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_page_3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_page_4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_page_5 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _asbm_icon_1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _asbm_icon_2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _asbm_icon_3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _asbm_icon_4 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _asbm_icon_5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_badget_1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_badget_2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_badget_3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_badget_4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_badget_5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_slider = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_text_1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_text_2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_text_3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_text_4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_text_5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_partinglines1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_partinglines2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_partinglines3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_partinglines4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_partinglines5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_add_background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_parting_line = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _asbm_page_background = null;
public int _s_color1 = 0;
public int _s_color2 = 0;
public int _s_color3 = 0;
public int _s_color4 = 0;
public int _s_color5 = 0;
public int _b_color = 0;
public int _p_line = 0;
public int _m_backgroundcolor = 0;
public boolean _e_badgetcolor1 = false;
public boolean _e_badgetcolor2 = false;
public boolean _e_badgetcolor3 = false;
public boolean _e_badgetcolor4 = false;
public boolean _e_badgetcolor5 = false;
public int _b_color1 = 0;
public int _b_color2 = 0;
public int _b_color3 = 0;
public int _b_color4 = 0;
public int _b_color5 = 0;
public int _p_clickcolor = 0;
public int _p_lines_color = 0;
public boolean _e_selectedpagecolor = false;
public int _s_pagecolor = 0;
public boolean _middlebuttonvisible = false;
public anywheresoftware.b4a.objects.ImageViewWrapper _pnl_asbm_add_icon = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon5 = null;
public boolean _enablemiddlebuttonaspage = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _middleicon = null;
public String _typeofmenu = "";
public int _mode = 0;
public boolean _e_text = false;
public int _t_color = 0;
public String _text_1 = "";
public String _text_2 = "";
public String _text_3 = "";
public String _text_4 = "";
public String _text_5 = "";
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
public String  _asbm_add_background_click() throws Exception{
 //BA.debugLineNum = 2439;BA.debugLine="Private Sub asbm_add_background_Click";
 //BA.debugLineNum = 2441;BA.debugLine="asbm_add_background_handler(Sender)";
_asbm_add_background_handler((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 //BA.debugLineNum = 2443;BA.debugLine="End Sub";
return "";
}
public String  _asbm_add_background_handler(anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
 //BA.debugLineNum = 2451;BA.debugLine="Private Sub asbm_add_background_handler(SenderPane";
 //BA.debugLineNum = 2453;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Middle";
if (_xui.SubExists(ba,_mcallback,_meventname+"_MiddleButtonClick",(int) (0))) { 
 //BA.debugLineNum = 2454;BA.debugLine="CallSub(mCallBack, mEventName & \"_MiddleButtonCl";
__c.CallSubNew(ba,_mcallback,_meventname+"_MiddleButtonClick");
 };
 //BA.debugLineNum = 2458;BA.debugLine="End Sub";
return "";
}
public String  _asbm_add_background_handler_long(anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
 //BA.debugLineNum = 2460;BA.debugLine="Private Sub asbm_add_background_handler_long(Sende";
 //BA.debugLineNum = 2462;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Middle";
if (_xui.SubExists(ba,_mcallback,_meventname+"_MiddleButtonLongClick",(int) (0))) { 
 //BA.debugLineNum = 2463;BA.debugLine="CallSub(mCallBack, mEventName & \"_MiddleButtonLo";
__c.CallSubNew(ba,_mcallback,_meventname+"_MiddleButtonLongClick");
 };
 //BA.debugLineNum = 2467;BA.debugLine="End Sub";
return "";
}
public String  _asbm_add_background_longclick() throws Exception{
 //BA.debugLineNum = 2445;BA.debugLine="Private Sub asbm_add_background_LongClick";
 //BA.debugLineNum = 2447;BA.debugLine="asbm_add_background_handler_long(Sender)";
_asbm_add_background_handler_long((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 //BA.debugLineNum = 2449;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_1_click() throws Exception{
 //BA.debugLineNum = 1870;BA.debugLine="Private Sub asbm_page_1_Click";
 //BA.debugLineNum = 1872;BA.debugLine="asbm_page_1_handler(Sender)";
_asbm_page_1_handler((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 //BA.debugLineNum = 1874;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_1_handler(anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
int _cx = 0;
int _cy = 0;
 //BA.debugLineNum = 1878;BA.debugLine="private Sub asbm_page_1_handler(SenderPanel As B4X";
 //BA.debugLineNum = 1880;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Page1C";
if (_xui.SubExists(ba,_mcallback,_meventname+"_Page1Click",(int) (0))) { 
 //BA.debugLineNum = 1881;BA.debugLine="CallSub(mCallBack, mEventName & \"_Page1Click\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_Page1Click");
 };
 //BA.debugLineNum = 1883;BA.debugLine="currentpage = 1";
_currentpage = (int) (1);
 //BA.debugLineNum = 1885;BA.debugLine="Dim cx As Int = asbm_page_1.Left + asbm_page_1.Wi";
_cx = (int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()/(double)2);
 //BA.debugLineNum = 1887;BA.debugLine="If e_text = True Then";
if (_e_text==__c.True) { 
 //BA.debugLineNum = 1889;BA.debugLine="Dim cy As Int";
_cy = 0;
 //BA.debugLineNum = 1890;BA.debugLine="cy = asbm_page_1.Top + asbm_page_1.Height/2.5";
_cy = (int) (_asbm_page_1.getTop()+_asbm_page_1.getHeight()/(double)2.5);
 //BA.debugLineNum = 1892;BA.debugLine="asbm_icon_1.SetLayoutAnimated(250,asbm_icon_1.Le";
_asbm_icon_1.SetLayoutAnimated((int) (250),_asbm_icon_1.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2-__c.DipToCurrent((int) (5))),_asbm_icon_1.getWidth(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 1893;BA.debugLine="asbm_text_1.SetLayoutAnimated(250,asbm_text_1.Le";
_asbm_text_1.SetLayoutAnimated((int) (250),_asbm_text_1.getLeft(),(int) (_asbm_icon_1.getTop()+_asbm_icon_1.getHeight()),_asbm_text_1.getWidth(),_asbm_text_1.getHeight());
 //BA.debugLineNum = 1895;BA.debugLine="asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Le";
_asbm_icon_2.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 1896;BA.debugLine="asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Le";
_asbm_text_2.SetLayoutAnimated((int) (250),_asbm_text_2.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_2.getHeight()/(double)1.4),_asbm_text_2.getWidth(),_asbm_text_2.getHeight());
 //BA.debugLineNum = 1899;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 1900;BA.debugLine="asbm_icon_3.SetLayoutAnimated(250,asbm_icon_2.L";
_asbm_icon_3.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 1901;BA.debugLine="asbm_icon_4.SetLayoutAnimated(250,asbm_icon_2.L";
_asbm_icon_4.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 1902;BA.debugLine="asbm_text_3.SetLayoutAnimated(250,asbm_text_3.L";
_asbm_text_3.SetLayoutAnimated((int) (250),_asbm_text_3.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_3.getHeight()/(double)1.4),_asbm_text_3.getWidth(),_asbm_text_3.getHeight());
 //BA.debugLineNum = 1903;BA.debugLine="asbm_text_4.SetLayoutAnimated(250,asbm_text_4.L";
_asbm_text_4.SetLayoutAnimated((int) (250),_asbm_text_4.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_4.getHeight()/(double)1.4),_asbm_text_4.getWidth(),_asbm_text_4.getHeight());
 };
 //BA.debugLineNum = 1907;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1908;BA.debugLine="asbm_icon_5.SetLayoutAnimated(250,asbm_icon_2.L";
_asbm_icon_5.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 1909;BA.debugLine="asbm_text_5.SetLayoutAnimated(250,asbm_text_5.L";
_asbm_text_5.SetLayoutAnimated((int) (250),_asbm_text_5.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_5.getHeight()/(double)1.4),_asbm_text_5.getWidth(),_asbm_text_5.getHeight());
 };
 };
 //BA.debugLineNum = 1915;BA.debugLine="asbm_slider.SetLayoutAnimated(500,cx - asbm_slide";
_asbm_slider.SetLayoutAnimated((int) (500),(int) (_cx-_asbm_slider.getWidth()/(double)2),_asbm_slider.getTop(),_asbm_slider.getWidth(),_asbm_slider.getHeight());
 //BA.debugLineNum = 1916;BA.debugLine="asbm_slider.SetColorAnimated(0,asbm_slider.Color,";
_asbm_slider.SetColorAnimated((int) (0),_asbm_slider.getColor(),_s_color1);
 //BA.debugLineNum = 1944;BA.debugLine="If e_SelectedPageColor = True Then";
if (_e_selectedpagecolor==__c.True) { 
 //BA.debugLineNum = 1946;BA.debugLine="asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_2.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_2.getBitmap())),_xui.Color_White).getObject()));
 //BA.debugLineNum = 1948;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 1950;BA.debugLine="asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLe";
_asbm_icon_3.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_3.getBitmap())),_xui.Color_White).getObject()));
 //BA.debugLineNum = 1951;BA.debugLine="asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLev";
_asbm_icon_4.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_4.getBitmap())),_xui.Color_White).getObject()));
 };
 //BA.debugLineNum = 1955;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1956;BA.debugLine="asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel(";
_asbm_icon_5.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_5.getBitmap())),_xui.Color_White).getObject()));
 };
 //BA.debugLineNum = 1959;BA.debugLine="asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel(";
_asbm_icon_1.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_1.getBitmap())),_s_pagecolor).getObject()));
 };
 //BA.debugLineNum = 1963;BA.debugLine="CreateHaloEffect(asbm_page_1, asbm_page_1.Width/2";
_createhaloeffect(_asbm_page_1,(int) (_asbm_page_1.getWidth()/(double)2),(int) (_asbm_page_1.getHeight()/(double)2),_p_clickcolor);
 //BA.debugLineNum = 1965;BA.debugLine="asbm_icon_1.BringToFront";
_asbm_icon_1.BringToFront();
 //BA.debugLineNum = 1971;BA.debugLine="asbm_slider.BringToFront";
_asbm_slider.BringToFront();
 //BA.debugLineNum = 1973;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_2_click() throws Exception{
 //BA.debugLineNum = 1986;BA.debugLine="Private Sub asbm_page_2_Click";
 //BA.debugLineNum = 1988;BA.debugLine="asbm_page_2_handler(Sender)";
_asbm_page_2_handler((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 //BA.debugLineNum = 1990;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_2_handler(anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
int _cx = 0;
int _cy = 0;
 //BA.debugLineNum = 1994;BA.debugLine="Private Sub asbm_page_2_handler(SenderPanel As B4X";
 //BA.debugLineNum = 1996;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Page2C";
if (_xui.SubExists(ba,_mcallback,_meventname+"_Page2Click",(int) (0))) { 
 //BA.debugLineNum = 1997;BA.debugLine="CallSub(mCallBack, mEventName & \"_Page2Click\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_Page2Click");
 };
 //BA.debugLineNum = 1999;BA.debugLine="currentpage = 2";
_currentpage = (int) (2);
 //BA.debugLineNum = 2000;BA.debugLine="Dim cx As Int = asbm_page_2.Left + asbm_page_2.Wi";
_cx = (int) (_asbm_page_2.getLeft()+_asbm_page_2.getWidth()/(double)2);
 //BA.debugLineNum = 2002;BA.debugLine="asbm_slider.SetLayoutAnimated(500,cx - asbm_slide";
_asbm_slider.SetLayoutAnimated((int) (500),(int) (_cx-_asbm_slider.getWidth()/(double)2),_asbm_slider.getTop(),_asbm_slider.getWidth(),_asbm_slider.getHeight());
 //BA.debugLineNum = 2003;BA.debugLine="asbm_slider.SetColorAnimated(0,asbm_slider.Color,";
_asbm_slider.SetColorAnimated((int) (0),_asbm_slider.getColor(),_s_color2);
 //BA.debugLineNum = 2005;BA.debugLine="If e_text = True Then";
if (_e_text==__c.True) { 
 //BA.debugLineNum = 2006;BA.debugLine="Dim cy As Int";
_cy = 0;
 //BA.debugLineNum = 2007;BA.debugLine="cy = asbm_page_1.Top + asbm_page_1.Height/2.5";
_cy = (int) (_asbm_page_1.getTop()+_asbm_page_1.getHeight()/(double)2.5);
 //BA.debugLineNum = 2009;BA.debugLine="asbm_icon_1.SetLayoutAnimated(250,asbm_icon_1.Le";
_asbm_icon_1.SetLayoutAnimated((int) (250),_asbm_icon_1.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_1.getWidth(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 2010;BA.debugLine="asbm_text_1.SetLayoutAnimated(250,asbm_text_1.Le";
_asbm_text_1.SetLayoutAnimated((int) (250),_asbm_text_1.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_1.getHeight()/(double)1.4),_asbm_text_1.getWidth(),_asbm_text_1.getHeight());
 //BA.debugLineNum = 2012;BA.debugLine="asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Le";
_asbm_icon_2.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2-__c.DipToCurrent((int) (5))),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2013;BA.debugLine="asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Le";
_asbm_text_2.SetLayoutAnimated((int) (250),_asbm_text_2.getLeft(),(int) (_asbm_icon_2.getTop()+_asbm_icon_2.getHeight()),_asbm_text_2.getWidth(),_asbm_text_2.getHeight());
 //BA.debugLineNum = 2016;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2017;BA.debugLine="asbm_icon_3.SetLayoutAnimated(250,asbm_icon_1.L";
_asbm_icon_3.SetLayoutAnimated((int) (250),_asbm_icon_1.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_1.getWidth(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 2018;BA.debugLine="asbm_icon_4.SetLayoutAnimated(250,asbm_icon_1.L";
_asbm_icon_4.SetLayoutAnimated((int) (250),_asbm_icon_1.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_1.getWidth(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 2019;BA.debugLine="asbm_text_3.SetLayoutAnimated(250,asbm_text_3.L";
_asbm_text_3.SetLayoutAnimated((int) (250),_asbm_text_3.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_3.getHeight()/(double)1.4),_asbm_text_3.getWidth(),_asbm_text_3.getHeight());
 //BA.debugLineNum = 2020;BA.debugLine="asbm_text_4.SetLayoutAnimated(250,asbm_text_4.L";
_asbm_text_4.SetLayoutAnimated((int) (250),_asbm_text_4.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_4.getHeight()/(double)1.4),_asbm_text_4.getWidth(),_asbm_text_4.getHeight());
 };
 //BA.debugLineNum = 2024;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2025;BA.debugLine="asbm_icon_5.SetLayoutAnimated(250,asbm_icon_1.L";
_asbm_icon_5.SetLayoutAnimated((int) (250),_asbm_icon_1.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_1.getWidth(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 2026;BA.debugLine="asbm_text_5.SetLayoutAnimated(250,asbm_text_5.L";
_asbm_text_5.SetLayoutAnimated((int) (250),_asbm_text_5.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_5.getHeight()/(double)1.4),_asbm_text_5.getWidth(),_asbm_text_5.getHeight());
 };
 };
 //BA.debugLineNum = 2058;BA.debugLine="If e_SelectedPageColor = True Then";
if (_e_selectedpagecolor==__c.True) { 
 //BA.debugLineNum = 2060;BA.debugLine="asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_1.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_1.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2062;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2064;BA.debugLine="asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_3.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_3.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2065;BA.debugLine="asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_4.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_4.getBitmap())),__c.Colors.White).getObject()));
 };
 //BA.debugLineNum = 2069;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2071;BA.debugLine="asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_5.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_5.getBitmap())),__c.Colors.White).getObject()));
 };
 //BA.debugLineNum = 2075;BA.debugLine="asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_2.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_2.getBitmap())),_s_pagecolor).getObject()));
 };
 //BA.debugLineNum = 2079;BA.debugLine="CreateHaloEffect(asbm_page_2, asbm_page_2.Width/2";
_createhaloeffect(_asbm_page_2,(int) (_asbm_page_2.getWidth()/(double)2),(int) (_asbm_page_2.getHeight()/(double)2),_p_clickcolor);
 //BA.debugLineNum = 2080;BA.debugLine="asbm_icon_2.BringToFront";
_asbm_icon_2.BringToFront();
 //BA.debugLineNum = 2085;BA.debugLine="asbm_slider.BringToFront";
_asbm_slider.BringToFront();
 //BA.debugLineNum = 2089;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_3_click() throws Exception{
 //BA.debugLineNum = 2220;BA.debugLine="Private Sub asbm_page_3_Click";
 //BA.debugLineNum = 2222;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2224;BA.debugLine="asbm_page_3_handler(Sender)";
_asbm_page_3_handler((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 };
 //BA.debugLineNum = 2228;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_3_handler(anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
int _cx = 0;
int _cy = 0;
 //BA.debugLineNum = 2232;BA.debugLine="Private Sub asbm_page_3_handler(SenderPanel As B4X";
 //BA.debugLineNum = 2234;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Page3C";
if (_xui.SubExists(ba,_mcallback,_meventname+"_Page3Click",(int) (0))) { 
 //BA.debugLineNum = 2235;BA.debugLine="CallSub(mCallBack, mEventName & \"_Page3Click\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_Page3Click");
 };
 //BA.debugLineNum = 2237;BA.debugLine="currentpage = 3";
_currentpage = (int) (3);
 //BA.debugLineNum = 2239;BA.debugLine="Dim cx As Int = asbm_page_3.Left + asbm_page_3.Wi";
_cx = (int) (_asbm_page_3.getLeft()+_asbm_page_3.getWidth()/(double)2);
 //BA.debugLineNum = 2241;BA.debugLine="asbm_slider.SetLayoutAnimated(500,cx - asbm_slide";
_asbm_slider.SetLayoutAnimated((int) (500),(int) (_cx-_asbm_slider.getWidth()/(double)2),_asbm_slider.getTop(),_asbm_slider.getWidth(),_asbm_slider.getHeight());
 //BA.debugLineNum = 2242;BA.debugLine="asbm_slider.SetColorAnimated(0,asbm_slider.Color,";
_asbm_slider.SetColorAnimated((int) (0),_asbm_slider.getColor(),_s_color3);
 //BA.debugLineNum = 2244;BA.debugLine="If e_text = True Then";
if (_e_text==__c.True) { 
 //BA.debugLineNum = 2246;BA.debugLine="Dim cy As Int";
_cy = 0;
 //BA.debugLineNum = 2247;BA.debugLine="cy = asbm_page_1.Top + asbm_page_1.Height/2.5";
_cy = (int) (_asbm_page_1.getTop()+_asbm_page_1.getHeight()/(double)2.5);
 //BA.debugLineNum = 2249;BA.debugLine="asbm_icon_3.SetLayoutAnimated(250,asbm_icon_1.Le";
_asbm_icon_3.SetLayoutAnimated((int) (250),_asbm_icon_1.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2-__c.DipToCurrent((int) (5))),_asbm_icon_1.getWidth(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 2250;BA.debugLine="asbm_text_3.SetLayoutAnimated(250,asbm_text_1.Le";
_asbm_text_3.SetLayoutAnimated((int) (250),_asbm_text_1.getLeft(),(int) (_asbm_icon_3.getTop()+_asbm_icon_3.getHeight()),_asbm_text_1.getWidth(),_asbm_text_1.getHeight());
 //BA.debugLineNum = 2252;BA.debugLine="asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Le";
_asbm_icon_2.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2253;BA.debugLine="asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Le";
_asbm_text_2.SetLayoutAnimated((int) (250),_asbm_text_2.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_2.getHeight()/(double)1.4),_asbm_text_2.getWidth(),_asbm_text_2.getHeight());
 //BA.debugLineNum = 2255;BA.debugLine="asbm_icon_1.SetLayoutAnimated(250,asbm_icon_2.Le";
_asbm_icon_1.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2256;BA.debugLine="asbm_text_1.SetLayoutAnimated(250,asbm_text_2.Le";
_asbm_text_1.SetLayoutAnimated((int) (250),_asbm_text_2.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_2.getHeight()/(double)1.4),_asbm_text_2.getWidth(),_asbm_text_2.getHeight());
 //BA.debugLineNum = 2260;BA.debugLine="asbm_icon_4.SetLayoutAnimated(250,asbm_icon_2.L";
_asbm_icon_4.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2262;BA.debugLine="asbm_text_4.SetLayoutAnimated(250,asbm_text_4.L";
_asbm_text_4.SetLayoutAnimated((int) (250),_asbm_text_4.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_4.getHeight()/(double)1.4),_asbm_text_4.getWidth(),_asbm_text_4.getHeight());
 //BA.debugLineNum = 2266;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2267;BA.debugLine="asbm_icon_5.SetLayoutAnimated(250,asbm_icon_2.L";
_asbm_icon_5.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2268;BA.debugLine="asbm_text_5.SetLayoutAnimated(250,asbm_text_5.L";
_asbm_text_5.SetLayoutAnimated((int) (250),_asbm_text_5.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_5.getHeight()/(double)1.4),_asbm_text_5.getWidth(),_asbm_text_5.getHeight());
 };
 };
 //BA.debugLineNum = 2295;BA.debugLine="If e_SelectedPageColor = True Then";
if (_e_selectedpagecolor==__c.True) { 
 //BA.debugLineNum = 2297;BA.debugLine="asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_1.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_1.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2298;BA.debugLine="asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_2.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_2.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2299;BA.debugLine="asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_4.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_4.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2301;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2302;BA.debugLine="asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_5.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_5.getBitmap())),__c.Colors.White).getObject()));
 };
 //BA.debugLineNum = 2306;BA.debugLine="asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_3.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_3.getBitmap())),_s_pagecolor).getObject()));
 };
 //BA.debugLineNum = 2310;BA.debugLine="CreateHaloEffect(asbm_page_3, asbm_page_3.Width/2";
_createhaloeffect(_asbm_page_3,(int) (_asbm_page_3.getWidth()/(double)2),(int) (_asbm_page_3.getHeight()/(double)2),_p_clickcolor);
 //BA.debugLineNum = 2311;BA.debugLine="asbm_icon_3.BringToFront";
_asbm_icon_3.BringToFront();
 //BA.debugLineNum = 2317;BA.debugLine="asbm_slider.BringToFront";
_asbm_slider.BringToFront();
 //BA.debugLineNum = 2320;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_4_click() throws Exception{
 //BA.debugLineNum = 2334;BA.debugLine="Private Sub asbm_page_4_Click";
 //BA.debugLineNum = 2336;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2338;BA.debugLine="asbm_page_4_handler(Sender)";
_asbm_page_4_handler((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 };
 //BA.debugLineNum = 2342;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_4_handler(anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
int _cx = 0;
int _cy = 0;
 //BA.debugLineNum = 2347;BA.debugLine="Private Sub asbm_page_4_handler(SenderPanel As B4X";
 //BA.debugLineNum = 2349;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Page4C";
if (_xui.SubExists(ba,_mcallback,_meventname+"_Page4Click",(int) (0))) { 
 //BA.debugLineNum = 2350;BA.debugLine="CallSub(mCallBack, mEventName & \"_Page4Click\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_Page4Click");
 };
 //BA.debugLineNum = 2352;BA.debugLine="currentpage = 4";
_currentpage = (int) (4);
 //BA.debugLineNum = 2354;BA.debugLine="Dim cx As Int = asbm_page_4.Left + asbm_page_4.Wi";
_cx = (int) (_asbm_page_4.getLeft()+_asbm_page_4.getWidth()/(double)2);
 //BA.debugLineNum = 2356;BA.debugLine="asbm_slider.SetLayoutAnimated(500,cx - asbm_slide";
_asbm_slider.SetLayoutAnimated((int) (500),(int) (_cx-_asbm_slider.getWidth()/(double)2),_asbm_slider.getTop(),_asbm_slider.getWidth(),_asbm_slider.getHeight());
 //BA.debugLineNum = 2357;BA.debugLine="asbm_slider.SetColorAnimated(0,asbm_slider.Color,";
_asbm_slider.SetColorAnimated((int) (0),_asbm_slider.getColor(),_s_color4);
 //BA.debugLineNum = 2359;BA.debugLine="If e_text = True Then";
if (_e_text==__c.True) { 
 //BA.debugLineNum = 2361;BA.debugLine="Dim cy As Int";
_cy = 0;
 //BA.debugLineNum = 2362;BA.debugLine="cy = asbm_page_1.Top + asbm_page_1.Height/2.5";
_cy = (int) (_asbm_page_1.getTop()+_asbm_page_1.getHeight()/(double)2.5);
 //BA.debugLineNum = 2364;BA.debugLine="asbm_icon_4.SetLayoutAnimated(250,asbm_icon_1.Le";
_asbm_icon_4.SetLayoutAnimated((int) (250),_asbm_icon_1.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2-__c.DipToCurrent((int) (5))),_asbm_icon_1.getWidth(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 2365;BA.debugLine="asbm_text_4.SetLayoutAnimated(250,asbm_text_1.Le";
_asbm_text_4.SetLayoutAnimated((int) (250),_asbm_text_1.getLeft(),(int) (_asbm_icon_4.getTop()+_asbm_icon_4.getHeight()),_asbm_text_1.getWidth(),_asbm_text_1.getHeight());
 //BA.debugLineNum = 2367;BA.debugLine="asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Le";
_asbm_icon_2.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2368;BA.debugLine="asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Le";
_asbm_text_2.SetLayoutAnimated((int) (250),_asbm_text_2.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_2.getHeight()/(double)1.4),_asbm_text_2.getWidth(),_asbm_text_2.getHeight());
 //BA.debugLineNum = 2370;BA.debugLine="asbm_icon_1.SetLayoutAnimated(250,asbm_icon_2.Le";
_asbm_icon_1.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2371;BA.debugLine="asbm_text_1.SetLayoutAnimated(250,asbm_text_2.Le";
_asbm_text_1.SetLayoutAnimated((int) (250),_asbm_text_2.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_2.getHeight()/(double)1.4),_asbm_text_2.getWidth(),_asbm_text_2.getHeight());
 //BA.debugLineNum = 2374;BA.debugLine="asbm_icon_3.SetLayoutAnimated(250,asbm_icon_2.L";
_asbm_icon_3.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2376;BA.debugLine="asbm_text_3.SetLayoutAnimated(250,asbm_text_3.L";
_asbm_text_3.SetLayoutAnimated((int) (250),_asbm_text_3.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_3.getHeight()/(double)1.4),_asbm_text_3.getWidth(),_asbm_text_3.getHeight());
 //BA.debugLineNum = 2381;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2382;BA.debugLine="asbm_icon_5.SetLayoutAnimated(250,asbm_icon_2.L";
_asbm_icon_5.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2383;BA.debugLine="asbm_text_5.SetLayoutAnimated(250,asbm_text_5.L";
_asbm_text_5.SetLayoutAnimated((int) (250),_asbm_text_5.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_5.getHeight()/(double)1.4),_asbm_text_5.getWidth(),_asbm_text_5.getHeight());
 };
 };
 //BA.debugLineNum = 2410;BA.debugLine="If e_SelectedPageColor = True Then";
if (_e_selectedpagecolor==__c.True) { 
 //BA.debugLineNum = 2412;BA.debugLine="asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_1.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_1.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2413;BA.debugLine="asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_2.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_2.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2414;BA.debugLine="asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_3.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_3.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2416;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2418;BA.debugLine="asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLev";
_asbm_icon_5.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_5.getBitmap())),__c.Colors.White).getObject()));
 };
 //BA.debugLineNum = 2422;BA.debugLine="asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_4.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_4.getBitmap())),_s_pagecolor).getObject()));
 };
 //BA.debugLineNum = 2426;BA.debugLine="CreateHaloEffect(asbm_page_4, asbm_page_4.Width/2";
_createhaloeffect(_asbm_page_4,(int) (_asbm_page_4.getWidth()/(double)2),(int) (_asbm_page_4.getHeight()/(double)2),_p_clickcolor);
 //BA.debugLineNum = 2428;BA.debugLine="asbm_icon_4.BringToFront";
_asbm_icon_4.BringToFront();
 //BA.debugLineNum = 2434;BA.debugLine="asbm_slider.BringToFront";
_asbm_slider.BringToFront();
 //BA.debugLineNum = 2436;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_5_click() throws Exception{
 //BA.debugLineNum = 2106;BA.debugLine="Private Sub asbm_page_5_Click";
 //BA.debugLineNum = 2108;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2110;BA.debugLine="asbm_page_5_handler(Sender)";
_asbm_page_5_handler((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 };
 //BA.debugLineNum = 2114;BA.debugLine="End Sub";
return "";
}
public String  _asbm_page_5_handler(anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
int _cx = 0;
int _cy = 0;
 //BA.debugLineNum = 2118;BA.debugLine="Private Sub asbm_page_5_handler(SenderPanel As B4X";
 //BA.debugLineNum = 2120;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Page5C";
if (_xui.SubExists(ba,_mcallback,_meventname+"_Page5Click",(int) (0))) { 
 //BA.debugLineNum = 2121;BA.debugLine="CallSub(mCallBack, mEventName & \"_Page5Click\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_Page5Click");
 };
 //BA.debugLineNum = 2123;BA.debugLine="currentpage = 5";
_currentpage = (int) (5);
 //BA.debugLineNum = 2125;BA.debugLine="Dim cx As Int = asbm_page_5.Left + asbm_page_5.Wi";
_cx = (int) (_asbm_page_5.getLeft()+_asbm_page_5.getWidth()/(double)2);
 //BA.debugLineNum = 2127;BA.debugLine="asbm_slider.SetLayoutAnimated(500,cx - asbm_slide";
_asbm_slider.SetLayoutAnimated((int) (500),(int) (_cx-_asbm_slider.getWidth()/(double)2),_asbm_slider.getTop(),_asbm_slider.getWidth(),_asbm_slider.getHeight());
 //BA.debugLineNum = 2128;BA.debugLine="asbm_slider.SetColorAnimated(0,asbm_slider.Color,";
_asbm_slider.SetColorAnimated((int) (0),_asbm_slider.getColor(),_s_color5);
 //BA.debugLineNum = 2130;BA.debugLine="If e_text = True Then";
if (_e_text==__c.True) { 
 //BA.debugLineNum = 2132;BA.debugLine="Dim cy As Int";
_cy = 0;
 //BA.debugLineNum = 2133;BA.debugLine="cy = asbm_page_1.Top + asbm_page_1.Height/2.5";
_cy = (int) (_asbm_page_1.getTop()+_asbm_page_1.getHeight()/(double)2.5);
 //BA.debugLineNum = 2135;BA.debugLine="asbm_icon_5.SetLayoutAnimated(250,asbm_icon_5.Le";
_asbm_icon_5.SetLayoutAnimated((int) (250),_asbm_icon_5.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2-__c.DipToCurrent((int) (5))),_asbm_icon_5.getWidth(),_asbm_icon_5.getHeight());
 //BA.debugLineNum = 2136;BA.debugLine="asbm_text_5.SetLayoutAnimated(250,asbm_text_5.Le";
_asbm_text_5.SetLayoutAnimated((int) (250),_asbm_text_5.getLeft(),(int) (_asbm_icon_5.getTop()+_asbm_icon_5.getHeight()),_asbm_text_5.getWidth(),_asbm_text_5.getHeight());
 //BA.debugLineNum = 2138;BA.debugLine="asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Le";
_asbm_icon_2.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2139;BA.debugLine="asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Le";
_asbm_text_2.SetLayoutAnimated((int) (250),_asbm_text_2.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_2.getHeight()/(double)1.4),_asbm_text_2.getWidth(),_asbm_text_2.getHeight());
 //BA.debugLineNum = 2142;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2143;BA.debugLine="asbm_icon_3.SetLayoutAnimated(250,asbm_icon_2.L";
_asbm_icon_3.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2144;BA.debugLine="asbm_icon_4.SetLayoutAnimated(250,asbm_icon_2.L";
_asbm_icon_4.SetLayoutAnimated((int) (250),_asbm_icon_2.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_2.getWidth(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 2145;BA.debugLine="asbm_text_3.SetLayoutAnimated(250,asbm_text_3.L";
_asbm_text_3.SetLayoutAnimated((int) (250),_asbm_text_3.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_3.getHeight()/(double)1.4),_asbm_text_3.getWidth(),_asbm_text_3.getHeight());
 //BA.debugLineNum = 2146;BA.debugLine="asbm_text_4.SetLayoutAnimated(250,asbm_text_4.L";
_asbm_text_4.SetLayoutAnimated((int) (250),_asbm_text_4.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_4.getHeight()/(double)1.4),_asbm_text_4.getWidth(),_asbm_text_4.getHeight());
 };
 //BA.debugLineNum = 2151;BA.debugLine="asbm_icon_1.SetLayoutAnimated(250,asbm_icon_1.Le";
_asbm_icon_1.SetLayoutAnimated((int) (250),_asbm_icon_1.getLeft(),(int) (_cy-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_1.getWidth(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 2152;BA.debugLine="asbm_text_1.SetLayoutAnimated(250,asbm_text_1.Le";
_asbm_text_1.SetLayoutAnimated((int) (250),_asbm_text_1.getLeft(),(int) (_asbm_slider.getTop()-_asbm_text_1.getHeight()/(double)1.4),_asbm_text_1.getWidth(),_asbm_text_1.getHeight());
 };
 //BA.debugLineNum = 2180;BA.debugLine="If e_SelectedPageColor = True Then";
if (_e_selectedpagecolor==__c.True) { 
 //BA.debugLineNum = 2182;BA.debugLine="asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_1.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_1.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2183;BA.debugLine="asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_2.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_2.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2185;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2187;BA.debugLine="asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_4.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_4.getBitmap())),__c.Colors.White).getObject()));
 //BA.debugLineNum = 2188;BA.debugLine="asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_3.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_3.getBitmap())),__c.Colors.White).getObject()));
 };
 //BA.debugLineNum = 2192;BA.debugLine="asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel";
_asbm_icon_5.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_5.getBitmap())),_s_pagecolor).getObject()));
 };
 //BA.debugLineNum = 2196;BA.debugLine="CreateHaloEffect(asbm_page_5, asbm_page_5.Width/2";
_createhaloeffect(_asbm_page_5,(int) (_asbm_page_5.getWidth()/(double)2),(int) (_asbm_page_5.getHeight()/(double)2),_p_clickcolor);
 //BA.debugLineNum = 2197;BA.debugLine="asbm_icon_5.BringToFront";
_asbm_icon_5.BringToFront();
 //BA.debugLineNum = 2203;BA.debugLine="asbm_slider.BringToFront";
_asbm_slider.BringToFront();
 //BA.debugLineNum = 2206;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
int _cx = 0;
int _cy = 0;
 //BA.debugLineNum = 899;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 900;BA.debugLine="asbm_page_background.Width = Width";
_asbm_page_background.setWidth((int) (_width));
 //BA.debugLineNum = 901;BA.debugLine="asbm_parting_line.Width = Width";
_asbm_parting_line.setWidth((int) (_width));
 //BA.debugLineNum = 904;BA.debugLine="asbm_add_background.Left = asbm_page_background.W";
_asbm_add_background.setLeft((int) (_asbm_page_background.getWidth()/(double)2-_asbm_add_background.getWidth()/(double)2));
 //BA.debugLineNum = 910;BA.debugLine="If TypeOfMenu = \"4 Icon Tabs\" Then";
if ((_typeofmenu).equals("4 Icon Tabs")) { 
 //BA.debugLineNum = 912;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 915;BA.debugLine="asbm_page_1.Width = asbm_add_background.left/2";
_asbm_page_1.setWidth((int) (_asbm_add_background.getLeft()/(double)2));
 }else {
 //BA.debugLineNum = 920;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 921;BA.debugLine="asbm_page_1.Width = asbm_page_background.Width";
_asbm_page_1.setWidth((int) (_asbm_page_background.getWidth()/(double)5));
 }else {
 //BA.debugLineNum = 923;BA.debugLine="asbm_page_1.Width = asbm_page_background.Width";
_asbm_page_1.setWidth((int) (_asbm_page_background.getWidth()/(double)4));
 };
 };
 //BA.debugLineNum = 929;BA.debugLine="asbm_page_1.Left = 0";
_asbm_page_1.setLeft((int) (0));
 //BA.debugLineNum = 931;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 933;BA.debugLine="asbm_page_2.Width = asbm_add_background.left/2";
_asbm_page_2.setWidth((int) (_asbm_add_background.getLeft()/(double)2));
 }else {
 //BA.debugLineNum = 937;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 938;BA.debugLine="asbm_page_2.Width = asbm_page_background.Width";
_asbm_page_2.setWidth((int) (_asbm_page_background.getWidth()/(double)5));
 }else {
 //BA.debugLineNum = 940;BA.debugLine="asbm_page_2.Width = asbm_page_background.Width";
_asbm_page_2.setWidth((int) (_asbm_page_background.getWidth()/(double)4));
 };
 };
 //BA.debugLineNum = 946;BA.debugLine="asbm_page_2.Left = asbm_page_1.Left +	asbm_page_";
_asbm_page_2.setLeft((int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()));
 //BA.debugLineNum = 948;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 952;BA.debugLine="asbm_page_5.Width = asbm_page_background.Width/";
_asbm_page_5.setWidth((int) (_asbm_page_background.getWidth()/(double)5));
 //BA.debugLineNum = 954;BA.debugLine="asbm_page_5.Left =	asbm_page_2.Left + asbm_page";
_asbm_page_5.setLeft((int) (_asbm_page_2.getLeft()+_asbm_page_2.getWidth()));
 };
 //BA.debugLineNum = 960;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 962;BA.debugLine="asbm_page_3.Width = asbm_add_background.left/2";
_asbm_page_3.setWidth((int) (_asbm_add_background.getLeft()/(double)2));
 //BA.debugLineNum = 963;BA.debugLine="asbm_page_3.Left = asbm_add_background.left + a";
_asbm_page_3.setLeft((int) (_asbm_add_background.getLeft()+_asbm_add_background.getWidth()));
 }else {
 //BA.debugLineNum = 966;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 967;BA.debugLine="asbm_page_3.Width = asbm_page_background.Width";
_asbm_page_3.setWidth((int) (_asbm_page_background.getWidth()/(double)5));
 //BA.debugLineNum = 969;BA.debugLine="asbm_page_3.Left = asbm_page_5.left + asbm_pag";
_asbm_page_3.setLeft((int) (_asbm_page_5.getLeft()+_asbm_page_5.getWidth()));
 }else {
 //BA.debugLineNum = 973;BA.debugLine="asbm_page_3.Width = asbm_page_background.Width";
_asbm_page_3.setWidth((int) (_asbm_page_background.getWidth()/(double)4));
 //BA.debugLineNum = 975;BA.debugLine="asbm_page_3.Left = asbm_page_2.left + asbm_pag";
_asbm_page_3.setLeft((int) (_asbm_page_2.getLeft()+_asbm_page_2.getWidth()));
 };
 };
 //BA.debugLineNum = 990;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 992;BA.debugLine="asbm_page_4.Width = asbm_add_background.left/2";
_asbm_page_4.setWidth((int) (_asbm_add_background.getLeft()/(double)2));
 }else {
 //BA.debugLineNum = 996;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 997;BA.debugLine="asbm_page_4.Width = asbm_page_background.Width";
_asbm_page_4.setWidth((int) (_asbm_page_background.getWidth()/(double)5));
 }else {
 //BA.debugLineNum = 999;BA.debugLine="asbm_page_4.Width = asbm_page_background.Width";
_asbm_page_4.setWidth((int) (_asbm_page_background.getWidth()/(double)4));
 };
 };
 //BA.debugLineNum = 1006;BA.debugLine="asbm_page_4.Left =	asbm_page_3.Left + asbm_page";
_asbm_page_4.setLeft((int) (_asbm_page_3.getLeft()+_asbm_page_3.getWidth()));
 }else if((_typeofmenu).equals("2 Icon Tabs")) { 
 //BA.debugLineNum = 1013;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1016;BA.debugLine="asbm_page_1.Width = asbm_add_background.left";
_asbm_page_1.setWidth(_asbm_add_background.getLeft());
 }else {
 //BA.debugLineNum = 1018;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1019;BA.debugLine="asbm_page_1.Width = asbm_page_background.Width";
_asbm_page_1.setWidth((int) (_asbm_page_background.getWidth()/(double)3));
 }else {
 //BA.debugLineNum = 1021;BA.debugLine="asbm_page_1.Width = asbm_page_background.Width";
_asbm_page_1.setWidth((int) (_asbm_page_background.getWidth()/(double)2));
 };
 };
 //BA.debugLineNum = 1028;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1030;BA.debugLine="asbm_page_5.Width = asbm_page_background.Widt";
_asbm_page_5.setWidth((int) (_asbm_page_background.getWidth()/(double)3));
 //BA.debugLineNum = 1032;BA.debugLine="asbm_page_5.Left = asbm_page_1.left + asbm_page";
_asbm_page_5.setLeft((int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()));
 };
 //BA.debugLineNum = 1037;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1039;BA.debugLine="asbm_page_2.Width = asbm_add_background.left";
_asbm_page_2.setWidth(_asbm_add_background.getLeft());
 }else {
 //BA.debugLineNum = 1041;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1042;BA.debugLine="asbm_page_2.Width = asbm_page_background.Width";
_asbm_page_2.setWidth((int) (_asbm_page_background.getWidth()/(double)3));
 }else {
 //BA.debugLineNum = 1044;BA.debugLine="asbm_page_2.Width = asbm_page_background.Width";
_asbm_page_2.setWidth((int) (_asbm_page_background.getWidth()/(double)2));
 };
 };
 //BA.debugLineNum = 1051;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1053;BA.debugLine="asbm_page_2.Left =	asbm_add_background.left + a";
_asbm_page_2.setLeft((int) (_asbm_add_background.getLeft()+_asbm_add_background.getWidth()));
 }else {
 //BA.debugLineNum = 1056;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1057;BA.debugLine="asbm_page_2.Left =	asbm_page_5.left + asbm_pag";
_asbm_page_2.setLeft((int) (_asbm_page_5.getLeft()+_asbm_page_5.getWidth()));
 }else {
 //BA.debugLineNum = 1059;BA.debugLine="asbm_page_2.Left =  asbm_page_1.Left + asbm_pa";
_asbm_page_2.setLeft((int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()));
 };
 };
 };
 //BA.debugLineNum = 1072;BA.debugLine="asbm_partinglines1.Width = 1dip";
_asbm_partinglines1.setWidth(__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 1073;BA.debugLine="asbm_partinglines1.Color = xui.Color_White";
_asbm_partinglines1.setColor(_xui.Color_White);
 //BA.debugLineNum = 1074;BA.debugLine="asbm_partinglines1.Height = asbm_page_background.";
_asbm_partinglines1.setHeight((int) (_asbm_page_background.getHeight()/(double)2));
 //BA.debugLineNum = 1076;BA.debugLine="asbm_partinglines2.Width = 1dip";
_asbm_partinglines2.setWidth(__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 1077;BA.debugLine="asbm_partinglines2.Color = xui.Color_White";
_asbm_partinglines2.setColor(_xui.Color_White);
 //BA.debugLineNum = 1078;BA.debugLine="asbm_partinglines2.Height = asbm_page_background.";
_asbm_partinglines2.setHeight((int) (_asbm_page_background.getHeight()/(double)2));
 //BA.debugLineNum = 1080;BA.debugLine="asbm_partinglines3.Width = 1dip";
_asbm_partinglines3.setWidth(__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 1081;BA.debugLine="asbm_partinglines3.Color = xui.Color_White";
_asbm_partinglines3.setColor(_xui.Color_White);
 //BA.debugLineNum = 1082;BA.debugLine="asbm_partinglines3.Height = asbm_page_background.";
_asbm_partinglines3.setHeight((int) (_asbm_page_background.getHeight()/(double)2));
 //BA.debugLineNum = 1084;BA.debugLine="asbm_partinglines4.Width = 1dip";
_asbm_partinglines4.setWidth(__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 1085;BA.debugLine="asbm_partinglines4.Color = xui.Color_White";
_asbm_partinglines4.setColor(_xui.Color_White);
 //BA.debugLineNum = 1086;BA.debugLine="asbm_partinglines4.Height = asbm_page_background.";
_asbm_partinglines4.setHeight((int) (_asbm_page_background.getHeight()/(double)2));
 //BA.debugLineNum = 1088;BA.debugLine="asbm_partinglines5.Width = 1dip";
_asbm_partinglines5.setWidth(__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 1089;BA.debugLine="asbm_partinglines5.Color = xui.Color_White";
_asbm_partinglines5.setColor(_xui.Color_White);
 //BA.debugLineNum = 1090;BA.debugLine="asbm_partinglines5.Height = asbm_page_background.";
_asbm_partinglines5.setHeight((int) (_asbm_page_background.getHeight()/(double)2));
 //BA.debugLineNum = 1104;BA.debugLine="If TypeOfMenu = \"4 Icon Tabs\" Then";
if ((_typeofmenu).equals("4 Icon Tabs")) { 
 //BA.debugLineNum = 1106;BA.debugLine="asbm_partinglines1.Left = asbm_page_1.Left + asb";
_asbm_partinglines1.setLeft((int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()));
 //BA.debugLineNum = 1107;BA.debugLine="asbm_partinglines1.Top = asbm_page_background.He";
_asbm_partinglines1.setTop((int) (_asbm_page_background.getHeight()/(double)2-_asbm_partinglines1.getHeight()/(double)2));
 //BA.debugLineNum = 1109;BA.debugLine="asbm_partinglines2.Left = asbm_page_2.Left + asb";
_asbm_partinglines2.setLeft((int) (_asbm_page_2.getLeft()+_asbm_page_2.getWidth()));
 //BA.debugLineNum = 1110;BA.debugLine="asbm_partinglines2.Top = asbm_page_background.He";
_asbm_partinglines2.setTop((int) (_asbm_page_background.getHeight()/(double)2-_asbm_partinglines2.getHeight()/(double)2));
 //BA.debugLineNum = 1112;BA.debugLine="asbm_partinglines3.Left = asbm_page_3.Left + asb";
_asbm_partinglines3.setLeft((int) (_asbm_page_3.getLeft()+_asbm_page_3.getWidth()));
 //BA.debugLineNum = 1113;BA.debugLine="asbm_partinglines3.Top = asbm_page_background.He";
_asbm_partinglines3.setTop((int) (_asbm_page_background.getHeight()/(double)2-_asbm_partinglines3.getHeight()/(double)2));
 //BA.debugLineNum = 1115;BA.debugLine="asbm_partinglines4.Left = asbm_page_4.Left + asb";
_asbm_partinglines4.setLeft((int) (_asbm_page_4.getLeft()+_asbm_page_4.getWidth()));
 //BA.debugLineNum = 1116;BA.debugLine="asbm_partinglines4.Top = asbm_page_background.He";
_asbm_partinglines4.setTop((int) (_asbm_page_background.getHeight()/(double)2-_asbm_partinglines4.getHeight()/(double)2));
 //BA.debugLineNum = 1120;BA.debugLine="Dim cx,cy As Int";
_cx = 0;
_cy = 0;
 //BA.debugLineNum = 1121;BA.debugLine="cx = asbm_page_1.Left + asbm_page_1.Width/2";
_cx = (int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()/(double)2);
 //BA.debugLineNum = 1122;BA.debugLine="cy = asbm_page_1.Top + asbm_page_1.Height/2.5";
_cy = (int) (_asbm_page_1.getTop()+_asbm_page_1.getHeight()/(double)2.5);
 //BA.debugLineNum = 1133;BA.debugLine="asbm_icon_1.Height = asbm_page_background.Height";
_asbm_icon_1.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1134;BA.debugLine="asbm_icon_1.Width = asbm_page_background.Height/";
_asbm_icon_1.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1136;BA.debugLine="asbm_icon_1.Left = cx - asbm_icon_1.Width/2";
_asbm_icon_1.setLeft((int) (_cx-_asbm_icon_1.getWidth()/(double)2));
 //BA.debugLineNum = 1137;BA.debugLine="asbm_icon_1.Top = cy - asbm_icon_1.Height/2";
_asbm_icon_1.setTop((int) (_cy-_asbm_icon_1.getHeight()/(double)2));
 //BA.debugLineNum = 1140;BA.debugLine="asbm_icon_2.Height = asbm_page_background.Height/2";
_asbm_icon_2.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1141;BA.debugLine="asbm_icon_2.Width = asbm_page_background.Height/";
_asbm_icon_2.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1143;BA.debugLine="asbm_icon_2.Left = cx - asbm_icon_2.Width/2";
_asbm_icon_2.setLeft((int) (_cx-_asbm_icon_2.getWidth()/(double)2));
 //BA.debugLineNum = 1144;BA.debugLine="asbm_icon_2.Top = cy - asbm_icon_2.Height/2";
_asbm_icon_2.setTop((int) (_cy-_asbm_icon_2.getHeight()/(double)2));
 //BA.debugLineNum = 1146;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1148;BA.debugLine="asbm_partinglines5.Left = asbm_page_5.Left + as";
_asbm_partinglines5.setLeft((int) (_asbm_page_5.getLeft()+_asbm_page_5.getWidth()));
 //BA.debugLineNum = 1149;BA.debugLine="asbm_partinglines5.Top = asbm_page_background.H";
_asbm_partinglines5.setTop((int) (_asbm_page_background.getHeight()/(double)2-_asbm_partinglines5.getHeight()/(double)2));
 //BA.debugLineNum = 1151;BA.debugLine="asbm_icon_5.Height = asbm_page_background.Heigh";
_asbm_icon_5.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1152;BA.debugLine="asbm_icon_5.Width = asbm_page_background.Height";
_asbm_icon_5.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1154;BA.debugLine="asbm_icon_5.Left = cx - asbm_icon_5.Width/2";
_asbm_icon_5.setLeft((int) (_cx-_asbm_icon_5.getWidth()/(double)2));
 //BA.debugLineNum = 1155;BA.debugLine="asbm_icon_5.Top = cy - asbm_icon_5.Height/2";
_asbm_icon_5.setTop((int) (_cy-_asbm_icon_5.getHeight()/(double)2));
 };
 //BA.debugLineNum = 1160;BA.debugLine="asbm_icon_3.Height = asbm_page_background.Height";
_asbm_icon_3.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1161;BA.debugLine="asbm_icon_3.Width = asbm_page_background.Height/";
_asbm_icon_3.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1163;BA.debugLine="asbm_icon_3.Left = cx - asbm_icon_3.Width/2";
_asbm_icon_3.setLeft((int) (_cx-_asbm_icon_3.getWidth()/(double)2));
 //BA.debugLineNum = 1164;BA.debugLine="asbm_icon_3.Top = cy - asbm_icon_3.Height/2";
_asbm_icon_3.setTop((int) (_cy-_asbm_icon_3.getHeight()/(double)2));
 //BA.debugLineNum = 1169;BA.debugLine="asbm_icon_4.Left = cx - asbm_icon_4.Width/2";
_asbm_icon_4.setLeft((int) (_cx-_asbm_icon_4.getWidth()/(double)2));
 //BA.debugLineNum = 1170;BA.debugLine="asbm_icon_4.Top = cy - asbm_icon_4.Height/2";
_asbm_icon_4.setTop((int) (_cy-_asbm_icon_4.getHeight()/(double)2));
 //BA.debugLineNum = 1172;BA.debugLine="asbm_icon_4.Height = asbm_page_background.Height";
_asbm_icon_4.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1173;BA.debugLine="asbm_icon_4.Width = asbm_page_background.Height/";
_asbm_icon_4.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1177;BA.debugLine="If e_text = True Then";
if (_e_text==__c.True) { 
 //BA.debugLineNum = 1179;BA.debugLine="asbm_icon_1.Top = asbm_icon_1.Top - 5dip";
_asbm_icon_1.setTop((int) (_asbm_icon_1.getTop()-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1180;BA.debugLine="asbm_icon_2.Top = asbm_icon_2.Top - 5dip";
_asbm_icon_2.setTop((int) (_asbm_icon_2.getTop()-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1181;BA.debugLine="asbm_icon_3.Top = asbm_icon_3.Top - 5dip";
_asbm_icon_3.setTop((int) (_asbm_icon_3.getTop()-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1182;BA.debugLine="asbm_icon_4.Top = asbm_icon_4.Top - 5dip";
_asbm_icon_4.setTop((int) (_asbm_icon_4.getTop()-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1184;BA.debugLine="asbm_text_1.Left = 2dip";
_asbm_text_1.setLeft(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1185;BA.debugLine="asbm_text_1.Width = asbm_page_1.Width - 2dip";
_asbm_text_1.setWidth((int) (_asbm_page_1.getWidth()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1186;BA.debugLine="asbm_text_1.Height = asbm_icon_1.Height/2";
_asbm_text_1.setHeight((int) (_asbm_icon_1.getHeight()/(double)2));
 //BA.debugLineNum = 1188;BA.debugLine="asbm_text_1.Top = asbm_icon_1.Top + asbm_icon_1";
_asbm_text_1.setTop((int) (_asbm_icon_1.getTop()+_asbm_icon_1.getHeight()));
 //BA.debugLineNum = 1190;BA.debugLine="asbm_text_2.Left = 2dip";
_asbm_text_2.setLeft(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1191;BA.debugLine="asbm_text_2.Width = asbm_page_2.Width - 2dip";
_asbm_text_2.setWidth((int) (_asbm_page_2.getWidth()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1192;BA.debugLine="asbm_text_2.Height = asbm_icon_2.Height/2";
_asbm_text_2.setHeight((int) (_asbm_icon_2.getHeight()/(double)2));
 //BA.debugLineNum = 1196;BA.debugLine="asbm_text_3.Left = 2dip";
_asbm_text_3.setLeft(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1197;BA.debugLine="asbm_text_3.Width = asbm_page_3.Width - 2dip";
_asbm_text_3.setWidth((int) (_asbm_page_3.getWidth()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1198;BA.debugLine="asbm_text_3.Height = asbm_icon_3.Height/2";
_asbm_text_3.setHeight((int) (_asbm_icon_3.getHeight()/(double)2));
 //BA.debugLineNum = 1200;BA.debugLine="asbm_text_3.Top = asbm_icon_3.Top + asbm_icon_3";
_asbm_text_3.setTop((int) (_asbm_icon_3.getTop()+_asbm_icon_3.getHeight()));
 //BA.debugLineNum = 1202;BA.debugLine="asbm_text_4.Left = 2dip";
_asbm_text_4.setLeft(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1203;BA.debugLine="asbm_text_4.Width = asbm_page_4.Width - 2dip";
_asbm_text_4.setWidth((int) (_asbm_page_4.getWidth()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1204;BA.debugLine="asbm_text_4.Height = asbm_icon_4.Height/2";
_asbm_text_4.setHeight((int) (_asbm_icon_4.getHeight()/(double)2));
 //BA.debugLineNum = 1206;BA.debugLine="asbm_text_4.Top = asbm_icon_4.Top + asbm_icon_4";
_asbm_text_4.setTop((int) (_asbm_icon_4.getTop()+_asbm_icon_4.getHeight()));
 //BA.debugLineNum = 1208;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1209;BA.debugLine="asbm_icon_5.Top = asbm_icon_5.Top - 5dip";
_asbm_icon_5.setTop((int) (_asbm_icon_5.getTop()-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1211;BA.debugLine="asbm_text_5.Left = 2dip";
_asbm_text_5.setLeft(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1212;BA.debugLine="asbm_text_5.Width = asbm_page_5.Width - 2dip";
_asbm_text_5.setWidth((int) (_asbm_page_5.getWidth()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1213;BA.debugLine="asbm_text_5.Height = asbm_icon_5.Height/2";
_asbm_text_5.setHeight((int) (_asbm_icon_5.getHeight()/(double)2));
 //BA.debugLineNum = 1215;BA.debugLine="asbm_text_5.Top = asbm_icon_5.Top + asbm_icon_";
_asbm_text_5.setTop((int) (_asbm_icon_5.getTop()+_asbm_icon_5.getHeight()));
 };
 //BA.debugLineNum = 1219;BA.debugLine="asbm_slider.Top = asbm_text_1.Top + asbm_text_1";
_asbm_slider.setTop((int) (_asbm_text_1.getTop()+_asbm_text_1.getHeight()+__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1221;BA.debugLine="asbm_icon_1.top = cy - asbm_icon_1.Height/2";
_asbm_icon_1.setTop((int) (_cy-_asbm_icon_1.getHeight()/(double)2));
 //BA.debugLineNum = 1222;BA.debugLine="asbm_icon_2.top = cy - asbm_icon_2.Height/2";
_asbm_icon_2.setTop((int) (_cy-_asbm_icon_2.getHeight()/(double)2));
 //BA.debugLineNum = 1223;BA.debugLine="asbm_icon_3.top = cy - asbm_icon_3.Height/2";
_asbm_icon_3.setTop((int) (_cy-_asbm_icon_3.getHeight()/(double)2));
 //BA.debugLineNum = 1224;BA.debugLine="asbm_icon_4.top = cy - asbm_icon_4.Height/2";
_asbm_icon_4.setTop((int) (_cy-_asbm_icon_4.getHeight()/(double)2));
 //BA.debugLineNum = 1227;BA.debugLine="asbm_text_1.Top = asbm_slider.Top - asbm_text_1";
_asbm_text_1.setTop((int) (_asbm_slider.getTop()-_asbm_text_1.getHeight()/(double)1.4));
 //BA.debugLineNum = 1228;BA.debugLine="asbm_text_2.Top = asbm_slider.Top - asbm_text_2";
_asbm_text_2.setTop((int) (_asbm_slider.getTop()-_asbm_text_2.getHeight()/(double)1.4));
 //BA.debugLineNum = 1229;BA.debugLine="asbm_text_3.Top = asbm_slider.Top - asbm_text_3";
_asbm_text_3.setTop((int) (_asbm_slider.getTop()-_asbm_text_3.getHeight()/(double)1.4));
 //BA.debugLineNum = 1230;BA.debugLine="asbm_text_4.Top = asbm_slider.Top - asbm_text_4";
_asbm_text_4.setTop((int) (_asbm_slider.getTop()-_asbm_text_4.getHeight()/(double)1.4));
 //BA.debugLineNum = 1232;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1233;BA.debugLine="asbm_icon_5.top = cy - asbm_icon_5.Height/2";
_asbm_icon_5.setTop((int) (_cy-_asbm_icon_5.getHeight()/(double)2));
 //BA.debugLineNum = 1234;BA.debugLine="asbm_text_5.Top = asbm_slider.Top - asbm_text_";
_asbm_text_5.setTop((int) (_asbm_slider.getTop()-_asbm_text_5.getHeight()/(double)1.4));
 };
 //BA.debugLineNum = 1238;BA.debugLine="If currentpage = 1 Then";
if (_currentpage==1) { 
 //BA.debugLineNum = 1240;BA.debugLine="asbm_icon_1.top = cy - asbm_icon_1.Height/2 -";
_asbm_icon_1.setTop((int) (_cy-_asbm_icon_1.getHeight()/(double)2-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1242;BA.debugLine="asbm_text_1.top = asbm_icon_1.Top + asbm_icon_";
_asbm_text_1.setTop((int) (_asbm_icon_1.getTop()+_asbm_icon_1.getHeight()));
 }else if(_currentpage==2) { 
 //BA.debugLineNum = 1244;BA.debugLine="asbm_icon_2.top = cy - asbm_icon_2.Height/2 -";
_asbm_icon_2.setTop((int) (_cy-_asbm_icon_2.getHeight()/(double)2-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1245;BA.debugLine="asbm_text_2.top = asbm_icon_2.Top + asbm_icon_";
_asbm_text_2.setTop((int) (_asbm_icon_2.getTop()+_asbm_icon_2.getHeight()));
 }else if(_currentpage==3) { 
 //BA.debugLineNum = 1247;BA.debugLine="asbm_icon_3.top = cy - asbm_icon_3.Height/2 -";
_asbm_icon_3.setTop((int) (_cy-_asbm_icon_3.getHeight()/(double)2-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1248;BA.debugLine="asbm_text_3.top = asbm_icon_3.Top + asbm_icon_";
_asbm_text_3.setTop((int) (_asbm_icon_3.getTop()+_asbm_icon_3.getHeight()));
 }else if(_currentpage==4) { 
 //BA.debugLineNum = 1250;BA.debugLine="asbm_icon_4.top = cy - asbm_icon_4.Height/2 -";
_asbm_icon_4.setTop((int) (_cy-_asbm_icon_4.getHeight()/(double)2-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1251;BA.debugLine="asbm_text_4.top = asbm_icon_4.Top + asbm_icon_";
_asbm_text_4.setTop((int) (_asbm_icon_4.getTop()+_asbm_icon_4.getHeight()));
 }else if(_currentpage==5) { 
 //BA.debugLineNum = 1253;BA.debugLine="asbm_icon_5.top = cy - asbm_icon_5.Height/2 -";
_asbm_icon_5.setTop((int) (_cy-_asbm_icon_5.getHeight()/(double)2-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1254;BA.debugLine="asbm_text_5.top = asbm_icon_5.Top + asbm_icon_";
_asbm_text_5.setTop((int) (_asbm_icon_5.getTop()+_asbm_icon_5.getHeight()));
 };
 }else {
 //BA.debugLineNum = 1259;BA.debugLine="asbm_slider.Top = asbm_icon_1.Top + asbm_icon_1";
_asbm_slider.setTop((int) (_asbm_icon_1.getTop()+_asbm_icon_1.getHeight()+__c.DipToCurrent((int) (5))));
 };
 }else if((_typeofmenu).equals("2 Icon Tabs")) { 
 //BA.debugLineNum = 1267;BA.debugLine="Dim cx,cy As Int";
_cx = 0;
_cy = 0;
 //BA.debugLineNum = 1268;BA.debugLine="cx = asbm_page_1.Left + asbm_page_1.Width/2";
_cx = (int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()/(double)2);
 //BA.debugLineNum = 1269;BA.debugLine="cy = asbm_page_1.Top + asbm_page_1.Height/2.5";
_cy = (int) (_asbm_page_1.getTop()+_asbm_page_1.getHeight()/(double)2.5);
 //BA.debugLineNum = 1271;BA.debugLine="asbm_partinglines1.Left = asbm_page_1.Left + asb";
_asbm_partinglines1.setLeft((int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()));
 //BA.debugLineNum = 1272;BA.debugLine="asbm_partinglines1.Top = asbm_page_background.He";
_asbm_partinglines1.setTop((int) (_asbm_page_background.getHeight()/(double)2-_asbm_partinglines1.getHeight()/(double)2));
 //BA.debugLineNum = 1274;BA.debugLine="asbm_partinglines2.Left = asbm_page_2.Left + asb";
_asbm_partinglines2.setLeft((int) (_asbm_page_2.getLeft()+_asbm_page_2.getWidth()));
 //BA.debugLineNum = 1275;BA.debugLine="asbm_partinglines2.Top = asbm_page_background.He";
_asbm_partinglines2.setTop((int) (_asbm_page_background.getHeight()/(double)2-_asbm_partinglines2.getHeight()/(double)2));
 //BA.debugLineNum = 1281;BA.debugLine="asbm_icon_1.Height = asbm_page_background.Height";
_asbm_icon_1.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1282;BA.debugLine="asbm_icon_1.Width = asbm_page_background.Height/";
_asbm_icon_1.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1284;BA.debugLine="asbm_icon_1.Left = cx - asbm_icon_1.Width/2";
_asbm_icon_1.setLeft((int) (_cx-_asbm_icon_1.getWidth()/(double)2));
 //BA.debugLineNum = 1285;BA.debugLine="asbm_icon_1.Top = cy - asbm_icon_1.Height/2";
_asbm_icon_1.setTop((int) (_cy-_asbm_icon_1.getHeight()/(double)2));
 //BA.debugLineNum = 1287;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1289;BA.debugLine="asbm_partinglines5.Left = asbm_page_5.Left + as";
_asbm_partinglines5.setLeft((int) (_asbm_page_5.getLeft()+_asbm_page_5.getWidth()));
 //BA.debugLineNum = 1290;BA.debugLine="asbm_partinglines5.Top = asbm_page_background.H";
_asbm_partinglines5.setTop((int) (_asbm_page_background.getHeight()/(double)2-_asbm_partinglines5.getHeight()/(double)2));
 //BA.debugLineNum = 1292;BA.debugLine="asbm_icon_5.Height = asbm_page_background.Heigh";
_asbm_icon_5.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1293;BA.debugLine="asbm_icon_5.Width = asbm_page_background.Height";
_asbm_icon_5.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1295;BA.debugLine="asbm_icon_5.Left = cx - asbm_icon_5.Width/2";
_asbm_icon_5.setLeft((int) (_cx-_asbm_icon_5.getWidth()/(double)2));
 //BA.debugLineNum = 1296;BA.debugLine="asbm_icon_5.Top = cy - asbm_icon_5.Height/2";
_asbm_icon_5.setTop((int) (_cy-_asbm_icon_5.getHeight()/(double)2));
 };
 //BA.debugLineNum = 1300;BA.debugLine="asbm_icon_2.Height = asbm_page_background.Height";
_asbm_icon_2.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1301;BA.debugLine="asbm_icon_2.Width = asbm_page_background.Height/";
_asbm_icon_2.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1303;BA.debugLine="asbm_icon_2.Left = cx - asbm_icon_2.Width/2";
_asbm_icon_2.setLeft((int) (_cx-_asbm_icon_2.getWidth()/(double)2));
 //BA.debugLineNum = 1304;BA.debugLine="asbm_icon_2.Top = cy - asbm_icon_2.Height/2";
_asbm_icon_2.setTop((int) (_cy-_asbm_icon_2.getHeight()/(double)2));
 //BA.debugLineNum = 1309;BA.debugLine="If e_text = True Then";
if (_e_text==__c.True) { 
 //BA.debugLineNum = 1311;BA.debugLine="asbm_icon_1.Top = asbm_icon_1.Top - 5dip";
_asbm_icon_1.setTop((int) (_asbm_icon_1.getTop()-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1312;BA.debugLine="asbm_icon_2.Top = asbm_icon_2.Top - 5dip";
_asbm_icon_2.setTop((int) (_asbm_icon_2.getTop()-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1314;BA.debugLine="asbm_text_1.Left = 2dip";
_asbm_text_1.setLeft(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1315;BA.debugLine="asbm_text_1.Width = asbm_page_1.Width - 2dip";
_asbm_text_1.setWidth((int) (_asbm_page_1.getWidth()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1316;BA.debugLine="asbm_text_1.Height = asbm_icon_1.Height/2";
_asbm_text_1.setHeight((int) (_asbm_icon_1.getHeight()/(double)2));
 //BA.debugLineNum = 1318;BA.debugLine="asbm_text_1.Top = asbm_icon_1.Top + asbm_icon_1";
_asbm_text_1.setTop((int) (_asbm_icon_1.getTop()+_asbm_icon_1.getHeight()));
 //BA.debugLineNum = 1320;BA.debugLine="asbm_text_2.Left = 2dip";
_asbm_text_2.setLeft(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1321;BA.debugLine="asbm_text_2.Width = asbm_page_2.Width - 2dip";
_asbm_text_2.setWidth((int) (_asbm_page_2.getWidth()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1322;BA.debugLine="asbm_text_2.Height = asbm_icon_2.Height/2";
_asbm_text_2.setHeight((int) (_asbm_icon_2.getHeight()/(double)2));
 //BA.debugLineNum = 1324;BA.debugLine="asbm_text_2.Top = asbm_icon_2.Top + asbm_icon_2";
_asbm_text_2.setTop((int) (_asbm_icon_2.getTop()+_asbm_icon_2.getHeight()));
 //BA.debugLineNum = 1327;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1328;BA.debugLine="asbm_icon_5.Top = asbm_icon_5.Top - 5dip";
_asbm_icon_5.setTop((int) (_asbm_icon_5.getTop()-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1330;BA.debugLine="asbm_text_5.Left = 2dip";
_asbm_text_5.setLeft(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1331;BA.debugLine="asbm_text_5.Width = asbm_page_5.Width - 2dip";
_asbm_text_5.setWidth((int) (_asbm_page_5.getWidth()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1332;BA.debugLine="asbm_text_5.Height = asbm_icon_5.Height/2";
_asbm_text_5.setHeight((int) (_asbm_icon_5.getHeight()/(double)2));
 //BA.debugLineNum = 1334;BA.debugLine="asbm_text_5.Top = asbm_icon_5.Top + asbm_icon_";
_asbm_text_5.setTop((int) (_asbm_icon_5.getTop()+_asbm_icon_5.getHeight()));
 };
 //BA.debugLineNum = 1338;BA.debugLine="asbm_slider.Top = asbm_text_1.Top + asbm_text_1";
_asbm_slider.setTop((int) (_asbm_text_1.getTop()+_asbm_text_1.getHeight()+__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1340;BA.debugLine="asbm_icon_1.top = cy - asbm_icon_1.Height/2";
_asbm_icon_1.setTop((int) (_cy-_asbm_icon_1.getHeight()/(double)2));
 //BA.debugLineNum = 1341;BA.debugLine="asbm_icon_2.top = cy - asbm_icon_2.Height/2";
_asbm_icon_2.setTop((int) (_cy-_asbm_icon_2.getHeight()/(double)2));
 //BA.debugLineNum = 1345;BA.debugLine="asbm_text_1.Top = asbm_slider.Top - asbm_text_1";
_asbm_text_1.setTop((int) (_asbm_slider.getTop()-_asbm_text_1.getHeight()/(double)1.4));
 //BA.debugLineNum = 1346;BA.debugLine="asbm_text_2.Top = asbm_slider.Top - asbm_text_2";
_asbm_text_2.setTop((int) (_asbm_slider.getTop()-_asbm_text_2.getHeight()/(double)1.4));
 //BA.debugLineNum = 1349;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1350;BA.debugLine="asbm_icon_5.top = cy - asbm_icon_5.Height/2";
_asbm_icon_5.setTop((int) (_cy-_asbm_icon_5.getHeight()/(double)2));
 //BA.debugLineNum = 1351;BA.debugLine="asbm_text_5.Top = asbm_slider.Top - asbm_text_";
_asbm_text_5.setTop((int) (_asbm_slider.getTop()-_asbm_text_5.getHeight()/(double)1.4));
 };
 //BA.debugLineNum = 1355;BA.debugLine="If currentpage = 1 Then";
if (_currentpage==1) { 
 //BA.debugLineNum = 1357;BA.debugLine="asbm_icon_1.top = cy - asbm_icon_1.Height/2 -";
_asbm_icon_1.setTop((int) (_cy-_asbm_icon_1.getHeight()/(double)2-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1359;BA.debugLine="asbm_text_1.top = asbm_icon_1.Top + asbm_icon_";
_asbm_text_1.setTop((int) (_asbm_icon_1.getTop()+_asbm_icon_1.getHeight()));
 }else if(_currentpage==2) { 
 //BA.debugLineNum = 1361;BA.debugLine="asbm_icon_2.top = cy - asbm_icon_2.Height/2 -";
_asbm_icon_2.setTop((int) (_cy-_asbm_icon_2.getHeight()/(double)2-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1362;BA.debugLine="asbm_text_2.top = asbm_icon_2.Top + asbm_icon_";
_asbm_text_2.setTop((int) (_asbm_icon_2.getTop()+_asbm_icon_2.getHeight()));
 }else if(_currentpage==5) { 
 //BA.debugLineNum = 1365;BA.debugLine="asbm_icon_5.top = cy - asbm_icon_5.Height/2 -";
_asbm_icon_5.setTop((int) (_cy-_asbm_icon_5.getHeight()/(double)2-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1366;BA.debugLine="asbm_text_5.top = asbm_icon_5.Top + asbm_icon_";
_asbm_text_5.setTop((int) (_asbm_icon_5.getTop()+_asbm_icon_5.getHeight()));
 };
 }else {
 //BA.debugLineNum = 1371;BA.debugLine="asbm_slider.Top = asbm_icon_1.Top + asbm_icon_1";
_asbm_slider.setTop((int) (_asbm_icon_1.getTop()+_asbm_icon_1.getHeight()+__c.DipToCurrent((int) (5))));
 };
 };
 //BA.debugLineNum = 1379;BA.debugLine="If currentpage = 1 Then";
if (_currentpage==1) { 
 //BA.debugLineNum = 1382;BA.debugLine="Dim cx As Int = asbm_page_1.Left + asbm_page_1.W";
_cx = (int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()/(double)2);
 //BA.debugLineNum = 1385;BA.debugLine="asbm_slider.Left = cx - asbm_slider.Width/2";
_asbm_slider.setLeft((int) (_cx-_asbm_slider.getWidth()/(double)2));
 }else if(_currentpage==2) { 
 //BA.debugLineNum = 1390;BA.debugLine="Dim cx As Int = asbm_page_2.Left + asbm_page_2.W";
_cx = (int) (_asbm_page_2.getLeft()+_asbm_page_2.getWidth()/(double)2);
 //BA.debugLineNum = 1392;BA.debugLine="asbm_slider.Left =	cx - asbm_slider.Width/2";
_asbm_slider.setLeft((int) (_cx-_asbm_slider.getWidth()/(double)2));
 }else if(_currentpage==3) { 
 //BA.debugLineNum = 1397;BA.debugLine="Dim cx As Int = asbm_page_3.Left + asbm_page_3.W";
_cx = (int) (_asbm_page_3.getLeft()+_asbm_page_3.getWidth()/(double)2);
 //BA.debugLineNum = 1400;BA.debugLine="asbm_slider.Left = cx - asbm_slider.Width/2";
_asbm_slider.setLeft((int) (_cx-_asbm_slider.getWidth()/(double)2));
 }else if(_currentpage==4) { 
 //BA.debugLineNum = 1404;BA.debugLine="Dim cx As Int = asbm_page_4.Left + asbm_page_4.W";
_cx = (int) (_asbm_page_4.getLeft()+_asbm_page_4.getWidth()/(double)2);
 //BA.debugLineNum = 1407;BA.debugLine="asbm_slider.Left = cx - asbm_slider.Width/2";
_asbm_slider.setLeft((int) (_cx-_asbm_slider.getWidth()/(double)2));
 }else if(_currentpage==5) { 
 //BA.debugLineNum = 1411;BA.debugLine="Dim cx As Int = asbm_page_5.Left + asbm_page_5.W";
_cx = (int) (_asbm_page_5.getLeft()+_asbm_page_5.getWidth()/(double)2);
 //BA.debugLineNum = 1414;BA.debugLine="asbm_slider.Left = cx - asbm_slider.Width/2";
_asbm_slider.setLeft((int) (_cx-_asbm_slider.getWidth()/(double)2));
 };
 //BA.debugLineNum = 1420;BA.debugLine="If TypeOfMenu = \"4 Icon Tabs\" Then";
if ((_typeofmenu).equals("4 Icon Tabs")) { 
 //BA.debugLineNum = 1422;BA.debugLine="asbm_badget_1.Left = asbm_icon_1.Left + asbm_icon";
_asbm_badget_1.setLeft((int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1423;BA.debugLine="asbm_badget_2.Left = asbm_icon_1.Left + asbm_icon";
_asbm_badget_2.setLeft((int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1424;BA.debugLine="asbm_badget_3.Left = asbm_icon_1.Left + asbm_icon";
_asbm_badget_3.setLeft((int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1425;BA.debugLine="asbm_badget_4.Left = asbm_icon_1.Left + asbm_icon";
_asbm_badget_4.setLeft((int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1427;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1429;BA.debugLine="asbm_badget_5.Left = asbm_icon_1.Left + asbm_ic";
_asbm_badget_5.setLeft((int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))));
 };
 }else if((_typeofmenu).equals("2 Icon Tabs")) { 
 //BA.debugLineNum = 1435;BA.debugLine="asbm_badget_1.Left = asbm_icon_1.Left + asbm_ico";
_asbm_badget_1.setLeft((int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1436;BA.debugLine="asbm_badget_2.Left = asbm_icon_1.Left + asbm_ico";
_asbm_badget_2.setLeft((int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1438;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1440;BA.debugLine="asbm_badget_5.Left = asbm_icon_1.Left + asbm_ic";
_asbm_badget_5.setLeft((int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))));
 };
 };
 //BA.debugLineNum = 1446;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _changecolorbasedonalphalevel(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _newcolor) throws Exception{
b4a.example.bitmapcreator _bc = null;
b4a.example.bitmapcreator._argbcolor _a1 = null;
b4a.example.bitmapcreator._argbcolor _a2 = null;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 3310;BA.debugLine="Private Sub ChangeColorBasedOnAlphaLevel(bmp As B4";
 //BA.debugLineNum = 3311;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 3312;BA.debugLine="bc.Initialize(bmp.Width, bmp.Height)";
_bc._initialize(ba,(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
 //BA.debugLineNum = 3313;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
 //BA.debugLineNum = 3314;BA.debugLine="Dim a1, a2 As ARGBColor";
_a1 = new b4a.example.bitmapcreator._argbcolor();
_a2 = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 3315;BA.debugLine="bc.ColorToARGB(NewColor, a1)";
_bc._colortoargb(_newcolor,_a1);
 //BA.debugLineNum = 3316;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step6 = 1;
final int limit6 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit6 ;_y = _y + step6 ) {
 //BA.debugLineNum = 3317;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step7 = 1;
final int limit7 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit7 ;_x = _x + step7 ) {
 //BA.debugLineNum = 3318;BA.debugLine="bc.GetARGB(x, y, a2)";
_bc._getargb(_x,_y,_a2);
 //BA.debugLineNum = 3319;BA.debugLine="If a2.a > 0 Then";
if (_a2.a>0) { 
 //BA.debugLineNum = 3320;BA.debugLine="a2.r = a1.r";
_a2.r = _a1.r;
 //BA.debugLineNum = 3321;BA.debugLine="a2.g = a1.g";
_a2.g = _a1.g;
 //BA.debugLineNum = 3322;BA.debugLine="a2.b = a1.b";
_a2.b = _a1.b;
 //BA.debugLineNum = 3323;BA.debugLine="bc.SetARGB(x, y, a2)";
_bc._setargb(_x,_y,_a2);
 };
 }
};
 }
};
 //BA.debugLineNum = 3327;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
 //BA.debugLineNum = 3328;BA.debugLine="End Sub";
return null;
}
public String  _changemiddlebuttonsize(double _size,double _borderwidth) throws Exception{
 //BA.debugLineNum = 3082;BA.debugLine="Public Sub ChangeMiddleButtonSize(size As Double,";
 //BA.debugLineNum = 3084;BA.debugLine="asbm_add_background.Height = size";
_asbm_add_background.setHeight((int) (_size));
 //BA.debugLineNum = 3085;BA.debugLine="asbm_add_background.Width = size";
_asbm_add_background.setWidth((int) (_size));
 //BA.debugLineNum = 3087;BA.debugLine="asbm_add_background.SetColorAndBorder(m_Backgroun";
_asbm_add_background.SetColorAndBorder(_m_backgroundcolor,(int) (_borderwidth),_xui.Color_White,(int) (_asbm_add_background.getHeight()/(double)2));
 //BA.debugLineNum = 3089;BA.debugLine="asbm_add_background.Top = asbm_parting_line.Top -";
_asbm_add_background.setTop((int) (_asbm_parting_line.getTop()-_asbm_add_background.getHeight()/(double)2));
 //BA.debugLineNum = 3091;BA.debugLine="asbm_add_background.Left = asbm_page_background.W";
_asbm_add_background.setLeft((int) (_asbm_page_background.getWidth()/(double)2-_asbm_add_background.getWidth()/(double)2));
 //BA.debugLineNum = 3093;BA.debugLine="pnl_asbm_add_icon.Width = asbm_add_background.Wid";
_pnl_asbm_add_icon.setWidth((int) (_asbm_add_background.getWidth()/(double)2.5));
 //BA.debugLineNum = 3094;BA.debugLine="pnl_asbm_add_icon.Height = asbm_add_background.He";
_pnl_asbm_add_icon.setHeight((int) (_asbm_add_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 3096;BA.debugLine="pnl_asbm_add_icon.Left = asbm_add_background.Widt";
_pnl_asbm_add_icon.setLeft((int) (_asbm_add_background.getWidth()/(double)2-_pnl_asbm_add_icon.getWidth()/(double)2));
 //BA.debugLineNum = 3097;BA.debugLine="pnl_asbm_add_icon.Top = asbm_add_background.Heigh";
_pnl_asbm_add_icon.setTop((int) (_asbm_add_background.getHeight()/(double)2-_pnl_asbm_add_icon.getHeight()/(double)2));
 //BA.debugLineNum = 3100;BA.debugLine="End Sub";
return "";
}
public boolean  _checksize(anywheresoftware.b4a.objects.B4XViewWrapper _v,float _size) throws Exception{
 //BA.debugLineNum = 3343;BA.debugLine="Private Sub CheckSize(v As B4XView ,size As Float)";
 //BA.debugLineNum = 3344;BA.debugLine="v.TextSize = size";
_v.setTextSize(_size);
 //BA.debugLineNum = 3349;BA.debugLine="Return MeasureTextWidth(v.Text, v.Font) > v.Wid";
if (true) return _measuretextwidth(_v.getText(),_v.getFont())>_v.getWidth() || _measuretextheight(_v.getText(),_v.getFont())>_v.getHeight();
 //BA.debugLineNum = 3352;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 66;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 67;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 68;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 70;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
 //BA.debugLineNum = 72;BA.debugLine="Private currentpage As Int = 1";
_currentpage = (int) (1);
 //BA.debugLineNum = 74;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 76;BA.debugLine="Private asbm_page_1,asbm_page_2,asbm_page_3,asbm_";
_asbm_page_1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_page_2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_page_3 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_page_4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_page_5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 77;BA.debugLine="Private asbm_icon_1,asbm_icon_2,asbm_icon_3,asbm_";
_asbm_icon_1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
_asbm_icon_2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
_asbm_icon_3 = new anywheresoftware.b4a.objects.ImageViewWrapper();
_asbm_icon_4 = new anywheresoftware.b4a.objects.ImageViewWrapper();
_asbm_icon_5 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 78;BA.debugLine="Private asbm_badget_1,asbm_badget_2,asbm_badget_3";
_asbm_badget_1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_badget_2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_badget_3 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_badget_4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_badget_5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Private asbm_slider As B4XView";
_asbm_slider = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Private asbm_text_1,asbm_text_2,asbm_text_3,asbm_";
_asbm_text_1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_text_2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_text_3 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_text_4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_text_5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 83;BA.debugLine="Private asbm_partinglines1,asbm_partinglines2,asb";
_asbm_partinglines1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_partinglines2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_partinglines3 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_partinglines4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_asbm_partinglines5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 85;BA.debugLine="Private asbm_add_background As B4XView";
_asbm_add_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 87;BA.debugLine="Private asbm_parting_line As B4XView";
_asbm_parting_line = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 89;BA.debugLine="Private asbm_page_background As B4XView";
_asbm_page_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Private s_Color1 As Int";
_s_color1 = 0;
 //BA.debugLineNum = 92;BA.debugLine="Private s_Color2 As Int";
_s_color2 = 0;
 //BA.debugLineNum = 93;BA.debugLine="Private s_Color3 As Int";
_s_color3 = 0;
 //BA.debugLineNum = 94;BA.debugLine="Private s_Color4 As Int";
_s_color4 = 0;
 //BA.debugLineNum = 95;BA.debugLine="Private s_Color5 As Int";
_s_color5 = 0;
 //BA.debugLineNum = 97;BA.debugLine="Private b_Color As Int";
_b_color = 0;
 //BA.debugLineNum = 99;BA.debugLine="Private p_Line As Int";
_p_line = 0;
 //BA.debugLineNum = 101;BA.debugLine="Private m_BackgroundColor As Int";
_m_backgroundcolor = 0;
 //BA.debugLineNum = 103;BA.debugLine="Private e_BadgetColor1 As Boolean";
_e_badgetcolor1 = false;
 //BA.debugLineNum = 104;BA.debugLine="Private e_BadgetColor2 As Boolean";
_e_badgetcolor2 = false;
 //BA.debugLineNum = 105;BA.debugLine="Private e_BadgetColor3 As Boolean";
_e_badgetcolor3 = false;
 //BA.debugLineNum = 106;BA.debugLine="Private e_BadgetColor4 As Boolean";
_e_badgetcolor4 = false;
 //BA.debugLineNum = 107;BA.debugLine="Private e_BadgetColor5 As Boolean";
_e_badgetcolor5 = false;
 //BA.debugLineNum = 109;BA.debugLine="Private b_color1 As Int";
_b_color1 = 0;
 //BA.debugLineNum = 110;BA.debugLine="Private b_color2 As Int";
_b_color2 = 0;
 //BA.debugLineNum = 111;BA.debugLine="Private b_color3 As Int";
_b_color3 = 0;
 //BA.debugLineNum = 112;BA.debugLine="Private b_color4 As Int";
_b_color4 = 0;
 //BA.debugLineNum = 113;BA.debugLine="Private b_color5 As Int";
_b_color5 = 0;
 //BA.debugLineNum = 115;BA.debugLine="Private p_ClickColor As Int";
_p_clickcolor = 0;
 //BA.debugLineNum = 117;BA.debugLine="Private p_Lines_Color As Int";
_p_lines_color = 0;
 //BA.debugLineNum = 119;BA.debugLine="Private e_SelectedPageColor As Boolean";
_e_selectedpagecolor = false;
 //BA.debugLineNum = 121;BA.debugLine="Private s_PageColor As Int";
_s_pagecolor = 0;
 //BA.debugLineNum = 123;BA.debugLine="Private MiddleButtonVisible As Boolean";
_middlebuttonvisible = false;
 //BA.debugLineNum = 125;BA.debugLine="Private pnl_asbm_add_icon As ImageView";
_pnl_asbm_add_icon = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 127;BA.debugLine="Private icon1 As B4XBitmap";
_icon1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 128;BA.debugLine="Private icon2 As B4XBitmap";
_icon2 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 129;BA.debugLine="Private icon3 As B4XBitmap";
_icon3 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 130;BA.debugLine="Private icon4 As B4XBitmap";
_icon4 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 131;BA.debugLine="Private icon5 As B4XBitmap";
_icon5 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 133;BA.debugLine="Private EnableMiddleButtonAsPage As Boolean";
_enablemiddlebuttonaspage = false;
 //BA.debugLineNum = 135;BA.debugLine="Private middleicon As B4XBitmap";
_middleicon = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 137;BA.debugLine="Private TypeOfMenu As String = \"4 Icon Tabs\"";
_typeofmenu = "4 Icon Tabs";
 //BA.debugLineNum = 139;BA.debugLine="Private Mode As Int = 1";
_mode = (int) (1);
 //BA.debugLineNum = 141;BA.debugLine="Private e_text As Boolean";
_e_text = false;
 //BA.debugLineNum = 142;BA.debugLine="Private t_color As Int";
_t_color = 0;
 //BA.debugLineNum = 143;BA.debugLine="Private text_1 As String";
_text_1 = "";
 //BA.debugLineNum = 144;BA.debugLine="Private text_2 As String";
_text_2 = "";
 //BA.debugLineNum = 145;BA.debugLine="Private text_3 As String";
_text_3 = "";
 //BA.debugLineNum = 146;BA.debugLine="Private text_4 As String";
_text_4 = "";
 //BA.debugLineNum = 147;BA.debugLine="Private text_5 As String";
_text_5 = "";
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public void  _createhaloeffect(anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _x,int _y,int _clr) throws Exception{
ResumableSub_CreateHaloEffect rsub = new ResumableSub_CreateHaloEffect(this,_parent,_x,_y,_clr);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateHaloEffect extends BA.ResumableSub {
public ResumableSub_CreateHaloEffect(com.bwsi.cares.asbottommenu parent,anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _x,int _y,int _clr) {
this.parent = parent;
this._parent = _parent;
this._x = _x;
this._y = _y;
this._clr = _clr;
}
com.bwsi.cares.asbottommenu parent;
anywheresoftware.b4a.objects.B4XViewWrapper _parent;
int _x;
int _y;
int _clr;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _radius = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _i = 0;
int step8;
int limit8;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3283;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 3284;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 3285;BA.debugLine="Dim radius As Int = 150dip";
_radius = parent.__c.DipToCurrent((int) (150));
 //BA.debugLineNum = 3286;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, radius * 2, radius *";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_radius*2),(int) (_radius*2));
 //BA.debugLineNum = 3287;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
 //BA.debugLineNum = 3288;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Target";
_cvs.DrawCircle(_cvs.getTargetRect().getCenterX(),_cvs.getTargetRect().getCenterY(),(float) (_cvs.getTargetRect().getWidth()/(double)2),_clr,parent.__c.True,(float) (0));
 //BA.debugLineNum = 3289;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _cvs.CreateBitmap();
 //BA.debugLineNum = 3290;BA.debugLine="For i = 1 To 1";
if (true) break;

case 1:
//for
this.state = 4;
step8 = 1;
limit8 = (int) (1);
_i = (int) (1) ;
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 3291;BA.debugLine="CreateHaloEffectHelper(Parent,bmp, x, y, clr, ra";
parent._createhaloeffecthelper(_parent,_bmp,_x,_y,_clr,_radius);
 //BA.debugLineNum = 3292;BA.debugLine="Sleep(800)";
parent.__c.Sleep(ba,this,(int) (800));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 3294;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _createhaloeffecthelper(anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _x,int _y,int _clr,int _radius) throws Exception{
ResumableSub_CreateHaloEffectHelper rsub = new ResumableSub_CreateHaloEffectHelper(this,_parent,_bmp,_x,_y,_clr,_radius);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateHaloEffectHelper extends BA.ResumableSub {
public ResumableSub_CreateHaloEffectHelper(com.bwsi.cares.asbottommenu parent,anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _x,int _y,int _clr,int _radius) {
this.parent = parent;
this._parent = _parent;
this._bmp = _bmp;
this._x = _x;
this._y = _y;
this._clr = _clr;
this._radius = _radius;
}
com.bwsi.cares.asbottommenu parent;
anywheresoftware.b4a.objects.B4XViewWrapper _parent;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp;
int _x;
int _y;
int _clr;
int _radius;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _duration = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 3297;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 3298;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 3299;BA.debugLine="Dim p As B4XView = iv";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 3300;BA.debugLine="p.SetBitmap(bmp)";
_p.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 3301;BA.debugLine="Parent.AddView(p, x, y, 0, 0)";
_parent.AddView((android.view.View)(_p.getObject()),_x,_y,(int) (0),(int) (0));
 //BA.debugLineNum = 3302;BA.debugLine="Dim duration As Int = 1000";
_duration = (int) (1000);
 //BA.debugLineNum = 3303;BA.debugLine="p.SetLayoutAnimated(duration, x - radius, y - rad";
_p.SetLayoutAnimated(_duration,(int) (_x-_radius),(int) (_y-_radius),(int) (2*_radius),(int) (2*_radius));
 //BA.debugLineNum = 3304;BA.debugLine="p.SetVisibleAnimated(duration, False)";
_p.SetVisibleAnimated(_duration,parent.__c.False);
 //BA.debugLineNum = 3305;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,this,_duration);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 3306;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
 //BA.debugLineNum = 3307;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
int _cx = 0;
int _cy = 0;
 //BA.debugLineNum = 1455;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 1456;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 1459;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top";
_mbase.SetLayoutAnimated((int) (0),_mbase.getLeft(),_mbase.getTop(),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 1462;BA.debugLine="mBase.Color = xui.Color_Transparent";
_mbase.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1466;BA.debugLine="TypeOfMenu =  Props.Get(\"TypeOfMenu\")";
_typeofmenu = BA.ObjectToString(_props.Get((Object)("TypeOfMenu")));
 //BA.debugLineNum = 1468;BA.debugLine="If TypeOfMenu = \"4 Icon Tabs\" Then";
if ((_typeofmenu).equals("4 Icon Tabs")) { 
 //BA.debugLineNum = 1470;BA.debugLine="Mode = 1";
_mode = (int) (1);
 //BA.debugLineNum = 1472;BA.debugLine="IconTabs4(Props)";
_icontabs4(_props);
 //BA.debugLineNum = 1475;BA.debugLine="asbm_page_background.Color = b_Color";
_asbm_page_background.setColor(_b_color);
 //BA.debugLineNum = 1477;BA.debugLine="mBase.AddView(asbm_page_background,0,mBase.Heigh";
_mbase.AddView((android.view.View)(_asbm_page_background.getObject()),(int) (0),(int) (_mbase.getHeight()/(double)2.5),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 1479;BA.debugLine="asbm_page_background.Top = mBase.Height/2.5 'mBa";
_asbm_page_background.setTop((int) (_mbase.getHeight()/(double)2.5));
 //BA.debugLineNum = 1480;BA.debugLine="asbm_page_background.Height = mBase.Height - asb";
_asbm_page_background.setHeight((int) (_mbase.getHeight()-_asbm_page_background.getTop()));
 //BA.debugLineNum = 1482;BA.debugLine="mBase.AddView(asbm_parting_line,0,mBase.Height/2";
_mbase.AddView((android.view.View)(_asbm_parting_line.getObject()),(int) (0),(int) (_mbase.getHeight()/(double)2.5),_mbase.getWidth(),_asbm_parting_line.getHeight());
 //BA.debugLineNum = 1484;BA.debugLine="mBase.AddView(asbm_add_background,mBase.Width /";
_mbase.AddView((android.view.View)(_asbm_add_background.getObject()),(int) (_mbase.getWidth()/(double)2-_asbm_add_background.getWidth()/(double)2),(int) (0),(int) (_mbase.getHeight()/(double)1.2),(int) (_mbase.getHeight()/(double)1.2));
 //BA.debugLineNum = 1487;BA.debugLine="asbm_add_background.SetColorAndBorder(m_Backgrou";
_asbm_add_background.SetColorAndBorder(_m_backgroundcolor,__c.DipToCurrent((int) (3)),_xui.Color_White,(int) (_asbm_add_background.getHeight()/(double)2));
 //BA.debugLineNum = 1491;BA.debugLine="asbm_add_background.AddView(pnl_asbm_add_icon,10";
_asbm_add_background.AddView((android.view.View)(_pnl_asbm_add_icon.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),(int) (_asbm_add_background.getWidth()/(double)2.5),(int) (_asbm_add_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1493;BA.debugLine="pnl_asbm_add_icon.Left = asbm_add_background.Wid";
_pnl_asbm_add_icon.setLeft((int) (_asbm_add_background.getWidth()/(double)2-_pnl_asbm_add_icon.getWidth()/(double)2));
 //BA.debugLineNum = 1494;BA.debugLine="pnl_asbm_add_icon.Top = asbm_add_background.Heig";
_pnl_asbm_add_icon.setTop((int) (_asbm_add_background.getHeight()/(double)2-_pnl_asbm_add_icon.getHeight()/(double)2));
 //BA.debugLineNum = 1497;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1499;BA.debugLine="asbm_page_background.AddView(asbm_page_1,0,3dip";
_asbm_page_background.AddView((android.view.View)(_asbm_page_1.getObject()),(int) (0),__c.DipToCurrent((int) (3)),(int) (_asbm_add_background.getLeft()/(double)2),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1503;BA.debugLine="asbm_page_background.AddView(asbm_page_1,0,3dip";
_asbm_page_background.AddView((android.view.View)(_asbm_page_1.getObject()),(int) (0),__c.DipToCurrent((int) (3)),(int) (_asbm_page_background.getWidth()/(double)4),_asbm_page_background.getHeight());
 };
 //BA.debugLineNum = 1509;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1510;BA.debugLine="asbm_page_background.AddView(asbm_page_2,asbm_pa";
_asbm_page_background.AddView((android.view.View)(_asbm_page_2.getObject()),_asbm_page_1.getWidth(),__c.DipToCurrent((int) (3)),(int) (_asbm_add_background.getLeft()/(double)2),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1513;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1514;BA.debugLine="asbm_page_background.AddView(asbm_page_2,asbm_";
_asbm_page_background.AddView((android.view.View)(_asbm_page_2.getObject()),_asbm_page_1.getWidth(),__c.DipToCurrent((int) (3)),(int) (_asbm_page_background.getWidth()/(double)5),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1516;BA.debugLine="asbm_page_background.AddView(asbm_page_2,asbm_";
_asbm_page_background.AddView((android.view.View)(_asbm_page_2.getObject()),_asbm_page_1.getWidth(),__c.DipToCurrent((int) (3)),(int) (_asbm_page_background.getWidth()/(double)4),_asbm_page_background.getHeight());
 };
 };
 //BA.debugLineNum = 1522;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1524;BA.debugLine="asbm_page_background.AddView(asbm_page_5,asbm_p";
_asbm_page_background.AddView((android.view.View)(_asbm_page_5.getObject()),_asbm_page_5.getWidth(),__c.DipToCurrent((int) (3)),(int) (_asbm_page_background.getWidth()/(double)5),_asbm_page_background.getHeight());
 };
 //BA.debugLineNum = 1529;BA.debugLine="asbm_page_4.Width = asbm_page_background.Height";
_asbm_page_4.setWidth((int) (_asbm_page_background.getHeight()+__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1533;BA.debugLine="asbm_page_3.Width = asbm_page_background.Height";
_asbm_page_3.setWidth((int) (_asbm_page_background.getHeight()+__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 1535;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1536;BA.debugLine="asbm_page_background.AddView(asbm_page_3,asbm_ad";
_asbm_page_background.AddView((android.view.View)(_asbm_page_3.getObject()),(int) (_asbm_add_background.getLeft()+_asbm_add_background.getWidth()),__c.DipToCurrent((int) (3)),(int) (_asbm_add_background.getLeft()/(double)2),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1540;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1541;BA.debugLine="asbm_page_background.AddView(asbm_page_3,asbm_";
_asbm_page_background.AddView((android.view.View)(_asbm_page_3.getObject()),(int) (_asbm_page_5.getLeft()+_asbm_page_5.getWidth()),__c.DipToCurrent((int) (3)),(int) (_asbm_page_background.getWidth()/(double)4),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1543;BA.debugLine="asbm_page_background.AddView(asbm_page_3,asbm_";
_asbm_page_background.AddView((android.view.View)(_asbm_page_3.getObject()),(int) (_asbm_page_2.getLeft()+_asbm_page_2.getWidth()),__c.DipToCurrent((int) (3)),(int) (_asbm_page_background.getWidth()/(double)4),_asbm_page_background.getHeight());
 };
 };
 //BA.debugLineNum = 1548;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1549;BA.debugLine="asbm_page_background.AddView(asbm_page_4,asbm_pa";
_asbm_page_background.AddView((android.view.View)(_asbm_page_4.getObject()),(int) (_asbm_page_3.getLeft()+_asbm_page_3.getWidth()),__c.DipToCurrent((int) (3)),(int) (_asbm_add_background.getLeft()/(double)2),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1552;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1553;BA.debugLine="asbm_page_background.AddView(asbm_page_4,asbm_";
_asbm_page_background.AddView((android.view.View)(_asbm_page_4.getObject()),(int) (_asbm_page_3.getLeft()+_asbm_page_3.getWidth()),__c.DipToCurrent((int) (3)),(int) (_asbm_page_background.getWidth()/(double)5),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1556;BA.debugLine="asbm_page_background.AddView(asbm_page_4,asbm_";
_asbm_page_background.AddView((android.view.View)(_asbm_page_4.getObject()),(int) (_asbm_page_3.getLeft()+_asbm_page_3.getWidth()),__c.DipToCurrent((int) (3)),(int) (_asbm_page_background.getWidth()/(double)4),_asbm_page_background.getHeight());
 };
 };
 //BA.debugLineNum = 1561;BA.debugLine="asbm_icon_1.Height = asbm_page_background.Height";
_asbm_icon_1.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1562;BA.debugLine="asbm_icon_1.Width = asbm_page_background.Height/";
_asbm_icon_1.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1565;BA.debugLine="asbm_icon_2.Height = asbm_page_background.Height";
_asbm_icon_2.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1566;BA.debugLine="asbm_icon_2.Width = asbm_page_background.Height/";
_asbm_icon_2.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1568;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1570;BA.debugLine="asbm_icon_5.Height = asbm_page_background.Heigh";
_asbm_icon_5.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1571;BA.debugLine="asbm_icon_5.Width = asbm_page_background.Height";
_asbm_icon_5.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 };
 //BA.debugLineNum = 1575;BA.debugLine="asbm_icon_3.Height = asbm_page_background.Height";
_asbm_icon_3.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1576;BA.debugLine="asbm_icon_3.Width = asbm_page_background.Height/";
_asbm_icon_3.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1578;BA.debugLine="asbm_icon_4.Height = asbm_page_background.Height";
_asbm_icon_4.setHeight((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1579;BA.debugLine="asbm_icon_4.Width = asbm_page_background.Height/";
_asbm_icon_4.setWidth((int) (_asbm_page_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1582;BA.debugLine="Dim cx,cy As Int";
_cx = 0;
_cy = 0;
 //BA.debugLineNum = 1583;BA.debugLine="cx = asbm_page_1.Left + asbm_page_1.Width/2";
_cx = (int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()/(double)2);
 //BA.debugLineNum = 1584;BA.debugLine="cy = asbm_page_1.Top + asbm_page_1.Height/2.5";
_cy = (int) (_asbm_page_1.getTop()+_asbm_page_1.getHeight()/(double)2.5);
 //BA.debugLineNum = 1586;BA.debugLine="asbm_page_1.AddView(asbm_icon_1,5dip,asbm_page_1";
_asbm_page_1.AddView((android.view.View)(_asbm_icon_1.getObject()),__c.DipToCurrent((int) (5)),(int) (_asbm_page_1.getHeight()/(double)2-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_1.getHeight(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 1588;BA.debugLine="asbm_icon_1.Left = cx - asbm_icon_1.Width/2";
_asbm_icon_1.setLeft((int) (_cx-_asbm_icon_1.getWidth()/(double)2));
 //BA.debugLineNum = 1589;BA.debugLine="asbm_icon_1.Top = cy - asbm_icon_1.Height/2";
_asbm_icon_1.setTop((int) (_cy-_asbm_icon_1.getHeight()/(double)2));
 //BA.debugLineNum = 1592;BA.debugLine="asbm_page_2.AddView(asbm_icon_2,5dip,asbm_page_2";
_asbm_page_2.AddView((android.view.View)(_asbm_icon_2.getObject()),__c.DipToCurrent((int) (5)),(int) (_asbm_page_2.getHeight()/(double)2-_asbm_icon_2.getHeight()/(double)2),_asbm_icon_2.getHeight(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 1594;BA.debugLine="asbm_icon_2.Left = cx - asbm_icon_2.Width/2";
_asbm_icon_2.setLeft((int) (_cx-_asbm_icon_2.getWidth()/(double)2));
 //BA.debugLineNum = 1595;BA.debugLine="asbm_icon_2.Top = cy - asbm_icon_2.Height/2";
_asbm_icon_2.setTop((int) (_cy-_asbm_icon_2.getHeight()/(double)2));
 //BA.debugLineNum = 1597;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1599;BA.debugLine="asbm_page_5.AddView(asbm_icon_5,5dip,asbm_page_";
_asbm_page_5.AddView((android.view.View)(_asbm_icon_5.getObject()),__c.DipToCurrent((int) (5)),(int) (_asbm_page_5.getHeight()/(double)2-_asbm_icon_5.getHeight()/(double)2),_asbm_icon_5.getHeight(),_asbm_icon_5.getHeight());
 //BA.debugLineNum = 1601;BA.debugLine="asbm_icon_5.Left = cx - asbm_icon_5.Width/2";
_asbm_icon_5.setLeft((int) (_cx-_asbm_icon_5.getWidth()/(double)2));
 //BA.debugLineNum = 1602;BA.debugLine="asbm_icon_5.Top = cy - asbm_icon_5.Height/2";
_asbm_icon_5.setTop((int) (_cy-_asbm_icon_5.getHeight()/(double)2));
 };
 //BA.debugLineNum = 1606;BA.debugLine="asbm_page_3.AddView(asbm_icon_3,5dip,asbm_page_3";
_asbm_page_3.AddView((android.view.View)(_asbm_icon_3.getObject()),__c.DipToCurrent((int) (5)),(int) (_asbm_page_3.getHeight()/(double)2-_asbm_icon_3.getHeight()/(double)2),_asbm_icon_3.getHeight(),_asbm_icon_3.getHeight());
 //BA.debugLineNum = 1608;BA.debugLine="asbm_icon_3.Left = cx - asbm_icon_3.Width/2";
_asbm_icon_3.setLeft((int) (_cx-_asbm_icon_3.getWidth()/(double)2));
 //BA.debugLineNum = 1609;BA.debugLine="asbm_icon_3.Top = cy - asbm_icon_3.Height/2";
_asbm_icon_3.setTop((int) (_cy-_asbm_icon_3.getHeight()/(double)2));
 //BA.debugLineNum = 1612;BA.debugLine="asbm_page_4.AddView(asbm_icon_4,5dip,asbm_page_4";
_asbm_page_4.AddView((android.view.View)(_asbm_icon_4.getObject()),__c.DipToCurrent((int) (5)),(int) (_asbm_page_4.getHeight()/(double)2-_asbm_icon_4.getHeight()/(double)2),_asbm_icon_4.getHeight(),_asbm_icon_4.getHeight());
 //BA.debugLineNum = 1614;BA.debugLine="asbm_icon_4.Left = cx - asbm_icon_4.Width/2";
_asbm_icon_4.setLeft((int) (_cx-_asbm_icon_4.getWidth()/(double)2));
 //BA.debugLineNum = 1615;BA.debugLine="asbm_icon_4.Top = cy - asbm_icon_4.Height/2";
_asbm_icon_4.setTop((int) (_cy-_asbm_icon_4.getHeight()/(double)2));
 //BA.debugLineNum = 1618;BA.debugLine="asbm_page_background.AddView(asbm_slider,asbm_pa";
_asbm_page_background.AddView((android.view.View)(_asbm_slider.getObject()),(int) (_asbm_page_1.getWidth()/(double)2-_asbm_slider.getWidth()/(double)2),(int) (_asbm_icon_1.getTop()+_asbm_icon_1.getHeight()+7),_asbm_slider.getWidth(),_asbm_slider.getHeight());
 //BA.debugLineNum = 1620;BA.debugLine="asbm_page_1.AddView(asbm_badget_1,asbm_icon_1.Le";
_asbm_page_1.AddView((android.view.View)(_asbm_badget_1.getObject()),(int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))),(int) (_asbm_icon_1.getTop()-_asbm_badget_1.getHeight()/(double)2),_asbm_badget_1.getWidth(),_asbm_badget_1.getHeight());
 //BA.debugLineNum = 1622;BA.debugLine="asbm_page_2.AddView(asbm_badget_2,asbm_icon_1.Le";
_asbm_page_2.AddView((android.view.View)(_asbm_badget_2.getObject()),(int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))),(int) (_asbm_icon_2.getTop()-_asbm_badget_2.getHeight()/(double)2),_asbm_badget_2.getWidth(),_asbm_badget_2.getHeight());
 //BA.debugLineNum = 1624;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1626;BA.debugLine="asbm_page_5.AddView(asbm_badget_5,asbm_icon_1.L";
_asbm_page_5.AddView((android.view.View)(_asbm_badget_5.getObject()),(int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))),(int) (_asbm_icon_5.getTop()-_asbm_badget_3.getHeight()/(double)2),_asbm_badget_5.getWidth(),_asbm_badget_5.getHeight());
 };
 //BA.debugLineNum = 1631;BA.debugLine="asbm_page_3.AddView(asbm_badget_3,asbm_icon_1.Le";
_asbm_page_3.AddView((android.view.View)(_asbm_badget_3.getObject()),(int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))),(int) (_asbm_icon_3.getTop()-_asbm_badget_3.getHeight()/(double)2),_asbm_badget_3.getWidth(),_asbm_badget_3.getHeight());
 //BA.debugLineNum = 1633;BA.debugLine="asbm_page_4.AddView(asbm_badget_4,asbm_icon_1.Le";
_asbm_page_4.AddView((android.view.View)(_asbm_badget_4.getObject()),(int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))),(int) (_asbm_icon_4.getTop()-_asbm_badget_4.getHeight()/(double)2),_asbm_badget_4.getWidth(),_asbm_badget_4.getHeight());
 //BA.debugLineNum = 1637;BA.debugLine="asbm_badget_1.Visible = e_BadgetColor1";
_asbm_badget_1.setVisible(_e_badgetcolor1);
 //BA.debugLineNum = 1638;BA.debugLine="asbm_badget_2.Visible = e_BadgetColor2";
_asbm_badget_2.setVisible(_e_badgetcolor2);
 //BA.debugLineNum = 1640;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1642;BA.debugLine="asbm_badget_5.Visible = e_BadgetColor5";
_asbm_badget_5.setVisible(_e_badgetcolor5);
 };
 //BA.debugLineNum = 1646;BA.debugLine="asbm_badget_3.Visible = e_BadgetColor3";
_asbm_badget_3.setVisible(_e_badgetcolor3);
 //BA.debugLineNum = 1647;BA.debugLine="asbm_badget_4.Visible = e_BadgetColor4";
_asbm_badget_4.setVisible(_e_badgetcolor4);
 //BA.debugLineNum = 1650;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1651;BA.debugLine="asbm_add_background.Visible = True";
_asbm_add_background.setVisible(__c.True);
 //BA.debugLineNum = 1652;BA.debugLine="asbm_add_background.Enabled = True";
_asbm_add_background.setEnabled(__c.True);
 }else {
 //BA.debugLineNum = 1655;BA.debugLine="asbm_add_background.Visible = False";
_asbm_add_background.setVisible(__c.False);
 //BA.debugLineNum = 1656;BA.debugLine="asbm_add_background.Enabled = False";
_asbm_add_background.setEnabled(__c.False);
 };
 //BA.debugLineNum = 1661;BA.debugLine="asbm_page_1.AddView(asbm_text_1,0,0,0,0)";
_asbm_page_1.AddView((android.view.View)(_asbm_text_1.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 1662;BA.debugLine="asbm_page_2.AddView(asbm_text_2,0,0,0,0)";
_asbm_page_2.AddView((android.view.View)(_asbm_text_2.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 1663;BA.debugLine="asbm_page_3.AddView(asbm_text_3,0,0,0,0)";
_asbm_page_3.AddView((android.view.View)(_asbm_text_3.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 1664;BA.debugLine="asbm_page_4.AddView(asbm_text_4,0,0,0,0)";
_asbm_page_4.AddView((android.view.View)(_asbm_text_4.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 1666;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1668;BA.debugLine="asbm_page_5.AddView(asbm_text_5,0,0,0,0)";
_asbm_page_5.AddView((android.view.View)(_asbm_text_5.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 };
 }else if((_typeofmenu).equals("2 Icon Tabs")) { 
 //BA.debugLineNum = 1674;BA.debugLine="Mode = 2";
_mode = (int) (2);
 //BA.debugLineNum = 1676;BA.debugLine="IconTabs2(Props)";
_icontabs2(_props);
 //BA.debugLineNum = 1679;BA.debugLine="asbm_page_background.Color = b_Color";
_asbm_page_background.setColor(_b_color);
 //BA.debugLineNum = 1681;BA.debugLine="mBase.AddView(asbm_page_background,0,mBase.Heigh";
_mbase.AddView((android.view.View)(_asbm_page_background.getObject()),(int) (0),(int) (_mbase.getHeight()/(double)2.5),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 1683;BA.debugLine="asbm_page_background.Top = mBase.Height/2.5 'mBa";
_asbm_page_background.setTop((int) (_mbase.getHeight()/(double)2.5));
 //BA.debugLineNum = 1684;BA.debugLine="asbm_page_background.Height = mBase.Height - asb";
_asbm_page_background.setHeight((int) (_mbase.getHeight()-_asbm_page_background.getTop()));
 //BA.debugLineNum = 1686;BA.debugLine="mBase.AddView(asbm_parting_line,0,mBase.Height/2";
_mbase.AddView((android.view.View)(_asbm_parting_line.getObject()),(int) (0),(int) (_mbase.getHeight()/(double)2.5),_mbase.getWidth(),_asbm_parting_line.getHeight());
 //BA.debugLineNum = 1688;BA.debugLine="mBase.AddView(asbm_add_background,mBase.Width /";
_mbase.AddView((android.view.View)(_asbm_add_background.getObject()),(int) (_mbase.getWidth()/(double)2-_asbm_add_background.getWidth()/(double)2),(int) (0),(int) (_mbase.getHeight()/(double)1.2),(int) (_mbase.getHeight()/(double)1.2));
 //BA.debugLineNum = 1691;BA.debugLine="asbm_add_background.SetColorAndBorder(m_Backgrou";
_asbm_add_background.SetColorAndBorder(_m_backgroundcolor,__c.DipToCurrent((int) (3)),_xui.Color_White,(int) (_asbm_add_background.getHeight()/(double)2));
 //BA.debugLineNum = 1695;BA.debugLine="asbm_add_background.AddView(pnl_asbm_add_icon,10";
_asbm_add_background.AddView((android.view.View)(_pnl_asbm_add_icon.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),(int) (_asbm_add_background.getWidth()/(double)2.5),(int) (_asbm_add_background.getHeight()/(double)2.5));
 //BA.debugLineNum = 1697;BA.debugLine="pnl_asbm_add_icon.Left = asbm_add_background.Wid";
_pnl_asbm_add_icon.setLeft((int) (_asbm_add_background.getWidth()/(double)2-_pnl_asbm_add_icon.getWidth()/(double)2));
 //BA.debugLineNum = 1698;BA.debugLine="pnl_asbm_add_icon.Top = asbm_add_background.Heig";
_pnl_asbm_add_icon.setTop((int) (_asbm_add_background.getHeight()/(double)2-_pnl_asbm_add_icon.getHeight()/(double)2));
 //BA.debugLineNum = 1700;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1701;BA.debugLine="asbm_page_background.AddView(asbm_page_1,0,3dip,";
_asbm_page_background.AddView((android.view.View)(_asbm_page_1.getObject()),(int) (0),__c.DipToCurrent((int) (3)),_asbm_add_background.getLeft(),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1704;BA.debugLine="asbm_page_background.AddView(asbm_page_1,0,3dip";
_asbm_page_background.AddView((android.view.View)(_asbm_page_1.getObject()),(int) (0),__c.DipToCurrent((int) (3)),(int) (_asbm_page_background.getWidth()/(double)2),_asbm_page_background.getHeight());
 };
 //BA.debugLineNum = 1708;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1710;BA.debugLine="asbm_page_background.AddView(asbm_page_5,asbm_p";
_asbm_page_background.AddView((android.view.View)(_asbm_page_5.getObject()),(int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()),__c.DipToCurrent((int) (3)),(int) (_asbm_add_background.getWidth()/(double)2),_asbm_page_background.getHeight());
 };
 //BA.debugLineNum = 1716;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1717;BA.debugLine="asbm_page_background.AddView(asbm_page_2,asbm_ad";
_asbm_page_background.AddView((android.view.View)(_asbm_page_2.getObject()),(int) (_asbm_add_background.getLeft()+_asbm_add_background.getWidth()),__c.DipToCurrent((int) (3)),_asbm_add_background.getLeft(),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1719;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1720;BA.debugLine="asbm_page_background.AddView(asbm_page_2,asbm_";
_asbm_page_background.AddView((android.view.View)(_asbm_page_2.getObject()),(int) (_asbm_page_5.getLeft()+_asbm_page_5.getWidth()),__c.DipToCurrent((int) (3)),(int) (_asbm_add_background.getWidth()/(double)2),_asbm_page_background.getHeight());
 }else {
 //BA.debugLineNum = 1722;BA.debugLine="asbm_page_background.AddView(asbm_page_2,asbm_";
_asbm_page_background.AddView((android.view.View)(_asbm_page_2.getObject()),(int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()),__c.DipToCurrent((int) (3)),(int) (_asbm_add_background.getWidth()/(double)2),_asbm_page_background.getHeight());
 };
 };
 //BA.debugLineNum = 1727;BA.debugLine="asbm_icon_1.Height = asbm_page_background.Height";
_asbm_icon_1.setHeight((int) (_asbm_page_background.getHeight()/(double)2.2));
 //BA.debugLineNum = 1728;BA.debugLine="asbm_icon_1.Width = asbm_icon_1.Height";
_asbm_icon_1.setWidth(_asbm_icon_1.getHeight());
 //BA.debugLineNum = 1730;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1732;BA.debugLine="asbm_icon_5.Height = asbm_page_background.Heigh";
_asbm_icon_5.setHeight((int) (_asbm_page_background.getHeight()/(double)2.2));
 //BA.debugLineNum = 1733;BA.debugLine="asbm_icon_5.Width = asbm_icon_5.Height";
_asbm_icon_5.setWidth(_asbm_icon_5.getHeight());
 };
 //BA.debugLineNum = 1737;BA.debugLine="asbm_icon_2.Height = asbm_page_background.Height";
_asbm_icon_2.setHeight((int) (_asbm_page_background.getHeight()/(double)2.2));
 //BA.debugLineNum = 1738;BA.debugLine="asbm_icon_2.Width = asbm_icon_2.Height";
_asbm_icon_2.setWidth(_asbm_icon_2.getHeight());
 //BA.debugLineNum = 1741;BA.debugLine="Dim cx,cy As Int";
_cx = 0;
_cy = 0;
 //BA.debugLineNum = 1742;BA.debugLine="cx = asbm_page_1.Left + asbm_page_1.Width/2";
_cx = (int) (_asbm_page_1.getLeft()+_asbm_page_1.getWidth()/(double)2);
 //BA.debugLineNum = 1743;BA.debugLine="cy = asbm_page_1.Top + asbm_page_1.Height/2.3";
_cy = (int) (_asbm_page_1.getTop()+_asbm_page_1.getHeight()/(double)2.3);
 //BA.debugLineNum = 1745;BA.debugLine="asbm_page_1.AddView(asbm_icon_1,5dip,asbm_page_1";
_asbm_page_1.AddView((android.view.View)(_asbm_icon_1.getObject()),__c.DipToCurrent((int) (5)),(int) (_asbm_page_1.getHeight()/(double)2-_asbm_icon_1.getHeight()/(double)2),_asbm_icon_1.getHeight(),_asbm_icon_1.getHeight());
 //BA.debugLineNum = 1747;BA.debugLine="asbm_icon_1.Left = cx - asbm_icon_1.Width/2";
_asbm_icon_1.setLeft((int) (_cx-_asbm_icon_1.getWidth()/(double)2));
 //BA.debugLineNum = 1748;BA.debugLine="asbm_icon_1.Top = cy - asbm_icon_1.Height/2";
_asbm_icon_1.setTop((int) (_cy-_asbm_icon_1.getHeight()/(double)2));
 //BA.debugLineNum = 1750;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1752;BA.debugLine="asbm_page_5.AddView(asbm_icon_5,5dip,asbm_page_";
_asbm_page_5.AddView((android.view.View)(_asbm_icon_5.getObject()),__c.DipToCurrent((int) (5)),(int) (_asbm_page_5.getHeight()/(double)2-_asbm_icon_5.getHeight()/(double)2),_asbm_icon_5.getHeight(),_asbm_icon_5.getHeight());
 //BA.debugLineNum = 1754;BA.debugLine="asbm_icon_5.Left = cx - asbm_icon_5.Width/2";
_asbm_icon_5.setLeft((int) (_cx-_asbm_icon_5.getWidth()/(double)2));
 //BA.debugLineNum = 1755;BA.debugLine="asbm_icon_5.Top = cy - asbm_icon_5.Height/2";
_asbm_icon_5.setTop((int) (_cy-_asbm_icon_5.getHeight()/(double)2));
 };
 //BA.debugLineNum = 1759;BA.debugLine="asbm_page_2.AddView(asbm_icon_2,5dip,asbm_page_2";
_asbm_page_2.AddView((android.view.View)(_asbm_icon_2.getObject()),__c.DipToCurrent((int) (5)),(int) (_asbm_page_2.getHeight()/(double)2-_asbm_icon_2.getHeight()/(double)2),_asbm_icon_2.getHeight(),_asbm_icon_2.getHeight());
 //BA.debugLineNum = 1761;BA.debugLine="asbm_icon_2.Left = cx - asbm_icon_2.Width/2";
_asbm_icon_2.setLeft((int) (_cx-_asbm_icon_2.getWidth()/(double)2));
 //BA.debugLineNum = 1762;BA.debugLine="asbm_icon_2.Top = cy - asbm_icon_2.Height/2";
_asbm_icon_2.setTop((int) (_cy-_asbm_icon_2.getHeight()/(double)2));
 //BA.debugLineNum = 1766;BA.debugLine="asbm_page_background.AddView(asbm_slider,asbm_pa";
_asbm_page_background.AddView((android.view.View)(_asbm_slider.getObject()),(int) (_asbm_page_1.getWidth()/(double)2-_asbm_slider.getWidth()/(double)2),(int) (_asbm_icon_1.getTop()+_asbm_icon_1.getHeight()+7),_asbm_slider.getWidth(),_asbm_slider.getHeight());
 //BA.debugLineNum = 1768;BA.debugLine="asbm_page_1.AddView(asbm_badget_1,asbm_icon_1.Le";
_asbm_page_1.AddView((android.view.View)(_asbm_badget_1.getObject()),(int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))),(int) (_asbm_icon_1.getTop()-_asbm_badget_1.getHeight()/(double)2),_asbm_badget_1.getWidth(),_asbm_badget_1.getHeight());
 //BA.debugLineNum = 1770;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1772;BA.debugLine="asbm_page_5.AddView(asbm_badget_5,asbm_icon_1.L";
_asbm_page_5.AddView((android.view.View)(_asbm_badget_5.getObject()),(int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))),(int) (_asbm_icon_5.getTop()-_asbm_badget_5.getHeight()/(double)2),_asbm_badget_5.getWidth(),_asbm_badget_5.getHeight());
 };
 //BA.debugLineNum = 1776;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1777;BA.debugLine="asbm_page_2.AddView(asbm_badget_2,asbm_icon_5.L";
_asbm_page_2.AddView((android.view.View)(_asbm_badget_2.getObject()),(int) (_asbm_icon_5.getLeft()+_asbm_icon_5.getWidth()+__c.DipToCurrent((int) (1))),(int) (_asbm_icon_2.getTop()-_asbm_badget_2.getHeight()/(double)2),_asbm_badget_2.getWidth(),_asbm_badget_2.getHeight());
 }else {
 //BA.debugLineNum = 1779;BA.debugLine="asbm_page_2.AddView(asbm_badget_2,asbm_icon_1.L";
_asbm_page_2.AddView((android.view.View)(_asbm_badget_2.getObject()),(int) (_asbm_icon_1.getLeft()+_asbm_icon_1.getWidth()+__c.DipToCurrent((int) (1))),(int) (_asbm_icon_2.getTop()-_asbm_badget_2.getHeight()/(double)2),_asbm_badget_2.getWidth(),_asbm_badget_2.getHeight());
 };
 //BA.debugLineNum = 1785;BA.debugLine="asbm_badget_1.Visible = e_BadgetColor1";
_asbm_badget_1.setVisible(_e_badgetcolor1);
 //BA.debugLineNum = 1787;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1788;BA.debugLine="asbm_badget_5.Visible = e_BadgetColor5";
_asbm_badget_5.setVisible(_e_badgetcolor5);
 };
 //BA.debugLineNum = 1792;BA.debugLine="asbm_badget_2.Visible = e_BadgetColor2";
_asbm_badget_2.setVisible(_e_badgetcolor2);
 //BA.debugLineNum = 1795;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 1796;BA.debugLine="asbm_add_background.Visible = True";
_asbm_add_background.setVisible(__c.True);
 //BA.debugLineNum = 1797;BA.debugLine="asbm_add_background.Enabled = True";
_asbm_add_background.setEnabled(__c.True);
 }else {
 //BA.debugLineNum = 1800;BA.debugLine="asbm_add_background.Visible = False";
_asbm_add_background.setVisible(__c.False);
 //BA.debugLineNum = 1801;BA.debugLine="asbm_add_background.Enabled = False";
_asbm_add_background.setEnabled(__c.False);
 };
 //BA.debugLineNum = 1807;BA.debugLine="asbm_page_1.AddView(asbm_text_1,0,0,0,0)";
_asbm_page_1.AddView((android.view.View)(_asbm_text_1.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 1808;BA.debugLine="asbm_page_2.AddView(asbm_text_2,0,0,0,0)";
_asbm_page_2.AddView((android.view.View)(_asbm_text_2.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 1810;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 1812;BA.debugLine="asbm_page_5.AddView(asbm_text_5,0,0,0,0)";
_asbm_page_5.AddView((android.view.View)(_asbm_text_5.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 };
 };
 //BA.debugLineNum = 1818;BA.debugLine="asbm_page_background.AddView(asbm_partinglines1,a";
_asbm_page_background.AddView((android.view.View)(_asbm_partinglines1.getObject()),(int) (_asbm_page_background.getLeft()+_asbm_page_background.getWidth()),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1819;BA.debugLine="asbm_page_background.AddView(asbm_partinglines2,a";
_asbm_page_background.AddView((android.view.View)(_asbm_partinglines2.getObject()),(int) (_asbm_page_background.getLeft()+_asbm_page_background.getWidth()),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1820;BA.debugLine="asbm_page_background.AddView(asbm_partinglines3,a";
_asbm_page_background.AddView((android.view.View)(_asbm_partinglines3.getObject()),(int) (_asbm_page_background.getLeft()+_asbm_page_background.getWidth()),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1821;BA.debugLine="asbm_page_background.AddView(asbm_partinglines4,a";
_asbm_page_background.AddView((android.view.View)(_asbm_partinglines4.getObject()),(int) (_asbm_page_background.getLeft()+_asbm_page_background.getWidth()),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1822;BA.debugLine="asbm_page_background.AddView(asbm_partinglines5,a";
_asbm_page_background.AddView((android.view.View)(_asbm_partinglines5.getObject()),(int) (_asbm_page_background.getLeft()+_asbm_page_background.getWidth()),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1823;BA.debugLine="asbm_partinglines1.Visible = False";
_asbm_partinglines1.setVisible(__c.False);
 //BA.debugLineNum = 1824;BA.debugLine="asbm_partinglines2.Visible = False";
_asbm_partinglines2.setVisible(__c.False);
 //BA.debugLineNum = 1825;BA.debugLine="asbm_partinglines3.Visible = False";
_asbm_partinglines3.setVisible(__c.False);
 //BA.debugLineNum = 1826;BA.debugLine="asbm_partinglines4.Visible = False";
_asbm_partinglines4.setVisible(__c.False);
 //BA.debugLineNum = 1827;BA.debugLine="asbm_partinglines5.Visible = False";
_asbm_partinglines5.setVisible(__c.False);
 //BA.debugLineNum = 1831;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 1835;BA.debugLine="End Sub";
return "";
}
public String  _enablebadget1(boolean _enable) throws Exception{
 //BA.debugLineNum = 2472;BA.debugLine="Public Sub EnableBadget1(Enable As Boolean)";
 //BA.debugLineNum = 2474;BA.debugLine="e_BadgetColor1 = Enable";
_e_badgetcolor1 = _enable;
 //BA.debugLineNum = 2475;BA.debugLine="asbm_badget_1.Visible = e_BadgetColor1";
_asbm_badget_1.setVisible(_e_badgetcolor1);
 //BA.debugLineNum = 2476;BA.debugLine="End Sub";
return "";
}
public String  _enablebadget2(boolean _enable) throws Exception{
 //BA.debugLineNum = 2479;BA.debugLine="Public Sub EnableBadget2(Enable As Boolean)";
 //BA.debugLineNum = 2481;BA.debugLine="e_BadgetColor2 = Enable";
_e_badgetcolor2 = _enable;
 //BA.debugLineNum = 2482;BA.debugLine="asbm_badget_2.Visible = e_BadgetColor2";
_asbm_badget_2.setVisible(_e_badgetcolor2);
 //BA.debugLineNum = 2483;BA.debugLine="End Sub";
return "";
}
public String  _enablebadget3(boolean _enable) throws Exception{
 //BA.debugLineNum = 2486;BA.debugLine="Public Sub EnableBadget3(Enable As Boolean)";
 //BA.debugLineNum = 2488;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2490;BA.debugLine="e_BadgetColor3 = Enable";
_e_badgetcolor3 = _enable;
 //BA.debugLineNum = 2491;BA.debugLine="asbm_badget_3.Visible = e_BadgetColor3";
_asbm_badget_3.setVisible(_e_badgetcolor3);
 };
 //BA.debugLineNum = 2495;BA.debugLine="End Sub";
return "";
}
public String  _enablebadget4(boolean _enable) throws Exception{
 //BA.debugLineNum = 2498;BA.debugLine="Public Sub EnableBadget4(Enable As Boolean)";
 //BA.debugLineNum = 2500;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2503;BA.debugLine="e_BadgetColor4 = Enable";
_e_badgetcolor4 = _enable;
 //BA.debugLineNum = 2504;BA.debugLine="asbm_badget_4.Visible = e_BadgetColor4";
_asbm_badget_4.setVisible(_e_badgetcolor4);
 };
 //BA.debugLineNum = 2508;BA.debugLine="End Sub";
return "";
}
public String  _enablebadget5(boolean _enable) throws Exception{
 //BA.debugLineNum = 2511;BA.debugLine="Public Sub EnableBadget5(Enable As Boolean)";
 //BA.debugLineNum = 2513;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2516;BA.debugLine="e_BadgetColor5 = Enable";
_e_badgetcolor5 = _enable;
 //BA.debugLineNum = 2517;BA.debugLine="asbm_badget_5.Visible = e_BadgetColor5";
_asbm_badget_5.setVisible(_e_badgetcolor5);
 };
 //BA.debugLineNum = 2521;BA.debugLine="End Sub";
return "";
}
public String  _enableselectedpagecolor(boolean _enable) throws Exception{
 //BA.debugLineNum = 2581;BA.debugLine="Public Sub EnableSelectedPageColor(enable As Boole";
 //BA.debugLineNum = 2583;BA.debugLine="e_SelectedPageColor = enable";
_e_selectedpagecolor = _enable;
 //BA.debugLineNum = 2585;BA.debugLine="End Sub";
return "";
}
public String  _enabletext(boolean _enable) throws Exception{
 //BA.debugLineNum = 3218;BA.debugLine="Public Sub EnableText(Enable As Boolean)";
 //BA.debugLineNum = 3220;BA.debugLine="e_text = Enable";
_e_text = _enable;
 //BA.debugLineNum = 3221;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 3223;BA.debugLine="End Sub";
return "";
}
public float  _fittextsize(anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
float _size = 0f;
 //BA.debugLineNum = 3330;BA.debugLine="Private Sub FitTextSize(v As B4XView) As Float";
 //BA.debugLineNum = 3333;BA.debugLine="Dim size As Float";
_size = 0f;
 //BA.debugLineNum = 3334;BA.debugLine="For size = 2 To 80";
{
final double step2 = 1;
final double limit2 = (float) (80);
_size = (float) (2) ;
for (;_size <= limit2 ;_size = ((float)(0 + _size + step2))  ) {
 //BA.debugLineNum = 3335;BA.debugLine="If CheckSize(v,size) Then Exit";
if (_checksize(_v,_size)) { 
if (true) break;};
 }
};
 //BA.debugLineNum = 3337;BA.debugLine="size = size - 0.5";
_size = (float) (_size-0.5);
 //BA.debugLineNum = 3338;BA.debugLine="If CheckSize(v,size) Then size = size - 0.5";
if (_checksize(_v,_size)) { 
_size = (float) (_size-0.5);};
 //BA.debugLineNum = 3339;BA.debugLine="Return size -3";
if (true) return (float) (_size-3);
 //BA.debugLineNum = 3340;BA.debugLine="End Sub";
return 0f;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 1846;BA.debugLine="Public Sub GetBase As B4XView";
 //BA.debugLineNum = 1847;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 1848;BA.debugLine="End Sub";
return null;
}
public String  _hidebadgetvalue(int _badget,boolean _hide) throws Exception{
 //BA.debugLineNum = 3002;BA.debugLine="Public Sub HideBadgetValue(badget As Int,Hide As B";
 //BA.debugLineNum = 3004;BA.debugLine="If badget = 1 Then";
if (_badget==1) { 
 //BA.debugLineNum = 3006;BA.debugLine="If Hide = True Then";
if (_hide==__c.True) { 
 //BA.debugLineNum = 3008;BA.debugLine="asbm_badget_1.TextColor = asbm_badget_1.Color";
_asbm_badget_1.setTextColor(_asbm_badget_1.getColor());
 }else {
 //BA.debugLineNum = 3012;BA.debugLine="asbm_badget_1.TextColor = b_color1";
_asbm_badget_1.setTextColor(_b_color1);
 };
 }else if(_badget==2) { 
 //BA.debugLineNum = 3018;BA.debugLine="If Hide = True Then";
if (_hide==__c.True) { 
 //BA.debugLineNum = 3020;BA.debugLine="asbm_badget_2.TextColor = asbm_badget_2.Color";
_asbm_badget_2.setTextColor(_asbm_badget_2.getColor());
 }else {
 //BA.debugLineNum = 3024;BA.debugLine="asbm_badget_2.TextColor = b_color2";
_asbm_badget_2.setTextColor(_b_color2);
 };
 }else if(_badget==3) { 
 //BA.debugLineNum = 3030;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 3032;BA.debugLine="If Hide = True Then";
if (_hide==__c.True) { 
 //BA.debugLineNum = 3034;BA.debugLine="asbm_badget_3.TextColor = asbm_badget_3.Color";
_asbm_badget_3.setTextColor(_asbm_badget_3.getColor());
 }else {
 //BA.debugLineNum = 3038;BA.debugLine="asbm_badget_3.TextColor = b_color3";
_asbm_badget_3.setTextColor(_b_color3);
 };
 };
 }else if(_badget==4) { 
 //BA.debugLineNum = 3047;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 3049;BA.debugLine="If Hide = True Then";
if (_hide==__c.True) { 
 //BA.debugLineNum = 3051;BA.debugLine="asbm_badget_4.TextColor = asbm_badget_4.Color";
_asbm_badget_4.setTextColor(_asbm_badget_4.getColor());
 }else {
 //BA.debugLineNum = 3055;BA.debugLine="asbm_badget_4.TextColor = b_color4";
_asbm_badget_4.setTextColor(_b_color4);
 };
 };
 }else if(_badget==5) { 
 //BA.debugLineNum = 3063;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 3065;BA.debugLine="If Hide = True Then";
if (_hide==__c.True) { 
 //BA.debugLineNum = 3067;BA.debugLine="asbm_badget_5.TextColor = asbm_badget_5.Color";
_asbm_badget_5.setTextColor(_asbm_badget_5.getColor());
 }else {
 //BA.debugLineNum = 3071;BA.debugLine="asbm_badget_5.TextColor = b_color5";
_asbm_badget_5.setTextColor(_b_color5);
 };
 };
 };
 //BA.debugLineNum = 3079;BA.debugLine="End Sub";
return "";
}
public String  _icontabs2(anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_background = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_parting_line = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_add_background = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_1 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_2 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines1 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines2 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines3 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines4 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines5 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_5 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_asbm_text_1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_asbm_text_2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_asbm_text_5 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_slider = null;
anywheresoftware.b4a.objects.LabelWrapper _pnl_asbm_badget_1 = null;
anywheresoftware.b4a.objects.LabelWrapper _pnl_asbm_badget_5 = null;
anywheresoftware.b4a.objects.LabelWrapper _pnl_asbm_badget_2 = null;
 //BA.debugLineNum = 571;BA.debugLine="Private Sub IconTabs2(Props As Map)";
 //BA.debugLineNum = 573;BA.debugLine="EnableMiddleButtonAsPage = Props.Get(\"EnableMiddl";
_enablemiddlebuttonaspage = BA.ObjectToBoolean(_props.Get((Object)("EnableMiddleButtonAsPage")));
 //BA.debugLineNum = 576;BA.debugLine="Dim pnl_asbm_page_background As Panel";
_pnl_asbm_page_background = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 577;BA.debugLine="Dim pnl_asbm_parting_line As Panel";
_pnl_asbm_parting_line = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 578;BA.debugLine="Dim pnl_asbm_add_background As Panel";
_pnl_asbm_add_background = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 588;BA.debugLine="pnl_asbm_page_background.Initialize(\"asbm_page_ba";
_pnl_asbm_page_background.Initialize(ba,"asbm_page_background");
 //BA.debugLineNum = 589;BA.debugLine="asbm_page_background = pnl_asbm_page_background";
_asbm_page_background = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_background.getObject()));
 //BA.debugLineNum = 592;BA.debugLine="pnl_asbm_parting_line.Initialize(\"asbm_parting_li";
_pnl_asbm_parting_line.Initialize(ba,"asbm_parting_line");
 //BA.debugLineNum = 593;BA.debugLine="asbm_parting_line = pnl_asbm_parting_line";
_asbm_parting_line = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_parting_line.getObject()));
 //BA.debugLineNum = 595;BA.debugLine="pnl_asbm_add_background.Initialize(\"asbm_add_back";
_pnl_asbm_add_background.Initialize(ba,"asbm_add_background");
 //BA.debugLineNum = 596;BA.debugLine="asbm_add_background = pnl_asbm_add_background";
_asbm_add_background = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_add_background.getObject()));
 //BA.debugLineNum = 597;BA.debugLine="asbm_add_background.Height = mBase.Height/1.2";
_asbm_add_background.setHeight((int) (_mbase.getHeight()/(double)1.2));
 //BA.debugLineNum = 598;BA.debugLine="asbm_add_background.Width = mBase.Height/1.2";
_asbm_add_background.setWidth((int) (_mbase.getHeight()/(double)1.2));
 //BA.debugLineNum = 600;BA.debugLine="Dim pnl_asbm_add_icon As ImageView";
_pnl_asbm_add_icon = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 601;BA.debugLine="pnl_asbm_add_icon.Initialize(\"asbm_icon_4\")";
_pnl_asbm_add_icon.Initialize(ba,"asbm_icon_4");
 //BA.debugLineNum = 606;BA.debugLine="pnl_asbm_add_icon.Gravity = Gravity.FILL";
_pnl_asbm_add_icon.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 634;BA.debugLine="Dim pnl_asbm_page_1 As Panel";
_pnl_asbm_page_1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 635;BA.debugLine="Dim pnl_asbm_page_2 As Panel";
_pnl_asbm_page_2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 637;BA.debugLine="Dim pnl_asbm_partinglines1 As Panel";
_pnl_asbm_partinglines1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 638;BA.debugLine="Dim pnl_asbm_partinglines2 As Panel";
_pnl_asbm_partinglines2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 639;BA.debugLine="Dim pnl_asbm_partinglines3 As Panel";
_pnl_asbm_partinglines3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 640;BA.debugLine="Dim pnl_asbm_partinglines4 As Panel";
_pnl_asbm_partinglines4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 641;BA.debugLine="Dim pnl_asbm_partinglines5 As Panel";
_pnl_asbm_partinglines5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 644;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 646;BA.debugLine="Dim pnl_asbm_page_5 As Panel";
_pnl_asbm_page_5 = new anywheresoftware.b4a.objects.PanelWrapper();
 };
 //BA.debugLineNum = 652;BA.debugLine="Dim lbl_asbm_text_1 As Label";
_lbl_asbm_text_1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 653;BA.debugLine="Dim lbl_asbm_text_2 As Label";
_lbl_asbm_text_2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 656;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 658;BA.debugLine="Dim lbl_asbm_text_5 As Label";
_lbl_asbm_text_5 = new anywheresoftware.b4a.objects.LabelWrapper();
 };
 //BA.debugLineNum = 662;BA.debugLine="pnl_asbm_page_1.Initialize(\"asbm_page_1\")";
_pnl_asbm_page_1.Initialize(ba,"asbm_page_1");
 //BA.debugLineNum = 663;BA.debugLine="asbm_page_1 = pnl_asbm_page_1";
_asbm_page_1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_1.getObject()));
 //BA.debugLineNum = 665;BA.debugLine="lbl_asbm_text_1.Initialize(\"\")";
_lbl_asbm_text_1.Initialize(ba,"");
 //BA.debugLineNum = 666;BA.debugLine="asbm_text_1 = lbl_asbm_text_1";
_asbm_text_1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_asbm_text_1.getObject()));
 //BA.debugLineNum = 668;BA.debugLine="pnl_asbm_page_2.Initialize(\"asbm_page_2\")";
_pnl_asbm_page_2.Initialize(ba,"asbm_page_2");
 //BA.debugLineNum = 669;BA.debugLine="asbm_page_2 = pnl_asbm_page_2";
_asbm_page_2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_2.getObject()));
 //BA.debugLineNum = 671;BA.debugLine="lbl_asbm_text_2.Initialize(\"\")";
_lbl_asbm_text_2.Initialize(ba,"");
 //BA.debugLineNum = 672;BA.debugLine="asbm_text_2 = lbl_asbm_text_2";
_asbm_text_2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_asbm_text_2.getObject()));
 //BA.debugLineNum = 674;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 676;BA.debugLine="pnl_asbm_page_5.Initialize(\"asbm_page_5\")";
_pnl_asbm_page_5.Initialize(ba,"asbm_page_5");
 //BA.debugLineNum = 677;BA.debugLine="asbm_page_5 = pnl_asbm_page_5";
_asbm_page_5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_5.getObject()));
 //BA.debugLineNum = 679;BA.debugLine="lbl_asbm_text_5.Initialize(\"\")";
_lbl_asbm_text_5.Initialize(ba,"");
 //BA.debugLineNum = 680;BA.debugLine="asbm_text_5 = lbl_asbm_text_5";
_asbm_text_5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_asbm_text_5.getObject()));
 };
 //BA.debugLineNum = 685;BA.debugLine="pnl_asbm_partinglines1.Initialize(\"\")";
_pnl_asbm_partinglines1.Initialize(ba,"");
 //BA.debugLineNum = 686;BA.debugLine="asbm_partinglines1 = pnl_asbm_partinglines1";
_asbm_partinglines1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines1.getObject()));
 //BA.debugLineNum = 688;BA.debugLine="pnl_asbm_partinglines2.Initialize(\"\")";
_pnl_asbm_partinglines2.Initialize(ba,"");
 //BA.debugLineNum = 689;BA.debugLine="asbm_partinglines2 = pnl_asbm_partinglines2";
_asbm_partinglines2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines2.getObject()));
 //BA.debugLineNum = 691;BA.debugLine="pnl_asbm_partinglines3.Initialize(\"\")";
_pnl_asbm_partinglines3.Initialize(ba,"");
 //BA.debugLineNum = 692;BA.debugLine="asbm_partinglines3 = pnl_asbm_partinglines3";
_asbm_partinglines3 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines3.getObject()));
 //BA.debugLineNum = 694;BA.debugLine="pnl_asbm_partinglines4.Initialize(\"\")";
_pnl_asbm_partinglines4.Initialize(ba,"");
 //BA.debugLineNum = 695;BA.debugLine="asbm_partinglines4 = pnl_asbm_partinglines4";
_asbm_partinglines4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines4.getObject()));
 //BA.debugLineNum = 697;BA.debugLine="pnl_asbm_partinglines5.Initialize(\"\")";
_pnl_asbm_partinglines5.Initialize(ba,"");
 //BA.debugLineNum = 698;BA.debugLine="asbm_partinglines5 = pnl_asbm_partinglines5";
_asbm_partinglines5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines5.getObject()));
 //BA.debugLineNum = 700;BA.debugLine="asbm_partinglines1.Color = p_Lines_Color";
_asbm_partinglines1.setColor(_p_lines_color);
 //BA.debugLineNum = 701;BA.debugLine="asbm_partinglines2.Color = p_Lines_Color";
_asbm_partinglines2.setColor(_p_lines_color);
 //BA.debugLineNum = 702;BA.debugLine="asbm_partinglines3.Color = p_Lines_Color";
_asbm_partinglines3.setColor(_p_lines_color);
 //BA.debugLineNum = 703;BA.debugLine="asbm_partinglines4.Color = p_Lines_Color";
_asbm_partinglines4.setColor(_p_lines_color);
 //BA.debugLineNum = 704;BA.debugLine="asbm_partinglines5.Color = p_Lines_Color";
_asbm_partinglines5.setColor(_p_lines_color);
 //BA.debugLineNum = 707;BA.debugLine="asbm_icon_1.Initialize(\"asbm_icon_1\")";
_asbm_icon_1.Initialize(ba,"asbm_icon_1");
 //BA.debugLineNum = 711;BA.debugLine="asbm_icon_1.Gravity = Gravity.FILL";
_asbm_icon_1.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 719;BA.debugLine="asbm_icon_2.Initialize(\"asbm_icon_2\")";
_asbm_icon_2.Initialize(ba,"asbm_icon_2");
 //BA.debugLineNum = 723;BA.debugLine="asbm_icon_2.Gravity = Gravity.FILL";
_asbm_icon_2.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 731;BA.debugLine="asbm_icon_5.Initialize(\"asbm_icon_5\")";
_asbm_icon_5.Initialize(ba,"asbm_icon_5");
 //BA.debugLineNum = 735;BA.debugLine="asbm_icon_5.Gravity = Gravity.FILL";
_asbm_icon_5.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 748;BA.debugLine="Dim pnl_asbm_slider As Panel";
_pnl_asbm_slider = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 753;BA.debugLine="pnl_asbm_slider.Initialize(\"asbm_slider\")";
_pnl_asbm_slider.Initialize(ba,"asbm_slider");
 //BA.debugLineNum = 754;BA.debugLine="asbm_slider = pnl_asbm_slider";
_asbm_slider = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_slider.getObject()));
 //BA.debugLineNum = 756;BA.debugLine="Dim pnl_asbm_badget_1 As Label";
_pnl_asbm_badget_1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 757;BA.debugLine="pnl_asbm_badget_1.Initialize(\"asbm_badget_1\")";
_pnl_asbm_badget_1.Initialize(ba,"asbm_badget_1");
 //BA.debugLineNum = 758;BA.debugLine="asbm_badget_1 = pnl_asbm_badget_1";
_asbm_badget_1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_badget_1.getObject()));
 //BA.debugLineNum = 759;BA.debugLine="asbm_badget_1.Font = xui.CreateDefaultBoldFont(10";
_asbm_badget_1.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 760;BA.debugLine="asbm_badget_1.TextColor = xui.Color_White";
_asbm_badget_1.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 761;BA.debugLine="asbm_badget_1.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_badget_1.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 764;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 766;BA.debugLine="Dim pnl_asbm_badget_5 As Label";
_pnl_asbm_badget_5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 767;BA.debugLine="pnl_asbm_badget_5.Initialize(\"asbm_badget_5\")";
_pnl_asbm_badget_5.Initialize(ba,"asbm_badget_5");
 //BA.debugLineNum = 768;BA.debugLine="asbm_badget_5 = pnl_asbm_badget_5";
_asbm_badget_5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_badget_5.getObject()));
 //BA.debugLineNum = 769;BA.debugLine="asbm_badget_5.Font = xui.CreateDefaultBoldFont(1";
_asbm_badget_5.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 770;BA.debugLine="asbm_badget_5.TextColor = xui.Color_White";
_asbm_badget_5.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 771;BA.debugLine="asbm_badget_5.SetTextAlignment(\"CENTER\",\"CENTER\"";
_asbm_badget_5.SetTextAlignment("CENTER","CENTER");
 };
 //BA.debugLineNum = 776;BA.debugLine="Dim pnl_asbm_badget_2 As Label";
_pnl_asbm_badget_2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 777;BA.debugLine="pnl_asbm_badget_2.Initialize(\"asbm_badget_2\")";
_pnl_asbm_badget_2.Initialize(ba,"asbm_badget_2");
 //BA.debugLineNum = 778;BA.debugLine="asbm_badget_2 = pnl_asbm_badget_2";
_asbm_badget_2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_badget_2.getObject()));
 //BA.debugLineNum = 779;BA.debugLine="asbm_badget_2.Font = xui.CreateDefaultBoldFont(10";
_asbm_badget_2.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 780;BA.debugLine="asbm_badget_2.TextColor = xui.Color_White";
_asbm_badget_2.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 781;BA.debugLine="asbm_badget_2.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_badget_2.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 785;BA.debugLine="s_Color1 = xui.PaintOrColorToColor(Props.Get(\"Sli";
_s_color1 = _xui.PaintOrColorToColor(_props.Get((Object)("SliderColor1")));
 //BA.debugLineNum = 786;BA.debugLine="s_Color2 = xui.PaintOrColorToColor(Props.Get(\"Sli";
_s_color2 = _xui.PaintOrColorToColor(_props.Get((Object)("SliderColor2")));
 //BA.debugLineNum = 788;BA.debugLine="s_Color5 = xui.PaintOrColorToColor(Props.Get(\"Sli";
_s_color5 = _xui.PaintOrColorToColor(_props.Get((Object)("SliderColor5")));
 //BA.debugLineNum = 790;BA.debugLine="b_Color = xui.PaintOrColorToColor(Props.Get(\"Back";
_b_color = _xui.PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
 //BA.debugLineNum = 792;BA.debugLine="p_Line = xui.PaintOrColorToColor(Props.Get(\"Parti";
_p_line = _xui.PaintOrColorToColor(_props.Get((Object)("PartingLine")));
 //BA.debugLineNum = 794;BA.debugLine="m_BackgroundColor = xui.PaintOrColorToColor(Props";
_m_backgroundcolor = _xui.PaintOrColorToColor(_props.Get((Object)("MiddleBackgroundColor")));
 //BA.debugLineNum = 796;BA.debugLine="e_BadgetColor1 = Props.Get(\"EnableBadgetColor1\")";
_e_badgetcolor1 = BA.ObjectToBoolean(_props.Get((Object)("EnableBadgetColor1")));
 //BA.debugLineNum = 797;BA.debugLine="e_BadgetColor2 = Props.Get(\"EnableBadgetColor2\")";
_e_badgetcolor2 = BA.ObjectToBoolean(_props.Get((Object)("EnableBadgetColor2")));
 //BA.debugLineNum = 799;BA.debugLine="e_BadgetColor5 = Props.Get(\"EnableBadgetColor5\")";
_e_badgetcolor5 = BA.ObjectToBoolean(_props.Get((Object)("EnableBadgetColor5")));
 //BA.debugLineNum = 802;BA.debugLine="b_color1 = xui.PaintOrColorToColor(Props.Get(\"Bad";
_b_color1 = _xui.PaintOrColorToColor(_props.Get((Object)("BadgetColor1")));
 //BA.debugLineNum = 803;BA.debugLine="b_color2 = xui.PaintOrColorToColor(Props.Get(\"Bad";
_b_color2 = _xui.PaintOrColorToColor(_props.Get((Object)("BadgetColor2")));
 //BA.debugLineNum = 805;BA.debugLine="b_color5 = xui.PaintOrColorToColor(Props.Get(\"Bad";
_b_color5 = _xui.PaintOrColorToColor(_props.Get((Object)("BadgetColor5")));
 //BA.debugLineNum = 808;BA.debugLine="p_ClickColor = xui.PaintOrColorToColor(Props.Get(";
_p_clickcolor = _xui.PaintOrColorToColor(_props.Get((Object)("PageClickColor")));
 //BA.debugLineNum = 810;BA.debugLine="p_Lines_Color = xui.PaintOrColorToColor(Props.Get";
_p_lines_color = _xui.PaintOrColorToColor(_props.Get((Object)("PartingLinesColor")));
 //BA.debugLineNum = 812;BA.debugLine="e_SelectedPageColor = Props.Get(\"EnableSelectedPa";
_e_selectedpagecolor = BA.ObjectToBoolean(_props.Get((Object)("EnableSelectedPageColor")));
 //BA.debugLineNum = 814;BA.debugLine="s_PageColor = xui.PaintOrColorToColor(Props.Get(\"";
_s_pagecolor = _xui.PaintOrColorToColor(_props.Get((Object)("SelectedPageColor")));
 //BA.debugLineNum = 816;BA.debugLine="MiddleButtonVisible = Props.Get(\"MiddleButtonVisi";
_middlebuttonvisible = BA.ObjectToBoolean(_props.Get((Object)("MiddleButtonVisible")));
 //BA.debugLineNum = 818;BA.debugLine="e_text =  Props.Get(\"EnableText\")";
_e_text = BA.ObjectToBoolean(_props.Get((Object)("EnableText")));
 //BA.debugLineNum = 819;BA.debugLine="t_color = xui.PaintOrColorToColor(Props.Get(\"Text";
_t_color = _xui.PaintOrColorToColor(_props.Get((Object)("TextColor")));
 //BA.debugLineNum = 820;BA.debugLine="text_1 = Props.Get(\"Text1\")";
_text_1 = BA.ObjectToString(_props.Get((Object)("Text1")));
 //BA.debugLineNum = 821;BA.debugLine="text_2 = Props.Get(\"Text2\")";
_text_2 = BA.ObjectToString(_props.Get((Object)("Text2")));
 //BA.debugLineNum = 822;BA.debugLine="text_3 = Props.Get(\"Text3\")";
_text_3 = BA.ObjectToString(_props.Get((Object)("Text3")));
 //BA.debugLineNum = 823;BA.debugLine="text_4 = Props.Get(\"Text4\")";
_text_4 = BA.ObjectToString(_props.Get((Object)("Text4")));
 //BA.debugLineNum = 824;BA.debugLine="text_5 = Props.Get(\"Text5\")";
_text_5 = BA.ObjectToString(_props.Get((Object)("Text5")));
 //BA.debugLineNum = 826;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 828;BA.debugLine="MiddleButtonVisible = False";
_middlebuttonvisible = __c.False;
 };
 //BA.debugLineNum = 834;BA.debugLine="asbm_page_1.Color = xui.Color_Transparent";
_asbm_page_1.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 835;BA.debugLine="asbm_page_2.Color = xui.Color_Transparent";
_asbm_page_2.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 837;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 839;BA.debugLine="asbm_page_5.Color = xui.Color_Transparent";
_asbm_page_5.setColor(_xui.Color_Transparent);
 };
 //BA.debugLineNum = 844;BA.debugLine="asbm_slider.Height = 2dip";
_asbm_slider.setHeight(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 845;BA.debugLine="asbm_slider.Width = 40dip";
_asbm_slider.setWidth(__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 846;BA.debugLine="asbm_slider.SetColorAndBorder(s_Color1,0,xui.Colo";
_asbm_slider.SetColorAndBorder(_s_color1,(int) (0),_xui.Color_Transparent,(int) (_asbm_slider.getHeight()/(double)2));
 //BA.debugLineNum = 851;BA.debugLine="asbm_parting_line.Height = 3dip";
_asbm_parting_line.setHeight(__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 852;BA.debugLine="asbm_parting_line.Color = p_Line";
_asbm_parting_line.setColor(_p_line);
 //BA.debugLineNum = 856;BA.debugLine="asbm_badget_1.Width = 18dip";
_asbm_badget_1.setWidth(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 857;BA.debugLine="asbm_badget_1.Height = 18dip";
_asbm_badget_1.setHeight(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 858;BA.debugLine="asbm_badget_1.SetColorAndBorder(b_color1,0dip,xui";
_asbm_badget_1.SetColorAndBorder(_b_color1,__c.DipToCurrent((int) (0)),_xui.Color_White,(int) (_asbm_badget_1.getHeight()/(double)2));
 //BA.debugLineNum = 859;BA.debugLine="asbm_badget_1.Text = 0";
_asbm_badget_1.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 860;BA.debugLine="asbm_badget_1.TextSize = 13";
_asbm_badget_1.setTextSize((float) (13));
 //BA.debugLineNum = 863;BA.debugLine="asbm_text_1.TextColor = t_color";
_asbm_text_1.setTextColor(_t_color);
 //BA.debugLineNum = 864;BA.debugLine="asbm_text_2.TextColor = t_color";
_asbm_text_2.setTextColor(_t_color);
 //BA.debugLineNum = 865;BA.debugLine="asbm_text_1.Text = text_1";
_asbm_text_1.setText(BA.ObjectToCharSequence(_text_1));
 //BA.debugLineNum = 866;BA.debugLine="asbm_text_2.Text = text_2";
_asbm_text_2.setText(BA.ObjectToCharSequence(_text_2));
 //BA.debugLineNum = 868;BA.debugLine="asbm_text_1.Font = xui.CreateDefaultBoldFont(10)";
_asbm_text_1.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 869;BA.debugLine="asbm_text_2.Font = xui.CreateDefaultBoldFont(10)";
_asbm_text_2.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 870;BA.debugLine="asbm_text_1.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_text_1.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 871;BA.debugLine="asbm_text_2.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_text_2.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 873;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 875;BA.debugLine="asbm_badget_5.Width = 18dip";
_asbm_badget_5.setWidth(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 876;BA.debugLine="asbm_badget_5.Height = 18dip";
_asbm_badget_5.setHeight(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 877;BA.debugLine="asbm_badget_5.SetColorAndBorder(b_color5,0dip,xu";
_asbm_badget_5.SetColorAndBorder(_b_color5,__c.DipToCurrent((int) (0)),_xui.Color_White,(int) (_asbm_badget_5.getHeight()/(double)2));
 //BA.debugLineNum = 878;BA.debugLine="asbm_badget_5.Text = 0";
_asbm_badget_5.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 879;BA.debugLine="asbm_badget_5.TextSize = 13";
_asbm_badget_5.setTextSize((float) (13));
 //BA.debugLineNum = 880;BA.debugLine="asbm_text_5.Text = text_5";
_asbm_text_5.setText(BA.ObjectToCharSequence(_text_5));
 //BA.debugLineNum = 881;BA.debugLine="asbm_text_5.Font = xui.CreateDefaultBoldFont(10)";
_asbm_text_5.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 882;BA.debugLine="asbm_text_5.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_text_5.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 883;BA.debugLine="asbm_text_5.TextColor = t_color";
_asbm_text_5.setTextColor(_t_color);
 };
 //BA.debugLineNum = 886;BA.debugLine="asbm_badget_2.Width = 18dip";
_asbm_badget_2.setWidth(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 887;BA.debugLine="asbm_badget_2.Height = 18dip";
_asbm_badget_2.setHeight(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 888;BA.debugLine="asbm_badget_2.SetColorAndBorder(b_color2,0dip,xui";
_asbm_badget_2.SetColorAndBorder(_b_color2,__c.DipToCurrent((int) (0)),_xui.Color_White,(int) (_asbm_badget_2.getHeight()/(double)2));
 //BA.debugLineNum = 889;BA.debugLine="asbm_badget_2.Text = 0";
_asbm_badget_2.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 890;BA.debugLine="asbm_badget_2.TextSize = 13";
_asbm_badget_2.setTextSize((float) (13));
 //BA.debugLineNum = 893;BA.debugLine="End Sub";
return "";
}
public String  _icontabs4(anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_background = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_parting_line = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_add_background = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_1 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_2 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_3 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_4 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines1 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines2 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines3 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines4 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_partinglines5 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_page_5 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_asbm_text_1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_asbm_text_2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_asbm_text_3 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_asbm_text_4 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_asbm_text_5 = null;
anywheresoftware.b4a.objects.ImageViewWrapper _pnl_asbm_icon_4 = null;
anywheresoftware.b4a.objects.ImageViewWrapper _pnl_asbm_icon_5 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_asbm_slider = null;
anywheresoftware.b4a.objects.LabelWrapper _pnl_asbm_badget_1 = null;
anywheresoftware.b4a.objects.LabelWrapper _pnl_asbm_badget_2 = null;
anywheresoftware.b4a.objects.LabelWrapper _pnl_asbm_badget_3 = null;
anywheresoftware.b4a.objects.LabelWrapper _pnl_asbm_badget_4 = null;
anywheresoftware.b4a.objects.LabelWrapper _pnl_asbm_badget_5 = null;
 //BA.debugLineNum = 151;BA.debugLine="Private Sub IconTabs4(Props As Map)";
 //BA.debugLineNum = 153;BA.debugLine="EnableMiddleButtonAsPage = Props.Get(\"EnableMiddl";
_enablemiddlebuttonaspage = BA.ObjectToBoolean(_props.Get((Object)("EnableMiddleButtonAsPage")));
 //BA.debugLineNum = 156;BA.debugLine="Dim pnl_asbm_page_background As Panel";
_pnl_asbm_page_background = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 157;BA.debugLine="Dim pnl_asbm_parting_line As Panel";
_pnl_asbm_parting_line = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 158;BA.debugLine="Dim pnl_asbm_add_background As Panel";
_pnl_asbm_add_background = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 168;BA.debugLine="pnl_asbm_page_background.Initialize(\"asbm_page_ba";
_pnl_asbm_page_background.Initialize(ba,"asbm_page_background");
 //BA.debugLineNum = 169;BA.debugLine="asbm_page_background = pnl_asbm_page_background";
_asbm_page_background = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_background.getObject()));
 //BA.debugLineNum = 173;BA.debugLine="pnl_asbm_parting_line.Initialize(\"asbm_parting_li";
_pnl_asbm_parting_line.Initialize(ba,"asbm_parting_line");
 //BA.debugLineNum = 174;BA.debugLine="asbm_parting_line = pnl_asbm_parting_line";
_asbm_parting_line = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_parting_line.getObject()));
 //BA.debugLineNum = 177;BA.debugLine="pnl_asbm_add_background.Initialize(\"asbm_add_back";
_pnl_asbm_add_background.Initialize(ba,"asbm_add_background");
 //BA.debugLineNum = 178;BA.debugLine="asbm_add_background = pnl_asbm_add_background";
_asbm_add_background = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_add_background.getObject()));
 //BA.debugLineNum = 181;BA.debugLine="asbm_add_background.Height = mBase.Height/1.2";
_asbm_add_background.setHeight((int) (_mbase.getHeight()/(double)1.2));
 //BA.debugLineNum = 182;BA.debugLine="asbm_add_background.Width = mBase.Height/1.2";
_asbm_add_background.setWidth((int) (_mbase.getHeight()/(double)1.2));
 //BA.debugLineNum = 185;BA.debugLine="pnl_asbm_add_icon.Initialize(\"asbm_icon_4\")";
_pnl_asbm_add_icon.Initialize(ba,"asbm_icon_4");
 //BA.debugLineNum = 191;BA.debugLine="pnl_asbm_add_icon.Gravity = Gravity.FILL";
_pnl_asbm_add_icon.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 205;BA.debugLine="Dim pnl_asbm_page_1 As Panel";
_pnl_asbm_page_1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 206;BA.debugLine="Dim pnl_asbm_page_2 As Panel";
_pnl_asbm_page_2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 207;BA.debugLine="Dim pnl_asbm_page_3 As Panel";
_pnl_asbm_page_3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 208;BA.debugLine="Dim pnl_asbm_page_4 As Panel";
_pnl_asbm_page_4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 210;BA.debugLine="Dim pnl_asbm_partinglines1 As Panel";
_pnl_asbm_partinglines1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 211;BA.debugLine="Dim pnl_asbm_partinglines2 As Panel";
_pnl_asbm_partinglines2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 212;BA.debugLine="Dim pnl_asbm_partinglines3 As Panel";
_pnl_asbm_partinglines3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 213;BA.debugLine="Dim pnl_asbm_partinglines4 As Panel";
_pnl_asbm_partinglines4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 214;BA.debugLine="Dim pnl_asbm_partinglines5 As Panel";
_pnl_asbm_partinglines5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 216;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 218;BA.debugLine="Dim pnl_asbm_page_5 As Panel";
_pnl_asbm_page_5 = new anywheresoftware.b4a.objects.PanelWrapper();
 };
 //BA.debugLineNum = 242;BA.debugLine="Dim lbl_asbm_text_1 As Label";
_lbl_asbm_text_1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 243;BA.debugLine="Dim lbl_asbm_text_2 As Label";
_lbl_asbm_text_2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 244;BA.debugLine="Dim lbl_asbm_text_3 As Label";
_lbl_asbm_text_3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 245;BA.debugLine="Dim lbl_asbm_text_4 As Label";
_lbl_asbm_text_4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 247;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 249;BA.debugLine="Dim lbl_asbm_text_5 As Label";
_lbl_asbm_text_5 = new anywheresoftware.b4a.objects.LabelWrapper();
 };
 //BA.debugLineNum = 254;BA.debugLine="pnl_asbm_page_1.Initialize(\"asbm_page_1\")";
_pnl_asbm_page_1.Initialize(ba,"asbm_page_1");
 //BA.debugLineNum = 255;BA.debugLine="asbm_page_1 = pnl_asbm_page_1";
_asbm_page_1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_1.getObject()));
 //BA.debugLineNum = 257;BA.debugLine="lbl_asbm_text_1.Initialize(\"\")";
_lbl_asbm_text_1.Initialize(ba,"");
 //BA.debugLineNum = 258;BA.debugLine="asbm_text_1 = lbl_asbm_text_1";
_asbm_text_1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_asbm_text_1.getObject()));
 //BA.debugLineNum = 260;BA.debugLine="pnl_asbm_page_2.Initialize(\"asbm_page_2\")";
_pnl_asbm_page_2.Initialize(ba,"asbm_page_2");
 //BA.debugLineNum = 261;BA.debugLine="asbm_page_2 = pnl_asbm_page_2";
_asbm_page_2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_2.getObject()));
 //BA.debugLineNum = 263;BA.debugLine="lbl_asbm_text_2.Initialize(\"\")";
_lbl_asbm_text_2.Initialize(ba,"");
 //BA.debugLineNum = 264;BA.debugLine="asbm_text_2 = lbl_asbm_text_2";
_asbm_text_2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_asbm_text_2.getObject()));
 //BA.debugLineNum = 266;BA.debugLine="pnl_asbm_page_3.Initialize(\"asbm_page_3\")";
_pnl_asbm_page_3.Initialize(ba,"asbm_page_3");
 //BA.debugLineNum = 267;BA.debugLine="asbm_page_3 = pnl_asbm_page_3";
_asbm_page_3 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_3.getObject()));
 //BA.debugLineNum = 269;BA.debugLine="lbl_asbm_text_3.Initialize(\"\")";
_lbl_asbm_text_3.Initialize(ba,"");
 //BA.debugLineNum = 270;BA.debugLine="asbm_text_3 = lbl_asbm_text_3";
_asbm_text_3 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_asbm_text_3.getObject()));
 //BA.debugLineNum = 272;BA.debugLine="pnl_asbm_page_4.Initialize(\"asbm_page_4\")";
_pnl_asbm_page_4.Initialize(ba,"asbm_page_4");
 //BA.debugLineNum = 273;BA.debugLine="asbm_page_4 = pnl_asbm_page_4";
_asbm_page_4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_4.getObject()));
 //BA.debugLineNum = 275;BA.debugLine="lbl_asbm_text_4.Initialize(\"\")";
_lbl_asbm_text_4.Initialize(ba,"");
 //BA.debugLineNum = 276;BA.debugLine="asbm_text_4 = lbl_asbm_text_4";
_asbm_text_4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_asbm_text_4.getObject()));
 //BA.debugLineNum = 278;BA.debugLine="pnl_asbm_partinglines1.Initialize(\"\")";
_pnl_asbm_partinglines1.Initialize(ba,"");
 //BA.debugLineNum = 279;BA.debugLine="asbm_partinglines1 = pnl_asbm_partinglines1";
_asbm_partinglines1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines1.getObject()));
 //BA.debugLineNum = 281;BA.debugLine="pnl_asbm_partinglines2.Initialize(\"\")";
_pnl_asbm_partinglines2.Initialize(ba,"");
 //BA.debugLineNum = 282;BA.debugLine="asbm_partinglines2 = pnl_asbm_partinglines2";
_asbm_partinglines2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines2.getObject()));
 //BA.debugLineNum = 284;BA.debugLine="pnl_asbm_partinglines3.Initialize(\"\")";
_pnl_asbm_partinglines3.Initialize(ba,"");
 //BA.debugLineNum = 285;BA.debugLine="asbm_partinglines3 = pnl_asbm_partinglines3";
_asbm_partinglines3 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines3.getObject()));
 //BA.debugLineNum = 287;BA.debugLine="pnl_asbm_partinglines4.Initialize(\"\")";
_pnl_asbm_partinglines4.Initialize(ba,"");
 //BA.debugLineNum = 288;BA.debugLine="asbm_partinglines4 = pnl_asbm_partinglines4";
_asbm_partinglines4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines4.getObject()));
 //BA.debugLineNum = 290;BA.debugLine="pnl_asbm_partinglines5.Initialize(\"\")";
_pnl_asbm_partinglines5.Initialize(ba,"");
 //BA.debugLineNum = 291;BA.debugLine="asbm_partinglines5 = pnl_asbm_partinglines5";
_asbm_partinglines5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_partinglines5.getObject()));
 //BA.debugLineNum = 294;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 296;BA.debugLine="pnl_asbm_page_5.Initialize(\"asbm_page_5\")";
_pnl_asbm_page_5.Initialize(ba,"asbm_page_5");
 //BA.debugLineNum = 297;BA.debugLine="asbm_page_5 = pnl_asbm_page_5";
_asbm_page_5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_page_5.getObject()));
 //BA.debugLineNum = 299;BA.debugLine="lbl_asbm_text_5.Initialize(\"\")";
_lbl_asbm_text_5.Initialize(ba,"");
 //BA.debugLineNum = 300;BA.debugLine="asbm_text_5 = lbl_asbm_text_5";
_asbm_text_5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_asbm_text_5.getObject()));
 };
 //BA.debugLineNum = 305;BA.debugLine="asbm_icon_1.Initialize(\"asbm_icon_1\")";
_asbm_icon_1.Initialize(ba,"asbm_icon_1");
 //BA.debugLineNum = 311;BA.debugLine="asbm_icon_1.Gravity = Gravity.FILL";
_asbm_icon_1.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 320;BA.debugLine="asbm_icon_2.Initialize(\"asbm_icon_2\")";
_asbm_icon_2.Initialize(ba,"asbm_icon_2");
 //BA.debugLineNum = 324;BA.debugLine="asbm_icon_2.Gravity = Gravity.FILL";
_asbm_icon_2.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 332;BA.debugLine="asbm_icon_3.Initialize(\"asbm_icon_3\")";
_asbm_icon_3.Initialize(ba,"asbm_icon_3");
 //BA.debugLineNum = 336;BA.debugLine="asbm_icon_3.Gravity = Gravity.FILL";
_asbm_icon_3.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 345;BA.debugLine="Dim pnl_asbm_icon_4 As ImageView";
_pnl_asbm_icon_4 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 346;BA.debugLine="pnl_asbm_icon_4.Initialize(\"asbm_icon_4\")";
_pnl_asbm_icon_4.Initialize(ba,"asbm_icon_4");
 //BA.debugLineNum = 351;BA.debugLine="pnl_asbm_icon_4.Gravity = Gravity.FILL";
_pnl_asbm_icon_4.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 359;BA.debugLine="asbm_icon_4 = pnl_asbm_icon_4";
_asbm_icon_4 = _pnl_asbm_icon_4;
 //BA.debugLineNum = 361;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 363;BA.debugLine="Dim pnl_asbm_icon_5 As ImageView";
_pnl_asbm_icon_5 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 364;BA.debugLine="pnl_asbm_icon_5.Initialize(\"asbm_icon_5\")";
_pnl_asbm_icon_5.Initialize(ba,"asbm_icon_5");
 //BA.debugLineNum = 369;BA.debugLine="pnl_asbm_icon_5.Gravity = Gravity.FILL";
_pnl_asbm_icon_5.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 377;BA.debugLine="asbm_icon_5 = pnl_asbm_icon_5";
_asbm_icon_5 = _pnl_asbm_icon_5;
 };
 //BA.debugLineNum = 384;BA.debugLine="Dim pnl_asbm_slider As Panel";
_pnl_asbm_slider = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 392;BA.debugLine="pnl_asbm_slider.Initialize(\"asbm_slider\")";
_pnl_asbm_slider.Initialize(ba,"asbm_slider");
 //BA.debugLineNum = 393;BA.debugLine="asbm_slider = pnl_asbm_slider";
_asbm_slider = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_slider.getObject()));
 //BA.debugLineNum = 396;BA.debugLine="Dim pnl_asbm_badget_1 As Label";
_pnl_asbm_badget_1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 397;BA.debugLine="pnl_asbm_badget_1.Initialize(\"asbm_badget_1\")";
_pnl_asbm_badget_1.Initialize(ba,"asbm_badget_1");
 //BA.debugLineNum = 398;BA.debugLine="asbm_badget_1 = pnl_asbm_badget_1";
_asbm_badget_1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_badget_1.getObject()));
 //BA.debugLineNum = 399;BA.debugLine="asbm_badget_1.Font = xui.CreateDefaultBoldFont(10";
_asbm_badget_1.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 400;BA.debugLine="asbm_badget_1.TextColor = xui.Color_White";
_asbm_badget_1.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 401;BA.debugLine="asbm_badget_1.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_badget_1.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 404;BA.debugLine="Dim pnl_asbm_badget_2 As Label";
_pnl_asbm_badget_2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 405;BA.debugLine="pnl_asbm_badget_2.Initialize(\"asbm_badget_2\")";
_pnl_asbm_badget_2.Initialize(ba,"asbm_badget_2");
 //BA.debugLineNum = 406;BA.debugLine="asbm_badget_2 = pnl_asbm_badget_2";
_asbm_badget_2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_badget_2.getObject()));
 //BA.debugLineNum = 407;BA.debugLine="asbm_badget_2.Font = xui.CreateDefaultBoldFont(10";
_asbm_badget_2.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 408;BA.debugLine="asbm_badget_2.TextColor = xui.Color_White";
_asbm_badget_2.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 409;BA.debugLine="asbm_badget_2.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_badget_2.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 411;BA.debugLine="Dim pnl_asbm_badget_3 As Label";
_pnl_asbm_badget_3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 412;BA.debugLine="pnl_asbm_badget_3.Initialize(\"asbm_badget_3\")";
_pnl_asbm_badget_3.Initialize(ba,"asbm_badget_3");
 //BA.debugLineNum = 413;BA.debugLine="asbm_badget_3 = pnl_asbm_badget_3";
_asbm_badget_3 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_badget_3.getObject()));
 //BA.debugLineNum = 414;BA.debugLine="asbm_badget_3.Font = xui.CreateDefaultBoldFont(10";
_asbm_badget_3.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 415;BA.debugLine="asbm_badget_3.TextColor = xui.Color_White";
_asbm_badget_3.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 416;BA.debugLine="asbm_badget_3.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_badget_3.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 418;BA.debugLine="Dim pnl_asbm_badget_4 As Label";
_pnl_asbm_badget_4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 419;BA.debugLine="pnl_asbm_badget_4.Initialize(\"asbm_badget_4\")";
_pnl_asbm_badget_4.Initialize(ba,"asbm_badget_4");
 //BA.debugLineNum = 420;BA.debugLine="asbm_badget_4 = pnl_asbm_badget_4";
_asbm_badget_4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_badget_4.getObject()));
 //BA.debugLineNum = 421;BA.debugLine="asbm_badget_4.Font = xui.CreateDefaultBoldFont(10";
_asbm_badget_4.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 422;BA.debugLine="asbm_badget_4.TextColor = xui.Color_White";
_asbm_badget_4.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 423;BA.debugLine="asbm_badget_4.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_badget_4.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 425;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 427;BA.debugLine="Dim pnl_asbm_badget_5 As Label";
_pnl_asbm_badget_5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 428;BA.debugLine="pnl_asbm_badget_5.Initialize(\"asbm_badget_5\")";
_pnl_asbm_badget_5.Initialize(ba,"asbm_badget_5");
 //BA.debugLineNum = 429;BA.debugLine="asbm_badget_5 = pnl_asbm_badget_5";
_asbm_badget_5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl_asbm_badget_5.getObject()));
 //BA.debugLineNum = 430;BA.debugLine="asbm_badget_5.Font = xui.CreateDefaultBoldFont(1";
_asbm_badget_5.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 431;BA.debugLine="asbm_badget_5.TextColor = xui.Color_White";
_asbm_badget_5.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 432;BA.debugLine="asbm_badget_5.SetTextAlignment(\"CENTER\",\"CENTER\"";
_asbm_badget_5.SetTextAlignment("CENTER","CENTER");
 };
 //BA.debugLineNum = 437;BA.debugLine="s_Color1 = xui.PaintOrColorToColor(Props.Get(\"Sli";
_s_color1 = _xui.PaintOrColorToColor(_props.Get((Object)("SliderColor1")));
 //BA.debugLineNum = 438;BA.debugLine="s_Color2 = xui.PaintOrColorToColor(Props.Get(\"Sli";
_s_color2 = _xui.PaintOrColorToColor(_props.Get((Object)("SliderColor2")));
 //BA.debugLineNum = 439;BA.debugLine="s_Color3 = xui.PaintOrColorToColor(Props.Get(\"Sli";
_s_color3 = _xui.PaintOrColorToColor(_props.Get((Object)("SliderColor3")));
 //BA.debugLineNum = 440;BA.debugLine="s_Color4 = xui.PaintOrColorToColor(Props.Get(\"Sli";
_s_color4 = _xui.PaintOrColorToColor(_props.Get((Object)("SliderColor4")));
 //BA.debugLineNum = 441;BA.debugLine="s_Color5 = xui.PaintOrColorToColor(Props.Get(\"Sli";
_s_color5 = _xui.PaintOrColorToColor(_props.Get((Object)("SliderColor5")));
 //BA.debugLineNum = 443;BA.debugLine="b_Color = xui.PaintOrColorToColor(Props.Get(\"Back";
_b_color = _xui.PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
 //BA.debugLineNum = 445;BA.debugLine="p_Line = xui.PaintOrColorToColor(Props.Get(\"Parti";
_p_line = _xui.PaintOrColorToColor(_props.Get((Object)("PartingLine")));
 //BA.debugLineNum = 447;BA.debugLine="m_BackgroundColor = xui.PaintOrColorToColor(Props";
_m_backgroundcolor = _xui.PaintOrColorToColor(_props.Get((Object)("MiddleBackgroundColor")));
 //BA.debugLineNum = 449;BA.debugLine="e_BadgetColor1 = Props.Get(\"EnableBadgetColor1\")";
_e_badgetcolor1 = BA.ObjectToBoolean(_props.Get((Object)("EnableBadgetColor1")));
 //BA.debugLineNum = 450;BA.debugLine="e_BadgetColor2 = Props.Get(\"EnableBadgetColor2\")";
_e_badgetcolor2 = BA.ObjectToBoolean(_props.Get((Object)("EnableBadgetColor2")));
 //BA.debugLineNum = 451;BA.debugLine="e_BadgetColor3 = Props.Get(\"EnableBadgetColor3\")";
_e_badgetcolor3 = BA.ObjectToBoolean(_props.Get((Object)("EnableBadgetColor3")));
 //BA.debugLineNum = 452;BA.debugLine="e_BadgetColor4 = Props.Get(\"EnableBadgetColor4\")";
_e_badgetcolor4 = BA.ObjectToBoolean(_props.Get((Object)("EnableBadgetColor4")));
 //BA.debugLineNum = 453;BA.debugLine="e_BadgetColor5 = Props.Get(\"EnableBadgetColor5\")";
_e_badgetcolor5 = BA.ObjectToBoolean(_props.Get((Object)("EnableBadgetColor5")));
 //BA.debugLineNum = 455;BA.debugLine="b_color1 = xui.PaintOrColorToColor(Props.Get(\"Bad";
_b_color1 = _xui.PaintOrColorToColor(_props.Get((Object)("BadgetColor1")));
 //BA.debugLineNum = 456;BA.debugLine="b_color2 = xui.PaintOrColorToColor(Props.Get(\"Bad";
_b_color2 = _xui.PaintOrColorToColor(_props.Get((Object)("BadgetColor2")));
 //BA.debugLineNum = 457;BA.debugLine="b_color3 = xui.PaintOrColorToColor(Props.Get(\"Bad";
_b_color3 = _xui.PaintOrColorToColor(_props.Get((Object)("BadgetColor3")));
 //BA.debugLineNum = 458;BA.debugLine="b_color4 = xui.PaintOrColorToColor(Props.Get(\"Bad";
_b_color4 = _xui.PaintOrColorToColor(_props.Get((Object)("BadgetColor4")));
 //BA.debugLineNum = 459;BA.debugLine="b_color5 = xui.PaintOrColorToColor(Props.Get(\"Bad";
_b_color5 = _xui.PaintOrColorToColor(_props.Get((Object)("BadgetColor5")));
 //BA.debugLineNum = 461;BA.debugLine="p_ClickColor = xui.PaintOrColorToColor(Props.Get(";
_p_clickcolor = _xui.PaintOrColorToColor(_props.Get((Object)("PageClickColor")));
 //BA.debugLineNum = 463;BA.debugLine="p_Lines_Color = xui.PaintOrColorToColor(Props.Get";
_p_lines_color = _xui.PaintOrColorToColor(_props.Get((Object)("PartingLinesColor")));
 //BA.debugLineNum = 465;BA.debugLine="e_SelectedPageColor = Props.Get(\"EnableSelectedPa";
_e_selectedpagecolor = BA.ObjectToBoolean(_props.Get((Object)("EnableSelectedPageColor")));
 //BA.debugLineNum = 467;BA.debugLine="s_PageColor = xui.PaintOrColorToColor(Props.Get(\"";
_s_pagecolor = _xui.PaintOrColorToColor(_props.Get((Object)("SelectedPageColor")));
 //BA.debugLineNum = 469;BA.debugLine="MiddleButtonVisible = Props.Get(\"MiddleButtonVisi";
_middlebuttonvisible = BA.ObjectToBoolean(_props.Get((Object)("MiddleButtonVisible")));
 //BA.debugLineNum = 473;BA.debugLine="e_text =  Props.Get(\"EnableText\")";
_e_text = BA.ObjectToBoolean(_props.Get((Object)("EnableText")));
 //BA.debugLineNum = 474;BA.debugLine="t_color = xui.PaintOrColorToColor(Props.Get(\"Text";
_t_color = _xui.PaintOrColorToColor(_props.Get((Object)("TextColor")));
 //BA.debugLineNum = 475;BA.debugLine="text_1 = Props.Get(\"Text1\")";
_text_1 = BA.ObjectToString(_props.Get((Object)("Text1")));
 //BA.debugLineNum = 476;BA.debugLine="text_2 = Props.Get(\"Text2\")";
_text_2 = BA.ObjectToString(_props.Get((Object)("Text2")));
 //BA.debugLineNum = 477;BA.debugLine="text_3 = Props.Get(\"Text3\")";
_text_3 = BA.ObjectToString(_props.Get((Object)("Text3")));
 //BA.debugLineNum = 478;BA.debugLine="text_4 = Props.Get(\"Text4\")";
_text_4 = BA.ObjectToString(_props.Get((Object)("Text4")));
 //BA.debugLineNum = 479;BA.debugLine="text_5 = Props.Get(\"Text5\")";
_text_5 = BA.ObjectToString(_props.Get((Object)("Text5")));
 //BA.debugLineNum = 482;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 484;BA.debugLine="MiddleButtonVisible = False";
_middlebuttonvisible = __c.False;
 };
 //BA.debugLineNum = 489;BA.debugLine="asbm_page_1.Color = xui.Color_Transparent";
_asbm_page_1.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 490;BA.debugLine="asbm_page_2.Color = xui.Color_Transparent";
_asbm_page_2.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 491;BA.debugLine="asbm_page_3.Color = xui.Color_Transparent";
_asbm_page_3.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 492;BA.debugLine="asbm_page_4.Color = xui.Color_Transparent";
_asbm_page_4.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 494;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 496;BA.debugLine="asbm_page_5.Color = xui.Color_Transparent";
_asbm_page_5.setColor(_xui.Color_Transparent);
 };
 //BA.debugLineNum = 501;BA.debugLine="asbm_slider.Height = 2dip";
_asbm_slider.setHeight(__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 502;BA.debugLine="asbm_slider.Width = 40dip";
_asbm_slider.setWidth(__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 503;BA.debugLine="asbm_slider.SetColorAndBorder(s_Color1,0,xui.Colo";
_asbm_slider.SetColorAndBorder(_s_color1,(int) (0),_xui.Color_Transparent,(int) (_asbm_slider.getHeight()/(double)2));
 //BA.debugLineNum = 506;BA.debugLine="asbm_parting_line.Height = 3dip";
_asbm_parting_line.setHeight(__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 507;BA.debugLine="asbm_parting_line.Color = p_Line";
_asbm_parting_line.setColor(_p_line);
 //BA.debugLineNum = 510;BA.debugLine="asbm_badget_1.Width = 18dip";
_asbm_badget_1.setWidth(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 511;BA.debugLine="asbm_badget_1.Height = 18dip";
_asbm_badget_1.setHeight(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 512;BA.debugLine="asbm_badget_1.SetColorAndBorder(b_color1,0dip,xui";
_asbm_badget_1.SetColorAndBorder(_b_color1,__c.DipToCurrent((int) (0)),_xui.Color_White,(int) (_asbm_badget_1.getHeight()/(double)2));
 //BA.debugLineNum = 513;BA.debugLine="asbm_badget_1.Text = 0";
_asbm_badget_1.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 514;BA.debugLine="asbm_badget_1.TextSize = 13";
_asbm_badget_1.setTextSize((float) (13));
 //BA.debugLineNum = 517;BA.debugLine="asbm_badget_2.Width = 18dip";
_asbm_badget_2.setWidth(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 518;BA.debugLine="asbm_badget_2.Height = 18dip";
_asbm_badget_2.setHeight(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 519;BA.debugLine="asbm_badget_2.SetColorAndBorder(b_color2,0dip,xui";
_asbm_badget_2.SetColorAndBorder(_b_color2,__c.DipToCurrent((int) (0)),_xui.Color_White,(int) (_asbm_badget_2.getHeight()/(double)2));
 //BA.debugLineNum = 520;BA.debugLine="asbm_badget_2.Text = 0";
_asbm_badget_2.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 521;BA.debugLine="asbm_badget_2.TextSize = 13";
_asbm_badget_2.setTextSize((float) (13));
 //BA.debugLineNum = 523;BA.debugLine="asbm_badget_3.Width = 18dip";
_asbm_badget_3.setWidth(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 524;BA.debugLine="asbm_badget_3.Height = 18dip";
_asbm_badget_3.setHeight(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 525;BA.debugLine="asbm_badget_3.SetColorAndBorder(b_color3,0dip,xui";
_asbm_badget_3.SetColorAndBorder(_b_color3,__c.DipToCurrent((int) (0)),_xui.Color_White,(int) (_asbm_badget_3.getHeight()/(double)2));
 //BA.debugLineNum = 526;BA.debugLine="asbm_badget_3.Text = 0";
_asbm_badget_3.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 527;BA.debugLine="asbm_badget_3.TextSize = 13";
_asbm_badget_3.setTextSize((float) (13));
 //BA.debugLineNum = 529;BA.debugLine="asbm_badget_4.Width = 18dip";
_asbm_badget_4.setWidth(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 530;BA.debugLine="asbm_badget_4.Height = 18dip";
_asbm_badget_4.setHeight(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 531;BA.debugLine="asbm_badget_4.SetColorAndBorder(b_color4,0dip,xui";
_asbm_badget_4.SetColorAndBorder(_b_color4,__c.DipToCurrent((int) (0)),_xui.Color_White,(int) (_asbm_badget_4.getHeight()/(double)2));
 //BA.debugLineNum = 532;BA.debugLine="asbm_badget_4.Text = 0";
_asbm_badget_4.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 533;BA.debugLine="asbm_badget_4.TextSize = 13";
_asbm_badget_4.setTextSize((float) (13));
 //BA.debugLineNum = 536;BA.debugLine="asbm_text_1.TextColor = t_color";
_asbm_text_1.setTextColor(_t_color);
 //BA.debugLineNum = 537;BA.debugLine="asbm_text_2.TextColor = t_color";
_asbm_text_2.setTextColor(_t_color);
 //BA.debugLineNum = 538;BA.debugLine="asbm_text_3.TextColor = t_color";
_asbm_text_3.setTextColor(_t_color);
 //BA.debugLineNum = 539;BA.debugLine="asbm_text_4.TextColor = t_color";
_asbm_text_4.setTextColor(_t_color);
 //BA.debugLineNum = 540;BA.debugLine="asbm_text_1.Text = text_1";
_asbm_text_1.setText(BA.ObjectToCharSequence(_text_1));
 //BA.debugLineNum = 541;BA.debugLine="asbm_text_2.Text = text_2";
_asbm_text_2.setText(BA.ObjectToCharSequence(_text_2));
 //BA.debugLineNum = 542;BA.debugLine="asbm_text_3.Text = text_3";
_asbm_text_3.setText(BA.ObjectToCharSequence(_text_3));
 //BA.debugLineNum = 543;BA.debugLine="asbm_text_4.Text = text_4";
_asbm_text_4.setText(BA.ObjectToCharSequence(_text_4));
 //BA.debugLineNum = 545;BA.debugLine="asbm_text_1.Font = xui.CreateDefaultBoldFont(10)";
_asbm_text_1.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 546;BA.debugLine="asbm_text_2.Font = xui.CreateDefaultBoldFont(10)";
_asbm_text_2.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 547;BA.debugLine="asbm_text_3.Font = xui.CreateDefaultBoldFont(10)";
_asbm_text_3.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 548;BA.debugLine="asbm_text_4.Font = xui.CreateDefaultBoldFont(10)";
_asbm_text_4.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 549;BA.debugLine="asbm_text_1.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_text_1.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 550;BA.debugLine="asbm_text_2.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_text_2.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 551;BA.debugLine="asbm_text_3.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_text_3.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 552;BA.debugLine="asbm_text_4.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_text_4.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 554;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 556;BA.debugLine="asbm_badget_5.Width = 18dip";
_asbm_badget_5.setWidth(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 557;BA.debugLine="asbm_badget_5.Height = 18dip";
_asbm_badget_5.setHeight(__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 558;BA.debugLine="asbm_badget_5.SetColorAndBorder(b_color5,0dip,xu";
_asbm_badget_5.SetColorAndBorder(_b_color5,__c.DipToCurrent((int) (0)),_xui.Color_White,(int) (_asbm_badget_5.getHeight()/(double)2));
 //BA.debugLineNum = 559;BA.debugLine="asbm_badget_5.Text = 0";
_asbm_badget_5.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 560;BA.debugLine="asbm_badget_5.TextSize = 14";
_asbm_badget_5.setTextSize((float) (14));
 //BA.debugLineNum = 562;BA.debugLine="asbm_text_5.Text = text_5";
_asbm_text_5.setText(BA.ObjectToCharSequence(_text_5));
 //BA.debugLineNum = 563;BA.debugLine="asbm_text_5.TextColor = t_color";
_asbm_text_5.setTextColor(_t_color);
 //BA.debugLineNum = 564;BA.debugLine="asbm_text_5.Font = xui.CreateDefaultBoldFont(10)";
_asbm_text_5.setFont(_xui.CreateDefaultBoldFont((float) (10)));
 //BA.debugLineNum = 565;BA.debugLine="asbm_text_5.SetTextAlignment(\"CENTER\",\"CENTER\")";
_asbm_text_5.SetTextAlignment("CENTER","CENTER");
 };
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 1450;BA.debugLine="Public Sub Initialize (CallBack As Object, EventNa";
 //BA.debugLineNum = 1451;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 1452;BA.debugLine="mCallBack = CallBack";
_mcallback = _callback;
 //BA.debugLineNum = 1453;BA.debugLine="End Sub";
return "";
}
public int  _measuretextheight(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
 //BA.debugLineNum = 3374;BA.debugLine="Private Sub MeasureTextHeight(Text As String, Font";
 //BA.debugLineNum = 3376;BA.debugLine="Private bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 3377;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 3378;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 3379;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 3380;BA.debugLine="Return cvs.MeasureStringHeight(Text, Font1.ToN";
if (true) return (int) (_cvs.MeasureStringHeight(_text,(android.graphics.Typeface)(_font1.ToNativeFont().getObject()),_font1.getSize()));
 //BA.debugLineNum = 3392;BA.debugLine="End Sub";
return 0;
}
public int  _measuretextwidth(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
 //BA.debugLineNum = 3354;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
 //BA.debugLineNum = 3356;BA.debugLine="Private bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 3357;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 3358;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 3359;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 3360;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNa";
if (true) return (int) (_cvs.MeasureStringWidth(_text,(android.graphics.Typeface)(_font1.ToNativeFont().getObject()),_font1.getSize()));
 //BA.debugLineNum = 3372;BA.debugLine="End Sub";
return 0;
}
public String  _setbadgetcolor1(int _color) throws Exception{
 //BA.debugLineNum = 2524;BA.debugLine="Public Sub SetBadgetColor1(color As Int)";
 //BA.debugLineNum = 2526;BA.debugLine="b_color1 = color";
_b_color1 = _color;
 //BA.debugLineNum = 2527;BA.debugLine="asbm_badget_1.Color = b_color1";
_asbm_badget_1.setColor(_b_color1);
 //BA.debugLineNum = 2528;BA.debugLine="End Sub";
return "";
}
public String  _setbadgetcolor2(int _color) throws Exception{
 //BA.debugLineNum = 2531;BA.debugLine="Public Sub SetBadgetColor2(color As Int)";
 //BA.debugLineNum = 2533;BA.debugLine="b_color2 = color";
_b_color2 = _color;
 //BA.debugLineNum = 2534;BA.debugLine="asbm_badget_2.Color = b_color2";
_asbm_badget_2.setColor(_b_color2);
 //BA.debugLineNum = 2535;BA.debugLine="End Sub";
return "";
}
public String  _setbadgetcolor3(int _color) throws Exception{
 //BA.debugLineNum = 2538;BA.debugLine="Public Sub SetBadgetColor3(color As Int)";
 //BA.debugLineNum = 2540;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2542;BA.debugLine="b_color3 = color";
_b_color3 = _color;
 //BA.debugLineNum = 2543;BA.debugLine="asbm_badget_3.Color = b_color3";
_asbm_badget_3.setColor(_b_color3);
 };
 //BA.debugLineNum = 2547;BA.debugLine="End Sub";
return "";
}
public String  _setbadgetcolor4(int _color) throws Exception{
 //BA.debugLineNum = 2550;BA.debugLine="Public Sub SetBadgetColor4(color As Int)";
 //BA.debugLineNum = 2552;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2554;BA.debugLine="b_color4 = color";
_b_color4 = _color;
 //BA.debugLineNum = 2555;BA.debugLine="asbm_badget_4.Color = b_color4";
_asbm_badget_4.setColor(_b_color4);
 };
 //BA.debugLineNum = 2559;BA.debugLine="End Sub";
return "";
}
public String  _setbadgetcolor5(int _color) throws Exception{
 //BA.debugLineNum = 2562;BA.debugLine="Public Sub SetBadgetColor5(color As Int)";
 //BA.debugLineNum = 2564;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2566;BA.debugLine="b_color5 = color";
_b_color5 = _color;
 //BA.debugLineNum = 2567;BA.debugLine="asbm_badget_5.Color = b_color5";
_asbm_badget_5.setColor(_b_color5);
 };
 //BA.debugLineNum = 2571;BA.debugLine="End Sub";
return "";
}
public String  _setbadgetvalue1(int _value) throws Exception{
 //BA.debugLineNum = 2666;BA.debugLine="Public Sub SetBadgetValue1(value As Int)";
 //BA.debugLineNum = 2668;BA.debugLine="If value > 9 Then";
if (_value>9) { 
 //BA.debugLineNum = 2670;BA.debugLine="asbm_badget_1.Text = \"+\" & 9";
_asbm_badget_1.setText(BA.ObjectToCharSequence("+"+BA.NumberToString(9)));
 //BA.debugLineNum = 2671;BA.debugLine="asbm_badget_1.TextSize = FitTextSize(asbm_badget";
_asbm_badget_1.setTextSize(_fittextsize(_asbm_badget_1));
 }else if(_value<0) { 
 //BA.debugLineNum = 2675;BA.debugLine="asbm_badget_1.Text = 0";
_asbm_badget_1.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 2676;BA.debugLine="asbm_badget_1.TextSize = 13";
_asbm_badget_1.setTextSize((float) (13));
 }else {
 //BA.debugLineNum = 2681;BA.debugLine="asbm_badget_1.Text = value";
_asbm_badget_1.setText(BA.ObjectToCharSequence(_value));
 //BA.debugLineNum = 2682;BA.debugLine="asbm_badget_1.TextSize = 13";
_asbm_badget_1.setTextSize((float) (13));
 };
 //BA.debugLineNum = 2686;BA.debugLine="End Sub";
return "";
}
public String  _setbadgetvalue2(int _value) throws Exception{
 //BA.debugLineNum = 2689;BA.debugLine="Public Sub SetBadgetValue2(value As Int)";
 //BA.debugLineNum = 2691;BA.debugLine="If value > 9 Then";
if (_value>9) { 
 //BA.debugLineNum = 2693;BA.debugLine="asbm_badget_2.Text = \"+\" & 9";
_asbm_badget_2.setText(BA.ObjectToCharSequence("+"+BA.NumberToString(9)));
 //BA.debugLineNum = 2694;BA.debugLine="asbm_badget_2.TextSize = FitTextSize(asbm_badget";
_asbm_badget_2.setTextSize(_fittextsize(_asbm_badget_2));
 }else if(_value<0) { 
 //BA.debugLineNum = 2697;BA.debugLine="asbm_badget_2.Text = 0";
_asbm_badget_2.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 2698;BA.debugLine="asbm_badget_2.TextSize = 13";
_asbm_badget_2.setTextSize((float) (13));
 }else {
 //BA.debugLineNum = 2702;BA.debugLine="asbm_badget_2.Text = value";
_asbm_badget_2.setText(BA.ObjectToCharSequence(_value));
 //BA.debugLineNum = 2703;BA.debugLine="asbm_badget_2.TextSize = 13";
_asbm_badget_2.setTextSize((float) (13));
 };
 //BA.debugLineNum = 2706;BA.debugLine="End Sub";
return "";
}
public String  _setbadgetvalue3(int _value) throws Exception{
 //BA.debugLineNum = 2709;BA.debugLine="Public Sub SetBadgetValue3(value As Int)";
 //BA.debugLineNum = 2711;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2713;BA.debugLine="If value > 9 Then";
if (_value>9) { 
 //BA.debugLineNum = 2715;BA.debugLine="asbm_badget_3.Text = \"+\" & 9";
_asbm_badget_3.setText(BA.ObjectToCharSequence("+"+BA.NumberToString(9)));
 //BA.debugLineNum = 2716;BA.debugLine="asbm_badget_3.TextSize = FitTextSize(asbm_badge";
_asbm_badget_3.setTextSize(_fittextsize(_asbm_badget_3));
 }else if(_value<0) { 
 //BA.debugLineNum = 2719;BA.debugLine="asbm_badget_3.Text =  0";
_asbm_badget_3.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 2720;BA.debugLine="asbm_badget_3.TextSize = 13";
_asbm_badget_3.setTextSize((float) (13));
 }else {
 //BA.debugLineNum = 2724;BA.debugLine="asbm_badget_3.Text = value";
_asbm_badget_3.setText(BA.ObjectToCharSequence(_value));
 //BA.debugLineNum = 2725;BA.debugLine="asbm_badget_3.TextSize = 13";
_asbm_badget_3.setTextSize((float) (13));
 };
 };
 //BA.debugLineNum = 2731;BA.debugLine="End Sub";
return "";
}
public String  _setbadgetvalue4(int _value) throws Exception{
 //BA.debugLineNum = 2734;BA.debugLine="Public Sub SetBadgetValue4(value As Int)";
 //BA.debugLineNum = 2736;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2738;BA.debugLine="If value > 9 Then";
if (_value>9) { 
 //BA.debugLineNum = 2740;BA.debugLine="asbm_badget_4.Text = \"+\" & 9";
_asbm_badget_4.setText(BA.ObjectToCharSequence("+"+BA.NumberToString(9)));
 //BA.debugLineNum = 2741;BA.debugLine="asbm_badget_4.TextSize = FitTextSize(asbm_badge";
_asbm_badget_4.setTextSize(_fittextsize(_asbm_badget_4));
 }else if(_value<0) { 
 //BA.debugLineNum = 2744;BA.debugLine="asbm_badget_4.Text = 0";
_asbm_badget_4.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 2745;BA.debugLine="asbm_badget_4.TextSize = 13";
_asbm_badget_4.setTextSize((float) (13));
 }else {
 //BA.debugLineNum = 2749;BA.debugLine="asbm_badget_4.Text = value";
_asbm_badget_4.setText(BA.ObjectToCharSequence(_value));
 //BA.debugLineNum = 2750;BA.debugLine="asbm_badget_4.TextSize = 13";
_asbm_badget_4.setTextSize((float) (13));
 };
 };
 //BA.debugLineNum = 2755;BA.debugLine="End Sub";
return "";
}
public String  _setbadgetvalue5(int _value) throws Exception{
 //BA.debugLineNum = 2758;BA.debugLine="Public Sub SetBadgetValue5(value As Int)";
 //BA.debugLineNum = 2760;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2762;BA.debugLine="If value > 9 Then";
if (_value>9) { 
 //BA.debugLineNum = 2764;BA.debugLine="asbm_badget_5.Text = \"+\" & 9";
_asbm_badget_5.setText(BA.ObjectToCharSequence("+"+BA.NumberToString(9)));
 //BA.debugLineNum = 2765;BA.debugLine="asbm_badget_5.TextSize = FitTextSize(asbm_badge";
_asbm_badget_5.setTextSize(_fittextsize(_asbm_badget_5));
 }else if(_value<0) { 
 //BA.debugLineNum = 2768;BA.debugLine="asbm_badget_5.Text = 0";
_asbm_badget_5.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 2769;BA.debugLine="asbm_badget_5.TextSize = 13";
_asbm_badget_5.setTextSize((float) (13));
 }else {
 //BA.debugLineNum = 2773;BA.debugLine="asbm_badget_5.Text = value";
_asbm_badget_5.setText(BA.ObjectToCharSequence(_value));
 //BA.debugLineNum = 2774;BA.debugLine="asbm_badget_5.TextSize = 13";
_asbm_badget_5.setTextSize((float) (13));
 };
 };
 //BA.debugLineNum = 2779;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentpage(int _page) throws Exception{
 //BA.debugLineNum = 2958;BA.debugLine="Public Sub SetCurrentPage(page As Int)";
 //BA.debugLineNum = 2960;BA.debugLine="If page = 1 Then";
if (_page==1) { 
 //BA.debugLineNum = 2962;BA.debugLine="asbm_page_1_handler(asbm_page_1)";
_asbm_page_1_handler(_asbm_page_1);
 }else if(_page==2) { 
 //BA.debugLineNum = 2966;BA.debugLine="asbm_page_2_handler(asbm_page_2)";
_asbm_page_2_handler(_asbm_page_2);
 }else if(_page==3) { 
 //BA.debugLineNum = 2970;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2972;BA.debugLine="asbm_page_3_handler(asbm_page_3)";
_asbm_page_3_handler(_asbm_page_3);
 };
 }else if(_page==4) { 
 //BA.debugLineNum = 2978;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2980;BA.debugLine="asbm_page_4_handler(asbm_page_4)";
_asbm_page_4_handler(_asbm_page_4);
 };
 }else if(_page==5) { 
 //BA.debugLineNum = 2986;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2988;BA.debugLine="asbm_page_5_handler(asbm_page_5)";
_asbm_page_5_handler(_asbm_page_5);
 };
 }else {
 //BA.debugLineNum = 2994;BA.debugLine="Log(\"Page number not valid\")";
__c.LogImpl("56750244","Page number not valid",0);
 //BA.debugLineNum = 2995;BA.debugLine="asbm_page_1_handler(asbm_page_1)";
_asbm_page_1_handler(_asbm_page_1);
 };
 //BA.debugLineNum = 2999;BA.debugLine="End Sub";
return "";
}
public String  _seticon1(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 2781;BA.debugLine="Public Sub SetIcon1(icon As B4XBitmap)";
 //BA.debugLineNum = 2783;BA.debugLine="icon1 = icon";
_icon1 = _icon;
 //BA.debugLineNum = 2796;BA.debugLine="asbm_icon_1.Bitmap = icon1";
_asbm_icon_1.setBitmap((android.graphics.Bitmap)(_icon1.getObject()));
 //BA.debugLineNum = 2798;BA.debugLine="If currentpage = 1 Then";
if (_currentpage==1) { 
 //BA.debugLineNum = 2800;BA.debugLine="asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_1.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_1.getBitmap())),_s_pagecolor).getObject()));
 }else {
 //BA.debugLineNum = 2803;BA.debugLine="asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_1.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_1.getBitmap())),_xui.Color_White).getObject()));
 };
 //BA.debugLineNum = 2809;BA.debugLine="End Sub";
return "";
}
public String  _seticon2(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 2811;BA.debugLine="Public Sub SetIcon2(icon As B4XBitmap)";
 //BA.debugLineNum = 2813;BA.debugLine="icon2 = icon";
_icon2 = _icon;
 //BA.debugLineNum = 2826;BA.debugLine="asbm_icon_2.Bitmap = icon2";
_asbm_icon_2.setBitmap((android.graphics.Bitmap)(_icon2.getObject()));
 //BA.debugLineNum = 2828;BA.debugLine="If currentpage = 2 Then";
if (_currentpage==2) { 
 //BA.debugLineNum = 2830;BA.debugLine="asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_2.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_2.getBitmap())),_s_pagecolor).getObject()));
 }else {
 //BA.debugLineNum = 2832;BA.debugLine="asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_2.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_2.getBitmap())),_xui.Color_White).getObject()));
 };
 //BA.debugLineNum = 2840;BA.debugLine="End Sub";
return "";
}
public String  _seticon3(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 2842;BA.debugLine="Public Sub SetIcon3(icon As B4XBitmap)";
 //BA.debugLineNum = 2844;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2846;BA.debugLine="icon3 = icon";
_icon3 = _icon;
 //BA.debugLineNum = 2860;BA.debugLine="asbm_icon_3.Bitmap = icon3";
_asbm_icon_3.setBitmap((android.graphics.Bitmap)(_icon3.getObject()));
 //BA.debugLineNum = 2862;BA.debugLine="If currentpage = 3 Then";
if (_currentpage==3) { 
 //BA.debugLineNum = 2864;BA.debugLine="asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_3.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_3.getBitmap())),_s_pagecolor).getObject()));
 }else {
 //BA.debugLineNum = 2866;BA.debugLine="asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_3.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_3.getBitmap())),_xui.Color_White).getObject()));
 };
 };
 //BA.debugLineNum = 2872;BA.debugLine="End Sub";
return "";
}
public String  _seticon4(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 2875;BA.debugLine="Public Sub SetIcon4(icon As B4XBitmap)";
 //BA.debugLineNum = 2877;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2879;BA.debugLine="icon4 = icon";
_icon4 = _icon;
 //BA.debugLineNum = 2892;BA.debugLine="asbm_icon_4.Bitmap = icon4";
_asbm_icon_4.setBitmap((android.graphics.Bitmap)(_icon4.getObject()));
 //BA.debugLineNum = 2894;BA.debugLine="If currentpage = 4 Then";
if (_currentpage==4) { 
 //BA.debugLineNum = 2896;BA.debugLine="asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_4.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_4.getBitmap())),_s_pagecolor).getObject()));
 }else {
 //BA.debugLineNum = 2898;BA.debugLine="asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_4.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_4.getBitmap())),_xui.Color_White).getObject()));
 };
 };
 //BA.debugLineNum = 2905;BA.debugLine="End Sub";
return "";
}
public String  _seticon5(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 2908;BA.debugLine="Public Sub SetIcon5(icon As B4XBitmap)";
 //BA.debugLineNum = 2910;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2912;BA.debugLine="icon5 = icon";
_icon5 = _icon;
 //BA.debugLineNum = 2925;BA.debugLine="asbm_icon_5.Bitmap = icon5";
_asbm_icon_5.setBitmap((android.graphics.Bitmap)(_icon5.getObject()));
 //BA.debugLineNum = 2927;BA.debugLine="If currentpage = 5 Then";
if (_currentpage==5) { 
 //BA.debugLineNum = 2929;BA.debugLine="asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_5.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_5.getBitmap())),_s_pagecolor).getObject()));
 }else {
 //BA.debugLineNum = 2931;BA.debugLine="asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLeve";
_asbm_icon_5.setBitmap((android.graphics.Bitmap)(_changecolorbasedonalphalevel((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_asbm_icon_5.getBitmap())),_xui.Color_White).getObject()));
 };
 };
 //BA.debugLineNum = 2937;BA.debugLine="End Sub";
return "";
}
public String  _setmenubackgroundcolor(int _color) throws Exception{
 //BA.debugLineNum = 2574;BA.debugLine="Public Sub SetMenuBackgroundColor(color As Int)";
 //BA.debugLineNum = 2576;BA.debugLine="b_Color = color";
_b_color = _color;
 //BA.debugLineNum = 2577;BA.debugLine="asbm_page_background.Color = b_Color";
_asbm_page_background.setColor(_b_color);
 //BA.debugLineNum = 2578;BA.debugLine="End Sub";
return "";
}
public String  _setmiddlebuttonbackgroundcolor(int _color) throws Exception{
 //BA.debugLineNum = 2602;BA.debugLine="Public Sub SetMiddleButtonBackgroundColor(color As";
 //BA.debugLineNum = 2605;BA.debugLine="m_BackgroundColor = color";
_m_backgroundcolor = _color;
 //BA.debugLineNum = 2606;BA.debugLine="asbm_add_background.Color = m_BackgroundColor";
_asbm_add_background.setColor(_m_backgroundcolor);
 //BA.debugLineNum = 2608;BA.debugLine="End Sub";
return "";
}
public String  _setmiddlebuttonicon(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon) throws Exception{
 //BA.debugLineNum = 2940;BA.debugLine="Public Sub SetMiddleButtonIcon(icon As B4XBitmap)";
 //BA.debugLineNum = 2942;BA.debugLine="middleicon = icon";
_middleicon = _icon;
 //BA.debugLineNum = 2949;BA.debugLine="pnl_asbm_add_icon.Bitmap = middleicon";
_pnl_asbm_add_icon.setBitmap((android.graphics.Bitmap)(_middleicon.getObject()));
 //BA.debugLineNum = 2955;BA.debugLine="End Sub";
return "";
}
public String  _setmiddlebuttonvisible(boolean _visble) throws Exception{
 //BA.debugLineNum = 3208;BA.debugLine="Public Sub SetMiddleButtonVisible(Visble As Boolea";
 //BA.debugLineNum = 3210;BA.debugLine="MiddleButtonVisible = Visble";
_middlebuttonvisible = _visble;
 //BA.debugLineNum = 3211;BA.debugLine="asbm_add_background.Visible = Visble";
_asbm_add_background.setVisible(_visble);
 //BA.debugLineNum = 3212;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 3214;BA.debugLine="End Sub";
return "";
}
public String  _setpageclickcolor(int _color) throws Exception{
 //BA.debugLineNum = 2595;BA.debugLine="Public Sub SetPageClickColor(color As Int)";
 //BA.debugLineNum = 2597;BA.debugLine="p_ClickColor = color";
_p_clickcolor = _color;
 //BA.debugLineNum = 2599;BA.debugLine="End Sub";
return "";
}
public String  _setpartinglinecolor(int _color) throws Exception{
 //BA.debugLineNum = 2611;BA.debugLine="Public Sub SetPartingLineColor(color As Int)";
 //BA.debugLineNum = 2613;BA.debugLine="p_Line = color";
_p_line = _color;
 //BA.debugLineNum = 2614;BA.debugLine="asbm_parting_line.Color = p_Line";
_asbm_parting_line.setColor(_p_line);
 //BA.debugLineNum = 2616;BA.debugLine="End Sub";
return "";
}
public String  _setpartinglinescolor(int _color) throws Exception{
 //BA.debugLineNum = 3196;BA.debugLine="Public Sub SetPartingLinesColor(Color As Int)";
 //BA.debugLineNum = 3198;BA.debugLine="p_Lines_Color = Color";
_p_lines_color = _color;
 //BA.debugLineNum = 3200;BA.debugLine="asbm_partinglines1.Color = p_Lines_Color";
_asbm_partinglines1.setColor(_p_lines_color);
 //BA.debugLineNum = 3201;BA.debugLine="asbm_partinglines2.Color = p_Lines_Color";
_asbm_partinglines2.setColor(_p_lines_color);
 //BA.debugLineNum = 3202;BA.debugLine="asbm_partinglines3.Color = p_Lines_Color";
_asbm_partinglines3.setColor(_p_lines_color);
 //BA.debugLineNum = 3203;BA.debugLine="asbm_partinglines4.Color = p_Lines_Color";
_asbm_partinglines4.setColor(_p_lines_color);
 //BA.debugLineNum = 3204;BA.debugLine="asbm_partinglines5.Color = p_Lines_Color";
_asbm_partinglines5.setColor(_p_lines_color);
 //BA.debugLineNum = 3206;BA.debugLine="End Sub";
return "";
}
public String  _setselectedpagecolor(int _color) throws Exception{
 //BA.debugLineNum = 2588;BA.debugLine="Public Sub SetSelectedPageColor(color As Int)";
 //BA.debugLineNum = 2590;BA.debugLine="s_PageColor = color";
_s_pagecolor = _color;
 //BA.debugLineNum = 2592;BA.debugLine="End Sub";
return "";
}
public String  _setslider1color(int _color) throws Exception{
 //BA.debugLineNum = 2619;BA.debugLine="Public Sub SetSlider1Color(color As Int)";
 //BA.debugLineNum = 2621;BA.debugLine="s_Color1 = color";
_s_color1 = _color;
 //BA.debugLineNum = 2623;BA.debugLine="End Sub";
return "";
}
public String  _setslider2color(int _color) throws Exception{
 //BA.debugLineNum = 2626;BA.debugLine="Public Sub SetSlider2Color(color As Int)";
 //BA.debugLineNum = 2628;BA.debugLine="s_Color2 = color";
_s_color2 = _color;
 //BA.debugLineNum = 2630;BA.debugLine="End Sub";
return "";
}
public String  _setslider3color(int _color) throws Exception{
 //BA.debugLineNum = 2633;BA.debugLine="Public Sub SetSlider3Color(color As Int)";
 //BA.debugLineNum = 2635;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2637;BA.debugLine="s_Color3 = color";
_s_color3 = _color;
 };
 //BA.debugLineNum = 2641;BA.debugLine="End Sub";
return "";
}
public String  _setslider4color(int _color) throws Exception{
 //BA.debugLineNum = 2644;BA.debugLine="Public Sub SetSlider4Color(color As Int)";
 //BA.debugLineNum = 2646;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 2648;BA.debugLine="s_Color4 = color";
_s_color4 = _color;
 };
 //BA.debugLineNum = 2652;BA.debugLine="End Sub";
return "";
}
public String  _setslider5color(int _color) throws Exception{
 //BA.debugLineNum = 2655;BA.debugLine="Public Sub SetSlider5Color(color As Int)";
 //BA.debugLineNum = 2657;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 2659;BA.debugLine="s_Color5 = color";
_s_color5 = _color;
 };
 //BA.debugLineNum = 2663;BA.debugLine="End Sub";
return "";
}
public String  _settabpartinglinesvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 3103;BA.debugLine="Public Sub SetTabPartingLinesVisible(Visible As Bo";
 //BA.debugLineNum = 3105;BA.debugLine="If Visible = True Then";
if (_visible==__c.True) { 
 //BA.debugLineNum = 3110;BA.debugLine="If TypeOfMenu = \"4 Icon Tabs\" Then";
if ((_typeofmenu).equals("4 Icon Tabs")) { 
 //BA.debugLineNum = 3112;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 3114;BA.debugLine="asbm_partinglines1.Visible = True";
_asbm_partinglines1.setVisible(__c.True);
 //BA.debugLineNum = 3115;BA.debugLine="asbm_partinglines3.Visible = True";
_asbm_partinglines3.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 3119;BA.debugLine="asbm_partinglines1.Visible = True";
_asbm_partinglines1.setVisible(__c.True);
 //BA.debugLineNum = 3120;BA.debugLine="asbm_partinglines2.Visible = True";
_asbm_partinglines2.setVisible(__c.True);
 //BA.debugLineNum = 3121;BA.debugLine="asbm_partinglines3.Visible = True";
_asbm_partinglines3.setVisible(__c.True);
 //BA.debugLineNum = 3123;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 3124;BA.debugLine="asbm_partinglines5.Visible = True";
_asbm_partinglines5.setVisible(__c.True);
 };
 };
 }else if((_typeofmenu).equals("2 Icon Tabs")) { 
 //BA.debugLineNum = 3131;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 }else {
 //BA.debugLineNum = 3137;BA.debugLine="asbm_partinglines1.Visible = True";
_asbm_partinglines1.setVisible(__c.True);
 //BA.debugLineNum = 3141;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 3142;BA.debugLine="asbm_partinglines5.Visible = True";
_asbm_partinglines5.setVisible(__c.True);
 };
 };
 };
 }else {
 //BA.debugLineNum = 3151;BA.debugLine="If TypeOfMenu = \"4 Icon Tabs\" Then";
if ((_typeofmenu).equals("4 Icon Tabs")) { 
 //BA.debugLineNum = 3153;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 //BA.debugLineNum = 3155;BA.debugLine="asbm_partinglines1.Visible = False";
_asbm_partinglines1.setVisible(__c.False);
 //BA.debugLineNum = 3156;BA.debugLine="asbm_partinglines3.Visible = False";
_asbm_partinglines3.setVisible(__c.False);
 }else {
 //BA.debugLineNum = 3160;BA.debugLine="asbm_partinglines1.Visible = False";
_asbm_partinglines1.setVisible(__c.False);
 //BA.debugLineNum = 3161;BA.debugLine="asbm_partinglines2.Visible = False";
_asbm_partinglines2.setVisible(__c.False);
 //BA.debugLineNum = 3162;BA.debugLine="asbm_partinglines3.Visible = False";
_asbm_partinglines3.setVisible(__c.False);
 //BA.debugLineNum = 3164;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 3165;BA.debugLine="asbm_partinglines5.Visible = False";
_asbm_partinglines5.setVisible(__c.False);
 };
 };
 }else if((_typeofmenu).equals("2 Icon Tabs")) { 
 //BA.debugLineNum = 3172;BA.debugLine="If MiddleButtonVisible = True Then";
if (_middlebuttonvisible==__c.True) { 
 }else {
 //BA.debugLineNum = 3178;BA.debugLine="asbm_partinglines1.Visible = False";
_asbm_partinglines1.setVisible(__c.False);
 //BA.debugLineNum = 3182;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 3183;BA.debugLine="asbm_partinglines5.Visible = False";
_asbm_partinglines5.setVisible(__c.False);
 };
 };
 };
 };
 //BA.debugLineNum = 3193;BA.debugLine="End Sub";
return "";
}
public String  _settext1(String _text) throws Exception{
 //BA.debugLineNum = 3232;BA.debugLine="Public Sub SetText1(text As String)";
 //BA.debugLineNum = 3234;BA.debugLine="text_1 = text";
_text_1 = _text;
 //BA.debugLineNum = 3235;BA.debugLine="asbm_text_1.Text = text";
_asbm_text_1.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 3237;BA.debugLine="End Sub";
return "";
}
public String  _settext2(String _text) throws Exception{
 //BA.debugLineNum = 3239;BA.debugLine="Public Sub SetText2(text As String)";
 //BA.debugLineNum = 3241;BA.debugLine="text_2 = text";
_text_2 = _text;
 //BA.debugLineNum = 3242;BA.debugLine="asbm_text_2.Text = text";
_asbm_text_2.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 3244;BA.debugLine="End Sub";
return "";
}
public String  _settext3(String _text) throws Exception{
 //BA.debugLineNum = 3246;BA.debugLine="Public Sub SetText3(text As String)";
 //BA.debugLineNum = 3248;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 3250;BA.debugLine="text_3 = text";
_text_3 = _text;
 //BA.debugLineNum = 3251;BA.debugLine="asbm_text_3.Text = text";
_asbm_text_3.setText(BA.ObjectToCharSequence(_text));
 };
 //BA.debugLineNum = 3255;BA.debugLine="End Sub";
return "";
}
public String  _settext4(String _text) throws Exception{
 //BA.debugLineNum = 3257;BA.debugLine="Public Sub SetText4(text As String)";
 //BA.debugLineNum = 3259;BA.debugLine="If Mode = 1 Then";
if (_mode==1) { 
 //BA.debugLineNum = 3261;BA.debugLine="text_4 = text";
_text_4 = _text;
 //BA.debugLineNum = 3262;BA.debugLine="asbm_text_4.Text = text";
_asbm_text_4.setText(BA.ObjectToCharSequence(_text));
 };
 //BA.debugLineNum = 3266;BA.debugLine="End Sub";
return "";
}
public String  _settext5(String _text) throws Exception{
 //BA.debugLineNum = 3268;BA.debugLine="Public Sub SetText5(text As String)";
 //BA.debugLineNum = 3270;BA.debugLine="If EnableMiddleButtonAsPage = True Then";
if (_enablemiddlebuttonaspage==__c.True) { 
 //BA.debugLineNum = 3272;BA.debugLine="text_5 = text";
_text_5 = _text;
 //BA.debugLineNum = 3273;BA.debugLine="asbm_text_5.Text = text";
_asbm_text_5.setText(BA.ObjectToCharSequence(_text));
 };
 //BA.debugLineNum = 3277;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(int _color) throws Exception{
 //BA.debugLineNum = 3225;BA.debugLine="Public Sub SetTextColor(Color As Int)";
 //BA.debugLineNum = 3227;BA.debugLine="t_color = Color";
_t_color = _color;
 //BA.debugLineNum = 3228;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 3230;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
