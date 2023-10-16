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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "com.bwsi.cares", "com.bwsi.cares.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "com.bwsi.cares", "com.bwsi.cares.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.bwsi.cares.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static anywheresoftware.b4a.objects.Timer _tmrsplash = null;
public static com.bwsi.cares.main._mynews _selectednews = null;
public com.bwsi.cares.imageslider _imgslider = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scvmain = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _mxui = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmain = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelselection = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlsplash = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper[] _bitmp = null;
public static String[] _strnewstitle = null;
public static String[] _strnewsdesc = null;
public static String[] _strauthor = null;
public static String[] _strdate = null;
public com.bwsi.cares.b4ximageview _imgnews = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnewstitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblauthor = null;
public b4a.example3.customlistview _clvnews = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public com.bwsi.cares.b4ximageview _imgabout = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlaccount = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlservices = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblemail = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblforgotpassword = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllogin = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpassword = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnllogin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtloginemail = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtloginpassword = null;
public com.bwsi.cares.bctextengine _textengine = null;
public static int _bblistitemindexinitems = 0;
public com.bwsi.cares.clvexpandable _expandable = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _fadebitmap = null;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnservicesback = null;
public de.donmanfred.FloatingActionButtonWrapper _fabapply = null;
public b4a.example3.customlistview _clvservices = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblservices = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldot = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblviewall = null;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _cdtxtbox = null;
public com.bwsi.cares.asbottommenu _mainmenu = null;
public b4a.example.dateutils _dateutils = null;
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

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (faqspage.mostCurrent != null);
vis = vis | (dataprivacypage.mostCurrent != null);
vis = vis | (historypage.mostCurrent != null);
vis = vis | (newspage.mostCurrent != null);
return vis;}
public static class _mynews{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper Thumbnails;
public String Title;
public String NewsInfo;
public String Author;
public String DatePublished;
public void Initialize() {
IsInitialized = true;
Thumbnails = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
Title = "";
NewsInfo = "";
Author = "";
DatePublished = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 91;BA.debugLine="CheckPermissions";
_checkpermissions();
 //BA.debugLineNum = 92;BA.debugLine="Activity.LoadLayout(\"landingpage\")";
mostCurrent._activity.LoadLayout("landingpage",mostCurrent.activityBA);
 //BA.debugLineNum = 93;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
 //BA.debugLineNum = 94;BA.debugLine="SetStatusBarAndNavigationColor(0x7CD4D4D4)";
_setstatusbarandnavigationcolor(((int)0x7cd4d4d4));
 //BA.debugLineNum = 95;BA.debugLine="ShowSplash";
_showsplash();
 };
 //BA.debugLineNum = 97;BA.debugLine="tmrSplash.Initialize(\"DoSomething\",300)";
_tmrsplash.Initialize(processBA,"DoSomething",(long) (300));
 //BA.debugLineNum = 98;BA.debugLine="tmrSplash.Enabled = True";
_tmrsplash.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 99;BA.debugLine="scvMain.Visible = True";
mostCurrent._scvmain.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 100;BA.debugLine="scvMain.Panel.LoadLayout(\"LandingContents\")";
mostCurrent._scvmain.getPanel().LoadLayout("LandingContents",mostCurrent.activityBA);
 //BA.debugLineNum = 101;BA.debugLine="scvMain.Panel.Height = pnlMain.Height";
mostCurrent._scvmain.getPanel().setHeight(mostCurrent._pnlmain.getHeight());
 //BA.debugLineNum = 102;BA.debugLine="PanelSelection.Initialize(\"PanelSelection\")";
mostCurrent._panelselection.Initialize(mostCurrent.activityBA,"PanelSelection");
 //BA.debugLineNum = 103;BA.debugLine="pnlAccount.Visible = False";
mostCurrent._pnlaccount.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 109;BA.debugLine="imgSlider.NumberOfImages = 4";
mostCurrent._imgslider._setnumberofimages /*int*/ ((int) (4));
 //BA.debugLineNum = 110;BA.debugLine="imgSlider.PrevImage";
mostCurrent._imgslider._previmage /*void*/ ();
 //BA.debugLineNum = 111;BA.debugLine="timer1.Initialize(\"Timer1\",3000)";
_timer1.Initialize(processBA,"Timer1",(long) (3000));
 //BA.debugLineNum = 112;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 114;BA.debugLine="SetStatusBarAndNavigationColor(GlobalVariables.Pr";
_setstatusbarandnavigationcolor((int) (mostCurrent._globalvariables._pricolor1 /*double*/ ));
 //BA.debugLineNum = 116;BA.debugLine="InitializeDatas";
_initializedatas();
 //BA.debugLineNum = 118;BA.debugLine="CreateItem";
_createitem();
 //BA.debugLineNum = 123;BA.debugLine="fabApply.IconDrawable = \"fab_add\"";
mostCurrent._fabapply.setIconDrawable("fab_add");
 //BA.debugLineNum = 124;BA.debugLine="fabApply.ColorNormal = GlobalVariables.PriColor2";
mostCurrent._fabapply.setColorNormal((int) (mostCurrent._globalvariables._pricolor2 /*double*/ ));
 //BA.debugLineNum = 125;BA.debugLine="fabApply.ColorPressed = GlobalVariables.PriColor3";
mostCurrent._fabapply.setColorPressed((int) (mostCurrent._globalvariables._pricolor3 /*double*/ ));
 //BA.debugLineNum = 126;BA.debugLine="fabApply.ColorRipple = GlobalVariables.PriColor1";
mostCurrent._fabapply.setColorRipple((int) (mostCurrent._globalvariables._pricolor1 /*double*/ ));
 //BA.debugLineNum = 127;BA.debugLine="fabApply.ButtonSize = 1";
mostCurrent._fabapply.setButtonSize((int) (1));
 //BA.debugLineNum = 131;BA.debugLine="fabApply.Indeterminate = True";
mostCurrent._fabapply.setIndeterminate(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 139;BA.debugLine="TextEngine.Initialize(Activity)";
mostCurrent._textengine._initialize /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
 //BA.debugLineNum = 140;BA.debugLine="Expandable.Initialize(clvServices)";
mostCurrent._expandable._initialize /*String*/ (mostCurrent.activityBA,mostCurrent._clvservices);
 //BA.debugLineNum = 141;BA.debugLine="bc.Initialize(Activity.Width, 40dip)";
mostCurrent._bc._initialize(processBA,mostCurrent._activity.getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
 //BA.debugLineNum = 142;BA.debugLine="bc.FillGradient(Array As Int(0x00FFFFFF, GlobalVa";
mostCurrent._bc._fillgradient(new int[]{((int)0x00ffffff),(int) (mostCurrent._globalvariables._pricolor3 /*double*/ )},mostCurrent._bc._targetrect,"TOP_BOTTOM");
 //BA.debugLineNum = 143;BA.debugLine="FadeBitmap = bc.Bitmap";
mostCurrent._fadebitmap = mostCurrent._bc._getbitmap();
 //BA.debugLineNum = 144;BA.debugLine="MainMenu.SetIcon1(LoadBitmap(File.DirAssets, \"exp";
mostCurrent._mainmenu._seticon1 /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"explore.png").getObject())));
 //BA.debugLineNum = 145;BA.debugLine="MainMenu.SetIcon2(LoadBitmap(File.DirAssets, \"ser";
mostCurrent._mainmenu._seticon2 /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"services.png").getObject())));
 //BA.debugLineNum = 146;BA.debugLine="MainMenu.SetIcon5(LoadBitmap(File.DirAssets, \"bra";
mostCurrent._mainmenu._seticon5 /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"branches.png").getObject())));
 //BA.debugLineNum = 147;BA.debugLine="MainMenu.SetIcon3(LoadBitmap(File.DirAssets, \"cal";
mostCurrent._mainmenu._seticon3 /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"callus.png").getObject())));
 //BA.debugLineNum = 148;BA.debugLine="MainMenu.SetIcon4(LoadBitmap(File.DirAssets, \"use";
mostCurrent._mainmenu._seticon4 /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png").getObject())));
 //BA.debugLineNum = 150;BA.debugLine="MainMenu.SetText1(\"Explore\")";
