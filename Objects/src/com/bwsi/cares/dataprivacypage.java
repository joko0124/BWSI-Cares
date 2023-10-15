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

public class dataprivacypage extends Activity implements B4AActivity{
	public static dataprivacypage mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "com.bwsi.cares", "com.bwsi.cares.dataprivacypage");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (dataprivacypage).");
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
		activityBA = new BA(this, layout, processBA, "com.bwsi.cares", "com.bwsi.cares.dataprivacypage");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.bwsi.cares.dataprivacypage", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (dataprivacypage) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (dataprivacypage) Resume **");
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
		return dataprivacypage.class;
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
            BA.LogInfo("** Activity (dataprivacypage) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (dataprivacypage) Pause event (activity is not paused). **");
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
            dataprivacypage mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (dataprivacypage) Resume **");
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
public com.bwsi.cares.bbcodeview _dpview = null;
public com.bwsi.cares.bctextengine _textengine = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imglogo = null;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _cdbtn = null;
public de.amberhome.objects.appcompat.ACButtonWrapper _btncontinue = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkagree = null;
public b4a.example.dateutils _dateutils = null;
public com.bwsi.cares.main _main = null;
public com.bwsi.cares.faqspage _faqspage = null;
public com.bwsi.cares.globalvariables _globalvariables = null;
public com.bwsi.cares.dbutils _dbutils = null;
public com.bwsi.cares.historypage _historypage = null;
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
 //BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 22;BA.debugLine="SetStatusBarAndNavigationColor(GlobalVariables.Pr";
_setstatusbarandnavigationcolor((int) (mostCurrent._globalvariables._pricolor1 /*double*/ ));
 //BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"DataPrivacy\")";
mostCurrent._activity.LoadLayout("DataPrivacy",mostCurrent.activityBA);
 //BA.debugLineNum = 24;BA.debugLine="TextEngine.Initialize(Activity)";
mostCurrent._textengine._initialize /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
 //BA.debugLineNum = 25;BA.debugLine="DPView.TextEngine = TextEngine";
mostCurrent._dpview._settextengine /*com.bwsi.cares.bctextengine*/ (mostCurrent._textengine);
 //BA.debugLineNum = 26;BA.debugLine="DPView.Text = \"\"";
mostCurrent._dpview._settext /*String*/ ("");
 //BA.debugLineNum = 27;BA.debugLine="cdBtn.Initialize2(GlobalVariables.PriColor1,20,0,";
