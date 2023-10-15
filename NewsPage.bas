B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
End Sub

Sub Globals
	Private Person1_Img,Person2_Img,Person3_Img,Person4_Img, imgNews As B4XImageView
	Private pnlReader As Panel
	Private bmp(4) As Bitmap
	Private Back,lblNewsTitle,lblAuthor, lblDatePublished As Label
	Private imgNews As B4XImageView
	Private NewsDescView As BBCodeView
	Private TextEngine As BCTextEngine
	Private xui As XUI
End Sub

Sub Activity_Create(FirstTime As Boolean)
	SetStatusBarAndNavigationColor(0xFF03051A)
	Activity.LoadLayout("NewDetails")
	TextEngine.Initialize(Activity)
	NewsDescView.TextEngine = TextEngine
	NewsDescView.Text = ""

	For i = 0 To 3
		bmp(i) = LoadBitmap(File.DirAssets,"Person" & i & ".jpg")
	Next
	Person1_Img.RoundedImage = True
	Person1_Img.Bitmap = bmp(0)
	
	Person2_Img.RoundedImage = True
	Person2_Img.Bitmap = bmp(1)
	
	Person3_Img.RoundedImage = True
	Person3_Img.Bitmap = bmp(2)
	
	Person4_Img.RoundedImage = True
	Person4_Img.Bitmap = bmp(3)
	
	imgNews.Bitmap = Main.SelectedNews.Thumbnails
	lblNewsTitle.Text = Main.SelectedNews.Title
	lblAuthor.Text = Main.SelectedNews.Author
	lblDatePublished.Text = Main.SelectedNews.DatePublished
	NewsDescView.Text = Main.SelectedNews.NewsInfo
	imgNews.CornersRadius = 30dip
	pnlReader.Enabled = False
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub Back_Click
	StartActivity(Main)
	Activity.Finish
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