mostCurrent._mainmenu._settext1 /*String*/ ("Explore");
 //BA.debugLineNum = 151;BA.debugLine="MainMenu.SetText2(\"Services\")";
mostCurrent._mainmenu._settext2 /*String*/ ("Services");
 //BA.debugLineNum = 152;BA.debugLine="MainMenu.SetText5(\"Branches\")";
mostCurrent._mainmenu._settext5 /*String*/ ("Branches");
 //BA.debugLineNum = 153;BA.debugLine="MainMenu.SetText3(\"Call Us\")";
mostCurrent._mainmenu._settext3 /*String*/ ("Call Us");
 //BA.debugLineNum = 154;BA.debugLine="MainMenu.SetText4(\"Account\")";
mostCurrent._mainmenu._settext4 /*String*/ ("Account");
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public static String  _activity_permissionresult(String _permission,boolean _result) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
 //BA.debugLineNum = 173;BA.debugLine="If Permission = GlobalVariables.RTP.PERMISSION_CA";
if ((_permission).equals(mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_CAMERA)) { 
 //BA.debugLineNum = 174;BA.debugLine="Result = True";
_result = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 175;BA.debugLine="LogColor(\"YOU CAN USE THE CAMERA\",Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("7327683","YOU CAN USE THE CAMERA",anywheresoftware.b4a.keywords.Common.Colors.Red);
 }else {
 //BA.debugLineNum = 177;BA.debugLine="Result = False";
_result = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 179;BA.debugLine="Log (Permission)";
anywheresoftware.b4a.keywords.Common.LogImpl("7327687",_permission,0);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 160;BA.debugLine="scvMain.Visible = True";
mostCurrent._scvmain.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 161;BA.debugLine="MainMenu_Page1Click";
_mainmenu_page1click();
 //BA.debugLineNum = 162;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 163;BA.debugLine="scvMain.ScrollPosition = 0";
mostCurrent._scvmain.setScrollPosition((int) (0));
 //BA.debugLineNum = 164;BA.debugLine="pnlAccount.Visible = False";
mostCurrent._pnlaccount.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 165;BA.debugLine="pnlServices.Visible = False";
mostCurrent._pnlservices.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public static String  _backgroundandcornerradius(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _cornerradius) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdw1 = null;
 //BA.debugLineNum = 698;BA.debugLine="Sub BackgroundAndCornerRadius(View As View , Corne";
 //BA.debugLineNum = 699;BA.debugLine="Dim cdw1 As ColorDrawable";
_cdw1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 700;BA.debugLine="cdw1.Initialize(Colors.White, CornerRadius)";
_cdw1.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,_cornerradius);
 //BA.debugLineNum = 701;BA.debugLine="View.Background = cdw1";
_view.setBackground((android.graphics.drawable.Drawable)(_cdw1.getObject()));
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return "";
}
public static String  _bblistitem1_linkclicked(String _url) throws Exception{
com.bwsi.cares.bblistitem _bb = null;
int _index = 0;
 //BA.debugLineNum = 384;BA.debugLine="Private Sub BBListItem1_LinkClicked (URL As String";
 //BA.debugLineNum = 385;BA.debugLine="Log(URL)";
anywheresoftware.b4a.keywords.Common.LogImpl("71638401",_url,0);
 //BA.debugLineNum = 386;BA.debugLine="Dim bb As BBListItem = Sender";
_bb = (com.bwsi.cares.bblistitem)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA));
 //BA.debugLineNum = 387;BA.debugLine="Dim index As Int = clvServices.GetItemFromView(bb";
_index = mostCurrent._clvservices._getitemfromview(_bb._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 //BA.debugLineNum = 388;BA.debugLine="Log(index)";
anywheresoftware.b4a.keywords.Common.LogImpl("71638404",BA.NumberToString(_index),0);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public static String  _btnservicesback_click() throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Private Sub btnServicesBack_Click";
 //BA.debugLineNum = 508;BA.debugLine="MainMenu_Page1Click";
_mainmenu_page1click();
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _changecolorbasedonalphalevel(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _newcolor) throws Exception{
b4a.example.bitmapcreator._argbcolor _a1 = null;
b4a.example.bitmapcreator._argbcolor _a2 = null;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 667;BA.debugLine="Sub ChangeColorBasedOnAlphaLevel(bmp As B4XBitmap,";
 //BA.debugLineNum = 668;BA.debugLine="Dim bc As BitmapCreator";
mostCurrent._bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 669;BA.debugLine="bc.Initialize(bmp.Width, bmp.Height)";
mostCurrent._bc._initialize(processBA,(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
 //BA.debugLineNum = 670;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
mostCurrent._bc._copypixelsfrombitmap(_bmp);
 //BA.debugLineNum = 671;BA.debugLine="Dim a1, a2 As ARGBColor";
_a1 = new b4a.example.bitmapcreator._argbcolor();
_a2 = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 672;BA.debugLine="bc.ColorToARGB(NewColor, a1)";
mostCurrent._bc._colortoargb(_newcolor,_a1);
 //BA.debugLineNum = 673;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step6 = 1;
final int limit6 = (int) (mostCurrent._bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit6 ;_y = _y + step6 ) {
 //BA.debugLineNum = 674;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step7 = 1;
final int limit7 = (int) (mostCurrent._bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit7 ;_x = _x + step7 ) {
 //BA.debugLineNum = 675;BA.debugLine="bc.GetARGB(x, y, a2)";
mostCurrent._bc._getargb(_x,_y,_a2);
 //BA.debugLineNum = 676;BA.debugLine="If a2.a > 0 Then";
if (_a2.a>0) { 
 //BA.debugLineNum = 677;BA.debugLine="a2.r = a1.r";
_a2.r = _a1.r;
 //BA.debugLineNum = 678;BA.debugLine="a2.g = a1.g";
_a2.g = _a1.g;
 //BA.debugLineNum = 679;BA.debugLine="a2.b = a1.b";
_a2.b = _a1.b;
 //BA.debugLineNum = 680;BA.debugLine="bc.SetARGB(x, y, a2)";
mostCurrent._bc._setargb(_x,_y,_a2);
 };
 }
};
 }
};
 //BA.debugLineNum = 684;BA.debugLine="Return bc.Bitmap";
if (true) return mostCurrent._bc._getbitmap();
 //BA.debugLineNum = 685;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkconnected() throws Exception{
ResumableSub_CheckConnected rsub = new ResumableSub_CheckConnected(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckConnected extends BA.ResumableSub {
public ResumableSub_CheckConnected(com.bwsi.cares.main parent) {
this.parent = parent;
}
com.bwsi.cares.main parent;
anywheresoftware.b4a.phone.Phone _p = null;
boolean _success = false;
int _exitvalue = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 215;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 217;BA.debugLine="Wait For (p.ShellAsync(\"ping\", Array As String(\"-";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _p.ShellAsync(processBA,"ping",new String[]{"-c","1","8.8.8.8"}));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (Boolean) result[0];
_exitvalue = (Integer) result[1];
_stdout = (String) result[2];
_stderr = (String) result[3];
;
 //BA.debugLineNum = 218;BA.debugLine="If StdErr = \"\" And StdOut.Contains(\"Destination H";
if (true) break;

case 1:
//if
this.state = 6;
if ((_stderr).equals("") && _stdout.contains("Destination Host Unreachable")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 219;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 221;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(boolean _success,int _exitvalue,String _stdout,String _stderr) throws Exception{
}
public static String  _checkpermissions() throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Private Sub CheckPermissions";
 //BA.debugLineNum = 200;BA.debugLine="Log(\"Checking Permissions\")";
anywheresoftware.b4a.keywords.Common.LogImpl("7589825","Checking Permissions",0);
 //BA.debugLineNum = 202;BA.debugLine="GlobalVariables.RTP.CheckAndRequest(GlobalVariabl";
mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_READ_EXTERNAL_STORAGE);
 //BA.debugLineNum = 203;BA.debugLine="GlobalVariables.RTP.CheckAndRequest(GlobalVariabl";
mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_WRITE_EXTERNAL_STORAGE);
 //BA.debugLineNum = 204;BA.debugLine="GlobalVariables.RTP.CheckAndRequest(GlobalVariabl";
mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_COARSE_LOCATION);
 //BA.debugLineNum = 205;BA.debugLine="GlobalVariables.RTP.GetAllSafeDirsExternal(\"\")";
mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .GetAllSafeDirsExternal("");
 //BA.debugLineNum = 207;BA.debugLine="GlobalVariables.RTP.CheckAndRequest(GlobalVariabl";
mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_CAMERA);
 //BA.debugLineNum = 208;BA.debugLine="GlobalVariables.RTP.CheckAndRequest(GlobalVariabl";
mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,mostCurrent._globalvariables._rtp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_BODY_SENSORS);
 //BA.debugLineNum = 209;BA.debugLine="Return";
if (true) return "";
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
public static String  _clvnews_itemclick(int _index,Object _value) throws Exception{
Object[] _v = null;
 //BA.debugLineNum = 275;BA.debugLine="Private Sub clvNews_ItemClick (Index As Int, Value";
 //BA.debugLineNum = 276;BA.debugLine="Dim v() As Object = Value";
_v = (Object[])(_value);
 //BA.debugLineNum = 277;BA.debugLine="Dim Index As Int = v(0)";
_index = (int)(BA.ObjectToNumber(_v[(int) (0)]));
 //BA.debugLineNum = 278;BA.debugLine="SelectedNews = v(1)";
_selectednews = (com.bwsi.cares.main._mynews)(_v[(int) (1)]);
 //BA.debugLineNum = 279;BA.debugLine="StartActivity(NewsPage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._newspage.getObject()));
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public static String  _clvservices_scrollchanged(int _offset) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
com.bwsi.cares.bblistitem _bb = null;
 //BA.debugLineNum = 391;BA.debugLine="Private Sub clvServices_ScrollChanged (Offset As I";
 //BA.debugLineNum = 392;BA.debugLine="For i = 0 To clvServices.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._clvservices._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 393;BA.debugLine="Dim pnl As B4XView = clvServices.GetPanel(i)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = mostCurrent._clvservices._getpanel(_i);
 //BA.debugLineNum = 394;BA.debugLine="If pnl.NumberOfViews = 0 Then Return";
if (_pnl.getNumberOfViews()==0) { 
if (true) return "";};
 //BA.debugLineNum = 395;BA.debugLine="Dim BB As BBListItem = pnl.GetView(1).GetView(BB";
_bb = (com.bwsi.cares.bblistitem)(_pnl.GetView((int) (1)).GetView(_bblistitemindexinitems).getTag());
 //BA.debugLineNum = 396;BA.debugLine="BB.ParentScrolled(Offset, clvServices.GetRawList";
_bb._parentscrolled /*String*/ (_offset,mostCurrent._clvservices._getrawlistitem(_i).Offset,mostCurrent._clvservices._asview().getHeight(),_pnl.GetView((int) (0)).getHeight());
 }
};
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public static String  _clvservices_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
 //BA.debugLineNum = 415;BA.debugLine="Private Sub clvServices_VisibleRangeChanged (First";
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return "";
}
public static String  _createitem() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
com.bwsi.cares.main._mynews _info = null;
 //BA.debugLineNum = 251;BA.debugLine="Sub CreateItem()";
 //BA.debugLineNum = 252;BA.debugLine="For i = 0 To 3";
{
final int step1 = 1;
final int limit1 = (int) (3);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 253;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 254;BA.debugLine="Dim height As Int = 100%y";
_height = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA);
 //BA.debugLineNum = 255;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x , height)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
 //BA.debugLineNum = 256;BA.debugLine="p.LoadLayout(\"NewsCards\")";
_p.LoadLayout("NewsCards",mostCurrent.activityBA);
 //BA.debugLineNum = 257;BA.debugLine="Dim Info As MyNews";
_info = new com.bwsi.cares.main._mynews();
 //BA.debugLineNum = 259;BA.debugLine="imgNews.Bitmap = bitmp(i)";
mostCurrent._imgnews._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._bitmp[_i].getObject())));
 //BA.debugLineNum = 260;BA.debugLine="lblNewsTitle.Text = strNewsTitle(i)";
mostCurrent._lblnewstitle.setText(BA.ObjectToCharSequence(mostCurrent._strnewstitle[_i]));
 //BA.debugLineNum = 261;BA.debugLine="lblAuthor.TextColor = GlobalVariables.PriColor2";
mostCurrent._lblauthor.setTextColor((int) (mostCurrent._globalvariables._pricolor2 /*double*/ ));
 //BA.debugLineNum = 262;BA.debugLine="lblDate.TextColor = GlobalVariables.PriColor2";
mostCurrent._lbldate.setTextColor((int) (mostCurrent._globalvariables._pricolor2 /*double*/ ));
 //BA.debugLineNum = 263;BA.debugLine="lblAuthor.Text = strAuthor(i)";
mostCurrent._lblauthor.setText(BA.ObjectToCharSequence(mostCurrent._strauthor[_i]));
 //BA.debugLineNum = 264;BA.debugLine="lblDate.Text = strDate(i)";
mostCurrent._lbldate.setText(BA.ObjectToCharSequence(mostCurrent._strdate[_i]));
 //BA.debugLineNum = 266;BA.debugLine="Info.Thumbnails = bitmp(i)";
_info.Thumbnails /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = mostCurrent._bitmp[_i];
 //BA.debugLineNum = 267;BA.debugLine="Info.Title = strNewsTitle(i)";
_info.Title /*String*/  = mostCurrent._strnewstitle[_i];
 //BA.debugLineNum = 268;BA.debugLine="Info.Author= strAuthor(i)";
_info.Author /*String*/  = mostCurrent._strauthor[_i];
 //BA.debugLineNum = 269;BA.debugLine="Info.DatePublished = strDate(i)";
_info.DatePublished /*String*/  = mostCurrent._strdate[_i];
 //BA.debugLineNum = 270;BA.debugLine="Info.NewsInfo = strNewsDesc(i)";
_info.NewsInfo /*String*/  = mostCurrent._strnewsdesc[_i];
 //BA.debugLineNum = 271;BA.debugLine="clvNews.Add(p,Array(i,Info))";
mostCurrent._clvnews._add(_p,(Object)(new Object[]{(Object)(_i),(Object)(_info)}));
 }
};
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public static String  _createitemtext(int _index) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 374;BA.debugLine="Private Sub CreateItemText(index As Int) As String";
 //BA.debugLineNum = 375;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 376;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 377;BA.debugLine="sb.Append($\"[alignment=center][b]Item #${index}[/";