mostCurrent._cdbtn.Initialize2((int) (mostCurrent._globalvariables._pricolor1 /*double*/ ),(int) (20),(int) (0),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 28;BA.debugLine="btnContinue.Background = cdBtn";
mostCurrent._btncontinue.setBackground((android.graphics.drawable.Drawable)(mostCurrent._cdbtn.getObject()));
 //BA.debugLineNum = 29;BA.debugLine="btnContinue.TextColor = Colors.White";
mostCurrent._btncontinue.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 30;BA.debugLine="LoadDataPrivacy";
_loaddataprivacy();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 34;BA.debugLine="chkAgree.Checked = False";
mostCurrent._chkagree.setChecked(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 35;BA.debugLine="btnContinue.Enabled = False";
mostCurrent._btncontinue.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _back_click() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Private Sub Back_Click";
 //BA.debugLineNum = 43;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _btncontinue_click() throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Private Sub btnContinue_Click";
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public static String  _chkagree_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Private Sub chkAgree_CheckedChange(Checked As Bool";
 //BA.debugLineNum = 143;BA.debugLine="btnContinue.Enabled = Checked";
mostCurrent._btncontinue.setEnabled(_checked);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private Back As Label";
mostCurrent._back = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private DPView As BBCodeView";
mostCurrent._dpview = new com.bwsi.cares.bbcodeview();
 //BA.debugLineNum = 12;BA.debugLine="Private TextEngine As BCTextEngine";
mostCurrent._textengine = new com.bwsi.cares.bctextengine();
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 14;BA.debugLine="Private imgLogo As ImageView";
mostCurrent._imglogo = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private cdBtn As ColorDrawable";
mostCurrent._cdbtn = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 17;BA.debugLine="Private btnContinue As ACButton";
mostCurrent._btncontinue = new de.amberhome.objects.appcompat.ACButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private chkAgree As CheckBox";
mostCurrent._chkagree = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _loaddataprivacy() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub LoadDataPrivacy";
 //BA.debugLineNum = 64;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 65;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, 200dip, 120dip)";
_pnl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
 //BA.debugLineNum = 68;BA.debugLine="DPView.Text = _ $\"[color=#1E4369][Alignment=Left]";
mostCurrent._dpview._settext /*String*/ (("[color=#1E4369][Alignment=Left][TextSize=26][b]Your Privacy is\n"+"important to us[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]To be allowed to collect and process [/INDENT][Alignment=justify]your personal information, you need to [b]agree our Data Privacy Statement[/b].\n"+"[/Alignment][/TextSize]\n"+"[color=#1E4369][Alignment=Left][TextSize=26][b]Balibago Waterworks\n"+"Data Privacy Statement[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]We at Balibago Waterworks System, Inc. are[/INDENT][Alignment=justify]\n"+"committed to ensuring and promoting the protection of your privacy and the confidentiality of your Personal Data as defined under the [b]Data Privacy Act of 2012[/b] and [b]its Implementing Rules and Regulations[/b].\n"+"This privacy policy is created to inform you on how we collect and process your Personal Data.\n"+"[/Alignment][/TextSize][TextSize=15][INDENT=1]We may update this policy to the extent [/INDENT]\n"+"[Alignment=justify]necessary to comply with data privacy laws and regulations, and technological changes and updates. Hence, we highly encourage you to check this page from time to time so that you are aware of any changes we have made to our privacy policy.\n"+"[/Alignment][/TextSize]\n"+"[color=#1E4369][Alignment=Left][TextSize=26][b]Purpose of the Collection and Processing of your Personal Data[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]We collect and process your Personal Data [/INDENT][Alignment=justify]to provide you with the best customer experience in the availment of our products and services. In particular, we use your Personal Data to:[/Alignment][/TextSize]\n"+"[TextSize=15][list]\n"+"[*]Facilitate transactions in accordance with your instructions and manage customer relations.\n"+"[*]Accommodate applications with AllEasy, Inc. for the availment of its payment platform at the option of the Data Subject.\n"+"[*]Facilitate payment of water bills and other changes through authorized third-party service providers such As AllEasy, Inc.\n"+"[*]Send promotional advertisements, rewards programs, and latest products And services; and\n"+"[*]Conduct research and marketing initiatives to assist us in improving our products and services.\n"+"[/list][/TextSize][TextSize=15][INDENT=1]Along with our primordial objective to [/INDENT][Alignment=justify]provide you with the highest quality of products and services, we are committed to abiding by all applicable legal requirements. Included in these legal requirements in our mandate To collect and process your Personal Data for the promotion of safe and honest commercial dealings.[/Alignment][/TextSize]\n"+"\n"+"[color=#1E4369][Alignment=Left][TextSize=22][b]Personal Data Collected[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]We collect the following Personal Data from [/INDENT]\n"+"you:[/TextSize][TextSize=15][list style=ordered]\n"+"[*]Basic personal information such as name, date of birth, gender, nationality, and address.\n"+"[*]Payment details such as bank account, credit card and debit card (as may be necessary).\n"+"[*]Contact details such as telephone number, mobile phone number, and email address and\n"+"[*]Other identifying and supporting documents such as photos and government-issued IDs[/list]\n"+"\n"+"[color=#1E4369][Alignment=Left][TextSize=26][b]Method by which we collect\n"+"your Personal Data[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]We collect your Personal Data through our [/INDENT]\n"+"[Alignment=justify][b]Balibago Waterworks Customer Care App[/b], market research activities, and authorized third-party platform providers, affiliates, partners, subsidiaries, and/or third-party service providers.[/Alignment][/TextSize]\n"+"\n"+"[color=#1E4369][Alignment=Left][TextSize=26][b]Security of your Personal Data[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]Your Personal Data in whatever form are of[/INDENT]\n"+"[Alignment=Justify]great importance to us. Therefore, we have [b]imposed strict policies[/b] within our company [b]to ensure that the integrity and confidentiality of your Personal Data are ensured[/b]. We have [b]implemented technological, organizational, and physical security measures to protect your Personal Data from unauthorized access, alteration, modification, disclosure, destruction, erasure, loss and interference[/b].[/Alignment][/TextSize]\n"+"\n"+"[color=#1E4369][Alignment=Left][TextSize=26][b]Disclosure and Sharing of your Personal Data[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]In compliance with legal and regulatory [/INDENT]\n"+"[Alignment=Justify]mandates, we may need to submit and disclose your Personal Data to appropriate government agencies including but not limited to [b]Bangko Sentral ng Pilipinas [/b]and [b]Anti-Money Laundering Council[/b].[/Alignment][/TextSize]\n"+"[TextSize=15][INDENT=1]We may share your Personal Data with our [/INDENT]affiliates,[Alignment=Justify]partners, subsidiaries, and/or third-party service providers (the [b]“Recipients”[/b]) for advertising, marketing, research, and other commercial purposes only after obtaining your consent. We ensure that the sharing of your Personal data shall be administered and conducted with the highest degree of care to maintain confidentiality of your Personal Data. We shall further safeguard your privacy and the protection of your Personal Data by entering into data sharing agreements or data processing agreements with Recipients requiring the observance and compliance of certain measures by the Recipients.[/Alignment][/TextSize]\n"+"\n"+"[color=#1E4369][Alignment=Left][TextSize=26][b]Access to or Correction of your Personal Data[/b][/TextSize][/Alignment][/color]\n"+"\n"+"[TextSize=15][INDENT=1]We adhere and respect your rights in [/INDENT][Alignment=Justify]relation to the collection and processing of your Personal Data including, the [b]right access your Personal Data collected[/b] and kept by us, the [b]right to modify inaccurate Personal Data[/b], and the [b]right to erase or block your Personal Data[/b].\n"+"Nevertheless, while we recognize your right to the erasure of your Personal Data stored with us, we will retain certain information relating to you and your transactions with us for periods as required by the law.[/Alignment][/TextSize]\n"+"[TextSize=15][INDENT=1]Unless there are legal and contractual[/INDENT][Alignment=Justify]\n"+"constraints, we shall process all your requests for access to, and correction of erasure, your Personal Data.\n"+"For these requests, kindly contact us at:[/Alignment][/TextSize]\n"+"[TextSize=15][INDENT=1]Address: [b]3923 McArthur Hiway, Balibago, \n"+"	       Angeles City, Pampanga[/b]\n"+"Email: [b]privacy@bwsi.com.ph[/b][/INDENT][/TextSize]\n"+"\n"+"\n"+"\n"+""));
 //BA.debugLineNum = 134;BA.debugLine="chkAgree.Checked = False";
mostCurrent._chkagree.setChecked(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 135;BA.debugLine="btnContinue.Enabled = False";
mostCurrent._btncontinue.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _setstatusbarandnavigationcolor(int _clr) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
anywheresoftware.b4j.object.JavaObject _jo2 = null;
 //BA.debugLineNum = 46;BA.debugLine="Sub SetStatusBarAndNavigationColor(clr As Int)";
 //BA.debugLineNum = 47;BA.debugLine="Try";
try { //BA.debugLineNum = 48;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 49;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
 //BA.debugLineNum = 50;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 51;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
 //BA.debugLineNum = 52;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
 //BA.debugLineNum = 53;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
 //BA.debugLineNum = 54;BA.debugLine="Dim jo2 As JavaObject";
_jo2 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 55;BA.debugLine="jo2.InitializeContext";
_jo2.InitializeContext(processBA);
 //BA.debugLineNum = 56;BA.debugLine="jo2.RunMethodJO(\"getWindow\", Null).RunMethod(\"se";
_jo2.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr)});
 } 
       catch (Exception e12) {
			processBA.setLastException(e12); //BA.debugLineNum = 58;BA.debugLine="ToastMessageShow(\"Some error with your android v";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Some error with your android version ( <5 )"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
}
