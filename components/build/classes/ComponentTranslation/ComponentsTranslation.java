package com.google.appinventor.client;
import java.util.HashMap;
import java.util.Map;
import static com.google.appinventor.client.Ode.MESSAGES;
public class ComponentsTranslation {
  public static Map<String, String> myMap = map();

  private static String getName(String key) {
    String value = myMap.get(key);
    if (key == null) {
      return "**Missing key in ComponentsTranslations**";
    } else {
      return value;
    }
  }

  public static String getPropertyName(String key) {
    return getName("PROPERTY-" + key);
  }

  public static String getMethodName(String key) {
    return getName("METHOD-" + key);
  }

  public static String getEventName(String key) {
    return getName("EVENT-" + key);
  }
  public static HashMap<String, String> map() {
    HashMap<String, String> map = new HashMap<String, String>();


/* Component: AccelerometerSensor */



/* Properties */

    map.put("PROPERTY-Available", MESSAGES.AvailableProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-MinimumInterval", MESSAGES.MinimumIntervalProperties());
    map.put("PROPERTY-Sensitivity", MESSAGES.SensitivityProperties());
    map.put("PROPERTY-XAccel", MESSAGES.XAccelProperties());
    map.put("PROPERTY-YAccel", MESSAGES.YAccelProperties());
    map.put("PROPERTY-ZAccel", MESSAGES.ZAccelProperties());


/* Events */

    map.put("EVENT-AccelerationChanged", MESSAGES.AccelerationChangedEvents());
    map.put("EVENT-Shaking", MESSAGES.ShakingEvents());


/* Methods */



/* Component: ActivityStarter */



/* Properties */

    map.put("PROPERTY-Action", MESSAGES.ActionProperties());
    map.put("PROPERTY-ActivityClass", MESSAGES.ActivityClassProperties());
    map.put("PROPERTY-ActivityPackage", MESSAGES.ActivityPackageProperties());
    map.put("PROPERTY-DataType", MESSAGES.DataTypeProperties());
    map.put("PROPERTY-DataUri", MESSAGES.DataUriProperties());
    map.put("PROPERTY-ExtraKey", MESSAGES.ExtraKeyProperties());
    map.put("PROPERTY-ExtraValue", MESSAGES.ExtraValueProperties());
    map.put("PROPERTY-Extras", MESSAGES.ExtrasProperties());
    map.put("PROPERTY-Result", MESSAGES.ResultProperties());
    map.put("PROPERTY-ResultName", MESSAGES.ResultNameProperties());
    map.put("PROPERTY-ResultType", MESSAGES.ResultTypeProperties());
    map.put("PROPERTY-ResultUri", MESSAGES.ResultUriProperties());


/* Events */

    map.put("EVENT-ActivityCanceled", MESSAGES.ActivityCanceledEvents());
    map.put("EVENT-AfterActivity", MESSAGES.AfterActivityEvents());


/* Methods */

    map.put("METHOD-ResolveActivity", MESSAGES.ResolveActivityMethods());
    map.put("METHOD-StartActivity", MESSAGES.StartActivityMethods());


/* Component: Ball */



/* Properties */

    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-Heading", MESSAGES.HeadingProperties());
    map.put("PROPERTY-Interval", MESSAGES.IntervalProperties());
    map.put("PROPERTY-PaintColor", MESSAGES.PaintColorProperties());
    map.put("PROPERTY-Radius", MESSAGES.RadiusProperties());
    map.put("PROPERTY-Speed", MESSAGES.SpeedProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-X", MESSAGES.XProperties());
    map.put("PROPERTY-Y", MESSAGES.YProperties());
    map.put("PROPERTY-Z", MESSAGES.ZProperties());


/* Events */

    map.put("EVENT-CollidedWith", MESSAGES.CollidedWithEvents());
    map.put("EVENT-Dragged", MESSAGES.DraggedEvents());
    map.put("EVENT-EdgeReached", MESSAGES.EdgeReachedEvents());
    map.put("EVENT-Flung", MESSAGES.FlungEvents());
    map.put("EVENT-NoLongerCollidingWith", MESSAGES.NoLongerCollidingWithEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());
    map.put("EVENT-Touched", MESSAGES.TouchedEvents());


/* Methods */

    map.put("METHOD-Bounce", MESSAGES.BounceMethods());
    map.put("METHOD-CollidingWith", MESSAGES.CollidingWithMethods());
    map.put("METHOD-MoveIntoBounds", MESSAGES.MoveIntoBoundsMethods());
    map.put("METHOD-MoveTo", MESSAGES.MoveToMethods());
    map.put("METHOD-PointInDirection", MESSAGES.PointInDirectionMethods());
    map.put("METHOD-PointTowards", MESSAGES.PointTowardsMethods());


/* Component: BarcodeScanner */



/* Properties */

    map.put("PROPERTY-Result", MESSAGES.ResultProperties());
    map.put("PROPERTY-UseExternalScanner", MESSAGES.UseExternalScannerProperties());


/* Events */

    map.put("EVENT-AfterScan", MESSAGES.AfterScanEvents());


/* Methods */

    map.put("METHOD-DoScan", MESSAGES.DoScanMethods());


/* Component: BluetoothClient */



/* Properties */

    map.put("PROPERTY-AddressesAndNames", MESSAGES.AddressesAndNamesProperties());
    map.put("PROPERTY-Available", MESSAGES.AvailableProperties());
    map.put("PROPERTY-CharacterEncoding", MESSAGES.CharacterEncodingProperties());
    map.put("PROPERTY-DelimiterByte", MESSAGES.DelimiterByteProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-HighByteFirst", MESSAGES.HighByteFirstProperties());
    map.put("PROPERTY-IsConnected", MESSAGES.IsConnectedProperties());
    map.put("PROPERTY-Secure", MESSAGES.SecureProperties());


/* Events */



/* Methods */

    map.put("METHOD-BytesAvailableToReceive", MESSAGES.BytesAvailableToReceiveMethods());
    map.put("METHOD-Connect", MESSAGES.ConnectMethods());
    map.put("METHOD-ConnectWithUUID", MESSAGES.ConnectWithUUIDMethods());
    map.put("METHOD-Disconnect", MESSAGES.DisconnectMethods());
    map.put("METHOD-IsDevicePaired", MESSAGES.IsDevicePairedMethods());
    map.put("METHOD-ReceiveSigned1ByteNumber", MESSAGES.ReceiveSigned1ByteNumberMethods());
    map.put("METHOD-ReceiveSigned2ByteNumber", MESSAGES.ReceiveSigned2ByteNumberMethods());
    map.put("METHOD-ReceiveSigned4ByteNumber", MESSAGES.ReceiveSigned4ByteNumberMethods());
    map.put("METHOD-ReceiveSignedBytes", MESSAGES.ReceiveSignedBytesMethods());
    map.put("METHOD-ReceiveText", MESSAGES.ReceiveTextMethods());
    map.put("METHOD-ReceiveUnsigned1ByteNumber", MESSAGES.ReceiveUnsigned1ByteNumberMethods());
    map.put("METHOD-ReceiveUnsigned2ByteNumber", MESSAGES.ReceiveUnsigned2ByteNumberMethods());
    map.put("METHOD-ReceiveUnsigned4ByteNumber", MESSAGES.ReceiveUnsigned4ByteNumberMethods());
    map.put("METHOD-ReceiveUnsignedBytes", MESSAGES.ReceiveUnsignedBytesMethods());
    map.put("METHOD-Send1ByteNumber", MESSAGES.Send1ByteNumberMethods());
    map.put("METHOD-Send2ByteNumber", MESSAGES.Send2ByteNumberMethods());
    map.put("METHOD-Send4ByteNumber", MESSAGES.Send4ByteNumberMethods());
    map.put("METHOD-SendBytes", MESSAGES.SendBytesMethods());
    map.put("METHOD-SendText", MESSAGES.SendTextMethods());


/* Component: BluetoothServer */



/* Properties */

    map.put("PROPERTY-Available", MESSAGES.AvailableProperties());
    map.put("PROPERTY-CharacterEncoding", MESSAGES.CharacterEncodingProperties());
    map.put("PROPERTY-DelimiterByte", MESSAGES.DelimiterByteProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-HighByteFirst", MESSAGES.HighByteFirstProperties());
    map.put("PROPERTY-IsAccepting", MESSAGES.IsAcceptingProperties());
    map.put("PROPERTY-IsConnected", MESSAGES.IsConnectedProperties());
    map.put("PROPERTY-Secure", MESSAGES.SecureProperties());


/* Events */

    map.put("EVENT-ConnectionAccepted", MESSAGES.ConnectionAcceptedEvents());


/* Methods */

    map.put("METHOD-AcceptConnection", MESSAGES.AcceptConnectionMethods());
    map.put("METHOD-AcceptConnectionWithUUID", MESSAGES.AcceptConnectionWithUUIDMethods());
    map.put("METHOD-BytesAvailableToReceive", MESSAGES.BytesAvailableToReceiveMethods());
    map.put("METHOD-Disconnect", MESSAGES.DisconnectMethods());
    map.put("METHOD-ReceiveSigned1ByteNumber", MESSAGES.ReceiveSigned1ByteNumberMethods());
    map.put("METHOD-ReceiveSigned2ByteNumber", MESSAGES.ReceiveSigned2ByteNumberMethods());
    map.put("METHOD-ReceiveSigned4ByteNumber", MESSAGES.ReceiveSigned4ByteNumberMethods());
    map.put("METHOD-ReceiveSignedBytes", MESSAGES.ReceiveSignedBytesMethods());
    map.put("METHOD-ReceiveText", MESSAGES.ReceiveTextMethods());
    map.put("METHOD-ReceiveUnsigned1ByteNumber", MESSAGES.ReceiveUnsigned1ByteNumberMethods());
    map.put("METHOD-ReceiveUnsigned2ByteNumber", MESSAGES.ReceiveUnsigned2ByteNumberMethods());
    map.put("METHOD-ReceiveUnsigned4ByteNumber", MESSAGES.ReceiveUnsigned4ByteNumberMethods());
    map.put("METHOD-ReceiveUnsignedBytes", MESSAGES.ReceiveUnsignedBytesMethods());
    map.put("METHOD-Send1ByteNumber", MESSAGES.Send1ByteNumberMethods());
    map.put("METHOD-Send2ByteNumber", MESSAGES.Send2ByteNumberMethods());
    map.put("METHOD-Send4ByteNumber", MESSAGES.Send4ByteNumberMethods());
    map.put("METHOD-SendBytes", MESSAGES.SendBytesMethods());
    map.put("METHOD-SendText", MESSAGES.SendTextMethods());
    map.put("METHOD-StopAccepting", MESSAGES.StopAcceptingMethods());


/* Component: Button */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-Shape", MESSAGES.ShapeProperties());
    map.put("PROPERTY-ShowFeedback", MESSAGES.ShowFeedbackProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-Click", MESSAGES.ClickEvents());
    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LongClick", MESSAGES.LongClickEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());


/* Methods */



/* Component: Camcorder */



/* Properties */



/* Events */

    map.put("EVENT-AfterRecording", MESSAGES.AfterRecordingEvents());


/* Methods */

    map.put("METHOD-RecordVideo", MESSAGES.RecordVideoMethods());


/* Component: Camera */



/* Properties */

    map.put("PROPERTY-UseFront", MESSAGES.UseFrontProperties());


/* Events */

    map.put("EVENT-AfterPicture", MESSAGES.AfterPictureEvents());


/* Methods */

    map.put("METHOD-TakePicture", MESSAGES.TakePictureMethods());


/* Component: Canvas */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-BackgroundImage", MESSAGES.BackgroundImageProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-LineWidth", MESSAGES.LineWidthProperties());
    map.put("PROPERTY-PaintColor", MESSAGES.PaintColorProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-Dragged", MESSAGES.DraggedEvents());
    map.put("EVENT-Flung", MESSAGES.FlungEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());
    map.put("EVENT-Touched", MESSAGES.TouchedEvents());


/* Methods */

    map.put("METHOD-Clear", MESSAGES.ClearMethods());
    map.put("METHOD-DrawCircle", MESSAGES.DrawCircleMethods());
    map.put("METHOD-DrawLine", MESSAGES.DrawLineMethods());
    map.put("METHOD-DrawPoint", MESSAGES.DrawPointMethods());
    map.put("METHOD-DrawText", MESSAGES.DrawTextMethods());
    map.put("METHOD-DrawTextAtAngle", MESSAGES.DrawTextAtAngleMethods());
    map.put("METHOD-GetBackgroundPixelColor", MESSAGES.GetBackgroundPixelColorMethods());
    map.put("METHOD-GetPixelColor", MESSAGES.GetPixelColorMethods());
    map.put("METHOD-Save", MESSAGES.SaveMethods());
    map.put("METHOD-SaveAs", MESSAGES.SaveAsMethods());
    map.put("METHOD-SetBackgroundPixelColor", MESSAGES.SetBackgroundPixelColorMethods());


/* Component: CheckBox */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Checked", MESSAGES.CheckedProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-Changed", MESSAGES.ChangedEvents());
    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());


/* Methods */



/* Component: Clock */



/* Properties */

    map.put("PROPERTY-TimerAlwaysFires", MESSAGES.TimerAlwaysFiresProperties());
    map.put("PROPERTY-TimerEnabled", MESSAGES.TimerEnabledProperties());
    map.put("PROPERTY-TimerInterval", MESSAGES.TimerIntervalProperties());


/* Events */

    map.put("EVENT-Timer", MESSAGES.TimerEvents());


/* Methods */

    map.put("METHOD-AddDays", MESSAGES.AddDaysMethods());
    map.put("METHOD-AddHours", MESSAGES.AddHoursMethods());
    map.put("METHOD-AddMinutes", MESSAGES.AddMinutesMethods());
    map.put("METHOD-AddMonths", MESSAGES.AddMonthsMethods());
    map.put("METHOD-AddSeconds", MESSAGES.AddSecondsMethods());
    map.put("METHOD-AddWeeks", MESSAGES.AddWeeksMethods());
    map.put("METHOD-AddYears", MESSAGES.AddYearsMethods());
    map.put("METHOD-DayOfMonth", MESSAGES.DayOfMonthMethods());
    map.put("METHOD-Duration", MESSAGES.DurationMethods());
    map.put("METHOD-FormatDate", MESSAGES.FormatDateMethods());
    map.put("METHOD-FormatDateTime", MESSAGES.FormatDateTimeMethods());
    map.put("METHOD-FormatTime", MESSAGES.FormatTimeMethods());
    map.put("METHOD-GetMillis", MESSAGES.GetMillisMethods());
    map.put("METHOD-Hour", MESSAGES.HourMethods());
    map.put("METHOD-MakeInstant", MESSAGES.MakeInstantMethods());
    map.put("METHOD-MakeInstantFromMillis", MESSAGES.MakeInstantFromMillisMethods());
    map.put("METHOD-Minute", MESSAGES.MinuteMethods());
    map.put("METHOD-Month", MESSAGES.MonthMethods());
    map.put("METHOD-MonthName", MESSAGES.MonthNameMethods());
    map.put("METHOD-Now", MESSAGES.NowMethods());
    map.put("METHOD-Second", MESSAGES.SecondMethods());
    map.put("METHOD-SystemTime", MESSAGES.SystemTimeMethods());
    map.put("METHOD-Weekday", MESSAGES.WeekdayMethods());
    map.put("METHOD-WeekdayName", MESSAGES.WeekdayNameMethods());
    map.put("METHOD-Year", MESSAGES.YearMethods());


/* Component: ContactPicker */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-ContactName", MESSAGES.ContactNameProperties());
    map.put("PROPERTY-ContactUri", MESSAGES.ContactUriProperties());
    map.put("PROPERTY-EmailAddress", MESSAGES.EmailAddressProperties());
    map.put("PROPERTY-EmailAddressList", MESSAGES.EmailAddressListProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-PhoneNumber", MESSAGES.PhoneNumberProperties());
    map.put("PROPERTY-PhoneNumberList", MESSAGES.PhoneNumberListProperties());
    map.put("PROPERTY-Picture", MESSAGES.PictureProperties());
    map.put("PROPERTY-Shape", MESSAGES.ShapeProperties());
    map.put("PROPERTY-ShowFeedback", MESSAGES.ShowFeedbackProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-AfterPicking", MESSAGES.AfterPickingEvents());
    map.put("EVENT-BeforePicking", MESSAGES.BeforePickingEvents());
    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());


/* Methods */

    map.put("METHOD-Open", MESSAGES.OpenMethods());
    map.put("METHOD-ViewContact", MESSAGES.ViewContactMethods());


/* Component: DatePicker */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Day", MESSAGES.DayProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-Instant", MESSAGES.InstantProperties());
    map.put("PROPERTY-Month", MESSAGES.MonthProperties());
    map.put("PROPERTY-MonthInText", MESSAGES.MonthInTextProperties());
    map.put("PROPERTY-Shape", MESSAGES.ShapeProperties());
    map.put("PROPERTY-ShowFeedback", MESSAGES.ShowFeedbackProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());
    map.put("PROPERTY-Year", MESSAGES.YearProperties());


/* Events */

    map.put("EVENT-AfterDateSet", MESSAGES.AfterDateSetEvents());
    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());


/* Methods */

    map.put("METHOD-LaunchPicker", MESSAGES.LaunchPickerMethods());
    map.put("METHOD-SetDateToDisplay", MESSAGES.SetDateToDisplayMethods());
    map.put("METHOD-SetDateToDisplayFromInstant", MESSAGES.SetDateToDisplayFromInstantMethods());


/* Component: EmailPicker */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Hint", MESSAGES.HintProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());


/* Methods */

    map.put("METHOD-RequestFocus", MESSAGES.RequestFocusMethods());


/* Component: File */



/* Properties */



/* Events */

    map.put("EVENT-AfterFileSaved", MESSAGES.AfterFileSavedEvents());
    map.put("EVENT-GotText", MESSAGES.GotTextEvents());


/* Methods */

    map.put("METHOD-AppendToFile", MESSAGES.AppendToFileMethods());
    map.put("METHOD-Delete", MESSAGES.DeleteMethods());
    map.put("METHOD-ReadFrom", MESSAGES.ReadFromMethods());
    map.put("METHOD-SaveFile", MESSAGES.SaveFileMethods());


/* Component: Form */



/* Properties */

    map.put("PROPERTY-AboutScreen", MESSAGES.AboutScreenProperties());
    map.put("PROPERTY-AlignHorizontal", MESSAGES.AlignHorizontalProperties());
    map.put("PROPERTY-AlignVertical", MESSAGES.AlignVerticalProperties());
    map.put("PROPERTY-AppName", MESSAGES.AppNameProperties());
    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-BackgroundImage", MESSAGES.BackgroundImageProperties());
    map.put("PROPERTY-CloseScreenAnimation", MESSAGES.CloseScreenAnimationProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-Icon", MESSAGES.IconProperties());
    map.put("PROPERTY-OpenScreenAnimation", MESSAGES.OpenScreenAnimationProperties());
    map.put("PROPERTY-ScreenOrientation", MESSAGES.ScreenOrientationProperties());
    map.put("PROPERTY-Scrollable", MESSAGES.ScrollableProperties());
    map.put("PROPERTY-ShowStatusBar", MESSAGES.ShowStatusBarProperties());
    map.put("PROPERTY-Sizing", MESSAGES.SizingProperties());
    map.put("PROPERTY-Title", MESSAGES.TitleProperties());
    map.put("PROPERTY-TitleVisible", MESSAGES.TitleVisibleProperties());
    map.put("PROPERTY-VersionCode", MESSAGES.VersionCodeProperties());
    map.put("PROPERTY-VersionName", MESSAGES.VersionNameProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());


/* Events */

    map.put("EVENT-BackPressed", MESSAGES.BackPressedEvents());
    map.put("EVENT-ErrorOccurred", MESSAGES.ErrorOccurredEvents());
    map.put("EVENT-Initialize", MESSAGES.InitializeEvents());
    map.put("EVENT-OtherScreenClosed", MESSAGES.OtherScreenClosedEvents());
    map.put("EVENT-ScreenOrientationChanged", MESSAGES.ScreenOrientationChangedEvents());


/* Methods */

    map.put("METHOD-HideKeyboard", MESSAGES.HideKeyboardMethods());


/* Component: FtcAccelerationSensor */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Status", MESSAGES.StatusProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());
    map.put("PROPERTY-XAccel", MESSAGES.XAccelProperties());
    map.put("PROPERTY-YAccel", MESSAGES.YAccelProperties());
    map.put("PROPERTY-ZAccel", MESSAGES.ZAccelProperties());


/* Events */



/* Methods */

    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcAnalogInput */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Value", MESSAGES.ValueProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcAnalogOutput */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-SetAnalogOutputFrequency", MESSAGES.SetAnalogOutputFrequencyMethods());
    map.put("METHOD-SetAnalogOutputMode", MESSAGES.SetAnalogOutputModeMethods());
    map.put("METHOD-SetAnalogOutputVoltage", MESSAGES.SetAnalogOutputVoltageMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcColorSensor */



/* Properties */

    map.put("PROPERTY-ARGB", MESSAGES.ARGBProperties());
    map.put("PROPERTY-Alpha", MESSAGES.AlphaProperties());
    map.put("PROPERTY-Blue", MESSAGES.BlueProperties());
    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Green", MESSAGES.GreenProperties());
    map.put("PROPERTY-I2cAddress", MESSAGES.I2cAddressProperties());
    map.put("PROPERTY-MAX_NEW_I2C_ADDRESS", MESSAGES.MAX_NEW_I2C_ADDRESSProperties());
    map.put("PROPERTY-MIN_NEW_I2C_ADDRESS", MESSAGES.MIN_NEW_I2C_ADDRESSProperties());
    map.put("PROPERTY-Red", MESSAGES.RedProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-ConvertColorToHSV", MESSAGES.ConvertColorToHSVMethods());
    map.put("METHOD-ConvertHSVToColor", MESSAGES.ConvertHSVToColorMethods());
    map.put("METHOD-ConvertHSVToColorWithAlpha", MESSAGES.ConvertHSVToColorWithAlphaMethods());
    map.put("METHOD-ConvertRGBToHSV", MESSAGES.ConvertRGBToHSVMethods());
    map.put("METHOD-CreateARGB", MESSAGES.CreateARGBMethods());
    map.put("METHOD-CreateHSV", MESSAGES.CreateHSVMethods());
    map.put("METHOD-CreateRGB", MESSAGES.CreateRGBMethods());
    map.put("METHOD-EnableLed", MESSAGES.EnableLedMethods());
    map.put("METHOD-ExtractAlpha", MESSAGES.ExtractAlphaMethods());
    map.put("METHOD-ExtractBlue", MESSAGES.ExtractBlueMethods());
    map.put("METHOD-ExtractGreen", MESSAGES.ExtractGreenMethods());
    map.put("METHOD-ExtractHue", MESSAGES.ExtractHueMethods());
    map.put("METHOD-ExtractRed", MESSAGES.ExtractRedMethods());
    map.put("METHOD-ExtractSaturation", MESSAGES.ExtractSaturationMethods());
    map.put("METHOD-ExtractValue", MESSAGES.ExtractValueMethods());
    map.put("METHOD-ParseColor", MESSAGES.ParseColorMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcCompassSensor */



/* Properties */

    map.put("PROPERTY-CalibrationFailed", MESSAGES.CalibrationFailedProperties());
    map.put("PROPERTY-CompassMode_CALIBRATION_MODE", MESSAGES.CompassMode_CALIBRATION_MODEProperties());
    map.put("PROPERTY-CompassMode_MEASUREMENT_MODE", MESSAGES.CompassMode_MEASUREMENT_MODEProperties());
    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Direction", MESSAGES.DirectionProperties());
    map.put("PROPERTY-Status", MESSAGES.StatusProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-SetMode", MESSAGES.SetModeMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcDcMotor */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-CurrentPosition", MESSAGES.CurrentPositionProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Direction", MESSAGES.DirectionProperties());
    map.put("PROPERTY-Direction_FORWARD", MESSAGES.Direction_FORWARDProperties());
    map.put("PROPERTY-Direction_REVERSE", MESSAGES.Direction_REVERSEProperties());
    map.put("PROPERTY-Mode", MESSAGES.ModeProperties());
    map.put("PROPERTY-PortNumber", MESSAGES.PortNumberProperties());
    map.put("PROPERTY-Power", MESSAGES.PowerProperties());
    map.put("PROPERTY-RunMode_RESET_ENCODERS", MESSAGES.RunMode_RESET_ENCODERSProperties());
    map.put("PROPERTY-RunMode_RUN_TO_POSITION", MESSAGES.RunMode_RUN_TO_POSITIONProperties());
    map.put("PROPERTY-RunMode_RUN_USING_ENCODERS", MESSAGES.RunMode_RUN_USING_ENCODERSProperties());
    map.put("PROPERTY-RunMode_RUN_WITHOUT_ENCODERS", MESSAGES.RunMode_RUN_WITHOUT_ENCODERSProperties());
    map.put("PROPERTY-TargetPosition", MESSAGES.TargetPositionProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-GetPowerFloat", MESSAGES.GetPowerFloatMethods());
    map.put("METHOD-IsBusy", MESSAGES.IsBusyMethods());
    map.put("METHOD-SetPowerFloat", MESSAGES.SetPowerFloatMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcDcMotorController */



/* Properties */

    map.put("PROPERTY-BatteryVoltage", MESSAGES.BatteryVoltageProperties());
    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceMode_READ_ONLY", MESSAGES.DeviceMode_READ_ONLYProperties());
    map.put("PROPERTY-DeviceMode_WRITE_ONLY", MESSAGES.DeviceMode_WRITE_ONLYProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-MotorControllerDeviceMode", MESSAGES.MotorControllerDeviceModeProperties());
    map.put("PROPERTY-RunMode_RESET_ENCODERS", MESSAGES.RunMode_RESET_ENCODERSProperties());
    map.put("PROPERTY-RunMode_RUN_TO_POSITION", MESSAGES.RunMode_RUN_TO_POSITIONProperties());
    map.put("PROPERTY-RunMode_RUN_USING_ENCODERS", MESSAGES.RunMode_RUN_USING_ENCODERSProperties());
    map.put("PROPERTY-RunMode_RUN_WITHOUT_ENCODERS", MESSAGES.RunMode_RUN_WITHOUT_ENCODERSProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-GetDifferentialControlLoopCoefficientD", MESSAGES.GetDifferentialControlLoopCoefficientDMethods());
    map.put("METHOD-GetDifferentialControlLoopCoefficientI", MESSAGES.GetDifferentialControlLoopCoefficientIMethods());
    map.put("METHOD-GetDifferentialControlLoopCoefficientP", MESSAGES.GetDifferentialControlLoopCoefficientPMethods());
    map.put("METHOD-GetGearRatio", MESSAGES.GetGearRatioMethods());
    map.put("METHOD-GetMotorChannelMode", MESSAGES.GetMotorChannelModeMethods());
    map.put("METHOD-GetMotorCurrentPosition", MESSAGES.GetMotorCurrentPositionMethods());
    map.put("METHOD-GetMotorPower", MESSAGES.GetMotorPowerMethods());
    map.put("METHOD-GetMotorPowerFloat", MESSAGES.GetMotorPowerFloatMethods());
    map.put("METHOD-GetMotorTargetPosition", MESSAGES.GetMotorTargetPositionMethods());
    map.put("METHOD-IsBusy", MESSAGES.IsBusyMethods());
    map.put("METHOD-SetDifferentialControlLoopCoefficients", MESSAGES.SetDifferentialControlLoopCoefficientsMethods());
    map.put("METHOD-SetGearRatio", MESSAGES.SetGearRatioMethods());
    map.put("METHOD-SetMotorChannelMode", MESSAGES.SetMotorChannelModeMethods());
    map.put("METHOD-SetMotorPower", MESSAGES.SetMotorPowerMethods());
    map.put("METHOD-SetMotorPowerFloat", MESSAGES.SetMotorPowerFloatMethods());
    map.put("METHOD-SetMotorPowerForGroup", MESSAGES.SetMotorPowerForGroupMethods());
    map.put("METHOD-SetMotorTargetPosition", MESSAGES.SetMotorTargetPositionMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcDeviceInterfaceModule */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Mode_INPUT", MESSAGES.Mode_INPUTProperties());
    map.put("PROPERTY-Mode_OUTPUT", MESSAGES.Mode_OUTPUTProperties());
    map.put("PROPERTY-SerialNumber", MESSAGES.SerialNumberProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */

    map.put("EVENT-I2cPortIsReady", MESSAGES.I2cPortIsReadyEvents());


/* Methods */

    map.put("METHOD-CopyBufferIntoWriteBuffer", MESSAGES.CopyBufferIntoWriteBufferMethods());
    map.put("METHOD-EnableI2cReadMode", MESSAGES.EnableI2cReadModeMethods());
    map.put("METHOD-EnableI2cWriteMode", MESSAGES.EnableI2cWriteModeMethods());
    map.put("METHOD-GetAnalogInputValue", MESSAGES.GetAnalogInputValueMethods());
    map.put("METHOD-GetCopyOfReadBuffer", MESSAGES.GetCopyOfReadBufferMethods());
    map.put("METHOD-GetCopyOfWriteBuffer", MESSAGES.GetCopyOfWriteBufferMethods());
    map.put("METHOD-GetDigitalChannelMode", MESSAGES.GetDigitalChannelModeMethods());
    map.put("METHOD-GetDigitalChannelState", MESSAGES.GetDigitalChannelStateMethods());
    map.put("METHOD-GetDigitalIOControlByte", MESSAGES.GetDigitalIOControlByteMethods());
    map.put("METHOD-GetDigitalInputStateByte", MESSAGES.GetDigitalInputStateByteMethods());
    map.put("METHOD-GetDigitalOutputStateByte", MESSAGES.GetDigitalOutputStateByteMethods());
    map.put("METHOD-GetLEDState", MESSAGES.GetLEDStateMethods());
    map.put("METHOD-GetPulseWidthOutputTime", MESSAGES.GetPulseWidthOutputTimeMethods());
    map.put("METHOD-GetPulseWidthPeriod", MESSAGES.GetPulseWidthPeriodMethods());
    map.put("METHOD-IsI2cPortActionFlagSet", MESSAGES.IsI2cPortActionFlagSetMethods());
    map.put("METHOD-IsI2cPortInReadMode", MESSAGES.IsI2cPortInReadModeMethods());
    map.put("METHOD-IsI2cPortInWriteMode", MESSAGES.IsI2cPortInWriteModeMethods());
    map.put("METHOD-IsI2cPortReady", MESSAGES.IsI2cPortReadyMethods());
    map.put("METHOD-ReadI2cCacheFromController", MESSAGES.ReadI2cCacheFromControllerMethods());
    map.put("METHOD-SetAnalogOutputFrequency", MESSAGES.SetAnalogOutputFrequencyMethods());
    map.put("METHOD-SetAnalogOutputMode", MESSAGES.SetAnalogOutputModeMethods());
    map.put("METHOD-SetAnalogOutputVoltage", MESSAGES.SetAnalogOutputVoltageMethods());
    map.put("METHOD-SetDigitalChannelMode", MESSAGES.SetDigitalChannelModeMethods());
    map.put("METHOD-SetDigitalChannelState", MESSAGES.SetDigitalChannelStateMethods());
    map.put("METHOD-SetDigitalIOControlByte", MESSAGES.SetDigitalIOControlByteMethods());
    map.put("METHOD-SetDigitalOutputByte", MESSAGES.SetDigitalOutputByteMethods());
    map.put("METHOD-SetI2cPortActionFlag", MESSAGES.SetI2cPortActionFlagMethods());
    map.put("METHOD-SetLED", MESSAGES.SetLEDMethods());
    map.put("METHOD-SetPulseWidthOutputTime", MESSAGES.SetPulseWidthOutputTimeMethods());
    map.put("METHOD-SetPulseWidthPeriod", MESSAGES.SetPulseWidthPeriodMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());
    map.put("METHOD-WriteI2cCacheToController", MESSAGES.WriteI2cCacheToControllerMethods());
    map.put("METHOD-WriteI2cPortFlagOnlyToController", MESSAGES.WriteI2cPortFlagOnlyToControllerMethods());


/* Component: FtcDigitalChannel */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Mode", MESSAGES.ModeProperties());
    map.put("PROPERTY-Mode_INPUT", MESSAGES.Mode_INPUTProperties());
    map.put("PROPERTY-Mode_OUTPUT", MESSAGES.Mode_OUTPUTProperties());
    map.put("PROPERTY-State", MESSAGES.StateProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcElapsedTime */



/* Properties */

    map.put("PROPERTY-StartTime", MESSAGES.StartTimeProperties());
    map.put("PROPERTY-Time", MESSAGES.TimeProperties());


/* Events */



/* Methods */

    map.put("METHOD-Log", MESSAGES.LogMethods());
    map.put("METHOD-Reset", MESSAGES.ResetMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcGamepad */



/* Properties */

    map.put("PROPERTY-A", MESSAGES.AProperties());
    map.put("PROPERTY-AtRest", MESSAGES.AtRestProperties());
    map.put("PROPERTY-B", MESSAGES.BProperties());
    map.put("PROPERTY-Back", MESSAGES.BackProperties());
    map.put("PROPERTY-DpadDown", MESSAGES.DpadDownProperties());
    map.put("PROPERTY-DpadLeft", MESSAGES.DpadLeftProperties());
    map.put("PROPERTY-DpadRight", MESSAGES.DpadRightProperties());
    map.put("PROPERTY-DpadUp", MESSAGES.DpadUpProperties());
    map.put("PROPERTY-GamepadNumber", MESSAGES.GamepadNumberProperties());
    map.put("PROPERTY-Guide", MESSAGES.GuideProperties());
    map.put("PROPERTY-LeftBumper", MESSAGES.LeftBumperProperties());
    map.put("PROPERTY-LeftStickButton", MESSAGES.LeftStickButtonProperties());
    map.put("PROPERTY-LeftStickX", MESSAGES.LeftStickXProperties());
    map.put("PROPERTY-LeftStickY", MESSAGES.LeftStickYProperties());
    map.put("PROPERTY-LeftTrigger", MESSAGES.LeftTriggerProperties());
    map.put("PROPERTY-RightBumper", MESSAGES.RightBumperProperties());
    map.put("PROPERTY-RightStickButton", MESSAGES.RightStickButtonProperties());
    map.put("PROPERTY-RightStickX", MESSAGES.RightStickXProperties());
    map.put("PROPERTY-RightStickY", MESSAGES.RightStickYProperties());
    map.put("PROPERTY-RightTrigger", MESSAGES.RightTriggerProperties());
    map.put("PROPERTY-Start", MESSAGES.StartProperties());
    map.put("PROPERTY-Status", MESSAGES.StatusProperties());
    map.put("PROPERTY-Type", MESSAGES.TypeProperties());
    map.put("PROPERTY-X", MESSAGES.XProperties());
    map.put("PROPERTY-Y", MESSAGES.YProperties());


/* Events */



/* Methods */

    map.put("METHOD-SetJoystickDeadzone", MESSAGES.SetJoystickDeadzoneMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcGyroSensor */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Heading", MESSAGES.HeadingProperties());
    map.put("PROPERTY-HeadingMode", MESSAGES.HeadingModeProperties());
    map.put("PROPERTY-HeadingMode_CARDINAL", MESSAGES.HeadingMode_CARDINALProperties());
    map.put("PROPERTY-HeadingMode_CARTESIAN", MESSAGES.HeadingMode_CARTESIANProperties());
    map.put("PROPERTY-RawX", MESSAGES.RawXProperties());
    map.put("PROPERTY-RawY", MESSAGES.RawYProperties());
    map.put("PROPERTY-RawZ", MESSAGES.RawZProperties());
    map.put("PROPERTY-Rotation", MESSAGES.RotationProperties());
    map.put("PROPERTY-Status", MESSAGES.StatusProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-Calibrate", MESSAGES.CalibrateMethods());
    map.put("METHOD-IsCalibrating", MESSAGES.IsCalibratingMethods());
    map.put("METHOD-ResetZAxisIntegrator", MESSAGES.ResetZAxisIntegratorMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcI2cDevice */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */

    map.put("EVENT-I2cPortIsReady", MESSAGES.I2cPortIsReadyEvents());


/* Methods */

    map.put("METHOD-CopyBufferIntoWriteBuffer", MESSAGES.CopyBufferIntoWriteBufferMethods());
    map.put("METHOD-EnableI2cReadMode", MESSAGES.EnableI2cReadModeMethods());
    map.put("METHOD-EnableI2cWriteMode", MESSAGES.EnableI2cWriteModeMethods());
    map.put("METHOD-GetCopyOfReadBuffer", MESSAGES.GetCopyOfReadBufferMethods());
    map.put("METHOD-GetCopyOfWriteBuffer", MESSAGES.GetCopyOfWriteBufferMethods());
    map.put("METHOD-IsI2cPortActionFlagSet", MESSAGES.IsI2cPortActionFlagSetMethods());
    map.put("METHOD-IsI2cPortInReadMode", MESSAGES.IsI2cPortInReadModeMethods());
    map.put("METHOD-IsI2cPortInWriteMode", MESSAGES.IsI2cPortInWriteModeMethods());
    map.put("METHOD-IsI2cPortReady", MESSAGES.IsI2cPortReadyMethods());
    map.put("METHOD-ReadI2cCacheFromController", MESSAGES.ReadI2cCacheFromControllerMethods());
    map.put("METHOD-SetI2cPortActionFlag", MESSAGES.SetI2cPortActionFlagMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());
    map.put("METHOD-WriteI2cCacheToController", MESSAGES.WriteI2cCacheToControllerMethods());
    map.put("METHOD-WriteI2cPortFlagOnlyToController", MESSAGES.WriteI2cPortFlagOnlyToControllerMethods());


/* Component: FtcI2cDeviceReader */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-GetReadBuffer", MESSAGES.GetReadBufferMethods());
    map.put("METHOD-Initialize", MESSAGES.InitializeMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcIrSeekerSensor */



/* Properties */

    map.put("PROPERTY-Angle", MESSAGES.AngleProperties());
    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-I2cAddress", MESSAGES.I2cAddressProperties());
    map.put("PROPERTY-IndividualSensorCount", MESSAGES.IndividualSensorCountProperties());
    map.put("PROPERTY-MAX_NEW_I2C_ADDRESS", MESSAGES.MAX_NEW_I2C_ADDRESSProperties());
    map.put("PROPERTY-MIN_NEW_I2C_ADDRESS", MESSAGES.MIN_NEW_I2C_ADDRESSProperties());
    map.put("PROPERTY-Mode", MESSAGES.ModeProperties());
    map.put("PROPERTY-Mode_1200HZ", MESSAGES.Mode_1200HZProperties());
    map.put("PROPERTY-Mode_600HZ", MESSAGES.Mode_600HZProperties());
    map.put("PROPERTY-SignalDetected", MESSAGES.SignalDetectedProperties());
    map.put("PROPERTY-SignalDetectedThreshold", MESSAGES.SignalDetectedThresholdProperties());
    map.put("PROPERTY-Strength", MESSAGES.StrengthProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-IndividualSensorAngle", MESSAGES.IndividualSensorAngleMethods());
    map.put("METHOD-IndividualSensorStrength", MESSAGES.IndividualSensorStrengthMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcLED */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-Enable", MESSAGES.EnableMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcLegacyModule */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */

    map.put("EVENT-I2cPortIsReady", MESSAGES.I2cPortIsReadyEvents());


/* Methods */

    map.put("METHOD-CopyBufferIntoWriteBuffer", MESSAGES.CopyBufferIntoWriteBufferMethods());
    map.put("METHOD-Enable9v", MESSAGES.Enable9vMethods());
    map.put("METHOD-EnableAnalogReadMode", MESSAGES.EnableAnalogReadModeMethods());
    map.put("METHOD-EnableI2cReadMode", MESSAGES.EnableI2cReadModeMethods());
    map.put("METHOD-EnableI2cWriteMode", MESSAGES.EnableI2cWriteModeMethods());
    map.put("METHOD-GetCopyOfReadBuffer", MESSAGES.GetCopyOfReadBufferMethods());
    map.put("METHOD-GetCopyOfWriteBuffer", MESSAGES.GetCopyOfWriteBufferMethods());
    map.put("METHOD-IsI2cPortActionFlagSet", MESSAGES.IsI2cPortActionFlagSetMethods());
    map.put("METHOD-IsI2cPortInReadMode", MESSAGES.IsI2cPortInReadModeMethods());
    map.put("METHOD-IsI2cPortInWriteMode", MESSAGES.IsI2cPortInWriteModeMethods());
    map.put("METHOD-IsI2cPortReady", MESSAGES.IsI2cPortReadyMethods());
    map.put("METHOD-ReadAnalog", MESSAGES.ReadAnalogMethods());
    map.put("METHOD-ReadI2cCacheFromController", MESSAGES.ReadI2cCacheFromControllerMethods());
    map.put("METHOD-SetDigitalLine", MESSAGES.SetDigitalLineMethods());
    map.put("METHOD-SetI2cPortActionFlag", MESSAGES.SetI2cPortActionFlagMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());
    map.put("METHOD-WriteI2cCacheToController", MESSAGES.WriteI2cCacheToControllerMethods());
    map.put("METHOD-WriteI2cPortFlagOnlyToController", MESSAGES.WriteI2cPortFlagOnlyToControllerMethods());


/* Component: FtcLightSensor */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-LightDetected", MESSAGES.LightDetectedProperties());
    map.put("PROPERTY-LightDetectedRaw", MESSAGES.LightDetectedRawProperties());
    map.put("PROPERTY-Status", MESSAGES.StatusProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-EnableLed", MESSAGES.EnableLedMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcLinearOpMode */



/* Properties */

    map.put("PROPERTY-OpModeName", MESSAGES.OpModeNameProperties());
    map.put("PROPERTY-Time", MESSAGES.TimeProperties());


/* Events */

    map.put("EVENT-RunOpMode", MESSAGES.RunOpModeEvents());


/* Methods */

    map.put("METHOD-GetRuntime", MESSAGES.GetRuntimeMethods());
    map.put("METHOD-OpModeIsActive", MESSAGES.OpModeIsActiveMethods());
    map.put("METHOD-Sleep", MESSAGES.SleepMethods());
    map.put("METHOD-WaitForNextHardwareCycle", MESSAGES.WaitForNextHardwareCycleMethods());
    map.put("METHOD-WaitForStart", MESSAGES.WaitForStartMethods());
    map.put("METHOD-WaitOneFullHardwareCycle", MESSAGES.WaitOneFullHardwareCycleMethods());


/* Component: FtcOpMode */



/* Properties */

    map.put("PROPERTY-OpModeName", MESSAGES.OpModeNameProperties());
    map.put("PROPERTY-Time", MESSAGES.TimeProperties());


/* Events */

    map.put("EVENT-Init", MESSAGES.InitEvents());
    map.put("EVENT-InitLoop", MESSAGES.InitLoopEvents());
    map.put("EVENT-Loop", MESSAGES.LoopEvents());
    map.put("EVENT-Start", MESSAGES.StartEvents());
    map.put("EVENT-Stop", MESSAGES.StopEvents());


/* Methods */

    map.put("METHOD-GetRuntime", MESSAGES.GetRuntimeMethods());


/* Component: FtcOpticalDistanceSensor */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-LightDetected", MESSAGES.LightDetectedProperties());
    map.put("PROPERTY-LightDetectedRaw", MESSAGES.LightDetectedRawProperties());
    map.put("PROPERTY-Status", MESSAGES.StatusProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-EnableLed", MESSAGES.EnableLedMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcPwmOutput */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-PulseWidthOutputTime", MESSAGES.PulseWidthOutputTimeProperties());
    map.put("PROPERTY-PulseWidthPeriod", MESSAGES.PulseWidthPeriodProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcRobotController */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Configuration", MESSAGES.ConfigurationProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-LIBRARY_VERSION", MESSAGES.LIBRARY_VERSIONProperties());
    map.put("PROPERTY-TelemetrySorted", MESSAGES.TelemetrySortedProperties());
    map.put("PROPERTY-UsbScanTimeInSeconds", MESSAGES.UsbScanTimeInSecondsProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */



/* Methods */

    map.put("METHOD-CopyBytes", MESSAGES.CopyBytesMethods());
    map.put("METHOD-CreateByteArray", MESSAGES.CreateByteArrayMethods());
    map.put("METHOD-Get1ByteNumberFromByteArray", MESSAGES.Get1ByteNumberFromByteArrayMethods());
    map.put("METHOD-Get2ByteNumberFromByteArray", MESSAGES.Get2ByteNumberFromByteArrayMethods());
    map.put("METHOD-Get4ByteNumberFromByteArray", MESSAGES.Get4ByteNumberFromByteArrayMethods());
    map.put("METHOD-Get8ByteNumberFromByteArray", MESSAGES.Get8ByteNumberFromByteArrayMethods());
    map.put("METHOD-IsBitSet", MESSAGES.IsBitSetMethods());
    map.put("METHOD-LengthOfByteArray", MESSAGES.LengthOfByteArrayMethods());
    map.put("METHOD-LogDevices", MESSAGES.LogDevicesMethods());
    map.put("METHOD-Put1ByteNumberIntoByteArray", MESSAGES.Put1ByteNumberIntoByteArrayMethods());
    map.put("METHOD-Put2ByteNumberIntoByteArray", MESSAGES.Put2ByteNumberIntoByteArrayMethods());
    map.put("METHOD-Put4ByteNumberIntoByteArray", MESSAGES.Put4ByteNumberIntoByteArrayMethods());
    map.put("METHOD-Put8ByteNumberIntoByteArray", MESSAGES.Put8ByteNumberIntoByteArrayMethods());
    map.put("METHOD-RangeClip", MESSAGES.RangeClipMethods());
    map.put("METHOD-RangeScale", MESSAGES.RangeScaleMethods());
    map.put("METHOD-TelemetryAddNumericData", MESSAGES.TelemetryAddNumericDataMethods());
    map.put("METHOD-TelemetryAddTextData", MESSAGES.TelemetryAddTextDataMethods());


/* Component: FtcServo */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Direction", MESSAGES.DirectionProperties());
    map.put("PROPERTY-Direction_FORWARD", MESSAGES.Direction_FORWARDProperties());
    map.put("PROPERTY-Direction_REVERSE", MESSAGES.Direction_REVERSEProperties());
    map.put("PROPERTY-MAX_POSITION", MESSAGES.MAX_POSITIONProperties());
    map.put("PROPERTY-MIN_POSITION", MESSAGES.MIN_POSITIONProperties());
    map.put("PROPERTY-PortNumber", MESSAGES.PortNumberProperties());
    map.put("PROPERTY-Position", MESSAGES.PositionProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-ScaleRange", MESSAGES.ScaleRangeMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcServoController */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-PwmStatus_DISABLED", MESSAGES.PwmStatus_DISABLEDProperties());
    map.put("PROPERTY-PwmStatus_ENABLED", MESSAGES.PwmStatus_ENABLEDProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-GetPwmStatus", MESSAGES.GetPwmStatusMethods());
    map.put("METHOD-GetServoPosition", MESSAGES.GetServoPositionMethods());
    map.put("METHOD-PwmDisable", MESSAGES.PwmDisableMethods());
    map.put("METHOD-PwmEnable", MESSAGES.PwmEnableMethods());
    map.put("METHOD-SetServoPosition", MESSAGES.SetServoPositionMethods());
    map.put("METHOD-SetServoPositionAndSpeed", MESSAGES.SetServoPositionAndSpeedMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcTouchSensor */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-IsPressed", MESSAGES.IsPressedProperties());
    map.put("PROPERTY-Status", MESSAGES.StatusProperties());
    map.put("PROPERTY-Value", MESSAGES.ValueProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcTouchSensorMultiplexer */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Status", MESSAGES.StatusProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-GetSwitches", MESSAGES.GetSwitchesMethods());
    map.put("METHOD-IsTouchSensorPressed", MESSAGES.IsTouchSensorPressedMethods());
    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcUltrasonicSensor */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Status", MESSAGES.StatusProperties());
    map.put("PROPERTY-UltrasonicLevel", MESSAGES.UltrasonicLevelProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());


/* Events */



/* Methods */

    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FtcVoltageSensor */



/* Properties */

    map.put("PROPERTY-ConnectionInfo", MESSAGES.ConnectionInfoProperties());
    map.put("PROPERTY-Device", MESSAGES.DeviceProperties());
    map.put("PROPERTY-DeviceName", MESSAGES.DeviceNameProperties());
    map.put("PROPERTY-Version", MESSAGES.VersionProperties());
    map.put("PROPERTY-Voltage", MESSAGES.VoltageProperties());


/* Events */



/* Methods */

    map.put("METHOD-ToString", MESSAGES.ToStringMethods());


/* Component: FusiontablesControl */



/* Properties */

    map.put("PROPERTY-ApiKey", MESSAGES.ApiKeyProperties());
    map.put("PROPERTY-KeyFile", MESSAGES.KeyFileProperties());
    map.put("PROPERTY-Query", MESSAGES.QueryProperties());
    map.put("PROPERTY-ServiceAccountEmail", MESSAGES.ServiceAccountEmailProperties());
    map.put("PROPERTY-UseServiceAuthentication", MESSAGES.UseServiceAuthenticationProperties());


/* Events */

    map.put("EVENT-GotResult", MESSAGES.GotResultEvents());


/* Methods */

    map.put("METHOD-ForgetLogin", MESSAGES.ForgetLoginMethods());
    map.put("METHOD-GetRows", MESSAGES.GetRowsMethods());
    map.put("METHOD-GetRowsWithConditions", MESSAGES.GetRowsWithConditionsMethods());
    map.put("METHOD-InsertRow", MESSAGES.InsertRowMethods());
    map.put("METHOD-SendQuery", MESSAGES.SendQueryMethods());


/* Component: GameClient */



/* Properties */

    map.put("PROPERTY-GameId", MESSAGES.GameIdProperties());
    map.put("PROPERTY-InstanceId", MESSAGES.InstanceIdProperties());
    map.put("PROPERTY-InvitedInstances", MESSAGES.InvitedInstancesProperties());
    map.put("PROPERTY-JoinedInstances", MESSAGES.JoinedInstancesProperties());
    map.put("PROPERTY-Leader", MESSAGES.LeaderProperties());
    map.put("PROPERTY-Players", MESSAGES.PlayersProperties());
    map.put("PROPERTY-PublicInstances", MESSAGES.PublicInstancesProperties());
    map.put("PROPERTY-ServiceUrl", MESSAGES.ServiceUrlProperties());
    map.put("PROPERTY-UserEmailAddress", MESSAGES.UserEmailAddressProperties());


/* Events */

    map.put("EVENT-FunctionCompleted", MESSAGES.FunctionCompletedEvents());
    map.put("EVENT-GotMessage", MESSAGES.GotMessageEvents());
    map.put("EVENT-Info", MESSAGES.InfoEvents());
    map.put("EVENT-InstanceIdChanged", MESSAGES.InstanceIdChangedEvents());
    map.put("EVENT-Invited", MESSAGES.InvitedEvents());
    map.put("EVENT-NewInstanceMade", MESSAGES.NewInstanceMadeEvents());
    map.put("EVENT-NewLeader", MESSAGES.NewLeaderEvents());
    map.put("EVENT-PlayerJoined", MESSAGES.PlayerJoinedEvents());
    map.put("EVENT-PlayerLeft", MESSAGES.PlayerLeftEvents());
    map.put("EVENT-ServerCommandFailure", MESSAGES.ServerCommandFailureEvents());
    map.put("EVENT-ServerCommandSuccess", MESSAGES.ServerCommandSuccessEvents());
    map.put("EVENT-UserEmailAddressSet", MESSAGES.UserEmailAddressSetEvents());
    map.put("EVENT-WebServiceError", MESSAGES.WebServiceErrorEvents());


/* Methods */

    map.put("METHOD-GetInstanceLists", MESSAGES.GetInstanceListsMethods());
    map.put("METHOD-GetMessages", MESSAGES.GetMessagesMethods());
    map.put("METHOD-Invite", MESSAGES.InviteMethods());
    map.put("METHOD-LeaveInstance", MESSAGES.LeaveInstanceMethods());
    map.put("METHOD-MakeNewInstance", MESSAGES.MakeNewInstanceMethods());
    map.put("METHOD-SendMessage", MESSAGES.SendMessageMethods());
    map.put("METHOD-ServerCommand", MESSAGES.ServerCommandMethods());
    map.put("METHOD-SetInstance", MESSAGES.SetInstanceMethods());
    map.put("METHOD-SetLeader", MESSAGES.SetLeaderMethods());


/* Component: GyroscopeSensor */



/* Properties */

    map.put("PROPERTY-Available", MESSAGES.AvailableProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-XAngularVelocity", MESSAGES.XAngularVelocityProperties());
    map.put("PROPERTY-YAngularVelocity", MESSAGES.YAngularVelocityProperties());
    map.put("PROPERTY-ZAngularVelocity", MESSAGES.ZAngularVelocityProperties());


/* Events */

    map.put("EVENT-GyroscopeChanged", MESSAGES.GyroscopeChangedEvents());


/* Methods */



/* Component: HorizontalArrangement */



/* Properties */

    map.put("PROPERTY-AlignHorizontal", MESSAGES.AlignHorizontalProperties());
    map.put("PROPERTY-AlignVertical", MESSAGES.AlignVerticalProperties());
    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */



/* Methods */



/* Component: Image */



/* Properties */

    map.put("PROPERTY-Animation", MESSAGES.AnimationProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Picture", MESSAGES.PictureProperties());
    map.put("PROPERTY-ScalePictureToFit", MESSAGES.ScalePictureToFitProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */



/* Methods */



/* Component: ImagePicker */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-Selection", MESSAGES.SelectionProperties());
    map.put("PROPERTY-Shape", MESSAGES.ShapeProperties());
    map.put("PROPERTY-ShowFeedback", MESSAGES.ShowFeedbackProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-AfterPicking", MESSAGES.AfterPickingEvents());
    map.put("EVENT-BeforePicking", MESSAGES.BeforePickingEvents());
    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());


/* Methods */

    map.put("METHOD-Open", MESSAGES.OpenMethods());


/* Component: ImageSprite */



/* Properties */

    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-Heading", MESSAGES.HeadingProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-Interval", MESSAGES.IntervalProperties());
    map.put("PROPERTY-Picture", MESSAGES.PictureProperties());
    map.put("PROPERTY-Rotates", MESSAGES.RotatesProperties());
    map.put("PROPERTY-Speed", MESSAGES.SpeedProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-X", MESSAGES.XProperties());
    map.put("PROPERTY-Y", MESSAGES.YProperties());
    map.put("PROPERTY-Z", MESSAGES.ZProperties());


/* Events */

    map.put("EVENT-CollidedWith", MESSAGES.CollidedWithEvents());
    map.put("EVENT-Dragged", MESSAGES.DraggedEvents());
    map.put("EVENT-EdgeReached", MESSAGES.EdgeReachedEvents());
    map.put("EVENT-Flung", MESSAGES.FlungEvents());
    map.put("EVENT-NoLongerCollidingWith", MESSAGES.NoLongerCollidingWithEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());
    map.put("EVENT-Touched", MESSAGES.TouchedEvents());


/* Methods */

    map.put("METHOD-Bounce", MESSAGES.BounceMethods());
    map.put("METHOD-CollidingWith", MESSAGES.CollidingWithMethods());
    map.put("METHOD-MoveIntoBounds", MESSAGES.MoveIntoBoundsMethods());
    map.put("METHOD-MoveTo", MESSAGES.MoveToMethods());
    map.put("METHOD-PointInDirection", MESSAGES.PointInDirectionMethods());
    map.put("METHOD-PointTowards", MESSAGES.PointTowardsMethods());


/* Component: Label */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-HasMargins", MESSAGES.HasMarginsProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */



/* Methods */



/* Component: ListPicker */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Elements", MESSAGES.ElementsProperties());
    map.put("PROPERTY-ElementsFromString", MESSAGES.ElementsFromStringProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-ItemBackgroundColor", MESSAGES.ItemBackgroundColorProperties());
    map.put("PROPERTY-ItemTextColor", MESSAGES.ItemTextColorProperties());
    map.put("PROPERTY-Selection", MESSAGES.SelectionProperties());
    map.put("PROPERTY-SelectionIndex", MESSAGES.SelectionIndexProperties());
    map.put("PROPERTY-Shape", MESSAGES.ShapeProperties());
    map.put("PROPERTY-ShowFeedback", MESSAGES.ShowFeedbackProperties());
    map.put("PROPERTY-ShowFilterBar", MESSAGES.ShowFilterBarProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Title", MESSAGES.TitleProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-AfterPicking", MESSAGES.AfterPickingEvents());
    map.put("EVENT-BeforePicking", MESSAGES.BeforePickingEvents());
    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());


/* Methods */

    map.put("METHOD-Open", MESSAGES.OpenMethods());


/* Component: ListView */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Elements", MESSAGES.ElementsProperties());
    map.put("PROPERTY-ElementsFromString", MESSAGES.ElementsFromStringProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Selection", MESSAGES.SelectionProperties());
    map.put("PROPERTY-SelectionColor", MESSAGES.SelectionColorProperties());
    map.put("PROPERTY-SelectionIndex", MESSAGES.SelectionIndexProperties());
    map.put("PROPERTY-ShowFilterBar", MESSAGES.ShowFilterBarProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-TextSize", MESSAGES.TextSizeProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-AfterPicking", MESSAGES.AfterPickingEvents());


/* Methods */



/* Component: LocationSensor */



/* Properties */

    map.put("PROPERTY-Accuracy", MESSAGES.AccuracyProperties());
    map.put("PROPERTY-Altitude", MESSAGES.AltitudeProperties());
    map.put("PROPERTY-AvailableProviders", MESSAGES.AvailableProvidersProperties());
    map.put("PROPERTY-CurrentAddress", MESSAGES.CurrentAddressProperties());
    map.put("PROPERTY-DistanceInterval", MESSAGES.DistanceIntervalProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-HasAccuracy", MESSAGES.HasAccuracyProperties());
    map.put("PROPERTY-HasAltitude", MESSAGES.HasAltitudeProperties());
    map.put("PROPERTY-HasLongitudeLatitude", MESSAGES.HasLongitudeLatitudeProperties());
    map.put("PROPERTY-Latitude", MESSAGES.LatitudeProperties());
    map.put("PROPERTY-Longitude", MESSAGES.LongitudeProperties());
    map.put("PROPERTY-ProviderLocked", MESSAGES.ProviderLockedProperties());
    map.put("PROPERTY-ProviderName", MESSAGES.ProviderNameProperties());
    map.put("PROPERTY-TimeInterval", MESSAGES.TimeIntervalProperties());


/* Events */

    map.put("EVENT-LocationChanged", MESSAGES.LocationChangedEvents());
    map.put("EVENT-StatusChanged", MESSAGES.StatusChangedEvents());


/* Methods */

    map.put("METHOD-LatitudeFromAddress", MESSAGES.LatitudeFromAddressMethods());
    map.put("METHOD-LongitudeFromAddress", MESSAGES.LongitudeFromAddressMethods());


/* Component: MediaStore */



/* Properties */

    map.put("PROPERTY-ServiceURL", MESSAGES.ServiceURLProperties());


/* Events */

    map.put("EVENT-MediaStored", MESSAGES.MediaStoredEvents());
    map.put("EVENT-WebServiceError", MESSAGES.WebServiceErrorEvents());


/* Methods */

    map.put("METHOD-PostMedia", MESSAGES.PostMediaMethods());


/* Component: NearField */



/* Properties */

    map.put("PROPERTY-LastMessage", MESSAGES.LastMessageProperties());
    map.put("PROPERTY-ReadMode", MESSAGES.ReadModeProperties());
    map.put("PROPERTY-TextToWrite", MESSAGES.TextToWriteProperties());
    map.put("PROPERTY-WriteType", MESSAGES.WriteTypeProperties());


/* Events */

    map.put("EVENT-TagRead", MESSAGES.TagReadEvents());
    map.put("EVENT-TagWritten", MESSAGES.TagWrittenEvents());


/* Methods */



/* Component: Notifier */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-NotifierLength", MESSAGES.NotifierLengthProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());


/* Events */

    map.put("EVENT-AfterChoosing", MESSAGES.AfterChoosingEvents());
    map.put("EVENT-AfterTextInput", MESSAGES.AfterTextInputEvents());


/* Methods */

    map.put("METHOD-DismissProgressDialog", MESSAGES.DismissProgressDialogMethods());
    map.put("METHOD-LogError", MESSAGES.LogErrorMethods());
    map.put("METHOD-LogInfo", MESSAGES.LogInfoMethods());
    map.put("METHOD-LogWarning", MESSAGES.LogWarningMethods());
    map.put("METHOD-ShowAlert", MESSAGES.ShowAlertMethods());
    map.put("METHOD-ShowChooseDialog", MESSAGES.ShowChooseDialogMethods());
    map.put("METHOD-ShowMessageDialog", MESSAGES.ShowMessageDialogMethods());
    map.put("METHOD-ShowProgressDialog", MESSAGES.ShowProgressDialogMethods());
    map.put("METHOD-ShowTextDialog", MESSAGES.ShowTextDialogMethods());


/* Component: NxtColorSensor */



/* Properties */

    map.put("PROPERTY-AboveRangeEventEnabled", MESSAGES.AboveRangeEventEnabledProperties());
    map.put("PROPERTY-BelowRangeEventEnabled", MESSAGES.BelowRangeEventEnabledProperties());
    map.put("PROPERTY-BluetoothClient", MESSAGES.BluetoothClientProperties());
    map.put("PROPERTY-BottomOfRange", MESSAGES.BottomOfRangeProperties());
    map.put("PROPERTY-ColorChangedEventEnabled", MESSAGES.ColorChangedEventEnabledProperties());
    map.put("PROPERTY-DetectColor", MESSAGES.DetectColorProperties());
    map.put("PROPERTY-GenerateColor", MESSAGES.GenerateColorProperties());
    map.put("PROPERTY-SensorPort", MESSAGES.SensorPortProperties());
    map.put("PROPERTY-TopOfRange", MESSAGES.TopOfRangeProperties());
    map.put("PROPERTY-WithinRangeEventEnabled", MESSAGES.WithinRangeEventEnabledProperties());


/* Events */

    map.put("EVENT-AboveRange", MESSAGES.AboveRangeEvents());
    map.put("EVENT-BelowRange", MESSAGES.BelowRangeEvents());
    map.put("EVENT-ColorChanged", MESSAGES.ColorChangedEvents());
    map.put("EVENT-WithinRange", MESSAGES.WithinRangeEvents());


/* Methods */

    map.put("METHOD-GetColor", MESSAGES.GetColorMethods());
    map.put("METHOD-GetLightLevel", MESSAGES.GetLightLevelMethods());


/* Component: NxtDirectCommands */



/* Properties */

    map.put("PROPERTY-BluetoothClient", MESSAGES.BluetoothClientProperties());


/* Events */



/* Methods */

    map.put("METHOD-DeleteFile", MESSAGES.DeleteFileMethods());
    map.put("METHOD-DownloadFile", MESSAGES.DownloadFileMethods());
    map.put("METHOD-GetBatteryLevel", MESSAGES.GetBatteryLevelMethods());
    map.put("METHOD-GetBrickName", MESSAGES.GetBrickNameMethods());
    map.put("METHOD-GetCurrentProgramName", MESSAGES.GetCurrentProgramNameMethods());
    map.put("METHOD-GetFirmwareVersion", MESSAGES.GetFirmwareVersionMethods());
    map.put("METHOD-GetInputValues", MESSAGES.GetInputValuesMethods());
    map.put("METHOD-GetOutputState", MESSAGES.GetOutputStateMethods());
    map.put("METHOD-KeepAlive", MESSAGES.KeepAliveMethods());
    map.put("METHOD-ListFiles", MESSAGES.ListFilesMethods());
    map.put("METHOD-LsGetStatus", MESSAGES.LsGetStatusMethods());
    map.put("METHOD-LsRead", MESSAGES.LsReadMethods());
    map.put("METHOD-LsWrite", MESSAGES.LsWriteMethods());
    map.put("METHOD-MessageRead", MESSAGES.MessageReadMethods());
    map.put("METHOD-MessageWrite", MESSAGES.MessageWriteMethods());
    map.put("METHOD-PlaySoundFile", MESSAGES.PlaySoundFileMethods());
    map.put("METHOD-PlayTone", MESSAGES.PlayToneMethods());
    map.put("METHOD-ResetInputScaledValue", MESSAGES.ResetInputScaledValueMethods());
    map.put("METHOD-ResetMotorPosition", MESSAGES.ResetMotorPositionMethods());
    map.put("METHOD-SetBrickName", MESSAGES.SetBrickNameMethods());
    map.put("METHOD-SetInputMode", MESSAGES.SetInputModeMethods());
    map.put("METHOD-SetOutputState", MESSAGES.SetOutputStateMethods());
    map.put("METHOD-StartProgram", MESSAGES.StartProgramMethods());
    map.put("METHOD-StopProgram", MESSAGES.StopProgramMethods());
    map.put("METHOD-StopSoundPlayback", MESSAGES.StopSoundPlaybackMethods());


/* Component: NxtDrive */



/* Properties */

    map.put("PROPERTY-BluetoothClient", MESSAGES.BluetoothClientProperties());
    map.put("PROPERTY-DriveMotors", MESSAGES.DriveMotorsProperties());
    map.put("PROPERTY-StopBeforeDisconnect", MESSAGES.StopBeforeDisconnectProperties());
    map.put("PROPERTY-WheelDiameter", MESSAGES.WheelDiameterProperties());


/* Events */



/* Methods */

    map.put("METHOD-MoveBackward", MESSAGES.MoveBackwardMethods());
    map.put("METHOD-MoveBackwardIndefinitely", MESSAGES.MoveBackwardIndefinitelyMethods());
    map.put("METHOD-MoveForward", MESSAGES.MoveForwardMethods());
    map.put("METHOD-MoveForwardIndefinitely", MESSAGES.MoveForwardIndefinitelyMethods());
    map.put("METHOD-Stop", MESSAGES.StopMethods());
    map.put("METHOD-TurnClockwiseIndefinitely", MESSAGES.TurnClockwiseIndefinitelyMethods());
    map.put("METHOD-TurnCounterClockwiseIndefinitely", MESSAGES.TurnCounterClockwiseIndefinitelyMethods());


/* Component: NxtLightSensor */



/* Properties */

    map.put("PROPERTY-AboveRangeEventEnabled", MESSAGES.AboveRangeEventEnabledProperties());
    map.put("PROPERTY-BelowRangeEventEnabled", MESSAGES.BelowRangeEventEnabledProperties());
    map.put("PROPERTY-BluetoothClient", MESSAGES.BluetoothClientProperties());
    map.put("PROPERTY-BottomOfRange", MESSAGES.BottomOfRangeProperties());
    map.put("PROPERTY-GenerateLight", MESSAGES.GenerateLightProperties());
    map.put("PROPERTY-SensorPort", MESSAGES.SensorPortProperties());
    map.put("PROPERTY-TopOfRange", MESSAGES.TopOfRangeProperties());
    map.put("PROPERTY-WithinRangeEventEnabled", MESSAGES.WithinRangeEventEnabledProperties());


/* Events */

    map.put("EVENT-AboveRange", MESSAGES.AboveRangeEvents());
    map.put("EVENT-BelowRange", MESSAGES.BelowRangeEvents());
    map.put("EVENT-WithinRange", MESSAGES.WithinRangeEvents());


/* Methods */

    map.put("METHOD-GetLightLevel", MESSAGES.GetLightLevelMethods());


/* Component: NxtSoundSensor */



/* Properties */

    map.put("PROPERTY-AboveRangeEventEnabled", MESSAGES.AboveRangeEventEnabledProperties());
    map.put("PROPERTY-BelowRangeEventEnabled", MESSAGES.BelowRangeEventEnabledProperties());
    map.put("PROPERTY-BluetoothClient", MESSAGES.BluetoothClientProperties());
    map.put("PROPERTY-BottomOfRange", MESSAGES.BottomOfRangeProperties());
    map.put("PROPERTY-SensorPort", MESSAGES.SensorPortProperties());
    map.put("PROPERTY-TopOfRange", MESSAGES.TopOfRangeProperties());
    map.put("PROPERTY-WithinRangeEventEnabled", MESSAGES.WithinRangeEventEnabledProperties());


/* Events */

    map.put("EVENT-AboveRange", MESSAGES.AboveRangeEvents());
    map.put("EVENT-BelowRange", MESSAGES.BelowRangeEvents());
    map.put("EVENT-WithinRange", MESSAGES.WithinRangeEvents());


/* Methods */

    map.put("METHOD-GetSoundLevel", MESSAGES.GetSoundLevelMethods());


/* Component: NxtTouchSensor */



/* Properties */

    map.put("PROPERTY-BluetoothClient", MESSAGES.BluetoothClientProperties());
    map.put("PROPERTY-PressedEventEnabled", MESSAGES.PressedEventEnabledProperties());
    map.put("PROPERTY-ReleasedEventEnabled", MESSAGES.ReleasedEventEnabledProperties());
    map.put("PROPERTY-SensorPort", MESSAGES.SensorPortProperties());


/* Events */

    map.put("EVENT-Pressed", MESSAGES.PressedEvents());
    map.put("EVENT-Released", MESSAGES.ReleasedEvents());


/* Methods */

    map.put("METHOD-IsPressed", MESSAGES.IsPressedMethods());


/* Component: NxtUltrasonicSensor */



/* Properties */

    map.put("PROPERTY-AboveRangeEventEnabled", MESSAGES.AboveRangeEventEnabledProperties());
    map.put("PROPERTY-BelowRangeEventEnabled", MESSAGES.BelowRangeEventEnabledProperties());
    map.put("PROPERTY-BluetoothClient", MESSAGES.BluetoothClientProperties());
    map.put("PROPERTY-BottomOfRange", MESSAGES.BottomOfRangeProperties());
    map.put("PROPERTY-SensorPort", MESSAGES.SensorPortProperties());
    map.put("PROPERTY-TopOfRange", MESSAGES.TopOfRangeProperties());
    map.put("PROPERTY-WithinRangeEventEnabled", MESSAGES.WithinRangeEventEnabledProperties());


/* Events */

    map.put("EVENT-AboveRange", MESSAGES.AboveRangeEvents());
    map.put("EVENT-BelowRange", MESSAGES.BelowRangeEvents());
    map.put("EVENT-WithinRange", MESSAGES.WithinRangeEvents());


/* Methods */

    map.put("METHOD-GetDistance", MESSAGES.GetDistanceMethods());


/* Component: OrientationSensor */



/* Properties */

    map.put("PROPERTY-Angle", MESSAGES.AngleProperties());
    map.put("PROPERTY-Available", MESSAGES.AvailableProperties());
    map.put("PROPERTY-Azimuth", MESSAGES.AzimuthProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-Magnitude", MESSAGES.MagnitudeProperties());
    map.put("PROPERTY-Pitch", MESSAGES.PitchProperties());
    map.put("PROPERTY-Roll", MESSAGES.RollProperties());


/* Events */

    map.put("EVENT-OrientationChanged", MESSAGES.OrientationChangedEvents());


/* Methods */



/* Component: PasswordTextBox */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Hint", MESSAGES.HintProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());


/* Methods */

    map.put("METHOD-RequestFocus", MESSAGES.RequestFocusMethods());


/* Component: Pedometer */



/* Properties */

    map.put("PROPERTY-CalibrateStrideLength", MESSAGES.CalibrateStrideLengthProperties());
    map.put("PROPERTY-Distance", MESSAGES.DistanceProperties());
    map.put("PROPERTY-ElapsedTime", MESSAGES.ElapsedTimeProperties());
    map.put("PROPERTY-Moving", MESSAGES.MovingProperties());
    map.put("PROPERTY-StopDetectionTimeout", MESSAGES.StopDetectionTimeoutProperties());
    map.put("PROPERTY-StrideLength", MESSAGES.StrideLengthProperties());
    map.put("PROPERTY-UseGPS", MESSAGES.UseGPSProperties());


/* Events */

    map.put("EVENT-CalibrationFailed", MESSAGES.CalibrationFailedEvents());
    map.put("EVENT-GPSAvailable", MESSAGES.GPSAvailableEvents());
    map.put("EVENT-GPSLost", MESSAGES.GPSLostEvents());
    map.put("EVENT-SimpleStep", MESSAGES.SimpleStepEvents());
    map.put("EVENT-StartedMoving", MESSAGES.StartedMovingEvents());
    map.put("EVENT-StoppedMoving", MESSAGES.StoppedMovingEvents());
    map.put("EVENT-WalkStep", MESSAGES.WalkStepEvents());


/* Methods */

    map.put("METHOD-Pause", MESSAGES.PauseMethods());
    map.put("METHOD-Reset", MESSAGES.ResetMethods());
    map.put("METHOD-Resume", MESSAGES.ResumeMethods());
    map.put("METHOD-Save", MESSAGES.SaveMethods());
    map.put("METHOD-Start", MESSAGES.StartMethods());
    map.put("METHOD-Stop", MESSAGES.StopMethods());


/* Component: PhoneCall */



/* Properties */

    map.put("PROPERTY-PhoneNumber", MESSAGES.PhoneNumberProperties());


/* Events */

    map.put("EVENT-IncomingCallAnswered", MESSAGES.IncomingCallAnsweredEvents());
    map.put("EVENT-PhoneCallEnded", MESSAGES.PhoneCallEndedEvents());
    map.put("EVENT-PhoneCallStarted", MESSAGES.PhoneCallStartedEvents());


/* Methods */

    map.put("METHOD-MakePhoneCall", MESSAGES.MakePhoneCallMethods());


/* Component: PhoneNumberPicker */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-ContactName", MESSAGES.ContactNameProperties());
    map.put("PROPERTY-ContactUri", MESSAGES.ContactUriProperties());
    map.put("PROPERTY-EmailAddress", MESSAGES.EmailAddressProperties());
    map.put("PROPERTY-EmailAddressList", MESSAGES.EmailAddressListProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-PhoneNumber", MESSAGES.PhoneNumberProperties());
    map.put("PROPERTY-PhoneNumberList", MESSAGES.PhoneNumberListProperties());
    map.put("PROPERTY-Picture", MESSAGES.PictureProperties());
    map.put("PROPERTY-Shape", MESSAGES.ShapeProperties());
    map.put("PROPERTY-ShowFeedback", MESSAGES.ShowFeedbackProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-AfterPicking", MESSAGES.AfterPickingEvents());
    map.put("EVENT-BeforePicking", MESSAGES.BeforePickingEvents());
    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());


/* Methods */

    map.put("METHOD-Open", MESSAGES.OpenMethods());
    map.put("METHOD-ViewContact", MESSAGES.ViewContactMethods());


/* Component: PhoneStatus */



/* Properties */



/* Events */

    map.put("EVENT-OnSettings", MESSAGES.OnSettingsEvents());


/* Methods */

    map.put("METHOD-GetWifiIpAddress", MESSAGES.GetWifiIpAddressMethods());
    map.put("METHOD-doFault", MESSAGES.doFaultMethods());
    map.put("METHOD-getVersionName", MESSAGES.getVersionNameMethods());
    map.put("METHOD-installURL", MESSAGES.installURLMethods());
    map.put("METHOD-isConnected", MESSAGES.isConnectedMethods());
    map.put("METHOD-isDirect", MESSAGES.isDirectMethods());
    map.put("METHOD-setAssetsLoaded", MESSAGES.setAssetsLoadedMethods());
    map.put("METHOD-setHmacSeedReturnCode", MESSAGES.setHmacSeedReturnCodeMethods());
    map.put("METHOD-shutdown", MESSAGES.shutdownMethods());
    map.put("METHOD-startHTTPD", MESSAGES.startHTTPDMethods());


/* Component: Player */



/* Properties */

    map.put("PROPERTY-IsPlaying", MESSAGES.IsPlayingProperties());
    map.put("PROPERTY-Loop", MESSAGES.LoopProperties());
    map.put("PROPERTY-PlayOnlyInForeground", MESSAGES.PlayOnlyInForegroundProperties());
    map.put("PROPERTY-Source", MESSAGES.SourceProperties());
    map.put("PROPERTY-Volume", MESSAGES.VolumeProperties());


/* Events */

    map.put("EVENT-Completed", MESSAGES.CompletedEvents());
    map.put("EVENT-OtherPlayerStarted", MESSAGES.OtherPlayerStartedEvents());


/* Methods */

    map.put("METHOD-Pause", MESSAGES.PauseMethods());
    map.put("METHOD-Start", MESSAGES.StartMethods());
    map.put("METHOD-Stop", MESSAGES.StopMethods());
    map.put("METHOD-Vibrate", MESSAGES.VibrateMethods());


/* Component: ProximitySensor */



/* Properties */

    map.put("PROPERTY-Available", MESSAGES.AvailableProperties());
    map.put("PROPERTY-Distance", MESSAGES.DistanceProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-KeepRunningWhenOnPause", MESSAGES.KeepRunningWhenOnPauseProperties());
    map.put("PROPERTY-MaximumRange", MESSAGES.MaximumRangeProperties());


/* Events */

    map.put("EVENT-ProximityChanged", MESSAGES.ProximityChangedEvents());


/* Methods */



/* Component: Sharing */



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-ShareFile", MESSAGES.ShareFileMethods());
    map.put("METHOD-ShareFileWithMessage", MESSAGES.ShareFileWithMessageMethods());
    map.put("METHOD-ShareMessage", MESSAGES.ShareMessageMethods());


/* Component: Slider */



/* Properties */

    map.put("PROPERTY-ColorLeft", MESSAGES.ColorLeftProperties());
    map.put("PROPERTY-ColorRight", MESSAGES.ColorRightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-MaxValue", MESSAGES.MaxValueProperties());
    map.put("PROPERTY-MinValue", MESSAGES.MinValueProperties());
    map.put("PROPERTY-ThumbEnabled", MESSAGES.ThumbEnabledProperties());
    map.put("PROPERTY-ThumbPosition", MESSAGES.ThumbPositionProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-PositionChanged", MESSAGES.PositionChangedEvents());


/* Methods */



/* Component: Sound */



/* Properties */

    map.put("PROPERTY-MinimumInterval", MESSAGES.MinimumIntervalProperties());
    map.put("PROPERTY-Source", MESSAGES.SourceProperties());


/* Events */



/* Methods */

    map.put("METHOD-Pause", MESSAGES.PauseMethods());
    map.put("METHOD-Play", MESSAGES.PlayMethods());
    map.put("METHOD-Resume", MESSAGES.ResumeMethods());
    map.put("METHOD-Stop", MESSAGES.StopMethods());
    map.put("METHOD-Vibrate", MESSAGES.VibrateMethods());


/* Component: SoundRecorder */



/* Properties */

    map.put("PROPERTY-SavedRecording", MESSAGES.SavedRecordingProperties());


/* Events */

    map.put("EVENT-AfterSoundRecorded", MESSAGES.AfterSoundRecordedEvents());
    map.put("EVENT-StartedRecording", MESSAGES.StartedRecordingEvents());
    map.put("EVENT-StoppedRecording", MESSAGES.StoppedRecordingEvents());


/* Methods */

    map.put("METHOD-Start", MESSAGES.StartMethods());
    map.put("METHOD-Stop", MESSAGES.StopMethods());


/* Component: SpeechRecognizer */



/* Properties */

    map.put("PROPERTY-Result", MESSAGES.ResultProperties());


/* Events */

    map.put("EVENT-AfterGettingText", MESSAGES.AfterGettingTextEvents());
    map.put("EVENT-BeforeGettingText", MESSAGES.BeforeGettingTextEvents());


/* Methods */

    map.put("METHOD-GetText", MESSAGES.GetTextMethods());


/* Component: Spinner */



/* Properties */

    map.put("PROPERTY-Elements", MESSAGES.ElementsProperties());
    map.put("PROPERTY-ElementsFromString", MESSAGES.ElementsFromStringProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Prompt", MESSAGES.PromptProperties());
    map.put("PROPERTY-Selection", MESSAGES.SelectionProperties());
    map.put("PROPERTY-SelectionIndex", MESSAGES.SelectionIndexProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-AfterSelecting", MESSAGES.AfterSelectingEvents());


/* Methods */

    map.put("METHOD-DisplayDropdown", MESSAGES.DisplayDropdownMethods());


/* Component: TableArrangement */



/* Properties */

    map.put("PROPERTY-Columns", MESSAGES.ColumnsProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Rows", MESSAGES.RowsProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */



/* Methods */



/* Component: TextBox */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Hint", MESSAGES.HintProperties());
    map.put("PROPERTY-MultiLine", MESSAGES.MultiLineProperties());
    map.put("PROPERTY-NumbersOnly", MESSAGES.NumbersOnlyProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());


/* Methods */

    map.put("METHOD-HideKeyboard", MESSAGES.HideKeyboardMethods());
    map.put("METHOD-RequestFocus", MESSAGES.RequestFocusMethods());


/* Component: TextToSpeech */



/* Properties */

    map.put("PROPERTY-AvailableCountries", MESSAGES.AvailableCountriesProperties());
    map.put("PROPERTY-AvailableLanguages", MESSAGES.AvailableLanguagesProperties());
    map.put("PROPERTY-Country", MESSAGES.CountryProperties());
    map.put("PROPERTY-Language", MESSAGES.LanguageProperties());
    map.put("PROPERTY-Pitch", MESSAGES.PitchProperties());
    map.put("PROPERTY-Result", MESSAGES.ResultProperties());
    map.put("PROPERTY-SpeechRate", MESSAGES.SpeechRateProperties());


/* Events */

    map.put("EVENT-AfterSpeaking", MESSAGES.AfterSpeakingEvents());
    map.put("EVENT-BeforeSpeaking", MESSAGES.BeforeSpeakingEvents());


/* Methods */

    map.put("METHOD-Speak", MESSAGES.SpeakMethods());


/* Component: Texting */



/* Properties */

    map.put("PROPERTY-GoogleVoiceEnabled", MESSAGES.GoogleVoiceEnabledProperties());
    map.put("PROPERTY-Message", MESSAGES.MessageProperties());
    map.put("PROPERTY-PhoneNumber", MESSAGES.PhoneNumberProperties());
    map.put("PROPERTY-ReceivingEnabled", MESSAGES.ReceivingEnabledProperties());


/* Events */

    map.put("EVENT-MessageReceived", MESSAGES.MessageReceivedEvents());


/* Methods */

    map.put("METHOD-SendMessage", MESSAGES.SendMessageMethods());


/* Component: TimePicker */



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Hour", MESSAGES.HourProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-Instant", MESSAGES.InstantProperties());
    map.put("PROPERTY-Minute", MESSAGES.MinuteProperties());
    map.put("PROPERTY-Shape", MESSAGES.ShapeProperties());
    map.put("PROPERTY-ShowFeedback", MESSAGES.ShowFeedbackProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-AfterTimeSet", MESSAGES.AfterTimeSetEvents());
    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());


/* Methods */

    map.put("METHOD-LaunchPicker", MESSAGES.LaunchPickerMethods());
    map.put("METHOD-SetTimeToDisplay", MESSAGES.SetTimeToDisplayMethods());
    map.put("METHOD-SetTimeToDisplayFromInstant", MESSAGES.SetTimeToDisplayFromInstantMethods());


/* Component: TinyDB */



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-ClearAll", MESSAGES.ClearAllMethods());
    map.put("METHOD-ClearTag", MESSAGES.ClearTagMethods());
    map.put("METHOD-GetTags", MESSAGES.GetTagsMethods());
    map.put("METHOD-GetValue", MESSAGES.GetValueMethods());
    map.put("METHOD-StoreValue", MESSAGES.StoreValueMethods());


/* Component: TinyWebDB */



/* Properties */

    map.put("PROPERTY-ServiceURL", MESSAGES.ServiceURLProperties());


/* Events */

    map.put("EVENT-GotValue", MESSAGES.GotValueEvents());
    map.put("EVENT-ValueStored", MESSAGES.ValueStoredEvents());
    map.put("EVENT-WebServiceError", MESSAGES.WebServiceErrorEvents());


/* Methods */

    map.put("METHOD-GetValue", MESSAGES.GetValueMethods());
    map.put("METHOD-StoreValue", MESSAGES.StoreValueMethods());


/* Component: Twitter */



/* Properties */

    map.put("PROPERTY-ConsumerKey", MESSAGES.ConsumerKeyProperties());
    map.put("PROPERTY-ConsumerSecret", MESSAGES.ConsumerSecretProperties());
    map.put("PROPERTY-DirectMessages", MESSAGES.DirectMessagesProperties());
    map.put("PROPERTY-Followers", MESSAGES.FollowersProperties());
    map.put("PROPERTY-FriendTimeline", MESSAGES.FriendTimelineProperties());
    map.put("PROPERTY-Mentions", MESSAGES.MentionsProperties());
    map.put("PROPERTY-SearchResults", MESSAGES.SearchResultsProperties());
    map.put("PROPERTY-Username", MESSAGES.UsernameProperties());


/* Events */

    map.put("EVENT-DirectMessagesReceived", MESSAGES.DirectMessagesReceivedEvents());
    map.put("EVENT-FollowersReceived", MESSAGES.FollowersReceivedEvents());
    map.put("EVENT-FriendTimelineReceived", MESSAGES.FriendTimelineReceivedEvents());
    map.put("EVENT-IsAuthorized", MESSAGES.IsAuthorizedEvents());
    map.put("EVENT-MentionsReceived", MESSAGES.MentionsReceivedEvents());
    map.put("EVENT-SearchSuccessful", MESSAGES.SearchSuccessfulEvents());


/* Methods */

    map.put("METHOD-Authorize", MESSAGES.AuthorizeMethods());
    map.put("METHOD-CheckAuthorized", MESSAGES.CheckAuthorizedMethods());
    map.put("METHOD-DeAuthorize", MESSAGES.DeAuthorizeMethods());
    map.put("METHOD-DirectMessage", MESSAGES.DirectMessageMethods());
    map.put("METHOD-Follow", MESSAGES.FollowMethods());
    map.put("METHOD-RequestDirectMessages", MESSAGES.RequestDirectMessagesMethods());
    map.put("METHOD-RequestFollowers", MESSAGES.RequestFollowersMethods());
    map.put("METHOD-RequestFriendTimeline", MESSAGES.RequestFriendTimelineMethods());
    map.put("METHOD-RequestMentions", MESSAGES.RequestMentionsMethods());
    map.put("METHOD-SearchTwitter", MESSAGES.SearchTwitterMethods());
    map.put("METHOD-StopFollowing", MESSAGES.StopFollowingMethods());
    map.put("METHOD-Tweet", MESSAGES.TweetMethods());
    map.put("METHOD-TweetWithImage", MESSAGES.TweetWithImageMethods());


/* Component: VerticalArrangement */



/* Properties */

    map.put("PROPERTY-AlignHorizontal", MESSAGES.AlignHorizontalProperties());
    map.put("PROPERTY-AlignVertical", MESSAGES.AlignVerticalProperties());
    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */



/* Methods */



/* Component: VideoPlayer */



/* Properties */

    map.put("PROPERTY-FullScreen", MESSAGES.FullScreenProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Source", MESSAGES.SourceProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Volume", MESSAGES.VolumeProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */

    map.put("EVENT-Completed", MESSAGES.CompletedEvents());


/* Methods */

    map.put("METHOD-GetDuration", MESSAGES.GetDurationMethods());
    map.put("METHOD-Pause", MESSAGES.PauseMethods());
    map.put("METHOD-SeekTo", MESSAGES.SeekToMethods());
    map.put("METHOD-Start", MESSAGES.StartMethods());


/* Component: Voting */



/* Properties */

    map.put("PROPERTY-BallotOptions", MESSAGES.BallotOptionsProperties());
    map.put("PROPERTY-BallotQuestion", MESSAGES.BallotQuestionProperties());
    map.put("PROPERTY-ServiceURL", MESSAGES.ServiceURLProperties());
    map.put("PROPERTY-UserChoice", MESSAGES.UserChoiceProperties());
    map.put("PROPERTY-UserEmailAddress", MESSAGES.UserEmailAddressProperties());
    map.put("PROPERTY-UserId", MESSAGES.UserIdProperties());


/* Events */

    map.put("EVENT-GotBallot", MESSAGES.GotBallotEvents());
    map.put("EVENT-GotBallotConfirmation", MESSAGES.GotBallotConfirmationEvents());
    map.put("EVENT-NoOpenPoll", MESSAGES.NoOpenPollEvents());
    map.put("EVENT-WebServiceError", MESSAGES.WebServiceErrorEvents());


/* Methods */

    map.put("METHOD-RequestBallot", MESSAGES.RequestBallotMethods());
    map.put("METHOD-SendBallot", MESSAGES.SendBallotMethods());


/* Component: Web */



/* Properties */

    map.put("PROPERTY-AllowCookies", MESSAGES.AllowCookiesProperties());
    map.put("PROPERTY-RequestHeaders", MESSAGES.RequestHeadersProperties());
    map.put("PROPERTY-ResponseFileName", MESSAGES.ResponseFileNameProperties());
    map.put("PROPERTY-SaveResponse", MESSAGES.SaveResponseProperties());
    map.put("PROPERTY-Url", MESSAGES.UrlProperties());


/* Events */

    map.put("EVENT-GotFile", MESSAGES.GotFileEvents());
    map.put("EVENT-GotText", MESSAGES.GotTextEvents());


/* Methods */

    map.put("METHOD-BuildRequestData", MESSAGES.BuildRequestDataMethods());
    map.put("METHOD-ClearCookies", MESSAGES.ClearCookiesMethods());
    map.put("METHOD-Delete", MESSAGES.DeleteMethods());
    map.put("METHOD-Get", MESSAGES.GetMethods());
    map.put("METHOD-HtmlTextDecode", MESSAGES.HtmlTextDecodeMethods());
    map.put("METHOD-JsonTextDecode", MESSAGES.JsonTextDecodeMethods());
    map.put("METHOD-PostFile", MESSAGES.PostFileMethods());
    map.put("METHOD-PostText", MESSAGES.PostTextMethods());
    map.put("METHOD-PostTextWithEncoding", MESSAGES.PostTextWithEncodingMethods());
    map.put("METHOD-PutFile", MESSAGES.PutFileMethods());
    map.put("METHOD-PutText", MESSAGES.PutTextMethods());
    map.put("METHOD-PutTextWithEncoding", MESSAGES.PutTextWithEncodingMethods());
    map.put("METHOD-UriEncode", MESSAGES.UriEncodeMethods());
    map.put("METHOD-XMLTextDecode", MESSAGES.XMLTextDecodeMethods());


/* Component: WebViewer */



/* Properties */

    map.put("PROPERTY-CurrentPageTitle", MESSAGES.CurrentPageTitleProperties());
    map.put("PROPERTY-CurrentUrl", MESSAGES.CurrentUrlProperties());
    map.put("PROPERTY-FollowLinks", MESSAGES.FollowLinksProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-HomeUrl", MESSAGES.HomeUrlProperties());
    map.put("PROPERTY-IgnoreSslErrors", MESSAGES.IgnoreSslErrorsProperties());
    map.put("PROPERTY-PromptforPermission", MESSAGES.PromptforPermissionProperties());
    map.put("PROPERTY-UsesLocation", MESSAGES.UsesLocationProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-WebViewString", MESSAGES.WebViewStringProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */



/* Methods */

    map.put("METHOD-CanGoBack", MESSAGES.CanGoBackMethods());
    map.put("METHOD-CanGoForward", MESSAGES.CanGoForwardMethods());
    map.put("METHOD-ClearCaches", MESSAGES.ClearCachesMethods());
    map.put("METHOD-ClearLocations", MESSAGES.ClearLocationsMethods());
    map.put("METHOD-GoBack", MESSAGES.GoBackMethods());
    map.put("METHOD-GoForward", MESSAGES.GoForwardMethods());
    map.put("METHOD-GoHome", MESSAGES.GoHomeMethods());
    map.put("METHOD-GoToUrl", MESSAGES.GoToUrlMethods());


/* Component: YandexTranslate */



/* Properties */



/* Events */

    map.put("EVENT-GotTranslation", MESSAGES.GotTranslationEvents());


/* Methods */

    map.put("METHOD-RequestTranslation", MESSAGES.RequestTranslationMethods());
  return map;
  }
}