_sb.Append(("[alignment=center][b]Item #"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_index))+"[/b][/alignment]"));
 //BA.debugLineNum = 378;BA.debugLine="For i = 1 To Rnd(1, 20)";
{
final int step4 = 1;
final int limit4 = anywheresoftware.b4a.keywords.Common.Rnd((int) (1),(int) (20));
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 379;BA.debugLine="sb.Append(CRLF).Append($\"[u]Line ${i}[/u]: [colo";
_sb.Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(("[u]Line "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"[/u]: [color=red]alksd[/color] [url=\"https://www.b4x.com\"]jalksd jklasd[/url] kalsd "));
 }
};
 //BA.debugLineNum = 381;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return "";
}
public static String  _dosomething_tick() throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Private Sub DoSomething_Tick";
 //BA.debugLineNum = 185;BA.debugLine="Log(\"WORKING...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("7393217","WORKING...",0);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public static String  _fabapply_click() throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Private Sub fabApply_Click";
 //BA.debugLineNum = 336;BA.debugLine="StartActivity(DataPrivacyPage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._dataprivacypage.getObject()));
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return "";
}
public static String  _getcontent(int _iserviceid) throws Exception{
String _content = "";
 //BA.debugLineNum = 511;BA.debugLine="Private Sub GetContent(iServiceID As Int) As Strin";
 //BA.debugLineNum = 512;BA.debugLine="Private Content As String";
_content = "";
 //BA.debugLineNum = 514;BA.debugLine="Select iServiceID";
switch (_iserviceid) {
case 1: {
 //BA.debugLineNum = 516;BA.debugLine="Content = _ $\"[TextSize=14][INDENT=1]Sourcing o";
_content = ("[TextSize=14][INDENT=1]Sourcing of underground water reservoirs, also [/INDENT][alignment=justify]known as [b]groundwater sourcing or groundwater exploration[/b], refers to the process of locating and accessing underground water supplies or aquifers for various purposes, such as drinking water supply, irrigation, industrial use, or environmental restoration. This is an essential activity in regions where surface water sources may be insufficient or unreliable.\n"+"Here are the general steps involved in the sourcing of underground water reservoirs:\n"+"[/Alignment][/TextSize][b][list style=ordered][TextSize=14][color=#2A91C3]\n"+"[*]Site Assessment\n"+"[*]Geophysical Surveys\n"+"[*]Exploratory Drilling\n"+"[*]Aquifer Testing\n"+"[*]Water Quality Analysis\n"+"[*]Well Design and Construction\n"+"[*]Pumping and Monitoring\n"+"[*]Regulatory Compliance\n"+"[*]Maintenance and Rehabilitation\n"+"[/color][/TextSize][/list][/b]");
 break; }
case 2: {
 //BA.debugLineNum = 531;BA.debugLine="Content = _ $\"[TextSize=14][INDENT=1]The instal";
_content = ("[TextSize=14][INDENT=1]The installation of pumps and motors[/INDENT][alignment=justify] is a common process in various applications, including water supply systems, industrial processes, agricultural irrigation, and more. Proper installation is crucial to ensure the efficient and safe operation of these components.\n"+"Here are the general steps involved in the installation of pumps and motors:\n"+"[/Alignment][/TextSize][b][list style=ordered][TextSize=14][color=#2A91C3]\n"+"[*]Site Preparation\n"+"[*]Foundation Construction\n"+"[*]Electrical Wiring\n"+"[*]Alignment\n"+"[*]Coupling Installation (if applicable\n"+"[*]Piping and Plumbing\n"+"[*]Prime the Pump (if applicable\n"+"[*]Motor Alignment and Coupling Tightening (if applicable\n"+"[*]Start-Up and Testing\n"+"[*]Safety Measures\n"+"[*]Documentation\n"+"[/color][/TextSize][/list][/b]");
 break; }
case 3: {
 //BA.debugLineNum = 548;BA.debugLine="Content = _ $\"[TextSize=14][INDENT=1]Laying mai";
_content = ("[TextSize=14][INDENT=1]Laying mainline distribution pipes is a [/INDENT][alignment=justify]crucial step in establishing a water distribution system for supplying water to homes, businesses, and other end-users. This process involves the installation of large-diameter pipes that serve as the primary conveyance system for transporting water from the source (such as a treatment plant or well) to various distribution points.\n"+"Here are the key steps involved in laying mainline distribution pipes:\n"+"[/Alignment][/TextSize][b][list style=ordered][TextSize=14][color=#2A91C3]\n"+"[*]Design and Planning\n"+"[*]Materials and Equipment Preparation\n"+"[*]Route Survey and Marking\n"+"[*]Excavation and Trenching\n"+"[*]Bedding and Backfill\n"+"[*]Pipe Installation\n"+"[*]Pressure Testing\n"+"[*]Disinfection and Flushing\n"+"[*]Connection to Source and Distribution Points\n"+"[*]Testing and Commissioning\n"+"[*]Documentation and Record Keeping\n"+"[/color][/TextSize][/list][/b]");
 break; }
case 4: {
 //BA.debugLineNum = 565;BA.debugLine="Content = _ $\"[TextSize=14][INDENT=1]Chlorinati";
_content = ("[TextSize=14][INDENT=1]Chlorination of water sources is a [/INDENT][alignment=justify]common and effective method of disinfecting water to make it safe for consumption and other uses. Chlorine is added to water to kill or inactivate harmful microorganisms, such as bacteria, viruses, and parasites, that may be present in the water. Chlorination is widely used in public water supply systems, industrial processes, and swimming pools, among other applications.\n"+"Here's an overview of the chlorination process for water sources:\n"+"[/Alignment][/TextSize][b][list style=ordered][TextSize=14][color=#2A91C3]\n"+"[*]Selection of Chlorine Compound\n"+"[*]Dosage Determination\n"+"[*]Chlorine Addition\n"+"[*]Contact Time\n"+"[*]Residual Chlorine Monitoring\n"+"[*]Adjustment of Ph\n"+"[*]Dechlorination (if required\n"+"[*]Sampling and Testing\n"+"[*]Safety Precautions\n"+"[*]Documentation\n"+"[/color][/TextSize][/list][/b]");
 break; }
case 5: {
 //BA.debugLineNum = 581;BA.debugLine="Content = _ $\"[TextSize=14][INDENT=1]Filtration";
_content = ("[TextSize=14][INDENT=1]Filtration of surface water sources is a [/INDENT][alignment=justify]critical step in the treatment of water to make it safe for consumption and other uses. Surface water sources, such as rivers, lakes, and reservoirs, often contain suspended particles, sediments, algae, bacteria, and other impurities that need to be removed. Filtration is an essential part of the water treatment process and helps improve the water's clarity, taste, and safety.\n"+"Here's an overview of the filtration process for surface water sources:\n"+"[/Alignment][/TextSize][b][list style=ordered][TextSize=14][color=#2A91C3]\n"+"[*]Coagulation and Flocculation\n"+"[*]Screening (Optional\n"+"[*]Filtration Media Selection\n"+"[*]Filter Bed Preparation\n"+"[*]Filtration Process\n"+"[*]Backwashing (Cleaning)\n"+"[*]Disinfection (Optional)\n"+"[*]Post-Filtration Treatment (if needed)\n"+"[*]Quality Monitoring\n"+"[*]Distribution\n"+"[/color][/TextSize][/list][/b]");
 break; }
case 6: {
 //BA.debugLineNum = 597;BA.debugLine="Content = _ $\"[TextSize=14][INDENT=1]Connecting";
_content = ("[TextSize=14][INDENT=1]Connecting households and businesses to [/INDENT][alignment=justify]mainlines, often referred to as water or utility mains, is a crucial step in providing these consumers with access to essential services like water supply, natural gas, electricity, or telecommunications. The process of connecting properties to mainlines varies depending on the type of utility being provided and local regulations.\n"+"Here is a general overview of the steps involved in connecting households and businesses to mainlines:\n"+"[/Alignment][/TextSize][b][list style=ordered][TextSize=14][color=#2A91C3]\n"+"[*]Application and Permits\n"+"[*]Utility Assessment and Planning\n"+"[*]Design and Engineering\n"+"[*]Construction and Installation\n"+"[*]Connection to Property\n"+"[*]Inspection and Testing\n"+"[*]Connection Activation\n"+"[*]Billing and Service Agreements\n"+"[*]Ongoing Maintenance and Service\n"+"[/color][/TextSize][/list][/b]");
 break; }
case 7: {
 //BA.debugLineNum = 612;BA.debugLine="Content = _ $\"[TextSize=14][INDENT=1]Meter read";
_content = ("[TextSize=14][INDENT=1]Meter reading, billing, and payment collection are[/INDENT][alignment=justify] crucial components of utility services, such as electricity, water, gas, and telecommunications. These processes ensure that consumers are accurately billed for the services they use and enable utility providers to maintain their infrastructure and operations.\n"+"Here's an overview of each of these processes:\n"+"[/Alignment][/TextSize][b][list style=ordered][TextSize=14][color=#2A91C3]\n"+"[*]Meter Reading\n"+"[*]Billing\n"+"[*]Payment Collection\n"+"[*]Customer Support and Dispute Resolution\n"+"[*]Meter Maintenance and Replacement\n"+"[*]Data Security and Privacy\n"+"[/color][/TextSize][/list][/b]");
 break; }
case 8: {
 //BA.debugLineNum = 624;BA.debugLine="Content = _ $\"[TextSize=14][INDENT=1]After-sale";
_content = ("[TextSize=14][INDENT=1]After-sales services for utilities, including repairs [/INDENT][alignment=justify]of leaks and broken meters, are essential for maintaining the reliability and functionality of utility services and ensuring customer satisfaction. \n"+"Here's an overview of the after-sales services related to utility repairs:\n"+"[/Alignment][/TextSize][b][list style=ordered][TextSize=14][color=#2A91C3]\n"+"[*]Customer Reporting\n"+"[*]Issue Assessment\n"+"[*]Dispatching Technicians\n"+"[*]Meter Replacement or Repair\n"+"[*]Leak Repair\n"+"[*]Emergency Response\n"+"[*]Safety Measures\n"+"[*]Communication with Customers\n"+"[*]Quality Assurance\n"+"[*]Testing and Verification\n"+"[*]Billing Adjustments\n"+"[*]Customer Feedback\n"+"[/color][/TextSize][/list][/b]");
 break; }
case 9: {
 //BA.debugLineNum = 642;BA.debugLine="Content = _ $\"[TextSize=14][INDENT=1]Reducing n";
_content = ("[TextSize=14][INDENT=1]Reducing non-revenue water (NRW) is a [/INDENT][alignment=justify]critical goal for water utilities and municipalities to improve the efficiency of water distribution systems, conserve water resources, and enhance financial sustainability. Non-revenue water refers to water that is lost or unaccounted for within the distribution system and includes both physical losses (leaks and pipe bursts) and commercial losses (unauthorized consumption and meter inaccuracies). \n"+"Here are strategies to reduce non-revenue water:\n"+"[/Alignment][/TextSize][b][list style=ordered][TextSize=14][color=#2A91C3]\n"+"[*]Leak Detection and Repair\n"+"[*]Pressure Management\n"+"[*]Asset Management and Rehabilitation\n"+"[*]Meter Accuracy and Calibration\n"+"[*]Metering and Data Management\n"+"[*]Water Loss Audits\n"+"[*]Customer Engagement\n"+"[*]Real-Time Monitoring and Control\n"+"[*]Illegal Connections and Theft Prevention\n"+"[*]Data Analysis and Predictive Maintenance\n"+"[*]Investment in Technology and Infrastructure\n"+"[*]Regulatory Measures\n"+"[/color][/TextSize][/list][/b]");
 break; }
}
;
 //BA.debugLineNum = 661;BA.debugLine="Return Content";
if (true) return _content;
 //BA.debugLineNum = 662;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 28;BA.debugLine="Private imgSlider As ImageSlider";
mostCurrent._imgslider = new com.bwsi.cares.imageslider();
 //BA.debugLineNum = 29;BA.debugLine="Private scvMain As ScrollView";
mostCurrent._scvmain = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 32;BA.debugLine="Private mXUI As XUI";
mostCurrent._mxui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 33;BA.debugLine="Private pnlMain As Panel";
mostCurrent._pnlmain = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private PanelSelection As Panel";
mostCurrent._panelselection = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private pnlSplash As Panel";
mostCurrent._pnlsplash = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private bitmp(4) As Bitmap";
mostCurrent._bitmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper[(int) (4)];
{
int d0 = mostCurrent._bitmp.length;
for (int i0 = 0;i0 < d0;i0++) {
mostCurrent._bitmp[i0] = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
}
}
;
 //BA.debugLineNum = 39;BA.debugLine="Private strNewsTitle(4), strNewsDesc(4), strAutho";
mostCurrent._strnewstitle = new String[(int) (4)];
java.util.Arrays.fill(mostCurrent._strnewstitle,"");
mostCurrent._strnewsdesc = new String[(int) (4)];
java.util.Arrays.fill(mostCurrent._strnewsdesc,"");
mostCurrent._strauthor = new String[(int) (4)];
java.util.Arrays.fill(mostCurrent._strauthor,"");
mostCurrent._strdate = new String[(int) (4)];
java.util.Arrays.fill(mostCurrent._strdate,"");
 //BA.debugLineNum = 41;BA.debugLine="Private imgNews As B4XImageView";
mostCurrent._imgnews = new com.bwsi.cares.b4ximageview();
 //BA.debugLineNum = 42;BA.debugLine="Private lblNewsTitle As Label";
mostCurrent._lblnewstitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private lblAuthor As Label";
mostCurrent._lblauthor = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private clvNews As CustomListView";
mostCurrent._clvnews = new b4a.example3.customlistview();
 //BA.debugLineNum = 45;BA.debugLine="Private lblDate As Label";
mostCurrent._lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private imgAbout As B4XImageView";
mostCurrent._imgabout = new com.bwsi.cares.b4ximageview();
 //BA.debugLineNum = 47;BA.debugLine="Private pnlAccount As Panel";
mostCurrent._pnlaccount = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private pnlServices As Panel";
mostCurrent._pnlservices = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private lblCheck As Label";
mostCurrent._lblcheck = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private lblEmail As Label";
mostCurrent._lblemail = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private lblForgotPassword As Label";
mostCurrent._lblforgotpassword = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private lblLogin As Label";
mostCurrent._lbllogin = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private lblPassword As Label";
mostCurrent._lblpassword = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private pnlLogin As Panel";
mostCurrent._pnllogin = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private txtLoginEMail As EditText";
mostCurrent._txtloginemail = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private txtLoginPassword As EditText";
mostCurrent._txtloginpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private TextEngine As BCTextEngine";
mostCurrent._textengine = new com.bwsi.cares.bctextengine();
 //BA.debugLineNum = 66;BA.debugLine="Private BBListItemIndexInItems As Int = 0";
_bblistitemindexinitems = (int) (0);
 //BA.debugLineNum = 67;BA.debugLine="Private Expandable As CLVExpandable";
mostCurrent._expandable = new com.bwsi.cares.clvexpandable();
 //BA.debugLineNum = 68;BA.debugLine="Private FadeBitmap As B4XBitmap";
mostCurrent._fadebitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Private bc As BitmapCreator";
mostCurrent._bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 72;BA.debugLine="Private btnServicesBack As Label";
mostCurrent._btnservicesback = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 74;BA.debugLine="Private fabApply As FloatingActionButton";
mostCurrent._fabapply = new de.donmanfred.FloatingActionButtonWrapper();
 //BA.debugLineNum = 75;BA.debugLine="Private clvServices As CustomListView";
mostCurrent._clvservices = new b4a.example3.customlistview();
 //BA.debugLineNum = 77;BA.debugLine="Private lblServices As Label";
mostCurrent._lblservices = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 78;BA.debugLine="Private lblDot As Label";
mostCurrent._lbldot = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Private lblViewAll As Label";
mostCurrent._lblviewall = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 84;BA.debugLine="Private cdTxtBox As ColorDrawable";
mostCurrent._cdtxtbox = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 85;BA.debugLine="Private MainMenu As ASBottomMenu";
mostCurrent._mainmenu = new com.bwsi.cares.asbottommenu();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _imgslider_getimage(int _index) throws Exception{
ResumableSub_imgSlider_GetImage rsub = new ResumableSub_imgSlider_GetImage(null,_index);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_imgSlider_GetImage extends BA.ResumableSub {
public ResumableSub_imgSlider_GetImage(com.bwsi.cares.main parent,int _index) {
this.parent = parent;
this._index = _index;
}
com.bwsi.cares.main parent;
int _index;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 228;BA.debugLine="Return mXUI.LoadBitmapResize(File.DirAssets,$\"web";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(parent.mostCurrent._mxui.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),("web"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_index+1))+".jpg"),parent.mostCurrent._imgslider._windowbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),parent.mostCurrent._imgslider._windowbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),anywheresoftware.b4a.keywords.Common.True)));return;};
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _initializedatas() throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub InitializeDatas";
 //BA.debugLineNum = 283;BA.debugLine="bitmp(0) = LoadBitmap(File.DirAssets,\"News1.jpg\")";
