package com.bwsi.cares;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class globalvariables {
private static globalvariables mostCurrent = new globalvariables();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rtp = null;
public static double _pricolor1 = 0;
public static double _pricolor2 = 0;
public static double _pricolor3 = 0;
public b4a.example.dateutils _dateutils = null;
public com.bwsi.cares.main _main = null;
public com.bwsi.cares.faqspage _faqspage = null;
public com.bwsi.cares.dataprivacypage _dataprivacypage = null;
public com.bwsi.cares.dbutils _dbutils = null;
public com.bwsi.cares.historypage _historypage = null;
public com.bwsi.cares.newspage _newspage = null;
public com.bwsi.cares.starter _starter = null;
public com.bwsi.cares.httputils2service _httputils2service = null;
public com.bwsi.cares.b4xcollections _b4xcollections = null;
public com.bwsi.cares.xuiviewsutils _xuiviewsutils = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _fontbit(anywheresoftware.b4a.BA _ba,String _icon,float _font_size,int _color,boolean _awesome) throws Exception{
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _typ = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
double _h = 0;
 //BA.debugLineNum = 19;BA.debugLine="Public Sub FontBit (icon As String, font_size As F";
 //BA.debugLineNum = 21;BA.debugLine="If color = 0 Then color = Colors.White";
if (_color==0) { 
_color = anywheresoftware.b4a.keywords.Common.Colors.White;};
 //BA.debugLineNum = 22;BA.debugLine="Dim typ As Typeface = Typeface.MATERIALICONS";
_typ = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_typ = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS()));
 //BA.debugLineNum = 23;BA.debugLine="If awesome Then typ = Typeface.FONTAWESOME";
if (_awesome) { 
_typ = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.getFONTAWESOME()));};
 //BA.debugLineNum = 24;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 25;BA.debugLine="bmp.InitializeMutable(32dip, 32dip)";
_bmp.InitializeMutable(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32)));
 //BA.debugLineNum = 26;BA.debugLine="Dim cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 27;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 28;BA.debugLine="Dim h As Double";
_h = 0;
 //BA.debugLineNum = 29;BA.debugLine="If Not(awesome) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_awesome)) { 
 //BA.debugLineNum = 30;BA.debugLine="h = cvs.MeasureStringHeight(icon, typ, font_size";
_h = _cvs.MeasureStringHeight(_icon,(android.graphics.Typeface)(_typ.getObject()),_font_size)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10));
 }else {
 //BA.debugLineNum = 32;BA.debugLine="h = cvs.MeasureStringHeight(icon, typ, font_size";
_h = _cvs.MeasureStringHeight(_icon,(android.graphics.Typeface)(_typ.getObject()),_font_size);
 };
 //BA.debugLineNum = 34;BA.debugLine="cvs.DrawText(icon, bmp.Width / 2, bmp.Height / 2";
_cvs.DrawText(_ba,_icon,(float) (_bmp.getWidth()/(double)2),(float) (_bmp.getHeight()/(double)2+_h/(double)2),(android.graphics.Typeface)(_typ.getObject()),_font_size,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 35;BA.debugLine="Return bmp";
if (true) return _bmp;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public RTP As RuntimePermissions";
_rtp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 5;BA.debugLine="Public PriColor1 = 0xFF1E4369 As Double";
_pricolor1 = ((int)0xff1e4369);
 //BA.debugLineNum = 6;BA.debugLine="Public PriColor2 = 0xFF2A91C3 As Double";
_pricolor2 = ((int)0xff2a91c3);
 //BA.debugLineNum = 7;BA.debugLine="Public PriColor3 = 0xFFF3FDFF As Double";
_pricolor3 = ((int)0xfff3fdff);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _setsmalldisplay(anywheresoftware.b4a.BA _ba) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
 //BA.debugLineNum = 10;BA.debugLine="Public Sub SetSmallDisplay";
 //BA.debugLineNum = 11;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 12;BA.debugLine="r.Target = r.RunStaticMethod(\"android.util.Displa";
_r.Target = _r.RunStaticMethod("android.util.DisplayMetrics","getSystem",(Object[])(anywheresoftware.b4a.keywords.Common.Null),(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 13;BA.debugLine="r.RunMethod(\"setToDefaults\")";
_r.RunMethod("setToDefaults");
 //BA.debugLineNum = 14;BA.debugLine="r.RunMethod2(\"setDensity\", 480, \"java.lang.float\"";
_r.RunMethod2("setDensity",BA.NumberToString(480),"java.lang.float");
 //BA.debugLineNum = 15;BA.debugLine="r.RunMethod2(\"setScaledDensity\", 480 / 160, \"java";
_r.RunMethod2("setScaledDensity",BA.NumberToString(480/(double)160),"java.lang.float");
 //BA.debugLineNum = 16;BA.debugLine="r.RunMethod2(\"setDensityDpi\", 480, \"java.lang.int";
_r.RunMethod2("setDensityDpi",BA.NumberToString(480),"java.lang.int");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
}
