B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: FALSE
	#IncludeTitle: FALSE
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private timer1 As Timer

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private imgSlider As ImageSlider
	Private scvMain As ScrollView
	
	Private mXUI As XUI
	Private pnlCarousel As Panel
	Private pnlMain As Panel
	
	Private PanelSelection,Panel1 As Panel
	Private btnAccount As ImageView
	Private btnBranches As ImageView
	Private btnCallUs As ImageView
	Private btnHome As ImageView
	Private btnServices As ImageView
	Private btnApply As B4XImageView
	

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("LandingPage")
	scvMain.Panel.LoadLayout("LandingContents")
	scvMain.Panel.Height = pnlMain.Height
	PanelSelection.Initialize("PanelSelection")
	SetStatusBarAndNavigationColor(GlobalVariables.PriColor1)
	imgSlider.NumberOfImages = 3
	If FirstTime Then
		imgSlider.PrevImage
		timer1.Initialize("Timer1",3000)
		timer1.Enabled = True
	End If
'	BackgroundAndCornerRadius(EditText1,10dip)
	
	Panel_Selection_Attr(btnHome)

'	imgSlider.NextImage
End Sub

Sub Activity_Resume
	btnHome_Click
	timer1.Enabled = True
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode = 4 Then
		timer1.Enabled = False
		ExitApplication
		Return True
	Else
		Return False
	End If
End Sub

Sub imgSlider_GetImage (Index As Int) As ResumableSub
'	Return mXUI.LoadBitmapResize(File.DirAssets,$"web${Index + 1}.jpg"$,pnlCarousel.Width, pnlCarousel.Height,True)
	Return mXUI.LoadBitmapResize(File.DirAssets,$"web${Index + 1}.jpg"$,imgSlider.WindowBase.Width, imgSlider.WindowBase.Height,True)
End Sub

Sub scvMain_ScrollChanged(Position As Int)
	
End Sub

Private Sub Timer1_Tick
	imgSlider.NextImage
End Sub

''Change Icon Colors
Sub ChangeColorBasedOnAlphaLevel(bmp As B4XBitmap, NewColor As Int) As B4XBitmap
	Dim bc As BitmapCreator
	bc.Initialize(bmp.Width, bmp.Height)
	bc.CopyPixelsFromBitmap(bmp)
	Dim a1, a2 As ARGBColor
	bc.ColorToARGB(NewColor, a1)
	For y = 0 To bc.mHeight - 1
		For x = 0 To bc.mWidth - 1
			bc.GetARGB(x, y, a2)
			If a2.a > 0 Then
				a2.r = a1.r
				a2.g = a1.g
				a2.b = a1.b
				bc.SetARGB(x, y, a2)
			End If
		Next
	Next
	Return bc.Bitmap
End Sub

Public Sub SetBitmapWithFitOrFill (vTargetView As B4XView, bmp As B4XBitmap)
	vTargetView.SetBitmap(bmp)
   #if B4A
	'B4XView.SetBitmap sets the gravity in B4A to CENTER. This will prevent the bitmap from being scaled as needed so
	'we switch to FILL
	Dim iv As ImageView = vTargetView
	iv.Gravity = Gravity.FILL
   #End If
End Sub

''Set Bacground and Corner Radius 
Sub BackgroundAndCornerRadius(View As View , CornerRadius As Int)
	Dim cdw1 As ColorDrawable
	cdw1.Initialize(Colors.White, CornerRadius)
	View.Background = cdw1
End Sub

Sub SetStatusBarAndNavigationColor(clr As Int)
	Try
		Dim jo As JavaObject
		jo.InitializeContext
		Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
		window.RunMethod("addFlags", Array (0x80000000))
		window.RunMethod("clearFlags", Array (0x04000000))
		window.RunMethod("setStatusBarColor", Array(clr))
		Dim jo2 As JavaObject
		jo2.InitializeContext
		jo2.RunMethodJO("getWindow", Null).RunMethod("setNavigationBarColor", Array(clr))
	Catch
		ToastMessageShow("Some error with your android version ( <5 )",True)
	End Try
End Sub

''Probably the worst way to implement Bottom Navigation :)
Sub Panel_Selection_Attr(Selection As ImageView)
	'PanelSelection.Initialize("PanelSelection")
	btnHome.Bitmap = LoadBitmap(File.DirAssets,"Home.png")
	btnAccount.Bitmap = LoadBitmap(File.DirAssets,"User.png")
	btnCallUs.Bitmap = LoadBitmap(File.DirAssets,"callus.png")
	btnBranches.Bitmap = LoadBitmap(File.DirAssets,"house-flood.png")
	btnServices.Bitmap =  LoadBitmap(File.DirAssets,"services.png")
	Select Selection
		Case btnHome
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"Home.png")
		Case btnAccount
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"User.png")
		Case btnCallUs
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"callus.png")
		Case btnBranches
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"house-flood.png")
		Case btnServices
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"services.png")
	End Select
	BackgroundAndCornerRadius(PanelSelection,15dip)
	PanelSelection.Color = GlobalVariables.PriColor1
	Dim Left As Int
	Left = Selection.Left - 5%x
	Activity.AddView(PanelSelection,Left,91%y,16%x,8%y)
	SetBitmapWithFitOrFill(Selection, ChangeColorBasedOnAlphaLevel(bmp,Colors.White))
	'PanelSelection.SendToBack
	PanelSelection.SendToBack
End Sub


Private Sub btnServices_Click
	timer1.Enabled = False
'	StartActivity(ServicesPage)
End Sub

Private Sub btnHome_Click
	PanelSelection.RemoveView
	Panel_Selection_Attr(btnHome)
End Sub

Private Sub btnCallUs_Click
	PanelSelection.RemoveView
	Panel_Selection_Attr(btnCallUs)
End Sub

Private Sub btnBranches_Click
	PanelSelection.RemoveView
	Panel_Selection_Attr(btnBranches)
End Sub

Private Sub btnAccount_Click
	PanelSelection.RemoveView
	Panel_Selection_Attr(btnAccount)
End Sub