mostCurrent._bitmp[(int) (0)] = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"News1.jpg");
 //BA.debugLineNum = 284;BA.debugLine="bitmp(1) = LoadBitmap(File.DirAssets,\"News2.jpg\")";
mostCurrent._bitmp[(int) (1)] = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"News2.jpg");
 //BA.debugLineNum = 285;BA.debugLine="bitmp(2) = LoadBitmap(File.DirAssets,\"News6.jpg\")";
mostCurrent._bitmp[(int) (2)] = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"News6.jpg");
 //BA.debugLineNum = 286;BA.debugLine="bitmp(3) = LoadBitmap(File.DirAssets,\"News4.png\")";
mostCurrent._bitmp[(int) (3)] = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"News4.png");
 //BA.debugLineNum = 288;BA.debugLine="strNewsTitle(0) = \"Happy 65th anniversary, BWSI\"";
mostCurrent._strnewstitle[(int) (0)] = "Happy 65th anniversary, BWSI";
 //BA.debugLineNum = 289;BA.debugLine="strAuthor(0) = Chr(0xF044) & \" Balibago Waterwork";
mostCurrent._strauthor[(int) (0)] = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf044)))+" Balibago Waterworks";
 //BA.debugLineNum = 290;BA.debugLine="strDate(0) = Chr(0xF073) & \" 2023-05-21\"";
