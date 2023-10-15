package com.bwsi.cares;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class historypage extends Activity implements B4AActivity{
	public static historypage mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.bwsi.cares", "com.bwsi.cares.historypage");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (historypage).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.bwsi.cares", "com.bwsi.cares.historypage");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.bwsi.cares.historypage", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (historypage) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (historypage) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return historypage.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (historypage) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (historypage) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            historypage mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (historypage) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.LabelWrapper _back = null;
public com.bwsi.cares.bbcodeview _historyview = null;
public com.bwsi.cares.bctextengine _textengine = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public com.bwsi.cares.main _main = null;
public com.bwsi.cares.faqspage _faqspage = null;
public com.bwsi.cares.globalvariables _globalvariables = null;
public com.bwsi.cares.dataprivacypage _dataprivacypage = null;
public com.bwsi.cares.dbutils _dbutils = null;
public com.bwsi.cares.newspage _newspage = null;
public com.bwsi.cares.starter _starter = null;
public com.bwsi.cares.httputils2service _httputils2service = null;
public com.bwsi.cares.b4xcollections _b4xcollections = null;
public com.bwsi.cares.xuiviewsutils _xuiviewsutils = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 18;BA.debugLine="SetStatusBarAndNavigationColor(GlobalVariables.Pr";
_setstatusbarandnavigationcolor((int) (mostCurrent._globalvariables._pricolor1 /*double*/ ));
 //BA.debugLineNum = 19;BA.debugLine="Activity.LoadLayout(\"History\")";
mostCurrent._activity.LoadLayout("History",mostCurrent.activityBA);
 //BA.debugLineNum = 20;BA.debugLine="TextEngine.Initialize(Activity)";
mostCurrent._textengine._initialize /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
 //BA.debugLineNum = 21;BA.debugLine="HistoryView.TextEngine = TextEngine";
mostCurrent._historyview._settextengine /*com.bwsi.cares.bctextengine*/ (mostCurrent._textengine);
 //BA.debugLineNum = 22;BA.debugLine="HistoryView.Text = \"\"";
mostCurrent._historyview._settext /*String*/ ("");
 //BA.debugLineNum = 23;BA.debugLine="LoadHistory";
_loadhistory();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public static String  _back_click() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Private Sub Back_Click";
 //BA.debugLineNum = 35;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _backgroundandcornerradius(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _cornerradius) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdw1 = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub BackgroundAndCornerRadius(View As View , Corne";
 //BA.debugLineNum = 71;BA.debugLine="Dim cdw1 As ColorDrawable";
_cdw1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 72;BA.debugLine="cdw1.Initialize(Colors.White, CornerRadius)";
_cdw1.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,_cornerradius);
 //BA.debugLineNum = 73;BA.debugLine="View.Background = cdw1";
_view.setBackground((android.graphics.drawable.Drawable)(_cdw1.getObject()));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _changecolorbasedonalphalevel(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _newcolor) throws Exception{
b4a.example.bitmapcreator _bc = null;
b4a.example.bitmapcreator._argbcolor _a1 = null;
b4a.example.bitmapcreator._argbcolor _a2 = null;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 39;BA.debugLine="Sub ChangeColorBasedOnAlphaLevel(bmp As B4XBitmap,";
 //BA.debugLineNum = 40;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 41;BA.debugLine="bc.Initialize(bmp.Width, bmp.Height)";
_bc._initialize(processBA,(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
 //BA.debugLineNum = 42;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
 //BA.debugLineNum = 43;BA.debugLine="Dim a1, a2 As ARGBColor";
_a1 = new b4a.example.bitmapcreator._argbcolor();
_a2 = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 44;BA.debugLine="bc.ColorToARGB(NewColor, a1)";
_bc._colortoargb(_newcolor,_a1);
 //BA.debugLineNum = 45;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step6 = 1;
final int limit6 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit6 ;_y = _y + step6 ) {
 //BA.debugLineNum = 46;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step7 = 1;
final int limit7 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit7 ;_x = _x + step7 ) {
 //BA.debugLineNum = 47;BA.debugLine="bc.GetARGB(x, y, a2)";
_bc._getargb(_x,_y,_a2);
 //BA.debugLineNum = 48;BA.debugLine="If a2.a > 0 Then";
if (_a2.a>0) { 
 //BA.debugLineNum = 49;BA.debugLine="a2.r = a1.r";
_a2.r = _a1.r;
 //BA.debugLineNum = 50;BA.debugLine="a2.g = a1.g";
_a2.g = _a1.g;
 //BA.debugLineNum = 51;BA.debugLine="a2.b = a1.b";
_a2.b = _a1.b;
 //BA.debugLineNum = 52;BA.debugLine="bc.SetARGB(x, y, a2)";
_bc._setargb(_x,_y,_a2);
 };
 }
};
 }
};
 //BA.debugLineNum = 56;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private Back As Label";
