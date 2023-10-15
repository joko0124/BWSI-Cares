package com.bwsi.cares;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class imageslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.bwsi.cares.imageslider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.bwsi.cares.imageslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _currentpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _nextpanel = null;
public anywheresoftware.b4a.objects.collections.List _panels = null;
public int _currentindex = 0;
public anywheresoftware.b4a.objects.collections.List _cachedimages = null;
public int _animationduration = 0;
public int _cachesize = 0;
public int _taskindex = 0;
public int _mnumberofimages = 0;
public String _animationtype = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _windowbase = null;
public float _mousepressedx = 0f;
public boolean _showindicators = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _indicatorspanel = null;
public anywheresoftware.b4a.objects.B4XCanvas _indicatorscvs = null;
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
public static class _imagesliderimage{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper bmp;
public int index;
public void Initialize() {
IsInitialized = true;
bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
index = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _base_resize(double _width,double _height) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 61;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 62;BA.debugLine="WindowBase.SetLayoutAnimated(0, 0, 0, Width, Heig";
_windowbase.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 63;BA.debugLine="For Each p As B4XView In panels";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _panels;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
 //BA.debugLineNum = 64;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, Height)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 65;BA.debugLine="p.GetView(0).SetLayoutAnimated(0, 0, 0, Width, H";
_p.GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
 //BA.debugLineNum = 67;BA.debugLine="CachedImages.Clear 'clear the images cache as the";
_cachedimages.Clear();
 //BA.debugLineNum = 68;BA.debugLine="If ShowIndicators Then";
if (_showindicators) { 
 //BA.debugLineNum = 69;BA.debugLine="IndicatorsPanel.SetLayoutAnimated(0, 0, 0, Windo";
_indicatorspanel.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_windowbase.getWidth(),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 70;BA.debugLine="IndicatorsCVS.Resize(IndicatorsPanel.Width, Indi";
_indicatorscvs.Resize((float) (_indicatorspanel.getWidth()),(float) (_indicatorspanel.getHeight()));
 //BA.debugLineNum = 71;BA.debugLine="DrawIndicators";
_drawindicators();
 };
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 12;BA.debugLine="Private CurrentPanel, NextPanel As B4XView";
_currentpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_nextpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private panels As List";
_panels = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Private CurrentIndex As Int";
_currentindex = 0;
 //BA.debugLineNum = 15;BA.debugLine="Private CachedImages As List";
_cachedimages = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private AnimationDuration As Int";
_animationduration = 0;
 //BA.debugLineNum = 17;BA.debugLine="Private CacheSize As Int";
_cachesize = 0;
 //BA.debugLineNum = 18;BA.debugLine="Type ImageSliderImage (bmp As B4XBitmap, index As";
;
 //BA.debugLineNum = 19;BA.debugLine="Private TaskIndex As Int";
_taskindex = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private mNumberOfImages As Int";
_mnumberofimages = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private AnimationType As String";
_animationtype = "";
 //BA.debugLineNum = 22;BA.debugLine="Public WindowBase As B4XView";
_windowbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private MousePressedX As Float";
_mousepressedx = 0f;
 //BA.debugLineNum = 24;BA.debugLine="Private ShowIndicators As Boolean";
_showindicators = false;
 //BA.debugLineNum = 25;BA.debugLine="Private IndicatorsPanel As B4XView";
_indicatorspanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private IndicatorsCVS As B4XCanvas";
_indicatorscvs = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _iv1 = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv2 = null;
 //BA.debugLineNum = 35;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 36;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 37;BA.debugLine="WindowBase = xui.CreatePanel(\"WindowBase\")";
_windowbase = _xui.CreatePanel(ba,"WindowBase");
 //BA.debugLineNum = 38;BA.debugLine="mBase.AddView(WindowBase, 0, 0, 0, 0)";
_mbase.AddView((android.view.View)(_windowbase.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 39;BA.debugLine="AnimationDuration = Props.Get(\"AnimationDuration\"";
_animationduration = (int)(BA.ObjectToNumber(_props.Get((Object)("AnimationDuration"))));
 //BA.debugLineNum = 40;BA.debugLine="CacheSize = Props.Get(\"CacheSize\")";
_cachesize = (int)(BA.ObjectToNumber(_props.Get((Object)("CacheSize"))));
 //BA.debugLineNum = 41;BA.debugLine="AnimationType = Props.Get(\"AnimationType\")";
_animationtype = BA.ObjectToString(_props.Get((Object)("AnimationType")));
 //BA.debugLineNum = 42;BA.debugLine="CurrentPanel = xui.CreatePanel(\"pnl\")";
_currentpanel = _xui.CreatePanel(ba,"pnl");
 //BA.debugLineNum = 43;BA.debugLine="NextPanel = xui.CreatePanel(\"pnl\")";
_nextpanel = _xui.CreatePanel(ba,"pnl");
 //BA.debugLineNum = 44;BA.debugLine="ShowIndicators = Props.GetDefault(\"ShowIndicators";
_showindicators = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowIndicators"),(Object)(__c.True)));
 //BA.debugLineNum = 45;BA.debugLine="panels = Array(CurrentPanel, NextPanel)";
_panels = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_currentpanel.getObject()),(Object)(_nextpanel.getObject())});
 //BA.debugLineNum = 46;BA.debugLine="WindowBase.AddView(CurrentPanel, 0, 0, 0, 0)";
_windowbase.AddView((android.view.View)(_currentpanel.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 47;BA.debugLine="WindowBase.AddView(NextPanel, 0, 0, 0, 0)";
_windowbase.AddView((android.view.View)(_nextpanel.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 48;BA.debugLine="Dim iv1, iv2 As ImageView";
_iv1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 49;BA.debugLine="iv1.Initialize(\"\")";
_iv1.Initialize(ba,"");
 //BA.debugLineNum = 50;BA.debugLine="iv2.Initialize(\"\")";
_iv2.Initialize(ba,"");
 //BA.debugLineNum = 51;BA.debugLine="CurrentPanel.AddView(iv1, 0, 0, 0, 0)";
_currentpanel.AddView((android.view.View)(_iv1.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 52;BA.debugLine="NextPanel.AddView(iv2, 0, 0, 0, 0)";
_nextpanel.AddView((android.view.View)(_iv2.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 53;BA.debugLine="If ShowIndicators Then";
if (_showindicators) { 
 //BA.debugLineNum = 54;BA.debugLine="IndicatorsPanel = xui.CreatePanel(\"\")";
_indicatorspanel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 55;BA.debugLine="WindowBase.AddView(IndicatorsPanel, 0, 0, 2dip,";
_windowbase.AddView((android.view.View)(_indicatorspanel.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 56;BA.debugLine="IndicatorsCVS.Initialize(IndicatorsPanel)";
_indicatorscvs.Initialize(_indicatorspanel);
 };
 //BA.debugLineNum = 58;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _drawindicators() throws Exception{
int _clr = 0;
int _i = 0;
 //BA.debugLineNum = 75;BA.debugLine="Private Sub DrawIndicators";
 //BA.debugLineNum = 76;BA.debugLine="If ShowIndicators = False Then Return";
if (_showindicators==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 77;BA.debugLine="IndicatorsCVS.ClearRect(IndicatorsCVS.TargetRect)";
_indicatorscvs.ClearRect(_indicatorscvs.getTargetRect());
 //BA.debugLineNum = 78;BA.debugLine="Dim clr As Int";
_clr = 0;
 //BA.debugLineNum = 79;BA.debugLine="For i = 0 To mNumberOfImages - 1";
{
final int step4 = 1;
final int limit4 = (int) (_mnumberofimages-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 80;BA.debugLine="If CurrentIndex = i Then clr = 0xFFC80000 Else c";
if (_currentindex==_i) { 
_clr = ((int)0xffc80000);}
else {
_clr = ((int)0xff7a7a7a);};
 //BA.debugLineNum = 81;BA.debugLine="IndicatorsCVS.DrawCircle(IndicatorsCVS.TargetRec";
_indicatorscvs.DrawCircle((float) (_indicatorscvs.getTargetRect().getCenterX()+(-(_mnumberofimages-1)/(double)2+_i)*__c.DipToCurrent((int) (30))),(float) (__c.DipToCurrent((int) (25))),(float) (__c.DipToCurrent((int) (3))),_clr,__c.True,(float) (0));
 }
};
 //BA.debugLineNum = 83;BA.debugLine="IndicatorsCVS.Invalidate";
_indicatorscvs.Invalidate();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getimage(int _index) throws Exception{
ResumableSub_GetImage rsub = new ResumableSub_GetImage(this,_index);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetImage extends BA.ResumableSub {
public ResumableSub_GetImage(com.bwsi.cares.imageslider parent,int _index) {
this.parent = parent;
this._index = _index;
}
com.bwsi.cares.imageslider parent;
int _index;
com.bwsi.cares.imageslider._imagesliderimage _ii = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 139;BA.debugLine="For Each ii As ImageSliderImage In CachedImages";
if (true) break;

case 1:
//for
this.state = 8;
group1 = parent._cachedimages;
index1 = 0;
groupLen1 = group1.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 8;
if (index1 < groupLen1) {
this.state = 3;
_ii = (com.bwsi.cares.imageslider._imagesliderimage)(group1.Get(index1));}
if (true) break;

case 20:
//C
this.state = 19;
index1++;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 140;BA.debugLine="If ii.index = index Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_ii.index /*int*/ ==_index) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 141;BA.debugLine="CachedImages.RemoveAt(CachedImages.IndexOf(ii))";
parent._cachedimages.RemoveAt(parent._cachedimages.IndexOf((Object)(_ii)));
 //BA.debugLineNum = 142;BA.debugLine="CachedImages.Add(ii)";
parent._cachedimages.Add((Object)(_ii));
 //BA.debugLineNum = 143;BA.debugLine="Return ii";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ii));return;};
 if (true) break;

case 7:
//C
this.state = 20;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 146;BA.debugLine="Dim rs As ResumableSub = CallSub2(mCallBack, mEve";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubNew2(ba,parent._mcallback,parent._meventname+"_GetImage",(Object)(_index))));
 //BA.debugLineNum = 147;BA.debugLine="Dim ii As ImageSliderImage";
_ii = new com.bwsi.cares.imageslider._imagesliderimage();
 //BA.debugLineNum = 148;BA.debugLine="If rs.IsInitialized = False Then Return ii";
if (true) break;

case 9:
//if
this.state = 14;
if (_rs.IsInitialized()==parent.__c.False) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ii));return;};
if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 149;BA.debugLine="Wait For (rs) Complete (bmp As B4XBitmap)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 21;
return;
case 21:
//C
this.state = 15;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[0];
;
 //BA.debugLineNum = 150;BA.debugLine="ii.Initialize";
_ii.Initialize();
 //BA.debugLineNum = 151;BA.debugLine="ii.bmp = bmp";
_ii.bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
 //BA.debugLineNum = 152;BA.debugLine="ii.index = index";
_ii.index /*int*/  = _index;
 //BA.debugLineNum = 153;BA.debugLine="CachedImages.Add(ii)";
parent._cachedimages.Add((Object)(_ii));
 //BA.debugLineNum = 154;BA.debugLine="Do While CachedImages.Size > CacheSize";
if (true) break;

case 15:
//do while
this.state = 18;
while (parent._cachedimages.getSize()>parent._cachesize) {
this.state = 17;
if (true) break;
}
if (true) break;

case 17:
//C
this.state = 15;
 //BA.debugLineNum = 155;BA.debugLine="CachedImages.RemoveAt(0)";
parent._cachedimages.RemoveAt((int) (0));
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 157;BA.debugLine="Return ii";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ii));return;};
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
}
public int  _getnumberofimages() throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Public Sub getNumberOfImages As Int";
 //BA.debugLineNum = 173;BA.debugLine="Return mNumberOfImages";
if (true) return _mnumberofimages;
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 30;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 31;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 32;BA.debugLine="CachedImages.Initialize";
_cachedimages.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public void  _nextimage() throws Exception{
ResumableSub_NextImage rsub = new ResumableSub_NextImage(this);
rsub.resume(ba, null);
}
public static class ResumableSub_NextImage extends BA.ResumableSub {
public ResumableSub_NextImage(com.bwsi.cares.imageslider parent) {
this.parent = parent;
}
com.bwsi.cares.imageslider parent;
int _mytask = 0;
com.bwsi.cares.imageslider._imagesliderimage _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 117;BA.debugLine="TaskIndex = TaskIndex + 1";
parent._taskindex = (int) (parent._taskindex+1);
 //BA.debugLineNum = 118;BA.debugLine="Dim MyTask As Int = TaskIndex";
_mytask = parent._taskindex;
 //BA.debugLineNum = 119;BA.debugLine="CurrentIndex = (CurrentIndex + 1) Mod mNumberOfIm";
parent._currentindex = (int) ((parent._currentindex+1)%parent._mnumberofimages);
 //BA.debugLineNum = 120;BA.debugLine="Wait For (GetImage(CurrentIndex)) Complete (Resul";
parent.__c.WaitFor("complete", ba, this, parent._getimage(parent._currentindex));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (com.bwsi.cares.imageslider._imagesliderimage) result[0];
;
 //BA.debugLineNum = 121;BA.debugLine="If MyTask <> TaskIndex Or Result.IsInitialized =";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytask!=parent._taskindex || _result.IsInitialized /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 122;BA.debugLine="ShowImage(Result.bmp, True)";
parent._showimage(_result.bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ,parent.__c.True);
 //BA.debugLineNum = 123;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
 //BA.debugLineNum = 124;BA.debugLine="If CurrentIndex < mNumberOfImages -1 Then GetImag";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._currentindex<parent._mnumberofimages-1) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
parent._getimage((int) (parent._currentindex+1));
if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _previmage() throws Exception{
ResumableSub_PrevImage rsub = new ResumableSub_PrevImage(this);
rsub.resume(ba, null);
}
public static class ResumableSub_PrevImage extends BA.ResumableSub {
public ResumableSub_PrevImage(com.bwsi.cares.imageslider parent) {
this.parent = parent;
}
com.bwsi.cares.imageslider parent;
int _mytask = 0;
com.bwsi.cares.imageslider._imagesliderimage _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 128;BA.debugLine="TaskIndex = TaskIndex + 1";
parent._taskindex = (int) (parent._taskindex+1);
 //BA.debugLineNum = 129;BA.debugLine="Dim MyTask As Int = TaskIndex";
_mytask = parent._taskindex;
 //BA.debugLineNum = 130;BA.debugLine="CurrentIndex = (CurrentIndex - 1 + mNumberOfImage";
parent._currentindex = (int) ((parent._currentindex-1+parent._mnumberofimages)%parent._mnumberofimages);
 //BA.debugLineNum = 131;BA.debugLine="Wait For (GetImage(CurrentIndex)) Complete (Resul";
parent.__c.WaitFor("complete", ba, this, parent._getimage(parent._currentindex));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (com.bwsi.cares.imageslider._imagesliderimage) result[0];
;
 //BA.debugLineNum = 132;BA.debugLine="If MyTask <> TaskIndex Or Result.IsInitialized =";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytask!=parent._taskindex || _result.IsInitialized /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 133;BA.debugLine="ShowImage(Result.bmp, False)";
parent._showimage(_result.bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ,parent.__c.False);
 //BA.debugLineNum = 134;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
 //BA.debugLineNum = 135;BA.debugLine="If CurrentIndex > 0 Then GetImage(CurrentIndex -";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._currentindex>0) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
parent._getimage((int) (parent._currentindex-1));
if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setnumberofimages(int _i) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Public Sub setNumberOfImages (i As Int)";
 //BA.debugLineNum = 177;BA.debugLine="mNumberOfImages = i";
_mnumberofimages = _i;
 //BA.debugLineNum = 178;BA.debugLine="DrawIndicators";
_drawindicators();
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _showimage(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,boolean _movingtonext) throws Exception{
int _top = 0;
int _left = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 86;BA.debugLine="Private Sub ShowImage (bmp As B4XBitmap, MovingToN";
 //BA.debugLineNum = 87;BA.debugLine="NextPanel.GetView(0).SetBitmap(bmp)";
_nextpanel.GetView((int) (0)).SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 88;BA.debugLine="NextPanel.GetView(0).SetLayoutAnimated(0, WindowB";
_nextpanel.GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (_windowbase.getWidth()/(double)2-_bmp.getWidth()/(double)2),(int) (_windowbase.getHeight()/(double)2-_bmp.getHeight()/(double)2),(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
 //BA.debugLineNum = 90;BA.debugLine="NextPanel.Visible = True";
_nextpanel.setVisible(__c.True);
 //BA.debugLineNum = 91;BA.debugLine="Select AnimationType";
switch (BA.switchObjectToInt(_animationtype,"Vertical","Horizontal","Fade")) {
case 0: {
 //BA.debugLineNum = 93;BA.debugLine="Dim top As Int";
_top = 0;
 //BA.debugLineNum = 94;BA.debugLine="If MovingToNext Then top = -NextPanel.Height El";
if (_movingtonext) { 
_top = (int) (-_nextpanel.getHeight());}
else {
_top = _nextpanel.getHeight();};
 //BA.debugLineNum = 95;BA.debugLine="NextPanel.SetLayoutAnimated(0, 0, top, NextPane";
_nextpanel.SetLayoutAnimated((int) (0),(int) (0),_top,_nextpanel.getWidth(),_nextpanel.getHeight());
 //BA.debugLineNum = 96;BA.debugLine="NextPanel.SetLayoutAnimated(AnimationDuration,";
_nextpanel.SetLayoutAnimated(_animationduration,(int) (0),(int) (0),_nextpanel.getWidth(),_nextpanel.getHeight());
 //BA.debugLineNum = 97;BA.debugLine="CurrentPanel.SetLayoutAnimated(AnimationDuratio";
_currentpanel.SetLayoutAnimated(_animationduration,(int) (0),(int) (-_top),_currentpanel.getWidth(),_currentpanel.getHeight());
 break; }
case 1: {
 //BA.debugLineNum = 99;BA.debugLine="Dim left As Int";
_left = 0;
 //BA.debugLineNum = 100;BA.debugLine="If MovingToNext Then left = NextPanel.Width Els";
if (_movingtonext) { 
_left = _nextpanel.getWidth();}
else {
_left = (int) (-_nextpanel.getWidth());};
 //BA.debugLineNum = 101;BA.debugLine="NextPanel.SetLayoutAnimated(0, left, 0, NextPan";
_nextpanel.SetLayoutAnimated((int) (0),_left,(int) (0),_nextpanel.getWidth(),_nextpanel.getHeight());
 //BA.debugLineNum = 102;BA.debugLine="NextPanel.SetLayoutAnimated(AnimationDuration,";
_nextpanel.SetLayoutAnimated(_animationduration,(int) (0),(int) (0),_nextpanel.getWidth(),_nextpanel.getHeight());
 //BA.debugLineNum = 103;BA.debugLine="CurrentPanel.SetLayoutAnimated(AnimationDuratio";
_currentpanel.SetLayoutAnimated(_animationduration,(int) (-_left),(int) (0),_currentpanel.getWidth(),_currentpanel.getHeight());
 break; }
case 2: {
 //BA.debugLineNum = 105;BA.debugLine="NextPanel.Visible = False";
_nextpanel.setVisible(__c.False);
 //BA.debugLineNum = 106;BA.debugLine="NextPanel.SetLayoutAnimated(0, left, 0, NextPan";
_nextpanel.SetLayoutAnimated((int) (0),_left,(int) (0),_nextpanel.getWidth(),_nextpanel.getHeight());
 //BA.debugLineNum = 107;BA.debugLine="NextPanel.SetVisibleAnimated(AnimationDuration,";
_nextpanel.SetVisibleAnimated(_animationduration,__c.True);
 //BA.debugLineNum = 108;BA.debugLine="CurrentPanel.SetVisibleAnimated(AnimationDurati";
_currentpanel.SetVisibleAnimated(_animationduration,__c.False);
 break; }
}
;
 //BA.debugLineNum = 110;BA.debugLine="Dim p As B4XView = CurrentPanel";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _currentpanel;
 //BA.debugLineNum = 111;BA.debugLine="CurrentPanel = NextPanel";
_currentpanel = _nextpanel;
 //BA.debugLineNum = 112;BA.debugLine="NextPanel = p";
_nextpanel = _p;
 //BA.debugLineNum = 113;BA.debugLine="DrawIndicators";
_drawindicators();
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _windowbase_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Private Sub WindowBase_Touch (Action As Int, X As";
 //BA.debugLineNum = 161;BA.debugLine="If Action = WindowBase.TOUCH_ACTION_DOWN Then";
if (_action==_windowbase.TOUCH_ACTION_DOWN) { 
 //BA.debugLineNum = 162;BA.debugLine="MousePressedX = X";
_mousepressedx = _x;
 }else if(_action==_windowbase.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 164;BA.debugLine="If X > MousePressedX + 50dip Then";
if (_x>_mousepressedx+__c.DipToCurrent((int) (50))) { 
 //BA.debugLineNum = 165;BA.debugLine="PrevImage";
_previmage();
 }else if(_x<_mousepressedx-__c.DipToCurrent((int) (50))) { 
 //BA.debugLineNum = 167;BA.debugLine="NextImage";
_nextimage();
 };
 };
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