mostCurrent._strdate[(int) (0)] = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf073)))+" 2023-05-21";
 //BA.debugLineNum = 291;BA.debugLine="strNewsDesc(0) = _ $\"[Alignment=justify][TextSize";
mostCurrent._strnewsdesc[(int) (0)] = ("[Alignment=justify][TextSize=15]From humble beginnings To a beacon of progress, we have been making waves in providing clean, healthy, And potable water services To almost two million people now. Let us honor our legacy And embrace the winds of change, ensuring a brighter, greener, And sustainable future For generations To come.\n"+"[b]Happy 65th Anniversary, BWSI![/b][/TextSize][/Alignment]");
 //BA.debugLineNum = 295;BA.debugLine="strNewsTitle(1) = \"World Water Day 2023!\"";
mostCurrent._strnewstitle[(int) (1)] = "World Water Day 2023!";
 //BA.debugLineNum = 296;BA.debugLine="strAuthor(1) = Chr(0xF044) & \" Balibago Waterwork";
mostCurrent._strauthor[(int) (1)] = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf044)))+" Balibago Waterworks";
 //BA.debugLineNum = 297;BA.debugLine="strDate(1) = Chr(0xF073) & \" 2023-01-12\"";
mostCurrent._strdate[(int) (1)] = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf073)))+" 2023-01-12";
 //BA.debugLineNum = 298;BA.debugLine="strNewsDesc(1) = _ $\"[Alignment=justify][TextSize";
mostCurrent._strnewsdesc[(int) (1)] = ("[Alignment=justify][TextSize=15]Balibago Waterworks joins [b]United Nations' Water Campaign[/b] in celebration of [b]World Water Day[/b]. The campaign focuses on the targets of [b]Sustainable Development Goal #6[/b] which tackles water and sanitation issues.\n"+"This year's theme encourages everyone to \"be the change we want to see in the world\". It serves as a simple reminder that even seemingly insignificant actions can add up to significant progress if we all take part in them. \n"+"[b]Do we stand and stare?[/b]\n"+"\n"+"or,\n"+"\n"+"[b]Do we act?[/b][/TextSize][/Alignment]");
 //BA.debugLineNum = 307;BA.debugLine="strNewsTitle(2) = \"BW BOD appoints Sir CLP as the";
mostCurrent._strnewstitle[(int) (2)] = "BW BOD appoints Sir CLP as the new Chairman";
 //BA.debugLineNum = 308;BA.debugLine="strAuthor(2) = Chr(0xF044) & \" Balibago Waterwork";
mostCurrent._strauthor[(int) (2)] = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf044)))+" Balibago Waterworks";
 //BA.debugLineNum = 309;BA.debugLine="strDate(2) = Chr(0xF073) & \" 2022-12-10\"";
mostCurrent._strdate[(int) (2)] = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf073)))+" 2022-12-10";
 //BA.debugLineNum = 310;BA.debugLine="strNewsDesc(2) = _ $\"[Alignment=justify][TextSize";
mostCurrent._strnewsdesc[(int) (2)] = ("[Alignment=justify][TextSize=15]It is with great excitement that we announce the appointment of [b]MR. CRISTINO L. PANLILIO[/b] as the [b]new CHAIRMAN of Balibago Waterworks Board of Directors[/b] during the August 2022 Board Meeting.\n"+"Consequently, [b]MR. MICHAEL L. ESCALER[/b] is now our [b]CHAIRMAN EMERITUS[/b]\n"+"Many thanks to Sir MLE for being the captain of our ship for all these years! And best wishes to Sir CLP as he takes the charge now. \n"+"We are excited about the future and look forward to bringing Balibago Waterworks to the next level with this change in the chairmanship.\n"+"[/TextSize][/Alignment]");
 //BA.debugLineNum = 317;BA.debugLine="strNewsTitle(3) = \"BWSI Inks MOA With ARAW-ACI, K";
mostCurrent._strnewstitle[(int) (3)] = "BWSI Inks MOA With ARAW-ACI, KAAPKA On Angeles Watershed Rehabilitation";
 //BA.debugLineNum = 318;BA.debugLine="strAuthor(3) = Chr(0xF044) & \" Balibago Waterwork";
mostCurrent._strauthor[(int) (3)] = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf044)))+" Balibago Waterworks";
 //BA.debugLineNum = 319;BA.debugLine="strDate(3) = Chr(0xF073) & \" 2022-10-13\"";
mostCurrent._strdate[(int) (3)] = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf073)))+" 2022-10-13";
 //BA.debugLineNum = 320;BA.debugLine="strNewsDesc(3) = _ $\"[Alignment=justify][TextSize";