mostCurrent._back = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private HistoryView As BBCodeView";
mostCurrent._historyview = new com.bwsi.cares.bbcodeview();
 //BA.debugLineNum = 12;BA.debugLine="Private TextEngine As BCTextEngine";
mostCurrent._textengine = new com.bwsi.cares.bctextengine();
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static String  _loadhistory() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
 //BA.debugLineNum = 92;BA.debugLine="Sub LoadHistory";
 //BA.debugLineNum = 101;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 102;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, 200dip, 120dip)";
_pnl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
 //BA.debugLineNum = 104;BA.debugLine="HistoryView.Text = _ $\"[color=#1E4369][Alignment=";
mostCurrent._historyview._settext /*String*/ (("[color=#1E4369][Alignment=Left][TextSize=24][b]HUMBLE BEGINNINGS[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1][b]Balibago Waterworks System, Inc. (BWSI)[/b][/INDENT][Alignment=justify] Is a privately owned company established in May 20, 1958 by the Santos family of Porac, led by [b]Mr. Eladio Santos[/b] Or [b]“Apung Adiong”[/b] To the old-timers of BWSI. Its primary purpose was To acquire, establish, develop, manage And operate an effective waterworks utility system within its franchise area of 900 hectares composed of Barangay Balibago in Angeles City And Barangay Dau in the town of Mabalacat. The corporation started operations in 1958 at its present site in Balibago, Angeles City. On June 22, 1963, the Congress of the Philippines granted BWSI a [b]Congressional Franchise For 50 years[/b] As embodied in [b]Republic Act. No. 3647[/b] To operate exclusively within designated areas a waterworks system. It was also granted a [b]Certificate of Public Convenience (CPC)[/b] in the same year.\n"+"[/Alignment][/TextSize]\n"+"[Alignment=center][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"1.jpg\" width=220 height=125/][/Alignment]\n"+"\n"+"[color=#1E4369][Alignment=Left][TextSize=24][b]TURN OF EVENTS[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]For 40 years, the Santos family managed [/INDENT][Alignment=justify]and operated BWSI serving the residents And business establishments of [b]Barangays Balibago, Santol, Amsic, Malabanas, Pulung Maragul, Pampang, Diamond Subdivision And, Pulong Bato[/b] in Angeles City And part of [b]Barangay Dau[/b] in Mabalacat, Pampanga. In 1998, the Santos family sold their shareholdings in BWSI To a new group of investors led by [b]Michael L. Escaler And Cristino L. Panlilio.[/b] Under the new management, BWSI continued To expand its pipe-network coverage And improve its service To its customers. Today, BWSI Main Branch serves more than 15,000 households in its franchise area within Angeles City And Mabalacat. When the investment group of Messrs. Escaler And Panlilio took over BWSI from the Santos family, they saw a wealth of opportunity And possibility that lay before the company. Under their guidance, BWSI expanded in the last 14 years To serve other areas in different forms.\n"+"[/Alignment][/TextSize]\n"+"[Alignment=center][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"2.jpg\" width=200 height=125/][/Alignment]\n"+"\n"+"[color=#1E4369][Alignment=Left][TextSize=24][b]FURTHER GROWTH[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]Aside from serving its franchise area, BWSI [/INDENT][Alignment=justify]was awarded exclusive rights And franchises To serve the [b]Dapdap Resettlement Site[/b] together with the [b]Municipalities of Bamban And Capas[/b], all in Tarlac. BWSI was also approached To run And operate the water system in [b]Essel Park; an exclusive subdivision in San Fernando, Pampanga.[/b] It also maintains a bulk water operation in [b]Meycauayan, Bulacan.[/b] Furthermore, BWSI has been granted franchises To operate And manage waterworks systems in the [b]Municipalities of Guiguinto, Balagtas, Panginay And Malis[/b] in Bulacan; [b]Sto. Tomas, Magalang, Minalin, Porac, San Simon, Arayat, Sta. Rita, Apalit, Sta. Ana And San Luis[/b] in Pampanga; [b]Victoria And Sta. Rosa (Garden Villas Subdivision)[/b] in Laguna; [b]Sto. Domingo, Llanera And Zaragoza[/b] in Nueva Ecija; [b]Sta. Barbara, Laoac And San Jacinto[/b] in Pangasinan; [b]Aritao, Alfonso Castaneda, Bagabag And Bayombong[/b] in Nueva Vizcaya; [b]Maria Aurora[/b] in Aurora Province; [b]Laurel And Talisay[/b] in Batangas; And, [b]Passi City And Bingawan[/b] in Iloilo. BWSI Is also currently expanding its operations in [b]Tuba, Benguet.[/b] This brings To 38 the number of water utilities under the umbrella of the company.\n"+"[/Alignment][/TextSize]\n"+"[Alignment=center][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"3.jpg\" width=200 height=140/][/Alignment]\n"+"\n"+"[color=#1E4369][Alignment=Left][TextSize=24][b]TODAY[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]Today, BWSI provides running water To more [/INDENT][Alignment=justify]than [b]200,000 households[/b] throughout its franchise areas. BWSI works closely with the [b]National Water Resources Board (NWRB)[/b] in the pursuit of improving potable water supply in the countryside which Is likewise one of the priority goals of the national government. After 60 years in Public service, the [b]National Water Resources Board (NWRB) considers BWSI the largest And most efficiently operated provincial privately owned waterworks system in the country.[/b] The awarding And granting of franchises were made possible by BWSI’s outstanding reputation of being able To deliver the best water service possible.\n"+"[/Alignment][/TextSize]\n"+"[Alignment=center][img dir=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))+"\" FileName=\"4.jpg\" width=220 height=125/][/Alignment]\n"+""));
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _setbitmapwithfitorfill(anywheresoftware.b4a.objects.B4XViewWrapper _vtargetview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 59;BA.debugLine="Public Sub SetBitmapWithFitOrFill (vTargetView As";
 //BA.debugLineNum = 60;BA.debugLine="vTargetView.SetBitmap(bmp)";
_vtargetview.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 64;BA.debugLine="Dim iv As ImageView = vTargetView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_vtargetview.getObject()));
 //BA.debugLineNum = 65;BA.debugLine="iv.Gravity = Gravity.FILL";
_iv.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _setstatusbarandnavigationcolor(int _clr) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
anywheresoftware.b4j.object.JavaObject _jo2 = null;
 //BA.debugLineNum = 76;BA.debugLine="Sub SetStatusBarAndNavigationColor(clr As Int)";
 //BA.debugLineNum = 77;BA.debugLine="Try";
try { //BA.debugLineNum = 78;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 79;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
 //BA.debugLineNum = 80;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 81;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
 //BA.debugLineNum = 82;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
 //BA.debugLineNum = 83;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
 //BA.debugLineNum = 84;BA.debugLine="Dim jo2 As JavaObject";
_jo2 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 85;BA.debugLine="jo2.InitializeContext";
_jo2.InitializeContext(processBA);
 //BA.debugLineNum = 86;BA.debugLine="jo2.RunMethodJO(\"getWindow\", Null).RunMethod(\"se";
_jo2.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr)});
 } 
       catch (Exception e12) {
			processBA.setLastException(e12); //BA.debugLineNum = 88;BA.debugLine="ToastMessageShow(\"Some error with your android v";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Some error with your android version ( <5 )"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
}