mostCurrent._strnewsdesc[(int) (3)] = ("[Alignment=justify][TextSize=15]Balibago Waterworks, as a faithful partner of the City Government of Angeles in delivering clean, healthy, and potable water to its residents for 64 years now, recognizes its critical role in taking care of the environment. \n"+"\n"+"As a manifestation of this commitment, Balibago Waterworks has inked a partnership deal with [b]Abacan River and Angeles Watershed Advocacy Council, Inc. (ARAW-ACI)[/b] and [b]Kapatirang Aetas ng Angeles-Porac para sa Kalikasan at Agrikultura (KAAPKA)[/b] on the rehabilitation of [b]Angeles City Watershed today (October 11, 2022) at Oasis Hotel.[/b]  \n"+"\n"+"Under the [b]“Adopt-A-Watershed”[/b] Program of ARAW-ACI, Balibago Waterworks will be planting and maintaining at least 10,000 trees on ten (10) hectares of the Angeles City Watershed within the next five (5) years with the planting of the first 1,000 seedlings happening on October 22, 2022 at Sitio Balaru, Sapangbato, Angeles City.\n"+"\n"+"The following representatives are the signatories of the MOA: [b]Mr. Renato S. Tayag Jr. (ARAW-ACI President), Ms. Cristina Isabelle P. Alejandro (BWSI President), and Mr. Arnel Sibal (Representative of KAAPKA President, Mr. Henry A. Pan)[/b]. \n"+"\n"+"This historic agreement was witnessed by the [b]City Environment and Natural Resources Office Officer-in-Charge, Mr. Archimedes M. Lazatin, Angeles City Vice Mayor Hon. Vicky Vega-Cabigting[/b], and [b]Angeles City Mayor Hon. Carmelo “Pogi” Lazatin, Jr..[/b]\n"+"[/TextSize][/Alignment]");
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public static void  _initservices() throws Exception{
ResumableSub_InitServices rsub = new ResumableSub_InitServices(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_InitServices extends BA.ResumableSub {
public ResumableSub_InitServices(com.bwsi.cares.main parent) {
this.parent = parent;
}
com.bwsi.cares.main parent;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
long _starttime = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _titlepnl = null;
com.bwsi.cares.bblistitem _bb = null;
com.bwsi.cares.clvexpandable._expandableitemdata _ex = null;
anywheresoftware.b4a.objects.B4XViewWrapper _fade = null;
anywheresoftware.b4a.objects.B4XViewWrapper _arrow = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 420;BA.debugLine="Dim SenderFilter As Object";
_senderfilter = new Object();
 //BA.debugLineNum = 421;BA.debugLine="clvServices.Clear";
parent.mostCurrent._clvservices._clear();
 //BA.debugLineNum = 422;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 22;
this.catchState = 21;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 21;
 //BA.debugLineNum = 423;BA.debugLine="Starter.strCriteria = \"SELECT * FROM tblServices";
parent.mostCurrent._starter._strcriteria /*String*/  = "SELECT * FROM tblServices "+"ORDER BY id ASC";
 //BA.debugLineNum = 426;BA.debugLine="SenderFilter = Starter.DBCon.ExecQueryAsync(\"SQL";
_senderfilter = parent.mostCurrent._starter._dbcon /*anywheresoftware.b4a.sql.SQL*/ .ExecQueryAsync(processBA,"SQL",parent.mostCurrent._starter._strcriteria /*String*/ ,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 427;BA.debugLine="Wait For (SenderFilter) SQL_QueryComplete (Succe";
anywheresoftware.b4a.keywords.Common.WaitFor("sql_querycomplete", processBA, this, _senderfilter);
this.state = 23;
return;
case 23:
//C
this.state = 4;
_success = (Boolean) result[0];
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) result[1];
;
 //BA.debugLineNum = 429;BA.debugLine="If Success Then";
if (true) break;

case 4:
//if
this.state = 19;
if (_success) { 
this.state = 6;
}else {
this.state = 18;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 430;BA.debugLine="Dim StartTime As Long = DateTime.Now";
_starttime = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 431;BA.debugLine="Do While RS.NextRow";
if (true) break;

case 7:
//do while
this.state = 16;
while (_rs.NextRow()) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 432;BA.debugLine="Dim Pnl As B4XView = xui.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = parent.mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 433;BA.debugLine="Pnl.SetLayoutAnimated(0, 0, 0, clvServices.AsV";
_pnl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent.mostCurrent._clvservices._asview().getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 434;BA.debugLine="Pnl.LoadLayout(\"ServicesItems\")";
_pnl.LoadLayout("ServicesItems",mostCurrent.activityBA);
 //BA.debugLineNum = 435;BA.debugLine="Dim TitlePnl As B4XView = Pnl.GetView(0)";
_titlepnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_titlepnl = _pnl.GetView((int) (0));
 //BA.debugLineNum = 438;BA.debugLine="lblServices.Text = RS.GetString(\"ServiceTitle\"";
parent.mostCurrent._lblservices.setText(BA.ObjectToCharSequence(_rs.GetString("ServiceTitle")));
 //BA.debugLineNum = 439;BA.debugLine="Dim BB As BBListItem = Pnl.GetView(1).GetView(";
_bb = (com.bwsi.cares.bblistitem)(_pnl.GetView((int) (1)).GetView(parent._bblistitemindexinitems).getTag());
 //BA.debugLineNum = 440;BA.debugLine="BB.TextEngine = TextEngine";
_bb._settextengine /*com.bwsi.cares.bctextengine*/ (parent.mostCurrent._textengine);
 //BA.debugLineNum = 442;BA.debugLine="BB.Text = GetContent(RS.GetInt(\"id\"))	'KC";
_bb._settext /*String*/ (_getcontent(_rs.GetInt("id")));
 //BA.debugLineNum = 443;BA.debugLine="Dim ex As ExpandableItemData = Expandable.Crea";
_ex = parent.mostCurrent._expandable._createvalue /*com.bwsi.cares.clvexpandable._expandableitemdata*/ (_pnl,(Object)("not used"));
 //BA.debugLineNum = 444;BA.debugLine="ex.CollapsedHeight = 100dip";
_ex.CollapsedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100));
 //BA.debugLineNum = 445;BA.debugLine="ex.ExpandedHeight = Max(ex.CollapsedHeight, BB";
_ex.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.Max(_ex.CollapsedHeight /*int*/ ,_bb._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))+_titlepnl.getHeight()));
 //BA.debugLineNum = 446;BA.debugLine="Dim fade As B4XView = Pnl.GetView(1).GetView(1";
_fade = new anywheresoftware.b4a.objects.B4XViewWrapper();
_fade = _pnl.GetView((int) (1)).GetView((int) (1));
 //BA.debugLineNum = 447;BA.debugLine="Dim Arrow As B4XView = Pnl.GetView(0).GetView(";
_arrow = new anywheresoftware.b4a.objects.B4XViewWrapper();
_arrow = _pnl.GetView((int) (0)).GetView((int) (2));
 //BA.debugLineNum = 450;BA.debugLine="If ex.ExpandedHeight > ex.CollapsedHeight Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_ex.ExpandedHeight /*int*/ >_ex.CollapsedHeight /*int*/ ) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 451;BA.debugLine="Arrow.Visible = True";
_arrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 452;BA.debugLine="fade.Visible = True";
_fade.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 454;BA.debugLine="fade.Top = ex.CollapsedHeight - fade.Height -";
_fade.setTop((int) (_ex.CollapsedHeight /*int*/ -_fade.getHeight()-_titlepnl.getHeight()));
 //BA.debugLineNum = 455;BA.debugLine="bc.SetBitmapToImageView(FadeBitmap, fade)";
parent.mostCurrent._bc._setbitmaptoimageview(parent.mostCurrent._fadebitmap,_fade);
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 457;BA.debugLine="Arrow.Visible = False";
_arrow.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 458;BA.debugLine="fade.Visible = False";
_fade.setVisible(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 15:
//C
this.state = 7;
;
 //BA.debugLineNum = 460;BA.debugLine="Pnl.SetLayoutAnimated(0, 0, 0, Pnl.Width, ex.C";
_pnl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_pnl.getWidth(),_ex.CollapsedHeight /*int*/ );
 //BA.debugLineNum = 461;BA.debugLine="clvServices.Add(Pnl, ex)";
parent.mostCurrent._clvservices._add(_pnl,(Object)(_ex));
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 464;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71900589",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;

case 19:
//C
this.state = 22;
;
 //BA.debugLineNum = 467;BA.debugLine="Log($\"List of Time Records = ${NumberFormat2((Da";
anywheresoftware.b4a.keywords.Common.LogImpl("71900592",("List of Time Records = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((anywheresoftware.b4a.keywords.Common.DateTime.getNow()-_starttime)/(double)1000,(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)))+" seconds to populate "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._clvservices._getsize()))+" Time Records"),0);
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 //BA.debugLineNum = 470;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71900595",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 503;BA.debugLine="clvServices_ScrollChanged(0)";
_clvservices_scrollchanged((int) (0));
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static void  _sql_querycomplete(boolean _success,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs) throws Exception{
}
public static String  _lblviewall_click() throws Exception{
 //BA.debugLineNum = 741;BA.debugLine="Private Sub lblViewAll_Click";
 //BA.debugLineNum = 742;BA.debugLine="StartActivity(FAQsPage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._faqspage.getObject()));
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return "";
}
public static String  _mainmenu_page1click() throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Private Sub MainMenu_Page1Click";
 //BA.debugLineNum = 339;BA.debugLine="pnlAccount.Visible = False";
mostCurrent._pnlaccount.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 340;BA.debugLine="pnlServices.Visible = False";
mostCurrent._pnlservices.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 341;BA.debugLine="scvMain.Visible = True";
mostCurrent._scvmain.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 342;BA.debugLine="fabApply.Visible = True";
mostCurrent._fabapply.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public static String  _mainmenu_page2click() throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Private Sub MainMenu_Page2Click";
 //BA.debugLineNum = 346;BA.debugLine="pnlAccount.Visible = False";
mostCurrent._pnlaccount.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 347;BA.debugLine="pnlServices.Visible = True";
mostCurrent._pnlservices.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 348;BA.debugLine="InitServices";
_initservices();
 //BA.debugLineNum = 349;BA.debugLine="scvMain.Visible = False";
mostCurrent._scvmain.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return "";
}
public static String  _mainmenu_page3click() throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Private Sub MainMenu_Page3Click";
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return "";
}
public static String  _mainmenu_page4click() throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Private Sub MainMenu_Page4Click";
 //BA.debugLineNum = 357;BA.debugLine="scvMain.Visible = False";
mostCurrent._scvmain.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 358;BA.debugLine="pnlServices.Visible = False";
mostCurrent._pnlservices.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 359;BA.debugLine="pnlAccount.Visible = True";
mostCurrent._pnlaccount.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 360;BA.debugLine="pnlAccount.SetLayoutAnimated(0,0,0,100%x, 90%y)";
mostCurrent._pnlaccount.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA));
 //BA.debugLineNum = 361;BA.debugLine="pnlAccount.LoadLayout(\"Login\")";
mostCurrent._pnlaccount.LoadLayout("Login",mostCurrent.activityBA);
 //BA.debugLineNum = 362;BA.debugLine="cdTxtBox.Initialize2(Colors.Transparent, 0,0, Col";
mostCurrent._cdtxtbox.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.Transparent,(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 363;BA.debugLine="txtLoginEMail.Background = cdTxtBox";
mostCurrent._txtloginemail.setBackground((android.graphics.drawable.Drawable)(mostCurrent._cdtxtbox.getObject()));
 //BA.debugLineNum = 364;BA.debugLine="txtLoginPassword.Background = cdTxtBox";
mostCurrent._txtloginpassword.setBackground((android.graphics.drawable.Drawable)(mostCurrent._cdtxtbox.getObject()));
 //BA.debugLineNum = 365;BA.debugLine="fabApply.Visible = False";
mostCurrent._fabapply.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return "";
}
public static String  _mainmenu_page5click() throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Private Sub MainMenu_Page5Click";
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return "";
}
public static String  _panel_selection_attr(anywheresoftware.b4a.objects.ImageViewWrapper _selection) throws Exception{
int _left = 0;
 //BA.debugLineNum = 722;BA.debugLine="Sub Panel_Selection_Attr(Selection As ImageView)";
 //BA.debugLineNum = 725;BA.debugLine="Select Selection";
switch (BA.switchObjectToInt(_selection)) {
}
;
 //BA.debugLineNum = 729;BA.debugLine="BackgroundAndCornerRadius(PanelSelection,15dip)";
_backgroundandcornerradius((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._panelselection.getObject())),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)));
 //BA.debugLineNum = 730;BA.debugLine="PanelSelection.Color = GlobalVariables.PriColor1";
mostCurrent._panelselection.setColor((int) (mostCurrent._globalvariables._pricolor1 /*double*/ ));
 //BA.debugLineNum = 731;BA.debugLine="Dim Left As Int";
_left = 0;
 //BA.debugLineNum = 732;BA.debugLine="Left = Selection.Left - 5%x";
_left = (int) (_selection.getLeft()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA));
 //BA.debugLineNum = 733;BA.debugLine="Activity.AddView(PanelSelection,Left,91%y,16%x,8%";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelselection.getObject()),_left,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (91),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (16),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
 //BA.debugLineNum = 736;BA.debugLine="PanelSelection.SendToBack";
mostCurrent._panelselection.SendToBack();
 //BA.debugLineNum = 737;BA.debugLine="Activity.Color = 0xFFF3FDFF";
mostCurrent._activity.setColor(((int)0xfff3fdff));
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return "";
}
public static String  _pnlaboutus_click() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Private Sub pnlAboutUs_Click";
 //BA.debugLineNum = 243;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 244;BA.debugLine="StartActivity(HistoryPage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._historypage.getObject()));
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public static String  _pnlservicetitle_click() throws Exception{
int _index = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _fade = null;
com.bwsi.cares.clvexpandable._expandableitemdata _e = null;
 //BA.debugLineNum = 401;BA.debugLine="Private Sub pnlServiceTitle_Click";
 //BA.debugLineNum = 405;BA.debugLine="Dim index As Int = clvServices.GetItemFromView(Se";
_index = mostCurrent._clvservices._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
 //BA.debugLineNum = 406;BA.debugLine="Dim Fade As B4XView = clvServices.GetPanel(index)";
_fade = new anywheresoftware.b4a.objects.B4XViewWrapper();
_fade = mostCurrent._clvservices._getpanel(_index).GetView((int) (1)).GetView((int) (1));
 //BA.debugLineNum = 407;BA.debugLine="Dim e As ExpandableItemData = Expandable.ToggleIt";
_e = mostCurrent._expandable._toggleitem /*com.bwsi.cares.clvexpandable._expandableitemdata*/ (_index);
 //BA.debugLineNum = 408;BA.debugLine="If e.ExpandedHeight <> e.CollapsedHeight Then";
if (_e.ExpandedHeight /*int*/ !=_e.CollapsedHeight /*int*/ ) { 
 //BA.debugLineNum = 409;BA.debugLine="Fade.SetVisibleAnimated(100dip, Not(e.Expanded))";
_fade.SetVisibleAnimated(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.Not(_e.Expanded /*boolean*/ ));
 };
 //BA.debugLineNum = 411;BA.debugLine="clvServices_ScrollChanged(clvServices.sv.ScrollVi";
_clvservices_scrollchanged(mostCurrent._clvservices._sv.getScrollViewOffsetY());
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return "";
}
public static String  _pnlsplash_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Private Sub pnlSplash_Touch (Action As Int, X As F";
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
main._process_globals();
faqspage._process_globals();
globalvariables._process_globals();
dataprivacypage._process_globals();
dbutils._process_globals();
historypage._process_globals();
newspage._process_globals();
starter._process_globals();
httputils2service._process_globals();
b4xcollections._process_globals();
xuiviewsutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 19;BA.debugLine="Dim tmrSplash As Timer";
_tmrsplash = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 20;BA.debugLine="Type MyNews(Thumbnails As Bitmap , Title As Strin";
;
 //BA.debugLineNum = 21;BA.debugLine="Public SelectedNews As MyNews";
_selectednews = new com.bwsi.cares.main._mynews();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public static String  _scvmain_scrollchanged(int _position) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub scvMain_ScrollChanged(Position As Int)";
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public static String  _setbitmapwithfitorfill(anywheresoftware.b4a.objects.B4XViewWrapper _vtargetview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 687;BA.debugLine="Public Sub SetBitmapWithFitOrFill (vTargetView As";
 //BA.debugLineNum = 688;BA.debugLine="vTargetView.SetBitmap(bmp)";
_vtargetview.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 692;BA.debugLine="Dim iv As ImageView = vTargetView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_vtargetview.getObject()));
 //BA.debugLineNum = 693;BA.debugLine="iv.Gravity = Gravity.FILL";
_iv.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 //BA.debugLineNum = 695;BA.debugLine="End Sub";
return "";
}
public static String  _setstatusbarandnavigationcolor(int _clr) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
anywheresoftware.b4j.object.JavaObject _jo2 = null;
 //BA.debugLineNum = 704;BA.debugLine="Sub SetStatusBarAndNavigationColor(clr As Int)";
 //BA.debugLineNum = 705;BA.debugLine="Try";
try { //BA.debugLineNum = 706;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 707;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
 //BA.debugLineNum = 708;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 709;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
 //BA.debugLineNum = 711;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
 //BA.debugLineNum = 712;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
 //BA.debugLineNum = 713;BA.debugLine="Dim jo2 As JavaObject";
_jo2 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 714;BA.debugLine="jo2.InitializeContext";
_jo2.InitializeContext(processBA);
 //BA.debugLineNum = 715;BA.debugLine="jo2.RunMethodJO(\"getWindow\", Null).RunMethod(\"se";
_jo2.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr)});
 } 
       catch (Exception e12) {
			processBA.setLastException(e12); //BA.debugLineNum = 717;BA.debugLine="ToastMessageShow(\"Some error with your android v";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Some error with your android version ( <5 )"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 719;BA.debugLine="End Sub";
return "";
}
public static void  _showsplash() throws Exception{
ResumableSub_ShowSplash rsub = new ResumableSub_ShowSplash(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ShowSplash extends BA.ResumableSub {
public ResumableSub_ShowSplash(com.bwsi.cares.main parent) {
this.parent = parent;
}
com.bwsi.cares.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 188;BA.debugLine="pnlSplash.Visible = True";
parent.mostCurrent._pnlsplash.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 189;BA.debugLine="Sleep(3000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (3000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 190;BA.debugLine="pnlSplash.Visible = False";
parent.mostCurrent._pnlsplash.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 191;BA.debugLine="tmrSplash.Enabled = False";
parent._tmrsplash.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Private Sub Timer1_Tick";
 //BA.debugLineNum = 231;BA.debugLine="imgSlider.NextImage";
mostCurrent._imgslider._nextimage /*void*/ ();
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
}
